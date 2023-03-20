public class Main {
    public static void main(String[] args) {
        System.out.println(substringOf("perretetetypieasdbwzas", "pie"));
    }

    public static boolean substringOf(String string, String substring) {
        byte[] stringChars = string.getBytes();
        byte[] subChars = substring.getBytes();

        String temp = "";
        int pointer = 0;

        for (int i = 0; i < stringChars.length; i++) {
            if (stringChars[i] == subChars[pointer]) {
                temp = temp + (char) stringChars[i];
                if (pointer + 1 < substring.length())
                    pointer++;

                if (temp.equals(substring))
                    return true;

            }
            else {
                temp = "";
                pointer = 0;
            }
        }
        return false;
    }
}
