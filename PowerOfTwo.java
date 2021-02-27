public class PowerOfTwo {
    public static void main(String[] args) {
        int n=256;
        if (isPowerOfTwo(n)) System.out.println("Yes");
        else System.out.println("No");
    }
    static boolean isPowerOfTwo(int n){
        return (n!=0)&& ((n&(n-1))==0);
    }
}
