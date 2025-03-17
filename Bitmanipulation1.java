import java.util.Scanner;

public class Bitmanipulation1 {
    public static void main(String[] args){
        //bit manipulation are usually done in bit numbers
        //bitwise operator is used to perform bit manipulation
        //the methods we try are AND, OR, XOR, NOT
        //rether we use using 4 types 1)Get 2)set 3)Clear 4)Update
         //que) get the third bit(position 2) of number n n=0101
         //bit mask: 1<<i
         //operation AND
         //lets solve using get method
         int n = 5;
         int position = 3;
         int bitMask = 1<<position;
         if((bitMask & n) == 0){
            System.out.println("bit was zero");
         }
         else{
            System.out.println("bit was one");
         }


         //dempnstration of Set bit
         int n1=5;
         int pos = 1;
         int bitMask1 = 1<<pos;
         int newNumber = bitMask1 | n1;
         System.out.println(newNumber);
    
         //DEMONSTRATIOM OF CLEAR BIT
         int n2 = 5;
         int pos1 = 2;
         int bitMask2 = 1<<pos1;
         int notBitMask = ~(bitMask2);
         int newNumber1 = notBitMask & n2;
         System.out.println(newNumber1);

         // update bit demonstration
         //operation 1 = set and operation 0 = clear
          Scanner sc = new Scanner(System.in);
          int operation =sc.nextInt();
          int n3=5;
          int posi =1;
          int bitMask3 = 1<<posi;
          if(operation == 1){
            //set
            int newNumber2 = bitMask3 | n3;
            System.out.println(newNumber2);
          }
          else{
            //clear
            int newBitMask = ~(bitMask3);
            int newNumber3 = newBitMask & n3;
            System.out.println(newNumber3);
          }

      }
}
