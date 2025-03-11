public class Loop {
    public static void main(String args[]) {
        //for loop
        // for(int i=1; i<=4; i++){
        //     for(int j = 1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //OUTPUT WILL BE
        // *****
        // *****
        // *****
        // *****

        //PRINTING pattern hollow rectangle
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=5; j++){
        //         if(i==1 || j==1 || j==5 ||i==4){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // output is
        // *****
        // *   *
        // *   *
        // *****

        //half pyramid
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //output is
        // *
        // **
        // ***
        // **** 

        // print inverted pyramid 
        // for(int i=4; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // output is
        // ****
        // ***
        // **
        // *

        //inverted pyramid rotated by 90 degree
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }//for printing spaces

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //output is
    //      *
    //     **
    //    ***
    //   ****

    //printing pattern\
        int n=4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // output is
        // 1
        // 12
        // 123
        // 1234

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //output is
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        //method 2 to print this pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        int number = 1;
         for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
         }

         //0-1  TRIANGLE
         for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
         }

         //output is
            // 1
            // 0 1
            // 1 0 1
            // 0 1 0 1

    }
}
