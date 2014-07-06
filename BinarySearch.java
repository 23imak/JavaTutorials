public class BinarySearch {
	private int[] array;
	

	public BinarySearch(int[] values) {
		this.array = values;
	}
/**
 * 
 * @param search
 * the number to be searched
 * @param option
 * to check the index of the number if its repeating; either first or last
 * @return
 * returns the number if found else returns -1
 */
	
	public int searchNumber(int search,String option) {
		int start = 0;
		int position = -1;
		int end = array.length - 1;
		while (start <= end) {
			
			int mid = (start + end) / 2;
			if (search == array[mid]) {
				position = mid;
				if(option.equalsIgnoreCase("first")){
					
						end = mid-1;
					
					}
				else if(option.equalsIgnoreCase("last")){
				
						start = mid+1;
				}else
					return position;
				
			}
			if (search < array[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return position;

	}
	
}
