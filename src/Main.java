//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }

        boolean matchFound = false;
        while (firstNumber > 0) {

            int firstNumberDigit = firstNumber % 10;

            while (secondNumber > 0) {

                if (firstNumberDigit == (secondNumber % 10)) {
                    matchFound = true;
                    break;
                }
                secondNumber /= 10;
            }
            if (matchFound) {
                break;
            }
            firstNumber /= 10;
        }
        return matchFound;
    }
}