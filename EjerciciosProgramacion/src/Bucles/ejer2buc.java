
package Bucles;

import java.util.Scanner;

public class ejer2buc {
    public static void main(String[] args) {
        int A,B;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero");               
                A = in.nextInt();
        System.out.println("DIme otro numero");
                B = in.nextInt();
        
        for (int i = A; i <= B; i+=1) 
            System.out.println(i);
           
    }
    
    
}
