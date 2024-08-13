public class CountVowels {
	public static void main(String[] args) {
		// write your solution here
		//Read in characters	
		//Until the user enters a full stop '.'	
		//Show the number of lowercase vowels.
        int count = 0;
        char letter;
		char [] vowel = {'a', 'e', 'i', 'o', 'u'};

        while (true) {
            System.out.print("Character: ");
            letter = In.nextChar();

            if (letter == '.') {
                break;
            }

            for (char n : vowel) {
                if (letter == n) {
                    count++;
                    break;
                }
            }
        }
		System.out.print("Vowel count = " + count);
		}
	}
