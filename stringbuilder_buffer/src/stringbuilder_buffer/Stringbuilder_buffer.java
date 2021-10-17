package stringbuilder_buffer;

public class Stringbuilder_buffer {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb.reverse());
        //String s = sb.toString();
       // System.out.println(s);
        for (int i = sb.length()-1; i >= 0; i--) {
            System.out.print(sb.charAt(i));
        }
        sb.reverse();
        System.out.println("\n" + "\n");
        System.out.println(sb);
    }

}
