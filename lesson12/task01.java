public class task01 {
    public static void main(String[] args) {
        String str = "fksdkvkdsnvndsnvdsvd,b,fb(fsvdvdfbdbgfbgfbgfngfngf)" +
                "cscdsvdsvfdbfdbfbfgbgfbdfbfbfdbfdbdfb@";
        String str1 = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {

            if ((str.charAt(i) != '(') && (str.charAt(i) != ')') && (str.charAt(i) != '@')) {
                str1 = str1 + str.charAt(i);

            }

        }
        System.out.println(str1);
    }
}

