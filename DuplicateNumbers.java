package SkiilsPw.AdavncedSorting;
import java.util.Scanner;
public class DuplicateNumbers {
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
        int j = 0;
        while (true) {
            int ele = arr[j];
            if (ele == arr[ele]) {
                System.out.print(ele + " ");
                break;
            }
            else swap(arr,ele,j);
        }
    }
}
