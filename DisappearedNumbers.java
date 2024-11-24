package SkiilsPw.AdavncedSorting;

import java.util.ArrayList;
import java.util.Scanner;

public class DisappearedNumbers {
    public static void print(int[] arr){
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int ele,int j){
        int temp = arr[ele];
        arr[ele] = arr[j];
        arr[j] = temp;
    }
    public static void sortCycle(int[] arr,int i,int n){
        while (i<n) { 
            int ele = arr[i];
            if (ele == i+1 || ele == arr[ele-1]) {
                i++;
            }
            else swap(arr, ele-1, i);
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
        sortCycle(arr, 0, n);
        print(arr);
        ArrayList<Integer> ls = new ArrayList<>(n);
        for(int j = 0;j<n;j++){
            if (arr[j] != j+1) {
                ls.add(j+1);
            }
        }
        for (Integer ele : ls) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
