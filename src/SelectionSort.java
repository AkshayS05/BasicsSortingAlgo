import java.util.Scanner;

public class SelectionSort {
    //time complexity = O(n ^ 2)
    public static void increasingSelectionSort(int[] arr) {
        //in this sorting algorithm, nested loop will start with i+1 everytime, decreasing the window to iterate
        //We consider the smallest to be i everytime and put it to the right position
        //In the nested loop, if we find the element at jth index is smaller than that of arr[smallest] we
        //make the new smallest to be that jth index and as we have found the new smallest, boolean isSmallest will ne true
        for (int i = 0; i <arr.length ; i++) {
            int smallest = i;
            boolean isSmallest = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                    isSmallest = true;
                }
            }
            //will only run in case there was a swap
            //if isSmallest becomes true we go inside this swap and put the elements to the right pos
            if (isSmallest) {
                //here I've used bitwise swap operation using XOR gate
                arr[i] = arr[i] ^ arr[smallest];
                arr[smallest] = arr[smallest] ^ arr[i];
                arr[i] = arr[i] ^ arr[smallest];
            }
        }

        printArr(arr);
    }
    public static void decreasingSelectionSort(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            int greatest = i;
            boolean isGreatest = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[greatest]) {
                    greatest = j;
                    isGreatest = true;
                }
            }
            //will only run in case there was a swap
            if (isGreatest) {
                arr[i] = arr[i] ^ arr[greatest];
                arr[greatest] = arr[greatest] ^ arr[i];
                arr[i] = arr[i] ^ arr[greatest];
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
        increasingSelectionSort(arr);
        decreasingSelectionSort(arr);
    }




}

