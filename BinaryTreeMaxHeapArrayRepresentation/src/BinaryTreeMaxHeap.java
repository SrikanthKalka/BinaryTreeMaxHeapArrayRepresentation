public class BinaryTreeMaxHeap {

	public int[] maxHeapArray;
	public int capacity;
	public int pos;

	public BinaryTreeMaxHeap() {

		pos = 1;
		capacity = 10;
		maxHeapArray = new int[capacity];

	}

	public void buildMaxHeap(int nodeData) {

		if (pos == capacity) {
			// Increase Size of the Array
		} else {
			// Root node
			maxHeapArray[pos++] = nodeData;

			int childPos = pos-1;
			int parentPos = childPos / 2;

			while (maxHeapArray[parentPos] < maxHeapArray[childPos]
					&& parentPos > 0) {

				int temp = maxHeapArray[parentPos];
											// swapping Node data from child to parent
				maxHeapArray[parentPos] = maxHeapArray[childPos];
				maxHeapArray[childPos] = temp; // parent to child

				childPos = parentPos;
				parentPos =  childPos/2;
			}
		}

	}
	
	public void printMaxHeap(){
		
		for(int i=1; i<pos; i++){
			
			System.out.print("("+maxHeapArray[i]+") ,");
		}
		
	}

	public static void main(String[] args) {

		BinaryTreeMaxHeap obj = new BinaryTreeMaxHeap();
		
		
				obj.buildMaxHeap(12);
				obj.buildMaxHeap(7);
				obj.buildMaxHeap(6);
				obj.buildMaxHeap(10);
				obj.buildMaxHeap(8);
				obj.buildMaxHeap(20);
				obj.printMaxHeap();

	}

}
