package search;

public class SearchDemo {

    public static void main(String[] args) {
        //int[] nums = {5, 7, 9, 11, 13};
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        //int[] nums = new int[32];
        int target = 9;

        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target, 0, nums.length - 1); // using recursion

        if(result1 != -1) {
            System.out.println("Element found by liner at index: " + result1);
        } else {
            System.err.println("Element not found");
        }

        if(result2 != -1) {
            System.out.println("Element found by binary at index: " + result2);
        } else {
            System.err.println("Element not found");
        }

    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i=0;i<nums.length;i++) {
            steps++;
            if(nums[i] == target) {
                System.out.println("Steps taken by liner: " + steps);
                return i;
            }

        }
        System.out.println("Steps taken by liner: " + steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        int steps = 0;
        if(left<=right) {
            steps++;
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                System.out.println("Steps taken by binary: " + steps);
                return mid;
            }
            else if (nums[mid] < target)
                return binarySearch(nums, target, mid+1, right);
            else
                return binarySearch(nums, target, left, mid-1);
        }
        System.out.println("Steps taken by liner: " + steps);
        return -1;
    }

}
