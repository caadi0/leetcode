public class Solution {
    public int trap(int[] height) {
        int numberOfElements = height.length;
        int sum = 0;
        int[] indexL = new int[numberOfElements];
        int[] indexR = new int[numberOfElements];
        int leftMax = 0, rightMax = numberOfElements - 1;
        for(int i = 0; i < numberOfElements; i++) {
            if(height[i] >= height[leftMax]) {
                leftMax = i;
                indexL[i] = i;
            }  else {
                indexL[i] = leftMax;
            }
            
            if(height[numberOfElements-i-1] >= height[rightMax]) {
                rightMax = numberOfElements-i-1;
                indexR[numberOfElements-i-1] = numberOfElements-i-1;
            }  else {
                indexR[numberOfElements-i-1] = rightMax;
            }   
        }
        
        for(int i = 0; i < numberOfElements; i++) {
            if(indexR[i] == i || indexL[i] == i) {
                continue;
            } else {
                sum += (Math.min(height[indexR[i]], height[indexL[i]]) - height[i]);   
            }
        }
        return sum;
    }
}