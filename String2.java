public class String2 {
    public static void main(String[] args) {

        //concatenation
        //do string ko saath me jodh ke batayega

        String firstName = "bhavna";
        String lastName = "seemkar";
        String fullName = firstName + "@" + lastName;
        //bhavna@seemkar
        System.out.println(fullName.length());

        //charAt
        //ye har character ko print karega
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }


        //compare strings
        String name1 = "bhavna";
        String name2 = "bhavna";
        
        //case1 s1>s2 then print +ve value
        //case2 s1=s2 then print equal
        //case3 s1<s2 then print -ve value

        if(name1.compareTo(name2) == 0){
            System.out.println("strings are equal ");
        }
        else{
            System.out.println("strings are not equal");
        }

        //substrings
        //substring(beg index, end index)

        String sentence = "bhavnaseemkar";
        String name = sentence.substring(6);
        String name3 = sentence.substring(0, 6);
        System.out.println(name);
        System.out.println(name3);
    }
}

//point to be noted
//strings are immutable

//output is
// 14
// b
// h
// a
// v
// n
// a
// @
// s
// e
// e
// m
// k
// a
// r
