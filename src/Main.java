public class Main {
    public static void main(String[] args) {


        System.out.println(isPalindrome(12321));
        System.out.println(isPerfectNumber(28));
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(-10));



    }


    // Palindrome Sayıyı Bulma

    public static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        return number == reverseNumber;
    }



    // Mükemmel Sayıyı Bulma

    public static boolean isPerfectNumber(int number2) {

        int sum = 0;
        if (number2 < 1) {
            return false;
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                sum += i;

            }
        }
        return sum == number2;

    }

    //Sayıları Kelimelerle Yazdırma
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        String[] singleDigitWords = {
                "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };

        StringBuilder words = new StringBuilder();
        int temp = number;

        int numberOfDigits = (number == 0) ? 1 : (int) Math.log10(Math.abs(number)) + 1;

        for (int i = 0; i < numberOfDigits; i++) {
            int digit = temp % 10;
            words.insert(0, singleDigitWords[digit] + " ");
            temp /= 10;
        }

        return words.toString().trim();
    }




}






