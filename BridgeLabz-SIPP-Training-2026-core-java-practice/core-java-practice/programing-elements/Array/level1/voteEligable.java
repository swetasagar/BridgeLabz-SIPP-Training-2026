package programmingElements.array.level1;

import java.util.Scanner;

public class voteEligable {
    public static void main(String[] args) {
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the age of student "+ (i+1));
            arr[i]=sc.nextInt();
            sc.close();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=18){
                System.out.println(arr[i] + " student can vote ");
            } else if (arr[i]<0) {
                System.out.println(arr[i] +" Invalid Input ");
            } else{
                System.out.println(arr[i] + "  student can not vote ");
            }
        }

    }
}
