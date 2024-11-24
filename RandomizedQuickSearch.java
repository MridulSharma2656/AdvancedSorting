package SkiilsPw.AdavncedSorting;

import java.util.Scanner;

public class RandomizedQuickSearch {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
    public static void quickSort(int[] arr,int lo,int hi){
        if (lo>=hi) {
            return;
        }
        int idx = arrayPartition(arr, lo,hi);
        quickSort(arr, lo,idx - 1);
        quickSort(arr, idx + 1, hi);
    }
    public static int arrayPartition(int[] arr,int lo , int hi){
        int mid = (lo+hi)/2;
        int pivot = arr[mid], pIdx = mid;
        int count = 0;
        for(int i = lo;i<=hi;i++){
            if (arr[i] == arr[mid]) {
                continue;
            }
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int correctIdx = count + lo;
        swap(arr,pIdx,correctIdx);
        while (lo < correctIdx && hi > correctIdx) {
            if (arr[lo] <= pivot) {
                lo++;
            }
            else if (arr[hi] > pivot) {
                hi--;
            }
            else if (arr[lo] > pivot && arr[hi] <= pivot) {
                swap(arr, lo,hi);
            }
        }
        return correctIdx;
    }
    public static void swap(int[] arr,int pIdx,int correctIdx){
        int temp = arr[correctIdx];
        arr[correctIdx] = arr[pIdx];
        arr[pIdx] = temp;
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
        quickSort(arr,0,n-1);
        print(arr);
    }
}
