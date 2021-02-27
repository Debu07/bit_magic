public class CountSetBitsOptimal {
    public static void main(String[] args) {
        int n=14567;
        System.out.println(countSetBits(n));
    }
    static int countSetBits(int n){
        int res=0;
        while(n>0){
            res++;
            n=n&(n-1);
        }
        return res;
    }
}
