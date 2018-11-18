package aproductarraypuzzle;

import java.util.Arrays;

public class AProductArrayPuzzle {
    public static int[] aProductArrayPuzzle(int[] a){
        int tot = 1;
        for (int i = 0; i < a.length; i++) {
            tot *= a[i];
        }
        int[] prod = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            prod[i] = tot / a[i];
        }
        return prod;
    }
    
    public static void main(String[] args) {
        int[] array; 
        array  = new int[]{};
        System.out.println("" + Arrays.toString(aProductArrayPuzzle(array)));
        array  = new int[]{4};
        System.out.println("" + Arrays.toString(aProductArrayPuzzle(array)));
        array  = new int[]{1, 2};
        System.out.println("" + Arrays.toString(aProductArrayPuzzle(array)));
        array  = new int[]{10, 3, 5, 6, 2};
        System.out.println("" + Arrays.toString(aProductArrayPuzzle(array)));
        
        
    }    
}
