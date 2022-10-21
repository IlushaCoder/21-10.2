import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void wave(String str) {

        char[] words;
        ArrayList<Character> Upwords = new ArrayList<Character>();
        ArrayList<String> arraynew = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            Upwords.add(i, str.toUpperCase().charAt(i));
            if (String.valueOf(Upwords.get(i)).contains(String.valueOf(' ')))
                Upwords.set(i, '+');
        }
        for (int i = 0; i < str.length(); i++) {
            words = str.toCharArray();
            words[i] = Upwords.get(i);
            arraynew.add(i, String.valueOf(words));
        }
        for (int i = 0; i < arraynew.size(); i++) {
            for (int j=0;j<str.length();j++)
            {
                if(arraynew.get(i).charAt(j)=='+')
                {
                    arraynew.remove(i);
                }
            }
        }
        System.out.println(arraynew);
    }


        public static void main(String[] args) {
            wave("a       b    ");



    }
}

