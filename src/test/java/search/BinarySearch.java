package search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        int target = 9;

        int result = binarySearch(nums, target);

        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.err.println("Element not found");
        }

    }

    public static int binarySearch(int[] nums, int target) {
        //5, 7, 9, 11, 13

        int left = 0;
        int right = nums.length -1; //4

        int steps = 0;
        while(left <= right) {
            steps++;
            int mid = (left + right) / 2;

            if(nums[mid] == target) {
                System.out.println("Steps taken by binary: " + steps);
                return mid;
            }
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        System.out.println("Steps taken by binary: " + steps);
        return -1;
    }
}
