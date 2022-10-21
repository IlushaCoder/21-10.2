Задача:[https://www.codewars.com/kata/58f5c63f1e26ecda7e000029]
Любимое решение:import java.util.stream.IntStream;

public class MexicanWave {

    public static String[] wave(String str) {
        return IntStream
                .range(0, str.length())
                .mapToObj(x -> new StringBuilder(str).replace(x, x+1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
                .filter(x -> !x.equals(str))
                .toArray(String[]::new);
    }
    
}

Мое решение:
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
