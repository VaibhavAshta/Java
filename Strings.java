import java.util.*;
public class Strings {

    public static void printLetters(String n){
        for(int i=0; i<n.length(); i++){
            System.out.print(n.charAt(i)+" ");
        }
    }

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length(); i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String Path){
        int x=0, y=0;
        for(int i=0; i<Path.length(); i++){
            char dir = Path.charAt(i);
            //South
            if(dir == 'S'){
                y--;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //west
            else if(dir == 'W'){
                x--;
            }
            //east
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);
    }

    public static String subString(String str, int si, int ei){
        String subString = "";
        for(int i=si; i<ei; i++){
            subString += str.charAt(i);
        }
        return subString;
    }

    public static String upperCaseString(String str){
        StringBuilder sb = new StringBuilder("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i <=str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String stringComparison(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1; 
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }

    public static int countVowels(String word) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = Character.toLowerCase(word.charAt(i));
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                counter++;
            }
        }
        return counter;
    }
    
    public static boolean isAnagram(String s, String t) {
        if (stringComparison(s).equals(stringComparison(t))) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public String removeConsecutiveCharacter(String s){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            // If it's the first character or the current character is different from the previous one, append it to the sb
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};

        String str = "abcd";
        String str2= new String("xyz");
        
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);

        String name = "Madara Uchiha";
        System.out.println(name.length());

        String firstName = "Vaibhav";
        String lastName = "Ashta";
        String fullString = firstName+" "+lastName;

        String check = "racecars";
        System.out.println(isPalindrome(check));

        String path = "NS";
        System.out.println(getShortestPath(path));

        String str = "Hello World";
        System.out.println(subString(str, 0, 5));
        
        inbuild function
        System.out.println(str.substring(0, 5));

        //Largest string Lexicographically 
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        
        for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);

        StringBuilder sb = new StringBuilder("");
        for(char ch ='a'; ch<= 'z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);

        String str2 = "hi, i am vaibhav";
        System.out.println(upperCaseString(str2));

        String str3 = "aaabbbccddd";
        System.out.println(stringComparison(str3));

        String word = "aeriosufnfkaaa";
        System.out.println(countVowels(word));

        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
    
}
