package programmingElements.array.level1;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no ");
        int no=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(no+" * "+i+" = "+no*i);
        }
    }
}
