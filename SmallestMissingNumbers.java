package SkiilsPw.AdavncedSorting;
import java.util.Scanner;
public class SmallestMissingNumbers {
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
    public static int sortCycle(int[] arr,int i,int n){
        while (i<n) { 
            int ele = arr[i];
            if (ele<=0 || ele==i+1 || ele > n || ele==arr[ele-1]) {
                i++;
            }
            else swap(arr, ele-1, i);
        }
        i = 0;
        while (i<n) {
            if (arr[i] != i+1) {
                return i+1;
            }
            i++;
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        int i = 0;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the element number "+(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        print(arr);
        int ans = sortCycle(arr, 0, n);
        System.out.print(ans+" ");
    }
}
