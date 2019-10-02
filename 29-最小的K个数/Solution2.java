import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    int lens = input.length;
	    if(input == null || lens == 0 || k > lens || k <= 0){
	    	return list;
	    }
	    int start = 0;
	    int end = lens - 1;
	    int index = partition(input, start, end);
	    while(index != k-1){
	    	if(index > k-1){
	    		end = index - 1;
	    		index = partition(input, start, end);
	    	}else{
	    		start = index + 1;
	    		index = partition(input, start, end);
	    	}
	    }
	    for (int i = 0; i < k; i++) {
	    	list.add(input[i]);
	    }
	    return list;
    }
    
    private int partition(int[] nums, int start, int end) { //快排
    	int privotKey = nums[start];
    	while(start < end){
    		while(start < end && privotKey <= nums[end]){
    			--end;
    		}
    		swap(nums, start, end);//交换位置，使大于privotkey的值位于数组右边
    			
    		while(start < end && privotKey >= nums[start]){
    			++start;
    		}
    		swap(nums, start, end);//交换位置，使小于privotkey的值位于数组左边
    	}
    	return start;
    }

    private void swap(int[] nums, int start, int end) { //交换数组元素位置
    	int temp = nums[start];
    	nums[start] = nums[end];
    	nums[end] = temp;
    }
}
