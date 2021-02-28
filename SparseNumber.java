public class SparseNumber {
    public static void main(String[] args) {
        int n=3;
        if(isSparse(n)) System.out.println("No");
        else System.out.println("Yes");
    }
    static boolean isSparse(int n){
        return ((n&(n<<1))==1);
    }
}
