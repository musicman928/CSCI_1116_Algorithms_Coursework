import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(mcios("abcdefgerABCDEFGHIerqh123456789aswccaasdJ"));
    }

    public static String mcios(String in) {

        if (in.length() < 2) {
            return in;
        }

        byte[] chars = in.getBytes();

        ArrayList<String> list = new ArrayList<>();

        //until end of string append character to seperate string if it is less than the previous character


        String currentString = "" + (char) chars[0];

        int pointer = 1;
        byte lastchar = chars[0];

        while (pointer < chars.length) {

            if (lastchar < chars[pointer]) {
                currentString = currentString + (char) chars[pointer];
            }
            else {
                list.add(currentString);
                currentString = "";
            }

            pointer++;

        }

        //return longest string in list

        String out = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > out.length())
                out = list.get(i);
        }

        return out;

    }
}
