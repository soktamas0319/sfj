package lookandsay;

public class LookAndSay {

    public static void main(String[] args) {
        String result = "1";
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1 + ". kör: " + "\t"+ " " +  result);
            result = lookAndSay(result);
        }
    }

    public static String lookAndSay(String num) {
        if (num == null || num.isEmpty()) {
            return "";
        }
        StringBuilder sB = new StringBuilder();
        int howMany = 0;
        char whichDigit = '\0';
        int firstCharPositon = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(firstCharPositon) != num.charAt(i)) {
                howMany = num.substring(firstCharPositon, i).length();
                whichDigit = num.charAt(firstCharPositon);
                sB.append(howMany).append(whichDigit);
                firstCharPositon = i;
            }
        }
        howMany = num.substring(firstCharPositon, num.length()).length();
        whichDigit = num.charAt(firstCharPositon);
        sB.append(howMany).append(whichDigit);
        return sB.toString();
    }

}
