public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] array = new int[2];
        int low = 0, high = numbers.length-1;
        while(low < high) {
            if(numbers[low] + numbers[high] == target) {
                array[0] = low+1; array[1] = high+1;
                return array;
            } else if (numbers[low] + numbers[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        return array;
    }
}