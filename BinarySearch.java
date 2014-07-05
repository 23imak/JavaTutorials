public class BinarySearch {
	private int[] array;

	public BinarySearch(int[] values) {
		this.array = values;
	}

	public int searchNumber(int search) {
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (search == array[mid]) {
				//element found
				return mid;
			}
			if (search < array[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		//Element not found
		return -1;

	}

}
