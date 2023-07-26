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

    public static void inverted_half_pyramid_withNums(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    } 

    public static void Floyos_triangle(int n){
        //outer
        int counter = 1;
        for(int i =1; i<=n; i++){
            //hoe many times counter will be printed
            for (int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for(int i =1; i<=n; i++){
            for(int j =1; j <= i; j++){
                if((i+j) % 2 == 0 ){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for (int i = 1; i<=n; i++){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for (int j =1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Half
        for (int i = n; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for (int j =1; j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

     public static void solid_rhombus(int n){
        for(int i =1; i<=n; i++){
            //spaces
            for(int j =1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1; j<=n; j++){
                System.out.print("*");
            }
                System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i =1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //hollow rectangle stars
            for(int j=1; j<=n; j++){
                if(j == 1 || j == n || i == 1 || i == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        //Bonus Qs
    public static void number_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void palindromic_pattern(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<= (n-i); j++){
                System.out.print(" ");
            }
            //descending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    //hollow_rectangle(4, 5);
    //inverted_pyramid(11);
    // inverted_half_pyramid_withNums(5);
    //Floyos_triangle(5);   
    //zero_one_triangle(5); 
    //butterfly(5);
    //solid_rhombus(5);
    //hollow_rhombus(5);    
    //diamond(4);

    //number_pyramid(5);
    palindromic_pattern(5);
}
}

