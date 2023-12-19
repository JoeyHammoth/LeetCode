class Solution {
    public int arrayPairSum(int[] nums) {
        // Sort the array first, then since the size is already even, they are already 
        // grouped in pairs. The first number of the pair is automatically the min since
        // the array is sorted in an ascending order. Therefore, just iterate by 2
        // and add the number to the final result since these numbers are the minimum
        // of each pair of numbers. 
        Arrays.sort(nums);
        int result = 0;
        for (int itr = 0; itr < nums.length; itr += 2) {
            result += nums[itr];
        }
        return result;

        // Shitty overcomplicated solution
        /* 
    public int arrayPairSum(int[] nums) {
        int maxSum;
        List<Integer> cpyNums;
        List<Integer> maxSumList = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            maxSum = 0;
            cpyNums = Arrays.stream(nums).boxed().collect(Collectors.toList());
            cpyNums.remove(Integer.valueOf(nums[0]));
            cpyNums.remove(Integer.valueOf(nums[i]));
            maxSum += (nums[0] < nums[i]) ? nums[0] : nums[i];
            while (cpyNums.isEmpty() == false) {
                maxSum += generatePairing(cpyNums);
            }
            maxSumList.add(maxSum);
        }
        return Collections.max(maxSumList);
    } 

    public int generatePairing(List<Integer> nums) {
        Integer num1 = nums.get(0);
        Integer num2 = nums.get(1);
        nums.remove(num1);
        nums.remove(num2);
        return (num1 < num2) ? num1 : num2;
    }
    */
    }
}