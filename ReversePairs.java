package SkiilsPw.AdavncedSorting;

import java.util.Scanner;

public class ReversePairs {
    static int count = 0;
    public static void print(int[] arr){
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void mergeArray(int[] a, int[] b, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) 
        {
            if(a[i] <= b[j])
             {
                arr[k] = a[i];
                i++;
                k++;
            }
            else 
            {
                arr[k] = b[j]; 
                j++;
                k++;
            }
        }
        while(j<b.length)
        {
            arr[k] = b[j];
            j++;
            k++;
        }
        while (i<a.length)
        {
            arr[k] = b[i];
            i++;
            k++;
        }
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if (n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i = 0;i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i = 0;i<n-(n/2);i++){
            b[i] = arr[i+(n/2)];
        }
        mergeSort(a);
        mergeSort(b);
        pairCount(a, b);
        mergeArray(a, b, arr);
    }
    public static void pairCount(int[] a,int[] b){
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > 2*b[j]) {
                count += a.length-i;
                j++;
            }
            i++;
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
        // int[] arr = {5,4,3,2,1};
        print(arr);
        mergeSort(arr);
        print(arr);
        System.out.println(count);
    }
}
