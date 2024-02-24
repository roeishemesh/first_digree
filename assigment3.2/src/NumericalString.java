public class NumericalString {
    public static int toInt(char c) {return "0123456789".indexOf(c);
    }

    public static boolean isNumericString(String s) {
        // check if s contain only numbers
        boolean isInt = true;
        String numString = "0123456789";
        if (s == "" | s == null | s.charAt(s.length() - 1) == '0') {
            isInt = false;
        } else {
            for (int i = 0; i < s.length() & isInt; i++) {
                if (numString.indexOf(s.charAt(i)) == -1) {
                    isInt = false;
                }
            }
        }
        return isInt;
    }

    public static boolean legalNumericString(String s, int b) {
        boolean ans = false;
        //Task 3.1
        if (b < 2 || b > 10) {
            throw new IllegalArgumentException("the base should be between 2 to 10");
        }
        if (isNumericString(s)) {
            boolean legalNum = true;
            for (int i = 0; i < s.length() & legalNum; i++) {
                char checkChar = s.charAt(i);
                int checkInt = toInt(checkChar);
                if (checkInt >= b) {
                    legalNum = false;
                }

            }
            ans = legalNum;
        }
        return ans;
    }

    public static String decimalIncrement(String s) {
        String ans = "";
        //Task 3.2
        if (!legalNumericString(s, 10)) {
            throw new IllegalArgumentException("your string is illegal");
        } else {
            ans = decimalIncrement(s, "");
        }
        return ans;
    }

    public static String decimalIncrement(String s, String newString) {
        int checkNum;
        int firstChar = toInt(s.charAt(0));
        if (s.length() == 1) {
            if (firstChar != 9) {
                newString = newString + (firstChar + 1);
            } else {
                newString = newString + "01";
            }
        }
        else if(firstChar != 9) {
            checkNum = toInt(s.charAt(0));
            newString = (checkNum + 1) + s.substring(1);
        }

        else {
            newString = decimalIncrement(s.substring(1), "0" + newString);
        }

        return newString;
    }


    public static String decimalDouble(String s) {
        String ans = "";
        //Task 3.3
        if (!legalNumericString(s, 10)) {
            throw new IllegalArgumentException("your string is illegal");
        } else {
            ans = decimalDouble(s, "",0);
        }
        return ans;
    }
    public static String decimalDouble(String s,String newString,int carryOut){
    int num = toInt(s.charAt(0));
    int multiplication = num * 2 + carryOut;
    carryOut = multiplication/10;
    int newNum = multiplication % 10;
    if (s.length() == 1){
        if(carryOut == 1){
            newString = newString + newNum + carryOut;}
        else {
            newString = newString + newNum;
        }
    }
    else {
        newString =  newString + newNum ;
        newString = decimalDouble(s.substring(1),newString,carryOut);
    }
        return newString;
    }


    public static String binary2Decimal(String s) {
        String ans = "";
        //Task 3.4
        return ans;
    }

    public static String octal2Decimal(String s) {
        String ans = "";
        //Task 3.5
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Good Luck! :)");
        char c = '8';
        String s = "05";
//        System.out.println(isNumericString(s));
//        System.out.println(legalNumericString("101010",2));
        System.out.println(decimalDouble(s));


    }
}
