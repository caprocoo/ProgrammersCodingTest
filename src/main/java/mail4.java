public class mail4 {
    public static void main(String[] args) {
        int num = 10;
        String result = "";
        for(int i=0; i<num; i++){
            if("".equals(result)){
                result="1";
            }
            else{
                char[] a = result.toCharArray();
                String target = "";
                for(int j=0; j<a.length; j++){
                    if(j == 0){
                        target = "" + a[j];
                        result = "1";
                    }
                    else if(target.charAt(0)==a[j]){
                        target += ""+a[j];
                    }
                    else{
                        result += "" +target.length() + a[j];
                        target = "" + a[j];
                    }
                    if(j == (a.length -1)){
                        result += "" + target.length();
                    }
                }
            }


        }
        System.out.println(result);
    }
}
