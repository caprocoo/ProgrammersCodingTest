import java.util.Arrays;

public class mail3 {
    public static void main(String[] args) {

        int num = 3;
        int [] coffee_times = {4,2,2,5,3};
        int intArr [] = new int[num];
        int intArr2 [] = new int[num];

        int result [] = new int [coffee_times.length];

        int min = coffee_times[0];

        //5
        for(int i=0; i<coffee_times.length; i++){


            for(int j =0; j<num; j++){
                intArr[j] = coffee_times[j];
            }

            for( int j = 0; j<num; j++){
                intArr[j] = intArr[j]-1;
            }

        }
//        System.out.println("Arrays.toString(intArr) = " + Arrays.toString(intArr));



    }
}
