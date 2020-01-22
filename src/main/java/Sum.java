import java.util.Arrays;

public class Sum {

    public int of(int number) {
        if(number > -1) {
            return processNumber(number);
        }
        return 0;
    }

    private int processNumber(int number) {
        int adder = 0;
        char[] charNumbers = Integer.toString(number).toCharArray();
        for (int i = charNumbers.length-1; i >= 0; i--) {
            adder += Character.getNumericValue(charNumbers[i]);
        }
        return adder;
    }

}
