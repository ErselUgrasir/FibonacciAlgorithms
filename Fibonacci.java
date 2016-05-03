package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    
    // 1,1,2,3,5,8,13,21,34,55 ...
    
    // Complexity: O(2^n)
    public int fibonacci1(int eleman){
        if (eleman <= 2)
            return 1;
        return fibonacci1(eleman - 1) + fibonacci1(eleman - 2);
    }
    
    // Complexity: O(n)
    public int fibonacci2(int eleman){
        int[] dizi = new int[eleman];
        dizi[0] = 1;
        dizi[1] = 1;
        
        for (int i = 2; i < eleman; i++)
        {
            dizi[i] = dizi[i-1] + dizi[i-2];
        }

        return dizi[eleman - 1];
    }
    
    // Complexity: O(n)
    public int fibonacci3(int eleman){
        int a = 0, b = 1, c, i;
        if( eleman == 0)
          return a;
        for (i = 2; i <= eleman; i++)
        {
           c = a + b;
           a = b;
           b = c;
        }
        return b;
    }
    
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Which element of Fibonacci? : ");
        int x = input.nextInt();
        System.out.println( x + ". value : " + f.fibonacci3(x));
    }
    
}
