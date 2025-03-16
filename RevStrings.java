public class RevStrings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        //sabse pehle hum string ka half consider karenge
        //such that ki agar first half change ho to back ka automatic change kar sake
        //so running the loop
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;
            //for hello front =0
            //back = 5-1-0 =4
            //similarly for next iteration when i=1
            //front =1; back = 5-1-1 = 3

            //now for swap lets consider frontchar and backchar
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }
        System.out.println(sb);
    }
}
