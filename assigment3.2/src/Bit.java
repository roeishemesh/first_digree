public class Bit {
    public static void main(String[] args) {
        Bit bit1 = new Bit(true);
        Bit bit0 = new Bit(false);
        System.out.println(bit0.toString() + " " + bit1.toString());
        int sum = bit1.toInt() + bit0.toInt();
        System.out.println(sum);
    }
    //field
    private boolean value;
    //constructor
    public Bit(boolean value){
        //Task 4.1
        if(value){
            this.value = true;
        }
        else {
            this.value = false;
        }
    }
    //method
    public int toInt(){
        int ans = 0;
        //Task 4.2
        if(this.value){
            ans = 1;
        }
        return ans;

    }

    public String toString(){
        String ans = "";
        //Task 4.3
        if (this.value){
            ans = "1";
        }
        else {ans = "0";}
        return ans;
    }
}
