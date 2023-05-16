package DSA_Practise.Leetcodeproblems;

//package DSA_Practise.Leetcodeproblems;


class searchd {
    public static void main(String[] args) {
        int[][] array = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int ans = (countofneg(array));
        System.out.println(ans);
    }

    static int countofneg(int[][] arr){
        int count = 0;

        for(int[] row : arr){
            for(int col : row){
                if(col<0){
                    count++;
                }
            }

        }
        return count;
    }
}








class Solutionssssssss {
    public static void main(String[] args) {
        int[] arr = {6,5,4,8};
        int[] ans = smallerNumbersThanCurrent(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
       // Arrays.sort(nums);
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
            if(nums[i]>nums[j]){
                count++;
                arr[i]=count;
            }
            }
        }
        return arr;
    }
}