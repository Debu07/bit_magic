public class KthBitSet {
    public static void main(String[] args) {
        int n=5,k=2;
        if(checkKthBit(n,k)) System.out.println("Kth Bit Set");
        else System.out.println("Kth bit not Set");
    }
    static boolean checkKthBit(int n,int k){
        if ((n>>(k-1))==1) return true;
        return false;
    }
}
