
//This method reorders any array of integers 

public void insertionSort(Integer[] A) {
	for (int i = 1; i < A.length; i++)
	{
	    int key = A[i];
	    int j = i - 1;
	    while(j >= 0 && key < A[j]) {
			A[j+1] = A[j];
			A[j] = key;
			j = j - 1;
	    }
	}
}