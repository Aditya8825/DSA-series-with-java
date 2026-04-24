import java.util.*;
    
public class CountVowels {

    static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "HellO World";
        System.out.println(countVowels(str));
    }
}
