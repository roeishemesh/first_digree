import java.math.BigInteger;
public class test {
    public static void main(String[] args) {
        String a= "7654321";
        String b = "111";
//        System.out.println(sumOfStrings(a,b,"",0));
        String d = "1";
//        System.out.println(d.substring(1));
//        System.out.println(binary2Decimal("110101","0","1"));
        for(int p = 0;p<8;p++){
            System.out.println(intToOctal(p));
        }
    }
    public static int toInt(char c) {
        return "0123456789".indexOf(c);
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
    public static String sumOfStrings(String a,String b){
        String ans;
        if(b.length() > a.length()){
            ans = sumOfStrings(b,a,"",0);
        }
        else {ans = sumOfStrings(a,b,"",0);}
        return ans;
    }
    public static String sumOfStrings(String a,String b, String newString, int carryOut){
        int aNum = toInt(a.charAt(0));
        int bNum = toInt(b.charAt(0));
        int sumNums = aNum + bNum + carryOut;
        carryOut = sumNums / 10;
        int newNum = sumNums % 10;
        if (a.length() == 1){
            if(carryOut == 1){
                newString = newString + newNum + carryOut;}
            else {
                newString = newString + newNum;
            }
        }
        else if(b.length() == 1 & carryOut == 0 & toInt(b.charAt(0)) == 0){
            newString = newString + a;

        }
        else {
            newString = newString + newNum;
            a = a.substring(1);
            b = b.substring(1);
            if(b.length() == 0){
                newString = sumOfStrings(a,"0",newString,carryOut);
            }
            else {
                newString = sumOfStrings(a,b,newString,carryOut);
            }

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
    public static String binary2Decimal(String s,String newString, String pow) {
        int checkNum;
       if(s.length() == 1){
           checkNum = toInt(s.charAt(0));
           if (checkNum == 0){newString = newString;}
           else {
               newString = sumOfStrings(newString,pow);
           }
       }
       else{
           checkNum = toInt(s.charAt(0));
           if (checkNum == 0){
               newString = newString;
           }
           else {
               newString = sumOfStrings(newString,pow);
               pow = decimalDouble(pow);
               binary2Decimal(s.substring(1),newString,pow);
           }
       }
        return newString;
    }
    public static String intToOctal(int n) {
        // this func get int between 0-7 and return him in octal base.
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
}

