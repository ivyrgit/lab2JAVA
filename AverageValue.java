public class AverageValue {
	public static void main(String[] args) {
		// write your solution here
		//Read in integers	until the user enters -1.
		//If there was at least one integer	
		//show the average value.

		int sum = 0;
        int count = 0;
        int value;

        while (true) {
            System.out.print("Value: ");
            value = In.nextInt();
            if (value == -1) {
                break;
            }
            sum += value;
            count++;
        }
		if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average = " + average);
        } else {
            System.out.println("No values entered.");
        }
		}
	}
