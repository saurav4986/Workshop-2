package com.bridgeLabz.workShop_2;

public class ArrayEvenElementSum {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int sum=0;
        System.out.println("Sum of Elements of given array on even position:");
        for (int i=1;i<arr.length;i=i+2){
            sum+=arr[i];

        }
        System.out.println(sum);
    }
}
