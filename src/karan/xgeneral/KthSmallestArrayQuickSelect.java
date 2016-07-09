package karan.xgeneral;


public class KthSmallestArrayQuickSelect {
	 public static int findKthLargest(int[] nums, int k) {
	        if (nums == null || nums.length == 0) {
	            return 0;
	        }
	         
	        return findKthLargestHelper(nums, 0, nums.length - 1, nums.length - k);
	    }
	     
	    private static int findKthLargestHelper(int[] nums, int start, int end, int k) {
	        if (start >= end) {
	            return nums[start];
	        }
	         
	        int pivot = partition(nums, start, end);
	        if (pivot == k) {
	            return nums[k];
	        }
	         
	        if (pivot > k) {
	            return findKthLargestHelper(nums, start, pivot - 1, k);
	        } else {
	            return findKthLargestHelper(nums, pivot + 1, end, k);
	        }
	    }
	     
	    private static int partition(int[] nums, int start, int end) {
	        int pivot = nums[start];
	        int left = start + 1;
	        int right = end;
	         
	        while (left <= right) {
	            while (left <= right && nums[left] < pivot) {
	            	left++;
	            }
	             
	            while (left <= right && nums[right] >= pivot) {
	            	right--;
	            }
	             
	            if (left <= right) {
	                swap(nums, left, right);
	            }
	        }
	         
	        swap(nums, start, right);
	         
	        return right;
	    }
	 
	public static void swap(int[] nums, int n1, int n2) {
		int tmp = nums[n1];
		nums[n1] = nums[n2];
		nums[n2] = tmp;
	}
	public static void main(String[] args) {
		System.out.println(findKthLargest(new int[]{5,3,7,4,6,11,9,2},3 ));
	}
}
