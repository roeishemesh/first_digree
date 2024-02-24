import java.math.BigInteger;
import java.util.Scanner;

public class Tomer_Tester_Ass3 {
    private static boolean legalInput(String s) {
        boolean check0,check1,check2,check3,check4;
        check0 = CS("1",s) | CS("2",s) | CS("3",s) | CS("4",s) |CS("0",s);
        check1 = CS("1.1",s) | CS("1.2",s) | CS("1.3",s) | CS("1.4",s);
        check2 = CS("2.1",s) | CS("2.2",s) | CS("2.3",s) | CS("2.4",s);
        check3 = CS("3.1",s) | CS("3.2",s) | CS("3.3",s) | CS("3.4",s)| CS("3.5",s);
        check4 = CS("4.1",s) | CS("4.2",s) | CS("4.3",s) | CS("4.4",s)| CS("4.5",s);
        check0 =check0 | CS("1.0",s) | CS("2.0",s) | CS("3.0",s) | CS("4.0",s) |CS("0.0",s);
        check1 =check1 | CS("1.1.0",s) | CS("1.2.0",s) | CS("1.3.0",s) | CS("1.4.0",s);
        check2 =check2 | CS("2.1.0",s) | CS("2.2.0",s) | CS("2.3.0",s) | CS("2.4.0",s);
        check3 =check3 | CS("3.1.0",s) | CS("3.2.0",s) | CS("3.3.0",s) | CS("3.4.0",s)| CS("3.5.0",s);
        check4 =check4 | CS("4.1.0",s) | CS("4.2.0",s) | CS("4.3.0",s) | CS("4.4.0",s)| CS("4.5.0",s);
        return check0|check1|check2|check3|check4;
    }
    public static void main(String[] args) {
        space();
        println("created by: Tomer Cohen (aka Tomer The Tester)");
        println("for private tutoring: 0584477500");
        space();
        println("put a number from 0-4.5");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while (!CS(input, "-1")) {
            while (!legalInput(input)) {
                println("Cant check that, its not a real number for this Assignment");
                println("Check out 'read me' file for more information");
                space();
                println("anything else to check?");
                input = scanner.next();
            }
            whatToCheck(input);
            space();
            println("anything else to check?");
            input = scanner.next();
        }
    }
    public static String matrixToString(int[][] M) {
        if (M == null) {
            return "null";
        }
        if(M.length==0)
            return "{}";
        String s = "{";
        int i=0;
        for (i = 0; i < M.length-1; i++)
            s+=arrayToString(M[i])+",";
        s+=arrayToString(M[i])+"}";
        return s;
    }
    public static String arrayToString(int[] a) {
        if (a == null) {
            return "null";
        }
        if(a.length==0)
            return "{}";
        String s = "{";
        for (int i = 0; i < a.length - 1; i++)
            s += a[i] + ",";
        s += a[a.length - 1] + "}";
        return s;
    }


