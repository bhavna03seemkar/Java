public class Array1 {
    //method 1
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 97;
        marks[1] = 95;
        marks[2] = 90;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        //but printing this again and again takes much more time
        //so we will use the loop here
        for(int i=0; i<3; i++){
            System.out.println("marks is :"+marks[i]);
        }

        // output is
        // 97
        // 95
        // 90
        // marks is :97
        // marks is :95
        // marks is :90

        //method2 of declaring array
        int mark[] = {97, 95, 90};
        for(int i=0; i<3; i++){
            System.out.println(mark[i]);
        }

        //output is
        // 97
        // 95
        // 90

        
    }
}
