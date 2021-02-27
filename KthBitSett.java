public class KthBitSett {
    public static void main(String[] args) {
        int n=13,k=1;
        if (checkKthBit(n,k)) System.out.println("Set");
        else System.out.println("Not Set");
    }
    static boolean checkKthBit(int n,int k){
        if ((n & (1<<(k-1)))==1) return true;
        return false;
    }
}
