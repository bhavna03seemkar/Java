public class Sb2 {
    public static void main(String[] args) {
        //methods type in string builder
        //declaration
        StringBuilder sb = new StringBuilder("Bhavna seemkar");
        System.out.println(sb);

        //append
        sb.append("is learning java ");
        System.out.println("after append string is : " + sb);

        //replace
        sb.replace(0,5,"welcome to");
        System.out.println("after replace string is : " + sb);

        //delete a substring from the string buildrt
        sb.delete(0,11 );
        System.out.println("string after delete is :" + sb);

        //get the current capacity of the string
        int capacity = sb.capacity();
        System.out.println("capacity of the string is : " + capacity);

        //length of the string 
        int length = sb.length();
        System.out.println("length of the string is : " + length);

        //access the character at specific index
        System.out.println("char at index 7 is : " + sb.charAt(7));

        //set char at specific index
        sb.setCharAt(0, 'B');
        System.out.println("string after setting char at index 7 is : " + sb);

        //get the substring from the string builder
        String subString = sb.substring(0, 8);
        System.out.println("string after getting substring is : " + subString);
        
        //index of specific substring
        int index = sb.indexOf("Bseemkar");
        System.out.println("index is : " + index);

        //delete a char
        sb.deleteCharAt(0);
        System.out.println("char after deletion is : " + sb);

        //convert to string
        String result = sb.toString();
        System.out.println("finally the string is : " + result);

        //reverse the string
        sb.reverse();
        System.out.println("string after reverse is :" + sb);

    }
}

//output is
// Bhavna seemkar
// after append string is : Bhavna seemkaris learning java 
// after replace string is : welcome toa seemkaris learning java
// string after delete is : seemkaris learning java
// capacity of the string is : 62
// length of the string is : 25
// char at index 7 is : r
// string after setting char at index 7 is : Bseemkaris learning java
// string after getting substring is : Bseemkar
// index is : 0
// char after deletion is : seemkaris learning java
// finally the string is : seemkaris learning java
// string after reverse is : avaj gninrael sirakmees
