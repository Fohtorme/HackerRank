package sumofallsubstrings;

import java.util.Arrays;

public class SumOfAllSubstrings {

    public static int sumOfSubarrays(int[] a){
        if(a.length == 0) return 0;
        if(a.length == 1) return a[0];
        int tot = 0;
        for (int i = 0; i < a.length; i++) {
            tot += a[i]*a.length;
        }
        tot += sumOfSubarrays(Arrays.copyOfRange(a, 1, a.length - 1));
        return tot;
    } 
    
    public static void main(String[] args) {
        int[] array; 
        array  = new int[]{};
        System.out.println("" + sumOfSubarrays(array));
        array  = new int[]{4};
        System.out.println("" + sumOfSubarrays(array));
        array  = new int[]{1, 2};
        System.out.println("" + sumOfSubarrays(array));
        array  = new int[]{1, 2, 3};
        System.out.println("" + sumOfSubarrays(array));
        array  = new int[]{1, 2, 3, 4};
        System.out.println("" + sumOfSubarrays(array));
        array  = new int[]{1, 2, 3, 4, 5};
        System.out.println("" + sumOfSubarrays(array));
        array  = new int[]{1, 3};
        System.out.println("" + sumOfSubarrays(array));
        array  = new int[]{1};
        System.out.println("" + sumOfSubarrays(array));
        array  = new int[]{1, 1};
        System.out.println("" + sumOfSubarrays(array));
        array  = new int[]{1, 1, 1};
        System.out.println("" + sumOfSubarrays(array));
        array  = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("" + sumOfSubarrays(array));
        
        
    }
    
}
