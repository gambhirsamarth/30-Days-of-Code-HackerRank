import java.util.Scanner;

public class Solution {

    public static int calculateFine(int[] actualReturnDateIntegerArray, int[] expectedReturnDateIntegerArray) {
        // Date format: day, month, year
        int fine = 0;
        
        if (actualReturnDateIntegerArray[2] < expectedReturnDateIntegerArray[2])
            return fine;
        else if (actualReturnDateIntegerArray[2] == expectedReturnDateIntegerArray[2]) {
            if (actualReturnDateIntegerArray[1] < expectedReturnDateIntegerArray[1]) {
                return fine;
            } else if (actualReturnDateIntegerArray[1] == expectedReturnDateIntegerArray[1]) {
                if (actualReturnDateIntegerArray[0] <= expectedReturnDateIntegerArray[0]) {
                    return fine;
                } else {
                    fine = 15 * (actualReturnDateIntegerArray[0] - expectedReturnDateIntegerArray[0]);
                    return fine;
                }
            } else {
                fine = 500 * (actualReturnDateIntegerArray[1] - expectedReturnDateIntegerArray[1]);
                return fine;
            }
        } else if (actualReturnDateIntegerArray[2] > expectedReturnDateIntegerArray[2]) {
            fine = 10000;
            return fine;
        }
        return fine;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String actualReturnDate = scanner.nextLine();
        String expectedReturnDate = scanner.nextLine();
        
        String[] actualReturnDateStringArray = actualReturnDate.split(" ");
        String[] expectedReturnDateStringArray = expectedReturnDate.split(" ");
        
        int[] actualReturnDateIntegerArray = new int[actualReturnDateStringArray.length];
        int[] expectedReturnDateIntegerArray = new int[expectedReturnDateStringArray.length];
        
        for (int index = 0; index < actualReturnDateStringArray.length; index++) {
            actualReturnDateIntegerArray[index] = Integer.parseInt(actualReturnDateStringArray[index]);
            expectedReturnDateIntegerArray[index] = Integer.parseInt(expectedReturnDateStringArray[index]);
        }
        
        int fine = calculateFine(actualReturnDateIntegerArray, expectedReturnDateIntegerArray);
        
        System.out.println(fine);
    }
}
