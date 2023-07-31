import java.util.*;
public class ArraysCC {
    public static void main(String args[]){
        int marks[] = new int[100];
        System.out.println("Length of Array: "+marks.length);
        Scanner sc = new Scanner (System.in);
        marks[0]   = sc.nextInt();
        marks[1]   = sc.nextInt();
        marks[2]   = sc.nextInt();

        System.out.println("Phys: "+marks[0]);
        System.out.println("Chem: "+marks[1]);
        System.out.println("math: "+marks[2]);

        int percentage = (marks[0] + marks[1] +marks[2])/3 ; 

        System.out.println("% of all subs are "+percentage);

        marks[2] = 100;
        System.out.println("math: "+marks[2]);

    }
}

import java.util.*;
public class ArraysCC {

    public static int linearSearch(int numbers[], int key){

        for(int i=0; i<numbers.length; i++){
            if( numbers[i] == key){
                return i;
            }
        }

        return -1;

    }
    public static void main(String args[]){
        int numbers[] = {1, 2, 4, 6, 8, 10, 12, 14, 16};
        int key = 0;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.print("Key Not Found");
        } else{
            System.out.print(" Key found at index: "+index);
        }

    }

}

public class ArraysCC {

    public static int linearSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1; // Element not found, return -1.
    }

    public static void main(String args[]) {
        String menu[] = {"Dosa", "Chole Bhature", "Samosa", "Pizza", "Vada Pav"};
        String key = "Samosa";

        int index = linearSearch(menu, key);
        if (index == -1) {
            System.out.print("Key Not Found");
        } else {
            System.out.print(" Key found at index: " + index);
        }
    }
}

import java.util.*;
public class ArraysCC {
    public static int getLargest(int numbers []){
        int largest  = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is: "+ smallest);
        return largest;
    }

    public static void main(String args[]){
        int numbers [] = {1, 2, 3, 6, 5};

        System.out.println("Largest number among array is: " + getLargest(numbers));
    }
} 
