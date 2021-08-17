// package Array;

// public class LargestNumbers {
    
// }

// leet code problem solutiion no .179


class Solution {

    public String largestNumber(int[] nums) {
        
        String[] snums =new String[nums.length];
        String result = "";
        for(int i=0;i<nums.length;i++)
        {
            snums[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(snums,(a,b)-> (b + a).compareTo(a + b));
        
        if(snums[0].equals("0"))
        {
            return "0";
        }
        else
        {
            for(String s: snums)
            {
                result +=s;
            }
            
        }
        return result;
    }
    }