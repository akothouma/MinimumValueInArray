package MinimumValueInArray;

import java.util.Arrays;

public class MinimumValueInArray {

    public void minimumValueInArray(int[] array) {  // can be declared to return int datatype;
        int i=0;
        int min = array[i];
        for ( i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The inputted aarray is "+ Arrays.toString(array) + "\n The minimum number is"+ " " +min);
    }

    public static void main(String[] args) {
        MinimumValueInArray min=new MinimumValueInArray();
        min.minimumValueInArray(new int[] {45,21,13,7,81,6,9,56});

    }
}
