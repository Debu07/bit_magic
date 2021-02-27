public class BitwiseOperators {
    public static void main(String[] args) {
        int x=3,y=6;
        int z=-3;
        //and
        System.out.println("And:"+(x&y));
        //or
        System.out.println("Or:"+(x|y));
        //xor
        System.out.println("Xor:"+(x^y));
        //not
        System.out.println("Not:"+(~x));
        //left shift
        System.out.println("Left Shift:"+(x<<1));
        System.out.println("Left Shift:"+(x<<y));
        //left shift negative number
        System.out.println("left Shift: "+(z<<1));
        //right shift (signed)
        System.out.println("Right Shift: "+(x>>1));
        System.out.println("Right Shift: "+(z>>1));
        //unsigned right shift
        System.out.println("Right Shift: "+(x>>>1));
        System.out.println("Right Shift: "+(z>>>1));


    }
}
