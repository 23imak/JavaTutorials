public class Quicksort {
	private int[] numbers;


	public Quicksort(int[] values) {
		this.numbers = values;
	}
	public int[] sort() {
        
        if (numbers == null || numbers.length == 0) {
            return numbers;
        }
        int length = numbers.length;
        quicksort(0, length - 1);
        return numbers;
    }

	private int quicksort(int low, int high) {
		int i = low, j = high;
		int pivot = numbers[low + (high - low) / 2];

		while (i <= j) {

			while (numbers[i] < pivot) {
				i++;
			}

			while (numbers[j] > pivot) {
				j--;
			}

			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
		return numbers[i];
	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	
}