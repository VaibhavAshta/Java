import java.util.*;
public class practiceArray {
    public static void update(int marks[])  {
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int LinearSearch(String food[], String key){
        for(int i=0; i<food.length; i++){
            if (food[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int a[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(largest<a[i]){
                largest = a[i];
            }
            if(smallest > a[i]){
                smallest = a[i];
            }
        }
        System.out.println("Smallest Numnber "+smallest);
        return largest;
    }

    public static int binarySearch(int num[], int key){
        int start = 0, end = num.length - 1;

        while (start<=end) {
            int mid  = (start+end)/2;
            
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void reverse(int num[]){
        int a = 0, z = num.length-1;
        while(a<z){
            int temp = num[a];
            num[a] = num[z];
            num[z] = temp;

            a++;
            z--;
        }
    }

    public static void subArrays(int num[]){
        int ts = 0;
        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(num[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total SubArray: "+ts);
    }

    public static void subArraySum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += num[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max Sum = "+maxSum);

    }

    public static void prefixSum(int num[]){
        int currSum = 0;
        int maxSum  = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        //calculate prefix sum
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = "+maxSum);
    }

    public static void kandanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs += numbers[i];
            ms = Math.max(cs, ms);
            if(cs < 0){
                cs = 0;
            }
        }
        System.out.println("Max Sum = "+ms);
    }

    public static int trappedRainWater(int heigth[]){
        int n = heigth.length;

        //Caluclate Left Max Boundary
        int leftMax[] = new int[n];
        leftMax[0] = heigth[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(heigth[i], leftMax[i-1]);
        }

        //Calculate Right Max Boundary 
        int rightMax[] = new int[n];
        rightMax[n-1] = heigth[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(heigth[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //Loop
        for(int i=0; i<n; i++){
            
            //waterLevel = Math.min(leftMax, rigthMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            
            //trappedWater += waterLevel - heigth[i]
            trappedWater += waterLevel - heigth[i];
        }

        return trappedWater;

    }

    public static int buyAndSell(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         int marks[]= {91,92,93};
//         update(marks);
// ;       for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i]+" ");
//         }
//         System.out.println();

        // int numbers[] = {2,4,6,8,10,12,14,16};
        // if(linearSearch(numbers, 105) == -1){
        //     System.out.println("Key Not Found");
        // }else{
        //     System.out.println("Key Found at Index "+linearSearch(numbers, 10));
        // }

        // int n = sc.nextInt();
        // String food [] = new String[n];
        // for(int i=0; i<n; i++){
        //     food[i] = sc.next();
        // }
        // System.out.println("Enter item you want to search: ");
        // String key = sc.next();
        // if(LinearSearch(food,key) == -1){
        //     System.out.println("Key not Found");
        // }else{
        //     System.out.println("Key found at "+LinearSearch(food, key));
        // }

        // int number[] = {3,5,7,9,15,13,11};
        // System.out.println("Largest Num is "+getLargest(number));

        // int num[] = {21,22,23,24,25,26,27,28,29,4};
        // int key = 25;
        // System.out.println("Key is at Index: "+binarySearch(num, key));

        // int num[] = {21,22,23,24,25,26,27,28,29,30};
        // reverse(num);
        // for(int i=0; i<num.length; i++){
        //     System.out.print(num[i]+ " ");
        // }
        // System.out.println();
        
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSell(prices));
    }
}
