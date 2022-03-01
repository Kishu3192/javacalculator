package com.company;
import java.util.Scanner;
public class calculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no.");
        int n1=sc.nextInt();
        System.out.println("enter second no.");
        int n2=sc.nextInt();
        System.out.println("Select Symbol(+,-,*,/)");
        String sym=sc.next();
        int res;
        switch(sym){
            case"+": res=n1+n2;
                     System.out.println("Addition is "+res);
                     break;
            case"-": res=n1-n2;
                     System.out.println("Subtraction is "+res);
                     break;
            case"*": res=n1*n2;
                     System.out.println("Multiply is "+res);
                     break;
            case"/": res=n1/n2;
                System.out.println("Division is "+res);
                break;
            default : System.out.println("invalid Symbol");
        }
    }
}
