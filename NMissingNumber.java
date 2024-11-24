package SkiilsPw.AdavncedSorting;

import java.util.Scanner;

public class NMissingNumber {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int idx,int i){
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
    public static void sortCycle(int[] arr,int i,int n){
        while (i<n) { 
            if (arr[i] == i || arr[i] == n) {
                i++;
            }
            else swap(arr, arr[i], i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the element number "+(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        print(arr);
        sortCycle(arr,0,n);
        print(arr);
        for(int j = 0;j < n;j++ ){
            if (arr[j] != j) {
                System.out.print(j);
            }
        }
    }
}
// OR APPLY MATHEMATICS FORMULA FOR Nth MISSING NUMBER FROM MEAN and MEDIAN 10th CLASS
