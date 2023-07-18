public class Adv_patterns {
    public static void hollow_rectangle(int rows, int cols){
        //outter loop
        for(int i = 1; i<=rows; i++){
            //inner loop
            for(int j = 1; j<=cols; j++){
                //cells - (i, j)
                if (i == 1 || i == rows || j == 1 || j == cols){
                    //boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_pyramid(int n){
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
  
    public static void main(String args[]){
    //hollow_rectangle(4, 5);
        inverted_pyramid(4);
    }
}

