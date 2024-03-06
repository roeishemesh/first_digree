import java.util.Scanner;

public class Tomer_Tester_Ass4 {

    private static boolean legalInput(String s) {
        boolean check0,check1,check2,check3,check4;
        check0 = CS("1",s) | CS("2",s) | CS("3",s) | CS("4",s)  |CS("0",s);
        check1 = CS("1.1",s);
        check2 = CS("2.1",s) | CS("2.2",s) | CS("2.3",s) | CS("2.4",s) | CS("2.5",s) | CS("2.6",s) | CS("2.7",s);;
        check3 = CS("3.1",s) | CS("3.2",s) | CS("3.3",s) | CS("3.4",s)| CS("3.5",s) | CS("3.6",s) | CS("3.7",s) | CS("3.8",s) | CS("3.9",s)| CS("3.10",s)| CS("3.11",s)| CS("3.12",s) | CS("4.1",s);
        check0 =check0 | CS("1.0",s) | CS("2.0",s) | CS("3.0",s) | CS("4.0",s) |CS("0.0",s);
        check1 =check1 | CS("1.1.0",s);
        check2 =check2| CS("2.1.0",s) | CS("2.2.0",s) | CS("2.3.0",s) | CS("2.4.0",s) | CS("2.5.0",s) | CS("2.6.0",s) | CS("2.7.0",s);;
        check3 =check3| CS("3.1.0",s) | CS("3.2.0",s) | CS("3.3.0",s) | CS("3.4.0",s)| CS("3.5.0",s) | CS("3.6.0",s) | CS("3.7.0",s) | CS("3.8.0",s) | CS("3.9.0",s)| CS("3.10.0",s)| CS("3.11.0",s)| CS("3.12.0",s) | CS("4.1.0",s);
        return check0|check1|check2|check3;
    }
    public static boolean CS(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }
    public static void space() {
        System.out.println();
    }
    private static void fail() {
        System.out.print("\n\nfail: ");
    }
    private static void good() {
        System.out.println("good");
    }
    public static void println(String message) {
        ThePrinter(message, 25);
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

    public static void main(String[] args) {
        space();
        println("created by: Tomer Cohen (aka Tomer The Tester)");
        println("for private tutoring: 0584477500");
        space();
        println("put a number from 0-4.1");
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

    private static void whatToCheck(String s) {
        boolean check0,check1,check2,check3;
        check0 = CS("1.0",s) | CS("2.0",s) | CS("3.0",s) | CS("4.0",s) |CS("0.0",s);
        check1 = CS("1.1.0",s);
        check2 = CS("2.1.0",s) | CS("2.2.0",s) | CS("2.3.0",s) | CS("2.4.0",s) | CS("2.5.0",s) | CS("2.6.0",s) | CS("2.7.0",s);;
        check3 = CS("3.1.0",s) | CS("3.2.0",s) | CS("3.3.0",s) | CS("3.4.0",s)| CS("3.5.0",s) | CS("3.6.0",s) | CS("3.7.0",s) | CS("3.8.0",s) | CS("3.9.0",s)| CS("3.10.0",s)| CS("3.11.0",s)| CS("3.12.0",s) | CS("4.1.0",s);
        boolean isDisplay=check0 || check1 || check2 || check3;
        if (isDisplay)
            s = s.substring(0, s.length() - 2);

        if (CS(s, "1") | CS(s, "0") | CS(s,"1.1")) {
            t11(isDisplay);
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
        if (CS(s, "2") | CS(s, "0")| CS(s,"2.5")) {
            t25(isDisplay);
        }
        if (CS(s, "2") | CS(s, "0")| CS(s,"2.6")) {
            t26(isDisplay);
        }
        if (CS(s, "2") | CS(s, "0")| CS(s,"2.7")) {
            t27(isDisplay);
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
        if (CS(s, "3") | CS(s, "0")| CS(s,"3.6")) {
            t36(isDisplay);
        }
        if (CS(s, "3") | CS(s, "0")| CS(s,"3.7")) {
            t37(isDisplay);
        }
        if (CS(s, "3") | CS(s, "0")| CS(s,"3.8")) {
            t38(isDisplay);
        }
        if (CS(s, "3") | CS(s, "0")| CS(s,"3.9")) {
            t39(isDisplay);
        }
        if (CS(s, "3") | CS(s, "0")| CS(s,"3.10")) {
            t310(isDisplay);
        }
        if (CS(s, "3") | CS(s, "0")| CS(s,"3.11")) {
            t311(isDisplay);
        }
        if (CS(s, "3") | CS(s, "0")| CS(s,"3.12")) {
            t312(isDisplay);
        }
        if (CS(s, "4") | CS(s, "0")| CS(s,"4.1")) {
            t41(isDisplay);
        }
    }

    private static void t11(boolean isDisplay) {
        Bit b1 = new Bit(true);
        Bit b0 = new Bit(false);
        Bit ans;
        boolean good= true;

        System.out.println("checking 1.1:");
        System.out.print("fullAdderCarry: ");

        if (isDisplay) {
            System.out.println("testing input #1: 0,0,0");
        }
        ans=Bit.fullAdderCarry( b0, b0, b0);
        if(ans.toInt()!=0){
            fail();
            System.out.println("Input 0,0,0 should be 0 but yours is: " + ans);
            good=false;
        }

        if (isDisplay) {
            System.out.println("testing input #2: 0,1,0");
        }
        ans=Bit.fullAdderCarry( b0, b1, b0);
        if(ans.toInt()!=0){
            fail();
            System.out.println("Input 0,1,0 should be 0 but yours is: " + ans);
            good=false;
        }

        if (isDisplay) {
            System.out.println("testing input #3: 1,0,1");
        }
        ans=Bit.fullAdderCarry( b1, b0, b1);
        if(ans.toInt()!=1){
            fail();
            System.out.println("Input 1,0,1 should be 1 but yours is: " + ans);
            good=false;
        }

        if (isDisplay) {
            System.out.println("testing input #4: 1,1,1");
        }
        ans=Bit.fullAdderCarry( b1, b1, b1);
        if(ans.toInt()!=1){
            fail();
            System.out.println("Input 1,1,1 should be 1 but yours is: " + ans);
            good=false;
        }

        if(good)
            good();

        System.out.print("fullAdderSum:");

        if (isDisplay) {
            System.out.println("testing input #1: 0,0,0");
        }

        good=true;
        ans=Bit.fullAdderSum( b0, b0, b0);
        if(ans.toInt()!=0){
            fail();
            System.out.println("Input 0,0,0 should be 0 but yours is: " + ans);
            good=false;
        }

        if (isDisplay) {
            System.out.println("testing input #2: 0,1,0");
        }

        ans=Bit.fullAdderSum( b0, b1, b0);
        if(ans.toInt()!=1){
            fail();
            System.out.println("Input 0,1,0 should be 1 but yours is: " + ans);
            good=false;
        }

        if (isDisplay) {
            System.out.println("testing input #3: 1,0,1");
        }

        ans=Bit.fullAdderSum( b1, b0, b1);
        if(ans.toInt()!=0){
            fail();
            System.out.println("Input 1,0,1 should be 0 but yours is: " + ans);
            good=false;
        }

        if (isDisplay) {
            System.out.println("testing input #4: 1,1,1");
        }

        ans=Bit.fullAdderSum( b1, b1, b1);
        if(ans.toInt()!=1){
            fail();
            System.out.println("Input 1,1,1 should be 1 but yours is: " + ans);
            good=false;
        }

        if(good)
            good();
    }
    private static void t21(boolean isDisplay) {
        BitList BL = new BitList();
        boolean good = true;
        Bit b1 = new Bit(1);
        Bit b0 = new Bit(0);
        boolean ans;

        System.out.println("checking 2.1:");
        System.out.print("addLast: ");

        if (isDisplay) {
            System.out.println("testing input : adding last 1, 1, 0, 0");
        }

        BL.addLast(b1);
        BL.addLast(b1);
        BL.addLast(b0);
        BL.addLast(b0);
        ans=BL.getFirst().toInt()==b1.toInt();
        if(!ans){
            fail();
            System.out.println("Input 1,1,0,0 your first isn't 1 its: " + BL.getFirst().toInt());
            good=false;
        }
        ans=BL.getLast().toInt()==b0.toInt();
        if(!ans){
            fail();
            System.out.println("Input 1,1,0,0 your last isn't 0 its: " + BL.getLast().toInt());
            good=false;
        }
        if(good)
            good();

        space();

        if(good){
            System.out.print("removeLast: ");
            if (isDisplay) {
                System.out.println("testing input : 1, 1, 0, 0");
            }
            Bit last=BL.removeLast();
            ans=last.toInt()==0;

            if(!ans){
                fail();
                System.out.println("Input 1,1,0,0 with add last removed last should send 0 but yours send: " + last.toInt());
                good=false;
            }
            ans=BL.getLast().toInt()==0;
            if(!ans){
                fail();
                System.out.println("Input 1,1,0,0 with add last after removing last, the last Bit should be 0 but yours is: " + BL.getLast().toInt());
                good=false;
            }
            BL.removeLast();
            ans=BL.getLast().toInt()==1;
            if(!ans){
                fail();
                System.out.println("Input 1,1,0,0 with add last after removing last , the last Bit should be 1 but yours is: " + BL.getLast().toInt());
                good=false;
            }
            last=BL.removeLast();
            ans=last.toInt()==1;
            if(!ans){
                fail();
                System.out.println("Input 1,1,0,0 with add last after removing last 2 times remove first should send 1 but yours send: " + last.toInt());
                good=false;
            }
            if(good)
                good();
        }//if removeLast
        else {
            System.out.println();
            System.out.println("cant check removeLast, fix addLast please");
            System.out.println();
        }

        System.out.print("addFirst: ");
        good=true;
        BL = new BitList();

        if (isDisplay) {
            System.out.println("testing input : adding first 0, 0, 1, 1");
        }
        BL.addFirst(b0);
        BL.addFirst(b0);
        BL.addFirst(b1);
        BL.addFirst(b1);
        ans=BL.getFirst().toInt()==b1.toInt();
        if(!ans){
            fail();
            System.out.println("Input 0, 0, 1, 1 your first isn't 1 its: " + BL.getFirst().toInt());
            good=false;
        }
        ans=BL.getLast().toInt()==b0.toInt();
        if(!ans){
            fail();
            System.out.println("Input 0, 0, 1, 1 your last isn't 0 its: " + BL.getLast().toInt());
            good=false;
        }
        if(good)
            good();

        space();
        if(good){
            System.out.print("removeFirst: ");
            if (isDisplay) {
                System.out.println("testing input :  0, 0, 1, 1");
            }
            Bit first=BL.removeFirst();
            ans=first.toInt()==1;
            if(!ans){
                fail();
                System.out.println("Input 0, 0, 1, 1 with add first remove first should send 1 but yours send: " + first.toInt());
                good=false;
            }
            ans=BL.getFirst().toInt()==1;
            if(!ans){
                fail();
                System.out.println("Input 0, 0, 1, 1 with add first after removing first, the first Bit should be 1 but yours is: " + BL.getFirst().toInt());
                good=false;
            }
            BL.removeFirst();
            ans=BL.getFirst().toInt()==0;
            if(!ans){
                fail();
                System.out.println("Input 0, 0, 1, 1 with add first after removing first 2 times, the First Bit should be 0 but yours is: " + BL.getFirst().toInt());
                good=false;
            }
            first=BL.removeFirst();
            ans=first.toInt()==0;
            if(!ans){
                fail();
                System.out.println("Input 0, 0, 1 ,1  with add first after removing first 3 time should send 0 but yours send: " + first.toInt());
                good=false;
            }
            if(good)
                good();
        }//if removeFirst
        else {
            System.out.println();
            System.out.println("cant check removeFirst, fix addFirst please ");
            System.out.println();
        }
    }
    private static void t22(boolean isDisplay) {

        System.out.print("checking 2.2: ");
        boolean good=true;
        String ans;
        if (isDisplay) {
            System.out.println("testing input : <001>");
        }
        BitList b1 = new BitList();
        b1.addFirst(Bit.ZERO);
        b1.addFirst(Bit.ZERO);
        b1.addFirst(Bit.ONE);
        ans=b1.toString();
        if(!CS(ans,"<001>")){
            System.out.println();
            fail();
            System.out.println("input 001 should be <001> but yours is: "+ans);
            good=false;
        }

        if (isDisplay) {
            System.out.println("testing input : <101>");
        }

        b1 = new BitList();
        b1.addFirst(Bit.ONE);
        b1.addFirst(Bit.ZERO);
        b1.addFirst(Bit.ONE);
        ans=b1.toString();
        if(!CS(ans,"<101>")){
            System.out.println();
            fail();
            System.out.println("input 101 should be <101> but yours is: "+ans);
            good=false;
        }

        if (isDisplay) {
            System.out.println("testing input : <101111>");
        }

        b1 = new BitList();
        b1.addFirst(Bit.ONE);
        b1.addFirst(Bit.ZERO);
        b1.addFirst(Bit.ONE);
        b1.addFirst(Bit.ONE);
        b1.addFirst(Bit.ONE);
        b1.addFirst(Bit.ONE);
        ans=b1.toString();
        if(!CS(ans,"<101111>")){
            System.out.println();
            fail();
            System.out.println("input 101111 should be <101111> but yours is: "+ans);
            good=false;
        }
        if(good)
            good();
        System.out.println();
    }
    private static void t23(boolean isDisplay) {
        System.out.print("checking 2.3:");
        boolean good=true;
        String ans;
        if (isDisplay) {
            System.out.println("testing #1 input : <001>");
        }

        BitList b1 = new BitList();
        b1.addFirst(Bit.ZERO);
        b1.addFirst(Bit.ZERO);
        b1.addFirst(Bit.ONE);
        if (isDisplay) {
            System.out.println("coping 001");
        }
        BitList b2 = new BitList(b1);
        if (isDisplay) {
            System.out.println("adding bits to the new bit and creating: <001111>");
        }
        b2.addFirst(Bit.ONE);
        b2.addFirst(Bit.ONE);
        b2.addFirst(Bit.ONE);
        ans=b1.toString();
        if(!CS(ans,"<001>")){
            System.out.println();
            fail();
            System.out.println("input <001> should be <001> but yours is: "+ans);
            good=false;
        }
        ans=b2.toString();
        if(!CS(ans,"<001111>")){
            System.out.println();
            fail();
            System.out.println("input <001111> should be <001111> but yours is: "+ans);
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 input : <101111>");
        }
        b1 = new BitList();
        b1.addFirst(Bit.ONE);
        b1.addFirst(Bit.ZERO);
        b1.addFirst(Bit.ONE);
        b1.addFirst(Bit.ONE);
        b1.addFirst(Bit.ONE);
        b1.addFirst(Bit.ONE);
        if (isDisplay) {
            System.out.println("coping 101111");
        }
        b2 = new BitList(b1);
        if (isDisplay) {
            System.out.println("removing bits to the new bit and creating: <101>");
        }
        b2.removeFirst();
        b2.removeFirst();
        b2.removeFirst();
        ans=b1.toString();
        if(!CS(ans,"<101111>")){
            System.out.println();
            fail();
            System.out.println("input <101111> should be <101111> but yours is: "+ans);
            good=false;
        }
        ans=b2.toString();
        if(!CS(ans,"<101>")){
            System.out.println();
            fail();
            System.out.println("input <101> should be <101> but yours is: "+ans);
            good=false;
        }

        if(good)
            good();
        System.out.println();
    }
    private static void t24(boolean isDisplay) {
        boolean good=true;
        boolean ans;
        System.out.print("checking 2.4: ");
        BitList b1 = new BitList();
        if (isDisplay) {
            System.out.println("testing #1 input : <>");
        }
        ans=b1.isNumber();
        if(ans){
            System.out.println();
            fail();
            System.out.println("Input nothing should be false but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 input : <0>");
        }

        b1.addFirst(Bit.ZERO);
        ans=b1.isNumber();
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 0 should be true but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 input : <1>");
        }

        b1.removeFirst();
        b1.addFirst(Bit.ONE);
        ans=b1.isNumber();
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 1 should be false but yours is: " + ans );
            good=false;
        }

        if (isDisplay) {
            System.out.println("testing #4 input : <10>");
        }

        b1.addFirst(Bit.ZERO);
        ans=b1.isNumber();
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 10 should be false but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #5 input : <100>");
        }

        b1.addFirst(Bit.ZERO);
        ans=b1.isNumber();
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 100 should be false but yours is: " + ans );
            good=false;
        }

        if(good)
            good();
        System.out.println();
    }
    private static void t25(boolean isDisplay) {
        boolean good=true;
        boolean ans;
        System.out.println("checking 2.5: ");
        System.out.print("isReduced :");
        if (isDisplay) {
            System.out.println("testing #1 input : <>");
        }
        BitList b1 = new BitList();
        ans=b1.isReduced();
        if(ans){
            System.out.println();
            fail();
            System.out.println("Input nothing should be false but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 input : <1>");
        }

        b1.addFirst(Bit.ONE);
        ans=b1.isReduced();
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 1 should be false but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 input : <01>");
        }

