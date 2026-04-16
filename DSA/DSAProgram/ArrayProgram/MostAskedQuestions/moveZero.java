class moveZero {
    public static void moveZeroes(int[] nums) {

        int i=0;
        int j=1;
        
        while(j<nums.length){
            if(nums[i]==0 &&nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++; j++;
            }
            if(nums[i]!=0 && nums[j]==0){
                i++;
                j++;

            }
            if(nums[i]==0 && nums[j]==0){
                i++;
                j++;
                
            }

        }
        
    }
    
    
    public static void main(String[] args){
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
        
       for(int i:nums){
           System.out.println(i);
       }
        
    }
}