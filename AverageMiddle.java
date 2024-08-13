import java.util.ArrayList;
import java.util.List;

public class AverageMiddle {
	public static void main(String[] args) {
		// write your solution here
		//Read in integers until the user enters -1.	
		//If there were at least 3 values, show the average-
		//excluding the biggest and smallest number.	
		//show whether sum is divisible by count
		List<Integer> values = new ArrayList<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;

        while (true) {
            System.out.print("Enter an integer (-1 to exit): ");
            int value = In.nextInt();

            if (value == -1) {
                break;
            }

            values.add(value);
            sum += value;
            count++;

            if (value > max) {
                max = value;
            }

            if (value < min) {
                min = value;
            }
        }

		if (count >= 3) {
            sum -= (max + min);
            count -= 2;

            double average = (double) sum / count;
            System.out.println("The middle average is: " + average);
        } else {
            System.out.println("Not enough values.");
        }

        if (count > 0 && sum % count == 0) {
            System.out.println("The sum is divisible by the count.");
        } else if (count > 0) {
            System.out.println("The sum is not divisible by the count.");
        }
	}
}
