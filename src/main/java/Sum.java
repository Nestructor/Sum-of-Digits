import java.util.Arrays;

public class Sum {

    public int of(int number) {
        if(number > -1) {
            char[] charNumbers = Integer.toString(number).toCharArray();
            int result = processNumber(charNumbers);
            while(result > 9) {
                result = processNumber(Integer.toString(result).toCharArray());
            }
            return result;
        }
        return 0;
    }

    private int processNumber(char[] charNumbers) {
        int adder = 0;
        for (int i = charNumbers.length-1; i >= 0; i--) {
            adder += Character.getNumericValue(charNumbers[i]);
        }
        return adder;
    }

}
