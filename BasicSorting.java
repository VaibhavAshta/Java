import java.util.*;

public class BasicSorting {
    public static void bubbleSort(int[] arr){
        int n = arr.length-1;
        for(int turn=0; turn<n; turn++){
            int swap =0;
            for(int j=0; j<n-turn; j++){
                //swap
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap ++;
                }
            }
            if(swap == 0){
                    break;
                }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }

    }

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }
    
    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }    

        int[] count = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String agrs[]){
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        countingSort(arr);
        printArr(arr);
    }
}