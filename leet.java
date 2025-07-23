class Solution {
public static void main(String args[])
{

    public int[] twoSum(int[] nums, int target) {
    nums=new int[]{2,7,11,15};
    target=9;
   for(int a=0;a<4;a++)
   {
    for(int b=0;b<4;b++)
    {
        if(target==nums[a]+nums[b])
        {
            System.out.println(a,b);
        }
    }
   }
  }
}
}