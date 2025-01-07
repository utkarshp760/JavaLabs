package Lab1;

import java.util.Scanner;

public class Standalone {
    static int n;
    static int i;
    static int j;
    static int choice;
    static int state;
    static int[] arr;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            if (state==0) {
                System.out.println("Array size");
                n = scanner.nextInt();
                arr = new int[n];

                for (i = 0; i < n; i++) {
                    System.out.println("Enter the " + i + "th value");
                    arr[i] = scanner.nextInt();
                }
                state=1;
            }
            System.out.println("Menu");
            System.out.println("1.Bubble sort");
            System.out.println("2.Selection sort");
            System.out.println("3.Insertion sort");
            System.out.println("4.Merge sort");
            System.out.println("5.Quick sort");
            System.out.println("6.Exit");
            System.out.println("Enter the choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bubblesort(arr);
                    break;
                case 2:
                    selectionsort(arr);
                    break;
                case 3:
                    insertionsort(arr);
                    break;
                case 4:
                    sort(arr, 0, arr.length - 1);
                    break;
                case 5:
                    quicksort(arr, 0, n - 1);
                    break;
                case 6:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.out.println("Please enter the correct number");
            }
        }while (choice!=6);
    }

    private static void quicksort(int[] arr, int low, int high) {
        if (low<high)
        {
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
        print(arr);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        i = low - 1;

        for (j = low; j < high; j++) { // Correct loop bounds
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }


    private static void merge(int[] arr, int l,int m,int r) {
        int n1=m-l+1;
        int n2=r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (i=0;i<n1;++i)
        {
            L[i]=arr[l+i];
        }
        for (j=0;j<n2;++j)
        {
            R[j]=arr[m+1+j];
        }
        j=0;
        i=0;
        int k = l;
        while (i<n1 && j<n2)
        {
            if (L[i]<=R[j])
            {
                arr[k]=L[i];
                i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }

    private static void sort(int[] arr,int l,int r){
        if (l<r)
        {
            int m=l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
        print(arr);
    }

    private static void insertionsort(int[] arr) {
        for (i=2;i<n;i++)
        {
            int key = arr[i];
            j=i-1;
            while (j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        print(arr);
    }

    private static void selectionsort(int[] arr) {
        for (i = 0;i<n;i++)
        {
            int min_index = i;
            for (j = i+1;j<n;j++)
            {
                if (arr[j]<arr[min_index])
                {
                    min_index=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;

        }
        print(arr);
    }

    private static void bubblesort(int[] arr) {
        System.out.println("Enter the array");
        for (i = 0; i < n ;i++)
        {
            for (j = 0;j<n-1;j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);

    }

    private static void print(int[] arr) {
        System.out.println("Sorted array is:");
        for (i=0;i<n;i++) {
            System.out.println("The " + i + "th value is: "+arr[i]);
        }
    }

}
