package capgemeini_training;

import java.util.Scanner;

public class Assignment_20Feb_Basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll :");
        int roll=sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter name :");
        String name=sc.next();
        System.out.println("Information :");
        System.out.println("roll : "+roll);
        System.out.println("name : "+name);
        sc.close();
    }
}
