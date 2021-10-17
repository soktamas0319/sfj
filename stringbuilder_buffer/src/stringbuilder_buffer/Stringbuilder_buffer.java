package stringbuilder_buffer;

public class Stringbuilder_buffer {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb.reverse());
        String s = sb.toString();
        System.out.println(s);
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i));
        }
        System.out.println("\n" + "\n");
        System.out.println(sb);
    }

}