        b1.addLast(Bit.ZERO);
        ans=b1.isReduced();
        if(ans){
            System.out.println();
            fail();
            System.out.println("Input 01 should be false but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #4 input : <001>");
        }

        b1.addLast(Bit.ZERO);
        ans=b1.isReduced();
        if(ans){
            System.out.println();
            fail();
            System.out.println("Input 001 should be false but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #4 input : <1001>");
        }

        b1.addLast(Bit.ONE);
        ans=b1.isReduced();
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 1001 should be true but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #5 input : <01001>");
        }

        b1.addLast(Bit.ZERO);
        ans=b1.isReduced();
        if(ans){
            System.out.println();
            fail();
            System.out.println("Input 01001 should be false but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #6 input : <00001001>");
        }

        b1.addLast(Bit.ZERO);
        b1.addLast(Bit.ZERO);
        b1.addLast(Bit.ZERO);
        ans=b1.isReduced();
        if(ans){
            System.out.println();
            fail();
            System.out.println("Input 00001001 should be false but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #6 input : <0>");
        }

        b1 = new BitList();
        b1.addLast(Bit.ZERO);
        ans=b1.isReduced();
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 0 should be true but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #6 input : <11>");
        }

        b1.removeFirst();
        b1.addLast(Bit.ONE);
        b1.addLast(Bit.ONE);
        ans=b1.isReduced();
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 11 should be true but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #7 input : <0000>");
        }

        b1 = new BitList();
        b1.addLast(Bit.ZERO);
        b1.addLast(Bit.ZERO);
        b1.addLast(Bit.ZERO);
        b1.addLast(Bit.ZERO);
        ans=b1.isReduced();
        if(ans){
            System.out.println();
            fail();
            System.out.println("Input 0000 should be false but yours is: " + ans );
            good=false;
        }
        if(good) {
            good();
            System.out.print("reduce :");
            String s;
            if (isDisplay) {
                System.out.println("testing #1 input : <11>");
            }

            b1 = new BitList();
            b1.addLast(Bit.ONE);
            b1.addLast(Bit.ONE);

            b1.reduce();
            s=b1.toString();
            ans=CS(s,"<11>");
            if(!ans){
                System.out.println();
                fail();
                System.out.println("Input <11> after reduse should be <11> but yours is: " + s );
                good=false;
            }
            if (isDisplay) {
                System.out.println("testing #2 input : <000011>");
            }

            b1.addLast(Bit.ZERO);
            b1.addLast(Bit.ZERO);
            b1.addLast(Bit.ZERO);
            b1.addLast(Bit.ZERO);
            b1.reduce();
            s=b1.toString();
            ans=CS(s,"<11>");
            if(!ans){
                System.out.println();
                fail();
                System.out.println("Input <000011> after reduse should be <11> but yours is: " + s );
                good=false;
            }
            if (isDisplay) {
                System.out.println("testing #3 input : <011011>");
            }

            b1.addLast(Bit.ZERO);
            b1.addLast(Bit.ONE);
            b1.addLast(Bit.ONE);
            b1.addLast(Bit.ZERO);
            b1.reduce();
            s=b1.toString();
            ans=CS(s,"<11011>");
            if(!ans){
                System.out.println();
                fail();
                System.out.println("Input <011011> after reduse should be <11011> but yours is: " + s );
                good=false;
            }
            if(good)
                good();
        }
        else
            System.out.println("cant test Reduce, please fix isRedused" );
    }
    private static void t26(boolean isDisplay) {
        boolean good=true;
        boolean ans;
        String s;
        System.out.println("checking 2.6: ");
        System.out.print("shiftRight: ");
        if (isDisplay) {
            System.out.println("testing #1 input : <>");
        }
        BitList b1 = new BitList();
        b1.shiftRight();
        s=b1.toString();
        ans=CS(s,"<>");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input <> should be <> but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 input : <010>");
        }
        b1.addLast(Bit.ZERO);
        b1.addLast(Bit.ONE);
        b1.addLast(Bit.ZERO);
        b1.shiftRight();
        s=b1.toString();
        ans=CS(s,"<01>");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input <010> should be <01> but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 input : <01>");
        }

        b1.shiftRight();
        s=b1.toString();
        ans=CS(s,"<0>");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input <01> should be <0> but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #4 input : <0>");
        }

        b1.shiftRight();
        s=b1.toString();
        ans=CS(s,"<0>");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input <0> should be <0> but yours is: " + s );
            good=false;
        }
        if(good)
            good();
        System.out.println();

        System.out.print("shiftLeft: ");
        if (isDisplay) {
            System.out.println("testing #1 input : <>");
        }
        b1 = new BitList(); // <>
        b1.shiftLeft();
        s=b1.toString();
        ans=CS(s,"<0>");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input <> should be <0> but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 input : <010>");
        }
        b1.removeFirst();
        b1.addLast(Bit.ZERO);
        b1.addLast(Bit.ONE);
        b1.addLast(Bit.ZERO);
        b1.shiftLeft();
        s=b1.toString();
        ans=CS(s,"<0100>");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input <010> should be <0100> but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 input : <0100>");
        }
        b1.shiftLeft();
        s=b1.toString();
        ans=CS(s,"<01000>");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input <0100> should be <01000> but yours is: " + s );
            good=false;
        }

        if(good)
            good();
        System.out.println();
    }
    private static void t27(boolean isDisplay) {
        boolean good=true;
        boolean ans;
        String s;
        System.out.print("checking 2.7: ");
        BitList b1 = new BitList();
        b1.addLast(Bit.ONE);
        if (isDisplay) {
            System.out.println("testing #1 input : <1> , 0");
        }
        b1.padding(0);
        s=b1.toString();
        ans=CS(s,"<1>");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input <1> and padding to 0 should be <1> but yours is: " + s );
            good=false;
        }
        b1= new BitList();
        b1.addLast(Bit.ZERO);
        if (isDisplay) {
            System.out.println("testing #2 input : <0> , 3");
        }
        b1.padding(3);
        s=b1.toString();
        ans=CS(s,"<000>");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input <0> and padding to 3 should be <000> but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 input : <000> , 3");
        }
        b1.padding(1);
        s=b1.toString();
        ans=CS(s,"<000>");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input <000> and padding to 3 should be <000> but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #4 input : <1000> , 6");
        }
        b1.addLast(Bit.ONE);
        b1.padding(6);
        s=b1.toString();
        ans=CS(s,"<001000>");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input <1000> and padding to 6 should be <001000> but yours is: " + s );
            good=false;
        }
        if(good)
            good();
    }
    private static void t31(boolean isDisplay) {
       t32(isDisplay);
    }
    private static void t32(boolean isDisplay) {
        boolean good=true;
        boolean ans;
        String s;
        System.out.print("checking 3.1 and 3.2 together: ");
        if (isDisplay) {
            System.out.println("testing #1 input : '0' ");
        }
        BinaryNumber b1 = new BinaryNumber('0');
        s=b1.toString();
        ans=CS(s,"0");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 0 should be 0 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 input : '1' ");
        }
        b1 = new BinaryNumber('1');
        s=b1.toString();
        ans=CS(s,"1");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 1 should be 1 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 input : '3' ");
        }
        b1 = new BinaryNumber('3');
        s=b1.toString();
        ans=CS(s,"11");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 3 should be 11 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 input : '2' ");
        }
        b1 = new BinaryNumber('2');
        s=b1.toString();
        ans=CS(s,"10");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 2 should be 10 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #4 input : '5' ");
        }
        b1 = new BinaryNumber('5');
        s=b1.toString();
        ans=CS(s,"101");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 5 should be 101 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #5 input : '9' ");
        }
        b1 = new BinaryNumber('9');
        s=b1.toString();
        ans=CS(s,"1001");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 9 should be 1001 but yours is: " + s );
            good=false;
        }
        if(good)
            good();
        System.out.println();

    }
    private static void t33(boolean isDisplay) {
        boolean good=true;
        boolean ans;
        System.out.print("checking 3.3: ");
        if (isDisplay) {
            System.out.println("testing #1 inputs : '0'=='0' ");
        }
        BinaryNumber b1 = new BinaryNumber('0');
        BinaryNumber b2 = new BinaryNumber('0');
        ans=b1.equals(b2);
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 0 and 0 should be true but yours is: " + ans );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 inputs : '1'=='0' ");
        }
        b2 = new BinaryNumber('1');
        ans=b1.equals(b2);
        if(ans){
            System.out.println();
            fail();
            System.out.println("Input 0 and 1 should be false but yours is: " + ans );
            good=false;
        }
        b1 = new BinaryNumber('5');
        b2 = new BinaryNumber('6');
        if (isDisplay) {
            System.out.println("testing #1 inputs : '5'=='6' ");
        }
        ans=b1.equals(b2);
        if(ans){
            System.out.println();
            fail();
            System.out.println("Input 5 and 6 should be false but yours is: " + ans );
            good=false;
        }
        b1 = new BinaryNumber('8');
        b2 = new BinaryNumber('8');
        if (isDisplay) {
            System.out.println("testing #1 inputs : '8'=='8' ");
        }
        ans=b1.equals(b2);
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 8 and 8 should be true but yours is: " + ans );
            good=false;
        }
        if(good)
            good();
        System.out.println();
    }
    private static void t34(boolean isDisplay) {
        boolean good=true;
        boolean ans;
        String s;
        System.out.print("checking 3.4: ");
        if (isDisplay) {
            System.out.println("testing #1 inputs : 0+0 ");
        }
        BinaryNumber b1 = new BinaryNumber('0');
        BinaryNumber b2 = new BinaryNumber('0');
        s=b1.add(b2).toString();
        ans=CS(s,b1.toString());
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 0 and 0 should be 0 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 inputs : 0+1 ");
        }
        b2 = new BinaryNumber('1');
        s=b1.add(b2).toString();
        ans=CS(s,b2.toString());
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 0 and 1 should be 1 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 inputs : 3+2 ");
        }
        b1 = new BinaryNumber('3');
        b2 = new BinaryNumber('2');
        s=b1.add(b2).toString();
        b2 = new BinaryNumber('5');
        ans=CS(s,b2.toString());
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 3 and 2 should be 5 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #4 inputs : 4+5 ");
        }
        b1 = new BinaryNumber('4');
        b2 = new BinaryNumber('5');
        s=b1.add(b2).toString();
        b2 = new BinaryNumber('9');
        ans=CS(s,b2.toString());
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 4 and 5 should be 9 but yours is: " + s );
            good=false;
        }
        if(good)
            good();
    }
    private static void t35(boolean isDisplay) {
        boolean good=true;
        boolean ans;
        int i;
        System.out.print("checking 3.5: ");
        if (isDisplay) {
            System.out.println("testing #1 inputs : 0 compare to 1 ");
        }
        BinaryNumber b1 = new BinaryNumber('1');
        BinaryNumber b2 = new BinaryNumber('0');
        i=b1.compareTo(b2);
        ans= i==1;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 1 compare to 0 should be 1 but yours is: " + i );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 inputs : 4 compare to 4 ");
        }
        b1 = new BinaryNumber('4');
        b2 = new BinaryNumber('4');
        i=b1.compareTo(b2);
        ans= i==0;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 4 compare to 4 should be 0 but yours is: " + i );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 inputs : 6 compare to 9 ");
        }
        b1 = new BinaryNumber('6');
        b2 = new BinaryNumber('9');
        i=b1.compareTo(b2);
        ans= i==-1;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 6 compare to 9 should be 0 but yours is: " + i );
            good=false;
        }

        if (isDisplay) {
            System.out.println("testing #4 inputs : 144 compare to 143 ");
        }
        b1 = (new BinaryNumber('9')).multiplyBy2().multiplyBy2().multiplyBy2().multiplyBy2();//144
        b2 = b1.add(new BinaryNumber('1'));
        i=b1.compareTo(b2);
        ans= i==-1;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 144 compare to 143 should be 1 but yours is: " + i );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #5 inputs : 144 compare to 288 ");
        }
        b2 = b1.multiplyBy2();
        i=b1.compareTo(b2);
        ans= i==-1;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 144 compare to 288 should be -1 but yours is: " + i );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #6 inputs : 288 compare to 288 ");
        }
        b1 = b1.multiplyBy2();
        i=b1.compareTo(b2);
        ans= i==0;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 288 compare to 288 should be 0 but yours is: " + i );
            good=false;
        }

        if(good)
            good();

        System.out.println();

    }
    private static void t36(boolean isDisplay) {

        boolean good=true;
        boolean ans;
        String s;
        System.out.print("checking 3.6: ");
        if (isDisplay) {
            System.out.println("testing #1 inputs : 1-0 ");
        }
        BinaryNumber b1 = new BinaryNumber('1');
        BinaryNumber b2 = new BinaryNumber('0');
        s=b1.subtract(b2).toString();
        ans=CS(s,b1.toString());
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 1-0 should be 1 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 inputs : 5-2 ");
        }
        b1 = new BinaryNumber('5');
        b2 = new BinaryNumber('2');
        BinaryNumber b3 = new BinaryNumber('3');
        s=b1.subtract(b2).toString();
        ans=CS(s,b3.toString());
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 5-2 should be 3 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 inputs : 3-2 ");
        }
        b1 = new BinaryNumber('3');
        b2 = new BinaryNumber('2');
        s=b1.subtract(b2).toString();
        b3 = new BinaryNumber('1');
        ans=CS(s,b3.toString());
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 3-2 should be 1 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #4 inputs : 5-5 ");
        }
        b1 = new BinaryNumber('5');
        b2 = new BinaryNumber('5');
        s=b1.subtract(b2).toString();
        b2 = new BinaryNumber('0');
        ans=CS(s,b2.toString());
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 5 and 5 should be 0 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #4 inputs : 320-20 ");
        }
        b1=b1.multiplyBy2().multiplyBy2().multiplyBy2().multiplyBy2().multiplyBy2().multiplyBy2();//320
        b2=(new BinaryNumber('5').multiplyBy2().multiplyBy2());//20
        s=b1.subtract(b2).toString();//300
        ans=CS(s,"100101100");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 320-20 should be 100101100 but yours is: " + s );
            good=false;
        }
        if(good)
            good();

        System.out.println();


    }
    private static void t37(boolean isDisplay) {
        boolean good=true;
        int i;
        boolean ans;
        System.out.print("checking 3.7: ");
        if (isDisplay) {
            System.out.println("testing #1 inputs : 1 ");
        }
        BinaryNumber b1 = new BinaryNumber('1');
        i=b1.toInt();
        ans=i==1;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 1 should be 1 but yours is: " +  i);
            good=false;
        }

        if (isDisplay) {
            System.out.println("testing #3 inputs : 0 ");
        }
        b1 = new BinaryNumber('0');
        i=b1.toInt();
        ans=i==0;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 0 should be 0 but yours is: " + i );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 inputs : 36 ");
        }
        b1 = new BinaryNumber('9').multiplyBy2().multiplyBy2();
        i=b1.toInt();
        ans=i==36;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 36 should be 36 but yours is: " + i );
            good=false;
        }

        if (isDisplay) {
            System.out.println("testing #4 inputs : 144 ");
        }
        b1 = b1.multiplyBy2().multiplyBy2();
        i=b1.toInt();
        ans=i==144;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 144 should be 144 but yours is: " + i );
            good=false;
        }


        if(good)
            good();

        System.out.println();

    }
    private static void t38(boolean isDisplay) {
        boolean good = true;
        boolean ans;
        System.out.print("checking 3.8: ");
        if (isDisplay) {
            System.out.println("testing #1 inputs : 0*3 ");
        }
        BinaryNumber b1 = new BinaryNumber('0');
        BinaryNumber b2 = new BinaryNumber('3');
        BinaryNumber b3 = new BinaryNumber('0');
        BinaryNumber mult;
        mult = b1.multiply(b2);
        ans = mult.compareTo(b3) == 0;
        if (!ans) {
            System.out.println();
            fail();
            System.out.println("Input 0 and 3 should be 0 but yours is: " + mult);
            good = false;
        }
        if (isDisplay) {
            System.out.println("testing #2 inputs : 3*0 ");
        }
        b1 = new BinaryNumber('3');
        b2 = new BinaryNumber('0');
        b3 = new BinaryNumber('0');
        mult = b1.multiply(b2);
        ans = mult.compareTo(b3) == 0;
        if (!ans) {
            System.out.println();
            fail();
            System.out.println("Input 3 and 0 should be 0 but yours is: " + mult);
            good = false;
        }
        if (isDisplay) {
            System.out.println("testing #3 inputs : 2*3 ");
        }

        b1 = new BinaryNumber('2');
        b2 = new BinaryNumber('3');
        b3 = new BinaryNumber('6');
        mult = b1.multiply(b2);
        ans = mult.compareTo(b3) == 0;
        if (!ans) {
            System.out.println();
            fail();
            System.out.println("Input 2 and 3 should be 6 but yours is: " + mult);
            good = false;
        }
        if (isDisplay) {
            System.out.println("testing #4 inputs : 8*5 ");
        }

        b1 = new BinaryNumber('8');
        b2 = new BinaryNumber('5');
        b3 = new BinaryNumber('8').multiplyBy2().multiplyBy2().add(b1);
        mult = b1.multiply(b2);
        ans = mult.compareTo(b3) == 0;
        if (!ans) {
            System.out.println();
            fail();
            System.out.println("Input 8 and 5 should be 40 but yours is: " + mult);
            good = false;
        }
        if (isDisplay) {
            System.out.println("testing #5 inputs : 16*3 ");
        }

        b1 = new BinaryNumber('8').multiplyBy2();
        b2 = new BinaryNumber('3');
        b3 = new BinaryNumber('8').multiplyBy2().multiplyBy2().add(b1);
        mult = b1.multiply(b2);
        ans = mult.compareTo(b3) == 0;
        if (!ans) {
            System.out.println();
            fail();
            System.out.println("Input 16 and 3 should be 48 but yours is: " + mult);
            good = false;
        }
        if (isDisplay) {
            System.out.println("testing #5 inputs : 108*16 ");
        }

        b1 = new BinaryNumber('9');
        b1 = b1.multiplyBy2().multiplyBy2().multiplyBy2().add(b1).add(b1).add(b1).add(b1);
        b2 = new BinaryNumber('8').multiplyBy2();
        b3 = b1.multiplyBy2().multiplyBy2().multiplyBy2().multiplyBy2();
        mult = b1.multiply(b2);
        ans = mult.compareTo(b3) == 0;
        if (!ans) {
            System.out.println();
            fail();
            System.out.println("Input 108 and 16 should be 1728 but yours is: " + mult);
            good = false;
        }

        if(good)
            good();
    }
    private static void t39(boolean isDisplay) {
            boolean good=true;
            boolean ans;
            System.out.print("checking 3.9: ");
            if (isDisplay) {
                System.out.println("testing #1 inputs : 0/3 ");
            }
            BinaryNumber b1 = new BinaryNumber('0');
            BinaryNumber b2 = new BinaryNumber('3');
            BinaryNumber b3 = new BinaryNumber('0');
            BinaryNumber div;
            div=b1.divide(b2);
            ans=div.compareTo(b3)==0;
            if(!ans){
                System.out.println();
                fail();
                System.out.println("Input 0 and 3 should be 0 but yours is: " + div );
                good=false;
            }
            if (isDisplay) {
                System.out.println("testing #2 inputs : 3/1 ");
            }
            b1 = new BinaryNumber('3');
            b2 = new BinaryNumber('1');
            b3 = new BinaryNumber('3');
            div=b1.divide(b2);
            ans=div.compareTo(b3)==0;
            if(!ans){
                System.out.println();
                fail();
                System.out.println("Input 3 and 1 should be 3 but yours is: " + div );
                good=false;
            }
            if (isDisplay) {
                System.out.println("testing #3 inputs : 2/3 ");
            }

            b1 = new BinaryNumber('2');
            b2 = new BinaryNumber('3');
            b3 = new BinaryNumber('0');
            div=b1.divide(b2);
            ans=div.compareTo(b3)==0;
            if(!ans){
                System.out.println();
                fail();
                System.out.println("Input 2 and 3 should be 0 but yours is: " + div );
                good=false;
            }
            if (isDisplay) {
                System.out.println("testing #4 inputs : 8/5 ");
            }

            b1 = new BinaryNumber('8');
            b2 = new BinaryNumber('5');
            b3 = new BinaryNumber('1');
            div=b1.divide(b2);
            ans=div.compareTo(b3)==0;
            if(!ans){
                System.out.println();
                fail();
                System.out.println("Input 8 and 5 should be 1 but yours is: " + div );
                good=false;
            }
            if (isDisplay) {
                System.out.println("testing #5 inputs : 16/3 ");
            }

            b1 = new BinaryNumber('8').multiplyBy2();
            b2 = new BinaryNumber('3');
            b3 = new BinaryNumber('5');
            div=b1.divide(b2);
            ans=div.compareTo(b3)==0;
            if(!ans){
                System.out.println();
                fail();
                System.out.println("Input 16 and 3 should be 5 but yours is: " + div );
                good=false;
            }
            if (isDisplay) {
                System.out.println("testing #5 inputs : 108/16 ");
            }

            b1 = new BinaryNumber('9');
            b1=b1.multiplyBy2().multiplyBy2().multiplyBy2().add(b1).add(b1).add(b1).add(b1);
            b2 = new BinaryNumber('8').multiplyBy2();
            b3 = new BinaryNumber('6');
            div=b1.divide(b2);
            ans=div.compareTo(b3)==0;
            if(!ans) {
                System.out.println();
                fail();
                System.out.println("Input 108 and 16 should be 6 but yours is: " + div);
                good = false;
            }
                if(good)
                    good();
    }
    private static void t310(boolean isDisplay) {
        boolean good = true;
        boolean ans;
        System.out.print("checking 3.10: ");
        if (isDisplay) {
            System.out.println("testing #1 inputs : 0%3 ");
        }
        BinaryNumber b1 = new BinaryNumber('0');
        BinaryNumber b2 = new BinaryNumber('3');
        BinaryNumber b3 = new BinaryNumber('0');
        BinaryNumber mod;
        mod = b1.mod(b2);
        ans = mod.compareTo(b3) == 0;
        if (!ans) {
            System.out.println();
            fail();
            System.out.println("Input 0 and 3 should be 0 but yours is: " + mod);
            good = false;
        }
        if (isDisplay) {
            System.out.println("testing #2 inputs : 3%1 ");
        }
        b1 = new BinaryNumber('3');
        b2 = new BinaryNumber('1');
        b3 = new BinaryNumber('0');
        mod = b1.mod(b2);
        ans = mod.compareTo(b3) == 0;
        if (!ans) {
            System.out.println();
            fail();
            System.out.println("Input 3 and 0 should be 0 but yours is: " + mod);
            good = false;
        }
        if (isDisplay) {
            System.out.println("testing #3 inputs : 2%3 ");
        }

        b1 = new BinaryNumber('2');
        b2 = new BinaryNumber('3');
        b3 = new BinaryNumber('2');
        mod = b1.mod(b2);
        ans = mod.compareTo(b3) == 0;
        if (!ans) {
            System.out.println();
            fail();
            System.out.println("Input 2 and 3 should be 2 but yours is: " + mod);
            good = false;
        }
        if (isDisplay) {
            System.out.println("testing #4 inputs : 8%5 ");
        }

        b1 = new BinaryNumber('8');
        b2 = new BinaryNumber('5');
        b3 = new BinaryNumber('3');
        mod = b1.mod(b2);
        ans = mod.compareTo(b3) == 0;
        if (!ans) {
            System.out.println();
            fail();
            System.out.println("Input 8 and 5 should be 3 but yours is: " + mod);
            good = false;
        }
        if (isDisplay) {
            System.out.println("testing #5 inputs : 16%3 ");
        }

        b1 = new BinaryNumber('8').multiplyBy2();
        b2 = new BinaryNumber('3');
        b3 = new BinaryNumber('1');
        mod = b1.mod(b2);
        ans = mod.compareTo(b3) == 0;
        if (!ans) {
            System.out.println();
            fail();
            System.out.println("Input 16 and 3 should be 1 but yours is: " + mod);
            good = false;
        }
        if (isDisplay) {
            System.out.println("testing #5 inputs : 108%16 ");
        }

        b1 = new BinaryNumber('9');
        b1 = b1.multiplyBy2().multiplyBy2().multiplyBy2().add(b1).add(b1).add(b1).add(b1);
        b2 = new BinaryNumber('8').multiplyBy2();
        b3 = new BinaryNumber('6').multiplyBy2();
        mod = b1.mod(b2);
        ans = mod.compareTo(b3) == 0;
        if (!ans) {
            System.out.println();
            fail();
            System.out.println("Input 108 and 16 should be 12 but yours is: " + mod);
            good = false;
        }
        if (good)
            good();
    }
    private static void t311(boolean isDisplay) {
        boolean good=true;
        boolean ans;

        System.out.print("checking 3.11");
        if (isDisplay) {
            System.out.println("testing #1 input : 12 ");
        }
        BinaryNumber b1 = new BinaryNumber("12");
        BinaryNumber b2 = new BinaryNumber("6").multiplyBy2();
        ans=b2.compareTo(b1)==0;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 12  should be 12 but yours is: " + b1.toInt() );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 input : 50 ");
        }

        b1 = new BinaryNumber("50");
        b2 = new BinaryNumber("5").multiplyBy2().multiplyBy2().multiplyBy2().add(new BinaryNumber("5").multiplyBy2());
        ans=b2.compareTo(b1)==0;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 50 should be 50 but yours is: " + b1.toInt() );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 input : 101 ");
        }
        b1 = new BinaryNumber("108");
        b2 = new BinaryNumber("9").multiply(new BinaryNumber("6").multiplyBy2());
        ans=b2.compareTo(b1)==0;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 12  should be 12 but yours is: " + b1.toInt() );
            good=false;
        }
        if(good)
            good();

    }
    private static void t312(boolean isDisplay) {
        boolean good=true;
        boolean ans;
        String s;
        System.out.print("checking 3.12: ");
        if (isDisplay) {
            System.out.println("testing #1 input : 0 ");
        }
        BinaryNumber b1 = new BinaryNumber("0");
        s=b1.toIntString();
        ans=CS(s,"0");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 0 should be 0 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 input : 1 ");
        }

        b1 = new BinaryNumber("1");
        s=b1.toIntString();
        ans=CS(s,"1");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 1 should be 1 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 input : 2 ");
        }
        b1 = new BinaryNumber("2");
        s=b1.toIntString();
        ans=CS(s,"2");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 2 should be 2 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 input : 1234 ");
        }
        b1 = new BinaryNumber("1234");
        s=b1.toIntString();
        ans=CS(s,"1234");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 1234 should be 1234 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #4 input : 222000333 ");
        }
        b1 = new BinaryNumber("222000333");
        s=b1.toIntString();
        ans=CS(s,"222000333");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 222000333 should be 222000333 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #5 input : 12345678900987654321 ");
        }
        b1 = new BinaryNumber("12345678900987654321");
        s=b1.toIntString();
        ans=CS(s,"12345678900987654321");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 12345678900987654321 should be 12345678900987654321 but yours is: " + s );
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #6 input : 1234567890098765432112345678900987654321 ");
        }
        b1 = new BinaryNumber("1234567890098765432112345678900987654321");
        s=b1.toIntString();
        ans=CS(s,"1234567890098765432112345678900987654321");
        if(!ans){
            System.out.println();
            fail();
            System.out.println("Input 1234567890098765432112345678900987654321 should be 1234567890098765432112345678900987654321 but yours is: " + s );
            good=false;
        }

        if(good)
            good();
    }
    private static void t41(boolean isDisplay){
        boolean good=true;
        boolean ans;
        System.out.print("checking 4.1: ");
        BinaryPrimesIterator bpi = new BinaryPrimesIterator();
        if (isDisplay) {
            System.out.println("testing #1 : 1 next should get 2 ");
        }
        int i=bpi.next().toInt();
        ans=i==2;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("1 next should be the prime 2 but yours is: " +  i);
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #2 : 2 next should get 3 ");
        }
        i=bpi.next().toInt();
        ans=i==3;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("2 next should be the prime 3 but yours is: " +  i);
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #3 : 3 next should get 5 ");
        }
        i=bpi.next().toInt();
        ans=i==5;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("3 next should be the prime 5 but yours is: " +  i);
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #4 : 3 next should getNumberOfGeneratedPrimes==3 ");
        }
        i=bpi.getNumberOfGeneratedPrimes().toInt();
        ans=i==3;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("3 next should getNumberOfGeneratedPrimes==3 but yours is: " +  i);
            good=false;
        }
        for ( i = 0; i < 8; i += 1) { bpi.next(); }

        if (isDisplay) {
            System.out.println("testing #5 : 12 next should get 37 ");
        }
        i=bpi.next().toInt();
        ans=i==37;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("12 next should be the prime 37 but yours is: " +  i);
            good=false;
        }
        if (isDisplay) {
            System.out.println("testing #6 : 12 next should getNumberOfGeneratedPrimes==12 ");
        }
        i=bpi.getNumberOfGeneratedPrimes().toInt();
        ans=i==12;
        if(!ans){
            System.out.println();
            fail();
            System.out.println("12 next should getNumberOfGeneratedPrimes==12 but yours is: " +  i);
            good=false;
        }
    if(good)
        good();



    }


}