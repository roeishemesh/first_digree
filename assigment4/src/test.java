public class test {
    public static void main(String[] args) {
    String a = "1000";
    String b = "11";
        System.out.println(subtractBinary(a,b));
    }

    public static String subtractBinary(String binary1, String binary2) {
        // Make sure the lengths of both binary strings are equal by padding with zeros
        int maxLength = Math.max(binary1.length(), binary2.length());
        binary1 = padZeros(binary1, maxLength);
        binary2 = padZeros(binary2, maxLength);

        StringBuilder result = new StringBuilder();
        int borrow = 0;

        // Start from the least significant bit
        for (int i = maxLength - 1; i >= 0; i--) {
            int digit1 = binary1.charAt(i) - '0';
            int digit2 = binary2.charAt(i) - '0';

            // Perform subtraction
            int subtract = digit1 - digit2 - borrow;

            // Update borrow
            if (subtract < 0) {
                subtract += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }

            // Append result
            result.insert(0, subtract);
        }

        // Remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }

    private static String padZeros(String binary, int length) {
        StringBuilder padded = new StringBuilder(binary);
        while (padded.length() < length) {
            padded.insert(0, '0');
        }
        return padded.toString();
    }

}
