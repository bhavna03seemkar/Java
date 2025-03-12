public class Pattern2 {
    public static void main(String[] args) {
        //butterfly pattern
        int n = 5;
        for(int i=1; i<=n; i++){
            //inner loop for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for lower half
            //inner loop for stars
            for(int i=n; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        
        
    }
}


// output is
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *