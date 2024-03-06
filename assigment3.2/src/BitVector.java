public class BitVector {
    private Bit[] bits;

    public BitVector(String s) {
        //Task 4.4
        // check if s is in binary base
        NumericalString.legalNumericString(s, 2);
        this.bits = new Bit[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                bits[i] = new Bit(false);
            }

            else {
                bits[i] = new Bit(true);
            }
        }
    }

        public String toString () {
            String ans = "";
            //Task 4.5
            String bitString = "";
            for(int i = 0; i<bits.length;i++){
                bitString = bitString + bits[i].toString();
            }
            bitString = NumericalString.binary2Decimal(bitString);
            for(int i = 0; i < bitString.length();i++){
               ans = bitString.charAt(i) + ans;
            }
            return ans;
        }

    public static void main(String[] args) {
        BitVector number = new BitVector("1011");
        System.out.println(number.toString());

    }
    }