    private static void whatToCheck(String s) {
        boolean check0,check1,check2,check3,check4;
        check0 = CS("1.0",s) | CS("2.0",s) | CS("3.0",s) | CS("4.0",s) |CS("0.0",s);
        check1 = CS("1.1.0",s) | CS("1.2.0",s) | CS("1.3.0",s) | CS("1.4.0",s);
        check2 = CS("2.1.0",s) | CS("2.2.0",s) | CS("2.3.0",s) | CS("2.4.0",s);
        check3 = CS("3.1.0",s) | CS("3.2.0",s) | CS("3.3.0",s) | CS("3.4.0",s)| CS("3.5.0",s);
        check4 = CS("4.1.0",s) | CS("4.2.0",s) | CS("4.3.0",s) | CS("4.4.0",s)| CS("4.5.0",s);
        boolean isDisplay=check0 || check1 || check2 || check3 || check4;
        if (isDisplay)
            s = s.substring(0, s.length() - 2);

        if (CS(s, "1") | CS(s, "0") | CS(s,"1.1")) {
            t11(isDisplay);
        }
        if (CS(s, "1") | CS(s, "0")| CS(s,"1.2")) {
            t12(isDisplay);
        }
        if (CS(s, "1") | CS(s, "0")| CS(s,"1.3")) {
            t13(isDisplay);
        }
        if (CS(s, "1") | CS(s, "0")| CS(s,"1.4")) {
            t14(isDisplay);
        }
        if (CS(s, "2") | CS(s, "0")| CS(s,"2.1")) {
            t21(isDisplay);
        }
        if (CS(s, "2") | CS(s, "0")| CS(s,"2.2")) {
            t22(isDisplay);
        }
        if (CS(s, "2") | CS(s, "0")| CS(s,"2.3")) {
            t23(isDisplay);
        }
        if (CS(s, "2") | CS(s, "0")| CS(s,"2.4")) {
            t24(isDisplay);
        }
        if (CS(s, "3") | CS(s, "0")| CS(s,"3.1")) {
            t31(isDisplay);
        }
        if (CS(s, "3") | CS(s, "0")| CS(s,"3.2")) {
            t32(isDisplay);
        }
        if (CS(s, "3") | CS(s, "0")| CS(s,"3.3")) {
            t33(isDisplay);
        }
        if (CS(s, "3") | CS(s, "0")| CS(s,"3.4")) {
            t34(isDisplay);
        }
        if (CS(s, "3") | CS(s, "0")| CS(s,"3.5")) {
            t35(isDisplay);
        }
        if (CS(s, "4") | CS(s, "0")| CS(s,"4.1")) {
            t41(isDisplay);
        }
        if (CS(s, "4") | CS(s, "0")| CS(s,"4.2")) {
            t42(isDisplay);
        }
        if (CS(s, "4") | CS(s, "0")| CS(s,"4.3")) {
            t43(isDisplay);
        }
        if (CS(s, "4") | CS(s, "0")| CS(s,"4.4")) {
            t44(isDisplay);
        }
        if (CS(s, "4") | CS(s, "0")| CS(s,"4.5")) {
            t45(isDisplay);
        }

    }
    private static void fail() {
        System.out.println();
        System.out.print("fail: ");
    }
    private static void good() {
        System.out.println("good");
    }
    public static void println(String message) {
        ThePrinter(message, 25);
    }
    public static void space() {
        System.out.println();
    }
    public static void ThePrinter(String message, int speed) {//print at a reduced speed
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            System.out.print(message.charAt(i));
            try {
                Thread.sleep(speed); // Sleep 100= 100ms (0.1 seconds)
            } catch (InterruptedException ex) {
            }
        }
        space();
    }
    public static boolean CS(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }

    private static void t11(boolean isDisplay){
        boolean good = true;
        System.out.println("checking Task1.1: ");

        if (isDisplay) {
            System.out.println("testing input #1: -10");
            space();
        }
        BigInteger bi0 = new BigInteger("-10");
        if(Assignment3BigInteger.sumSmaller(bi0).intValue()!=0) {
            System.out.println("for input:-10 :wrong, should be 0 but yours is: " + Assignment3BigInteger.sumSmaller(bi0) );
            good=false;
        }
        else{
            good();
            space();
        }

        if (isDisplay) {
            System.out.println("testing input #2: 0");
            space();
        }

        BigInteger bi1 = new BigInteger("0");
        if(Assignment3BigInteger.sumSmaller(bi1).intValue()!=0) {
            System.out.println("for input:0 :wrong, should be 0 but yours is: " + Assignment3BigInteger.sumSmaller(bi1) );
            good=false;
        }
        else{
            good();
            space();
        }

        if (isDisplay) {
            System.out.println("testing input #3: 7");
            space();
        }

        BigInteger bi2 = new BigInteger("7");
        if(Assignment3BigInteger.sumSmaller(bi2).intValue()!=21) {
            System.out.println("for input:7 :wrong, should be 21 but yours is: " + Assignment3BigInteger.sumSmaller(bi2) );
            good=false;
        }
        else{
            good();
            space();
        }

        if (isDisplay) {
            System.out.println("testing input #4: 99999");
            space();
        }

        BigInteger bi3 = new BigInteger("99999");
        BigInteger bi3tester = new BigInteger("4999850001");
        BigInteger bi3b = Assignment3BigInteger.sumSmaller(bi3);
        int test=bi3b.compareTo(bi3tester);
        if(test!=0) {
            System.out.println("for input:99999 :wrong, should be 4999850001 but yours is: " + bi3b.toString() );
            good=false;
        }
        else{
            good();
            space();
        }

        if(good)
            System.out.println("1.1: good");
    }
    private static void t12(boolean isDisplay) {
        System.out.println("checking Task1.2: ");
        System.out.println("it should print you 5 random numbers in separate rows: \n");
        Assignment3BigInteger.printRandoms(5);
    }
    private static void t13(boolean isDisplay) {

        System.out.println("checking Task1.3: ");
        boolean good=true;
        BigInteger bi0= new BigInteger("0");//false
        BigInteger bi1= new BigInteger("1");//false
        BigInteger bi2= new BigInteger("2");
        BigInteger bi3= new BigInteger("3");
        BigInteger bi4= new BigInteger("4");//false
        BigInteger bi5= new BigInteger("7");
        BigInteger bi6= new BigInteger("10");//false
        BigInteger bi7= new BigInteger("100000");//false
        BigInteger[] bi={bi0,bi1,bi2,bi3,bi4,bi5,bi6,bi7};
        boolean[] ans={false,false,true,true,false,true,false,false};
        for(int i=0;i<bi.length;i++) {
            if (isDisplay) {
                System.out.println("testing input #" + (i + 1) + ": " + bi[i].toString());
                space();
            }
            if (Assignment3BigInteger.isPrime(bi[i]) != ans[i]) {
                System.out.println("for input #" + i + ": wrong, should be " + ans[i] + " but yours is:" + Assignment3BigInteger.isPrime(bi[i]));
                good = false;
            } else {
                good();
                space();
            }
        }

        if(good)
            System.out.println("1.3: good");
    }
    private static void t14(boolean isDisplay) {
        System.out.println("checking Task1.4: ");
        boolean good=true;
        BigInteger bi3 = Assignment3BigInteger.randomPrime(2);
        if (isDisplay) {
            System.out.println("testing input #1: n=2");
            space();
        }

        if(!(bi3.intValue()==2 |bi3.intValue()==3)) {
            System.out.println("for input:2 :wrong, should be 2 or 3 but yours is: "+bi3.toString());
            good=false;
        }
        else {
            good();
            space();
        }

        if (isDisplay) {
            System.out.println("testing input #2: n=3");
            space();
        }
        BigInteger bi2 = Assignment3BigInteger.randomPrime(3);
        if(!(bi2.intValue()==2 |bi2.intValue()==3 | bi2.intValue()==5 |bi2.intValue()==7)) {
            System.out.println("for input:3 :wrong, should be 2 or 3  or 5 or 7 but yours is: "+bi2.toString());
            good=false;
        }
        else {
            good();
            space();
        }

        if (isDisplay) {
            System.out.println("testing input #3: n=5");
            space();
        }
        BigInteger bi1 = Assignment3BigInteger.randomPrime(5);
        if(!(bi1.intValue()==2 |bi1.intValue()==3 | bi1.intValue()==5 |bi1.intValue()==7 | bi1.intValue()==11 |bi1.intValue()==13 | bi1.intValue()==17 |bi1.intValue()==19 |bi1.intValue()==23 |bi1.intValue()==29 | bi1.intValue()==31)) {
            System.out.println("for input:5 :wrong, should be 2 or 3  or 5 or 7 or 11 or 13 or 17 or 19 or 23 or 29 or 31 but yours is: "+bi1.toString());
            good=false;
        }
        else {
            good();
            space();
        }
        if(good)
            System.out.println("1.4: good");
    }
    private static void t21(boolean isDisplay) {
        System.out.println("checking Task2.1: ");
        boolean good = true;
        int[][]mat0 = {{10,10,10,10},
                        {10,10,10,10},
                        {10,10,10,10},
                        {10,10,10,10}};
        int[][]mat1 = {{22,10,10,10},
                {10,10,10,10},
                {10,10,33,10},
                {10,10,10,10}};
        int[][]mat2 =   {{11,11,10,10},
                        {9,10,20,10},
                        {10,10,10,3},
                        {10,2,2,10}};
        int[][]mat3 =   {{12,11,10,10},
                        {9,10,10,10},
                        {10,10,20,1},
                        {10,1,0,10}};
        int[][]mat4 =   {{30,11,10,30},
                {9,10,10,10},
                {10,10,20,1},
                {33,1,0,10}};
        int[][]mat5 =   {{30,11,10,20},
                {9,10,10,10},
                {10,10,20,0},
                {10,1,0,10}};
        int[][][] mats={mat0,mat1,mat2,mat3,mat4,mat5};
        boolean[] ans= {true,false,true,true,true,false};
        boolean input;
        boolean check;
        for (int i = 0; i < mats.length; i++) {
            if (isDisplay) {
                System.out.println("testing matrix #" + (i + 1) + " which is: \n" + matrixToString(mats[i]));
            }
            input = Paths.findIfPath(mats[i]);
            check = input == ans[i];
            if (!check) {
                if (!isDisplay) {
                    System.out.println("testing matrix #" + (i + 1) + " which is: \n" + matrixToString(mats[i]));
                }
                fail();
                good = false;
                System.out.println("the input should get you " + ans[i] + " but yours is: " + input);
                space();
            } else if (isDisplay) {
                good();
                space();
            }
        }

        if(good)
            System.out.println("2.1: good");

    }
    private static void t22(boolean isDisplay) {
        System.out.println("checking Task2.2: ");
        boolean good = true;
        int[][]mat0 = {{10,0,10,10},
                {32,10,10,10},
                {10,10,10,10},
                {10,10,10,10}};
        int[][]mat1 = {{22,10,10,10},
                {10,10,10,10},
                {10,10,33,10},
                {10,10,10,10}};
        int[][]mat2 =   {{11,11,10,10},
                {9,10,20,10},
                {10,10,10,1},
                {10,2,2,10}};
        int[][]mat3 =   {{12,11,10,10},
                {9,10,10,10},
                {10,10,10,1},
                {10,1,0,10}};
        int[][]mat4 =   {{30,11,10,30},
                {9,10,10,10},
                {10,10,20,1},
                {10,1,1,10}};
        int[][]mat5 =   {{30,11,10,20},
                {9,10,10,10},
                {10,10,20,0},
                {10,1,0,10}};
        int[][][] mats={mat0,mat1,mat2,mat3,mat4,mat5};
        int[] ans= {1,0,2 ,3,2,0};
        int input;
        boolean check;
        for (int i = 0; i < mats.length; i++) {
            if (isDisplay) {
                System.out.println("testing matrix #" + (i + 1) + " which is: \n" + matrixToString(mats[i]));
            }
            input = Paths.countPaths(mats[i]);
            check = input == ans[i];
            if (!check) {
                if (!isDisplay) {
                    System.out.println("testing matrix #" + (i + 1) + " which is: \n" + matrixToString(mats[i]));
                }
                fail();
                good = false;
                System.out.println("the input should get you " + ans[i] + " but yours is: " + input);
                space();
            } else if (isDisplay) {
                good();
                space();
            }
        }

        if(good)
            System.out.println("2.2: good");
    }
    private static void t23(boolean isDisplay) {
        System.out.println("checking Task2.3: ");
        boolean good = true;
        int[][]mat0 = {{10,0,10,10},
                {32,10,10,10},
                {10,10,10,10},
                {10,10,10,10}};
        int[][]mat1 = {{22,10,10,10},
                {10,10,10,10},
                {10,10,33,10},
                {10,10,10,10}};
        int[][]mat2 =   {{11,11,10,10},
                {9,10,20,10},
                {10,10,10,1},
                {10,2,2,10}};
        int[][]mat3 =   {{12,11,10,10},
                {9,10,10,2},
                {10,10,11,1},
                {10,1,0,10}};
        int[][]mat4 =   {{30,11,10,30},
                {9,10,10,10},
                {10,10,20,1},
                {10,1,1,10}};
        int[][]mat5 =   {{30}};
        int[][][] mats={mat0,mat1,mat2,mat3,mat4,mat5};
        String[] ans= {"[0][0]->[1][0]->[3][3]","","[0][0]->[1][1]->[2][1]->[3][1]->[3][3]\n[0][0]->[1][1]->[2][1]->[2][2]->[2][3]->[3][3]","[0][0]->[1][2]->[1][3]" +
                "->[3][3]\n[0][0]->[1][2]->[2][2]->[3][3]\n[0][0]->[2][1]->[2][2]->[3][3]","[0][0]->[0][3]->[3][3]\n[0][0]->[3][0]->3[1]->[3][2]->[3][3]","[0][0]"};
        for (int i = 0; i < mats.length; i++) {
            System.out.println("testing matrix #" + (i + 1) + " which is: \n" + matrixToString(mats[i]));
            System.out.println("the input should print you those in some order:" + ans[i]+"\n");
            System.out.println("your printPaths prints: \n");
            Paths.printPaths(mats[i]);
        }

        if(good)
            System.out.println("2.3: good (?)");

    }
    private static void t24(boolean isDisplay) {
        System.out.println("checking Task2.4: ");
        boolean good = true;
        int[][]mat0 = {{10,10,10,10},
                {32,10,10,10},
                {10,10,10,10},
                {10,10,10,10}};
        int[][]mat3 =   {{12,11,10,10},
                {9,10,10,10},
                {10,10,11,10},
                {10,1,0,10}};
        int[][]mat4 =   {{30,11,10,30},
                {9,10,10,10},
                {10,10,20,1},
                {10,1,1,10}};
        int[][]mat5 =   {{30,11,10,20},
                {9,10,10,10},
                {10,10,20,0},
                {10,1,0,10}};
        int[][]mat6 =   {{30}};

        int[][][] mats={mat0,mat0,mat0,mat3,mat3,mat4,mat4,mat5,mat6,mat6};
        int[] costs ={60,30,41,33,42,41,70,10000,30,0};
        boolean[] ans= {true,true,false,true,true,true,true,false,true,false};
        boolean input;
        boolean check;
        for (int i = 0; i < mats.length; i++) {
            if (isDisplay) {
                System.out.println("testing matrix #" + (i + 1) + " which is: \n" + matrixToString(mats[i])+" cost="+costs[i]);
            }
            input = Paths.ifSubPath(mats[i],costs[i]);
            check = input == ans[i];
            if (!check) {
                if (!isDisplay) {
                    System.out.println("testing matrix #" + (i + 1) + " which is: \n" + matrixToString(mats[i])+" cost="+costs[i]);
                }
                fail();
                good = false;
                System.out.println("the input should get you " + ans[i] + " but yours is: " + input);
                space();
            } else if (isDisplay) {
                good();
                space();
            }
        }

        if(good)
            System.out.println("2.4: good");
    }
    private static void t31(boolean isDisplay) {
        System.out.println("checking Task3.1: ");
        boolean good=true;
        String s = "72849";
        int b = 2;
        boolean ans1=NumericalString.legalNumericString(s, b);
        if (isDisplay) {
            System.out.println("testing input #1: 72849 , b=2");
            space();
        }
        if(ans1){
            System.out.println("input 72849 b=2 should be false but yours is: " + ans1);
            good=false;
        }
        String s1 = "72849";
        b = 10;
        if (isDisplay) {
            System.out.println("testing input #2: 72849 , b=10");
            space();
        }
        boolean ans2=NumericalString.legalNumericString(s1, b);
        if(!ans2){
            System.out.println("input 72849 b=10 should be true but yours is: " + ans2);
            good=false;
        }
        String s2 = "1112111";
        b = 2;
        if (isDisplay) {
            System.out.println("testing input #3: 1112111 , b=2");
            space();
        }
        boolean ans3=NumericalString.legalNumericString(s2, b);
        if(ans3){
            System.out.println("input 1112111  b=2 should be false but yours is: " + ans3);
            good=false;
        }
        if(good)
            System.out.println("3.1: good");
    }
    private static void t32(boolean isDisplay) {
        System.out.println("checking Task3.1: ");
        boolean good=true;
        if (isDisplay) {System.out.println("testing input #1: 5");space();}
        String s = "5";
        String ans=NumericalString.decimalIncrement(s);
        if(!(CS(ans,"6"))) {
            System.out.println("input 5: wrong, should be 6 but yours is: " + ans);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #2: 4321");space();}
        String s1 = "4321";
        String ans1=NumericalString.decimalIncrement(s1);
        if(!(CS(ans1,"5321"))) {
            System.out.println("input 4321: wrong, should be 5321 but yours is: " + ans1);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #3: 9999999999999999999999999999999999999999");space();}
        String s2 = "9999999999999999999999999999999999999999";
        String ans2=NumericalString.decimalIncrement(s2);
        if(!(CS(ans2,"00000000000000000000000000000000000000001"))) {
            System.out.println("input 9999999999999999999999999999999999999999: wrong, should be 00000000000000000000000000000000000000001 but yours is: " + ans2);
            good=false;
        }
        if(good)
            System.out.println("3.2: good");
    }
    private static void t33(boolean isDisplay) {
        System.out.println("checking Task3.3: ");
        boolean good=true;
        if (isDisplay) {System.out.println("testing input #1: 5");space();}
        String s = "5";
        String ans=NumericalString.decimalDouble(s);
        if(!(CS(ans,"01"))) {
            System.out.println("input 5: wrong, should be 01 but yours is: " + ans);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #2: 4321");space();}
        String s1 = "4321";
        String ans1=NumericalString.decimalDouble(s1);
        if(!(CS(ans1,"8642"))) {
            System.out.println("input 4321: wrong, should be 8642 but yours is: " + ans1);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #3: 9999999999999999999999999999999999999999");space();}
        String s2 = "9999999999999999999999999999999999999999";
        String ans2=NumericalString.decimalDouble(s2);
        if(!(CS(ans2,"89999999999999999999999999999999999999991"))) {
            System.out.println("input 9999999999999999999999999999999999999999: wrong, should be 89999999999999999999999999999999999999991 but yours is: " + ans2);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #4: 642");space();}
        s1 = "642";
        ans1=NumericalString.decimalDouble(s1);
        if(!(CS(ans1,"294"))) {
            System.out.println("input 642: wrong, should be 294 but yours is: " + ans1);
            good=false;
        }

        if(good)
            System.out.println("3.3: good");
    }
    private static void t34(boolean isDisplay){
        System.out.println("checking Task3.4: ");
        boolean good=true;
        if (isDisplay) {System.out.println("testing input #1: 0");space();}
        String s = "0";
        String ans=NumericalString.binary2Decimal(s);
        if(!(CS(ans,"0"))) {
            System.out.println("input 0: wrong, should be 0 but yours is: " + ans);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #2: 1");space();}
        String s1 = "1";
        String ans1=NumericalString.binary2Decimal(s1);
        if(!(CS(ans1,"1"))) {
            System.out.println("input 1: wrong, should be 1 but yours is: " + ans1);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #3: 11111111");space();}
        String s2 = "11111111";
        String ans2=NumericalString.binary2Decimal(s2);
        if(!(CS(ans2,"552"))) {
            System.out.println("input 11111111: wrong, should be 552 but yours is: " + ans2);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #4: 011111111");space();}
        String s3 = "011111111";
        String ans3=NumericalString.binary2Decimal(s3);
        if(!(CS(ans3,"015"))) {
            System.out.println("input 011111111: wrong, should be 015 but yours is: " + ans3);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #5: 1011");space();}
        String s4 = "1011";
        String ans4=NumericalString.binary2Decimal(s4);
        if(!(CS(ans4,"31"))) {
            System.out.println("input 1011: wrong, should be 31 but yours is: " + ans4);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #6: 0011");space();}
        String s5 = "0011";
        String ans5=NumericalString.binary2Decimal(s5);
        if(!(CS(ans5,"21"))) {
            System.out.println("input 0011: wrong, should be 21 but yours is: " + ans5);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #7: 11111111111111111111111111111111111111111111111111");space();}
        String s6 = "11111111111111111111111111111111111111111111111111";
        String ans6=NumericalString.binary2Decimal(s6);
        if(!(CS(ans6,"3262486099985211"))) {
            System.out.println("input 11111111111111111111111111111111111111111111111111: wrong, should be 3262486099985211 but yours is: " + ans6);
            good=false;
        }

        if(good)
            System.out.println("3.4: good");
    }
    private static void t35(boolean isDisplay) {
        System.out.println("checking Task3.5: ");
        boolean good=true;
        if (isDisplay) {System.out.println("testing input #1: 651");space();}
        String s20 = "651";
        String ans44=NumericalString.octal2Decimal(s20);
        if(!(CS(ans44,"011"))) {
            System.out.println("input 651: wrong, should be 011 but yours is: " + ans44);
            good=false;
        }

        if (isDisplay) {System.out.println("testing input #2: 0");space();}

        String s = "0";
        String ans=NumericalString.octal2Decimal(s);
        if(!(CS(ans,"0"))) {
            System.out.println("input 0: wrong, should be 0 but yours is: " + ans);
            good=false;
        }

        if (isDisplay) {System.out.println("testing input #3: 1");space();}
        String s1 = "1";
        String ans1=NumericalString.octal2Decimal(s1);
        if(!(CS(ans1,"1"))) {
            System.out.println("input 1: wrong, should be 1 but yours is: " + ans1);
            good=false;
        }

        if (isDisplay) {System.out.println("testing input #4: 276");space();}
        String s4 = "276";
        String ans4=NumericalString.octal2Decimal(s4);
        if(!(CS(ans4,"244"))) {
            System.out.println("input 276: wrong, should be 244 but yours is: " + ans4);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #5: 1234567");space();}
        String s2 = "1234567";
        String ans2=NumericalString.octal2Decimal(s2);
        if(!(CS(ans2,"3534502"))) {
            System.out.println("input 1234567: wrong, should be 3534502 but yours is: " + ans2);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #6: 07777");space();}
        String s3 = "07777";
        String ans3=NumericalString.octal2Decimal(s3);
        if(!(CS(ans3,"06723"))) {
            System.out.println("input 07777: wrong, should be 06723 but yours is: " + ans3);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #7: 6677");space();}
        String s5 = "6677";
        String ans5=NumericalString.octal2Decimal(s5);
        if(!(CS(ans5,"6804"))) {
            System.out.println("input 6677: wrong, should be 6804 but yours is: " + ans5);
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #8: 55555555555555555555555555555555555555555555555555");space();}
        String s6 = "55555555555555555555555555555555555555555555555555";
        String ans6=NumericalString.octal2Decimal(s6);
        if(!(CS(ans6,"5440933720422876069458195570024117467362649101"))) {
            System.out.println("input 55555555555555555555555555555555555555555555555555: wrong, should be 5440933720422876069458195570024117467362649101 but yours is: " + ans6);
            good=false;
        }

        if(good)
            System.out.println("3.5: good");

    }
    private static void t41(boolean isDisplay) {
        System.out.println("4.1: cant test this task. please continue to test 4.2 and 4.3");
    }
    private static void t42(boolean isDisplay) {
        System.out.println("checking Task4.2: ");

        boolean good=true;
        if (isDisplay) {System.out.println("testing input #1: true");space();}
        Bit b= new Bit(true);
        if(b.toInt()!=1) {
            System.out.println("input true: wrong, should be 1 but yours is: "+b.toInt());
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #2: false");space();}
        Bit b1= new Bit(false);
        if(b1.toInt()!=0) {
            System.out.println("input false: wrong, should be 0 but yours is: "+b1.toInt());
            good=false;
        }

        if(good)
            System.out.println("4.2: good");
    }
    private static void t43(boolean isDisplay) {
        System.out.println("checking Task4.3: ");

        if (isDisplay) {System.out.println("testing input #1: true");space();}
        boolean good=true;
        Bit b= new Bit(true);
        if(!(CS(b.toString(),"1"))) {
            System.out.println("input true: wrong, should be 1 but yours is: "+b.toInt());
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #2: false");space();}
        Bit b1= new Bit(false);
        if(!(CS(b1.toString(),"0"))) {
            System.out.println("input false: wrong, should be 0 but yours is: "+b1.toInt());
            good=false;
        }

        if(good)
            System.out.println("4.3: good");

    }
    private static void t44(boolean isDisplay) {
        System.out.println("4.4: cant test this. use test 4.5");
    }
    private static void t45(boolean isDisplay) {
        System.out.println("checking Task4.5: ");

        boolean good = true;
        if (isDisplay) {System.out.println("testing input #1: 1011");space();}
        BitVector number = new BitVector("1011");

        if(!(CS(number.toString(),"13"))) {
            System.out.println("for input 1011: wrong, should be 13 but yours is: "+ number.toString());
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #2: 10110101");space();}
        BitVector number1 = new BitVector("10110101");
        if(!(CS(number1.toString(),"173"))) {
            System.out.println("for input 10110101: wrong, should be 173 but yours is: "+ number1.toString());
            good=false;
        }
        if (isDisplay) {System.out.println("testing input #3: 0");space();}
        BitVector number2 = new BitVector("0");
        String test = number2.toString();
        if(!(CS(number2.toString(),"0"))) {
            System.out.println("for input 0: wrong, should be 0 but yours is: "+ number2.toString());
            good=false;
        }
        if(good)
            System.out.println("4.5: good");
    }

}
