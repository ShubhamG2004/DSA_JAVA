package BinarySearch;

public class PeakIntheMoutainArray {
	public int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {

				end = mid;
			} else {
			
				start = mid + 1;
			}
		}
		
		return start;
	}
	public static void main(String[] args) {
		PeakIntheMoutainArray obj = new PeakIntheMoutainArray();
		int[] arr = {1, 3, 5, 7, 6, 4, 2};
		int peakIndex = obj.peakIndexInMountainArray(arr);
		System.out.println("Peak index: " + peakIndex);
	}
}
