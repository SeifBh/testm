import java.util.Arrays;
import java.util.List;

public class StringCalculatorStep1 {
    public static final int Add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            List<String> numbersList = Arrays.asList(numbersArray);
            numbersList.get(0);
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");

        } else {
            if (!numbers.isEmpty()) {
                returnValue = Arrays.stream(numbersArray).mapToInt(Integer::parseInt).sum();
            }else{
                System.out.println("jello world");
            }
        }
        return returnValue;
    }
}
