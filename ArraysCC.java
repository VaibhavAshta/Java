// import java.util.*;
// public class ArraysCC {

//     public static void update(int marks[], int nonChangeAble){
//         nonChangeAble = 10;
//         for(int i=0; i<marks.length; i++){
//             marks[i] = marks[i]+1;
//         }
//     }
//     public static void main(String args[]){
//         int marks[] = {97, 98, 99};
//         int nonChangeAble = 5;

//         update(marks, nonChangeAble);
//         System.out.println(nonChangeAble);

//         for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i]+" ");      
//         }
//         System.out.println();
//     }
// }

// import java.util.*;
// public class ArraysCC {

//     public static int linearSearch(int numbers[], int key){

//         for(int i=0; i<numbers.length; i++){
//             if( numbers[i] == key){
//                 return i;
//             }
//         }

//         return -1;

//     }
//     public static void main(String args[]){
//         int numbers[] = {1, 2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 0;

//         int index = linearSearch(numbers, key);
//         if(index == -1){
//             System.out.print("Key Not Found");
//         } else{
//             System.out.print(" Key found at index: "+index);
//         }

//     }

// }

// public class ArraysCC {

//     public static int linearSearch(String menu[], String key) {
//         for (int i = 0; i < menu.length; i++) {
//             if (menu[i].equals(key)) {
//                 return i;
//             }
//         }
//         return -1; // Element not found, return -1.
//     }

//     public static void main(String args[]) {
//         String menu[] = {"Dosa", "Chole Bhature", "Samosa", "Pizza", "Vada Pav"};
//         String key = "Samosa";

//         int index = linearSearch(menu, key);
//         if (index == -1) {
//             System.out.print("Key Not Found");
//         } else {
//             System.out.print(" Key found at index: " + index);
//         }
//     }
// }

// import java.util.*;
// public class ArraysCC {
//     public static int getLargest(int numbers []){
//         int largest  = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<numbers.length; i++){
//             if(largest < numbers[i]){
//                 largest = numbers[i];
//             }
//             if(smallest > numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("Smallest number is: "+ smallest);
//         return largest;
//     }

//     public static void main(String args[]){
//         int numbers [] = {1, 2, 3, 6, 5};

//         System.out.println("Largest number among array is: " + getLargest(numbers));
//     }
// } 

// import java.util.Scanner;

// public class ArraysCC{

//     public static int BinarySearch(int numbers[], int key){
//             int first = 0, end =numbers.length-1;

//             while(first<=end){
//                 int mid = (first+end)/2;
//                 //comparsions 
//                 if( numbers[mid] == key){
//                     return mid;
//                 }
//                 if( numbers[mid] > key){//left
//                     end = mid - 1;
//                 } else{//right
//                     first = mid+1;
//                 }

//             }

//             return -1;
//     }   

//     public static void main(String args[]){
//         BinarySearch
//         Scanner sc = new Scanner(System.in);
//         int numbers[] = {2,4,6,8,10,12,14};
//         System.out.print("Enter Key you want to search: ");
//         int key = sc.nextInt();
//         System.out.println("Key is at position: "+BinarySearch(numbers, key));

// }

public class ArraysCC{

    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first < last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            
            first++;
            last--;
        }
    }

    public static void printPairs(int numbers[]){
        int Tp = 0;
        for(int i=0; i<numbers.length; i++){

            int curr = numbers[i];//2,4,6,8,10
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+")");
                Tp++;
            }
            System.out.println();
        }             
       System.out.println("Total no. of pairs are: "+Tp);

    }

    public static void subArrays(int numbers[]){
        int ts =0;
        for(int i=0; i<numbers.length; i++){
            int start = i;

            for(int j=i; j<numbers.length; j++){
                int end = j;

                for(int k = start; k<=end; k++){//print
                    System.out.print(numbers[k]+" ");//numbers
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total numnbers of Sub Arrays ="+ts);

        for(int i=0; i<=numbers.length-1; i++){
                    int sum =0; 
                    sum += numbers[i];
                    return sum;
        }
                    System.out.println("Sum of arrays is = "+sum);

    }
    public static void main(String args[]){
        
        //reverse array
        // int numbers[] = {2,4,6,8,10,12,14};
        // reverse(numbers);

        // for(int i=0; i < numbers.length; i++){
        //     System.out.print(numbers[i]+" ");
        // }
        // System.out.println();

        //Pairs
        // int numbers[] = {2,4,6,8,10};
        // printPairs(numbers);

        //Subarrays
        int numbers[] = {2, 4, 6, 8, 10};
        subArrays(numbers);

    }
}
