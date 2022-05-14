import java.util.Scanner;

public class InsertionSort {
    public static void increasingInsertionSort(int[] arr) {
        //in insertion sort, we consider a sorted array as well as one unsorted array.
        //initially, the sorted array has only one element that is current.
        // Then the current is compared to the right side elements
        //if we find the smaller element to that of current, we move ith element to i+1 and create a space
        //for the smaller element. By doing so, we get the sorted array
        for (int i = 1; i <arr.length ; i++) {
            int current= arr[i];
            int j=i-1;
            while(j>=0&&current<arr[j]){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= current;
        }
        printArr(arr);
    }
    public static void decreasingInsertionSort(int[] arr) {
        for (int i = 1; i <arr.length ; i++) {
            int current= arr[i];
            int j= i-1;
            while(j>=0&&current>arr[j]){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= current;
        }
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("please enter the size of the array");
        int size= s.nextInt();
        int arr[]= new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]= s.nextInt();
        }
        increasingInsertionSort(arr);
        decreasingInsertionSort(arr);
    }
}
