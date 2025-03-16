//when we talk about string the string is immutable means we cant change the string once it is created.
//this usually takes more memory and processing power than string builder
//so we will use string builder class for the string
import java.util.*;
public class Stringbuilders {
    public static void main (String[] args){
        StringBuilder sb = new StringBuilder("Bhavna");
        System.out.println(sb);

        //print chat at any imdex
        System.out.println(sb.charAt(0));

        //setting char at index
        sb.setCharAt(0, 'b');
        System.out.println(sb);

        //insert at any index
        sb.insert(0,"B");
        System.out.println(sb);

        //delete at any index
        sb.delete(2,4);
        System.out.println(sb);

        //using append in string builder
        StringBuilder sb1 = new StringBuilder("h");
        sb1.append("e");
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1);
        System.out.println(sb1.length());
    }
}
