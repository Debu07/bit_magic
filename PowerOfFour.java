public class PowerOfFour {
    public static void main(String[] args) {
        int n=64;
        if(isPowerOfFour(n)) System.out.println("yes");
        else System.out.println("No");
    }
    static boolean isPowerOfFour(int n){
        return (n!=0)&& ((n&(n-1))==0 && (n-1)%3==0);
    }
}
