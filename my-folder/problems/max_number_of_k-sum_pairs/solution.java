class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            //to check if that k-nums[i] present and had some value left or already paired
            if(map.containsKey(k-nums[i])&&map.get(k-nums[i])>0){
                count++;
                map.put(k-nums[i],map.get(k-nums[i])-1);
            }else{
                //getOrDefault is easy way it directly checks if value is 0 returns 0 where I added 1
                //and if some value is present then it return that value "similar to map.get(i)" and I added 1 on it 
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
        
        
        /* int ops = 0;
        int[] arr1 = nums;
        int[] arr2 = operation(nums, k);
        while (arr1 != arr2) {
            arr1 = arr2;
            ops++;
            arr2 = operation(arr1, k);
        }
        return ops;
    }
    
    public int[] operation(int[] nums, int k) {
        int num1 = 0;
        int num2 = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        for (int j : nums) {
            if (list.contains(k - j)) {
                num1 = j;
                num2 = k - j;
                break;
            }
        }
        list.remove(Integer.valueOf(num1));
        list.remove(Integer.valueOf(num2));

        int[] result = new int[list.size()];

        for (int l = 0; l < list.size(); l++) {
            result[l] = list.get(l);
        }
        return result; */
    }
}