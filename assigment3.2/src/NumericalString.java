public class NumericalString {
    public static int toInt(char c) {return "0123456789".indexOf(c);
    }

    public static boolean isNumericString(String s) {
        // check if s contain only numbers
        boolean isInt = true;
        String numString = "0123456789";
        if (s == "" | s == null | (s.charAt(s.length() - 1) == '0' & s.length() > 1)){
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
        if (!legalNumericString(s, 2)) {
            throw new IllegalArgumentException("your string is illegal");
        } else {
            ans = binary2Decimal(s,"0");
        }
        return ans;
    }
    public static String binary2Decimal(String s,String sum) {
        int checkNum = toInt(s.charAt(s.length()-1));
        sum = decimalDouble(sum);
        if (s.length() == 1){
            if (checkNum == 1){
                sum = decimalIncrement(sum);
            }
        }
        else {
            if (checkNum == 1){
                sum = decimalIncrement(sum);}
            s = s.substring(0,s.length()-1);
            sum = binary2Decimal(s,sum);
        }
        return sum;
    }
    public static String octal2Decimal(String s) {
        // convert the octal string to binary string and then to decimal string.
        String ans = "";
        //Task 3.5
        s = octal2Binary(s,"");
        ans = binary2Decimal(s);
        return ans;
    }
    public static String octal2Binary(String s,String newString){
        // this func take octal string and convert him in binary base.
        int checkNum = toInt(s.charAt(0));
        if(s.length() == 1) {
            newString = newString + intToOctal(checkNum);
            while (newString.length() != 1 & newString.charAt(newString.length() - 1) == '0') {// remove all the 0 in the end of the binary string
                newString = newString.substring(0, newString.length() - 1);
            }
        }

        else {
            newString = newString + intToOctal(checkNum);
            s = s.substring(1);
            newString = octal2Binary(s,newString);
        }
        return newString;
    }
    public static String intToOctal(int n) {
        // this func get int between 0-7 and convert it to octal base.
        String binaryString = "";
        while (n > 0) {
            int modulo = n % 2;
            binaryString = binaryString + modulo;
            n = n / 2;
        }
        while (binaryString.length() != 3) {
            // add 0 to get octal base
            binaryString = binaryString + "0";
        }
        return binaryString;
    }

    public static void main(String[] args) {
        System.out.println("Good Luck! :)");
        char c = '8';
        String s = "1011";
//        System.out.println(isNumericString(s));
//        System.out.println(legalNumericString("101010",2));
//        System.out.println(binary2Decimal("0011"));
//        System.out.println(isNumericString("0"));
//        System.out.println(octal2Decimal("1"));
//        System.out.println(legalNumericString("000",8));
//        for (int p =0;p<8;p++){
//            System.out.println(intToOctal(p));
//        }
//        System.out.println(binary2Decimal("0"));

//        System.out.println(binary2Decimal(s));



    }
}
