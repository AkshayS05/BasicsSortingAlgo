import java.util.Scanner;

public class BubbleSort {
    //time complexity = O(n ^ 2)
    public static void increasingBubbleSort(int[] arr) {
        //i will traverse from 0 to 3 in case we have an array let's say 7 8 3 1 2
        // [7(0), 8(1), 3(2), 1(3), 2(4)] bracket one is an index
        // j will traverse 0 to 4 (4-0-1=3) in ist traversal, then (4-1-1= 2)....
        // this is because we have j+1 to compare if we traverse till arr.length-1 then we will get out of bound exception
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    arr[j]= arr[j]^arr[j+1];
                    arr[j+1]= arr[j+1]^arr[j];
                    arr[j]=arr[j]^arr[j+1];

                }
            }
        }
           printArr(arr);

    }
    public static void decreasingBubbleSort(int[] arr) {
        // opposite of increasing bubble sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    //swap
                    arr[j]= arr[j]^arr[j+1];
                    arr[j+1]= arr[j+1]^arr[j];
                    arr[j]=arr[j]^arr[j+1];

                }
            }
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
        increasingBubbleSort(arr);
        decreasingBubbleSort(arr);
    }

}
