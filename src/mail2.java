public class mail2 {
    public static void main(String[] args) {

        String s1 = "AxA";
        String s2 = "AyA";
        String v1 = "";
        String v2 = "";
        String value = "";

        for (int i = 0; i < s1.length(); i++) {
            if (s2.startsWith(s1.substring(s1.length() - i))) {
                v1 = "";
                if(v1.length()<(s1 + s2.substring(i)).length()){
                    v1 = s1 + s2.substring(i);
                }

            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (s1.startsWith(s2.substring(s2.length() - i))) {
                v2 = "";
                if(v2.length()<(s2 + s1.substring(i)).length()){
                    v2 = s2 + s1.substring(i);
                }


            }
        }


        if (v1.length() < v2.length()) {
            value = v1;

        } else if (v2.length() < v1.length()) {
            value = v2;
        } else {
            if (v1.compareTo(v2) > 0) {
                value = v2;
            } else {
                value = v1;
            }
        }

//        return value;
        System.out.println("value = " + value);
    }
}
