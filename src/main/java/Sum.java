
public class Sum {

    public int of(int number) {
        return number > -1 ? getSum(number) : 0;
    }

    private int getSum(int number) {
        int sum = processNumber(toCharArray(number));
        while (sum > 9) {
            sum = processNumber(toCharArray(sum));
        }
        return sum;
    }

    private char[] toCharArray(int number) {
        return Integer.toString(number).toCharArray();
    }

    private int processNumber(char[] charNumbers) {
        int adder = 0;
        for (int i = charNumbers.length - 1; i >= 0; i--) {
            adder += Character.getNumericValue(charNumbers[i]);
        }
        return adder;
    }

}
