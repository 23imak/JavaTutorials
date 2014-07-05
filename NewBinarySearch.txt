public class BinarySearch {
	private int[] array;
	

	public BinarySearch(int[] values) {
		this.array = values;
	}

	public int searchNumber(int search,String option) {
		int start = 0;
		int temp = -1;
		int end = array.length - 1;
		while (start <= end) {
			
			int mid = (start + end) / 2;
			if (search == array[mid]) {
				temp = mid;
				if(option.equalsIgnoreCase("first")){
					
					mid = (start + mid)/2;
					if(search < array[mid])
						end = mid-1;
					else
						start = mid+1;
					return mid;
					
					}
				if(option.equalsIgnoreCase("last")){
				
					mid = (mid + end)/2;
					if(search < array[mid])
						end = mid-1;
					else
						start = mid+1;
					return mid;
				}
				
			}
			if (search < array[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return temp;

	}
	
}