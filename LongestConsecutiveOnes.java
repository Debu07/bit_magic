public class LongestConsecutiveOnes {
    public static void main(String[] args) {
        int n=14;
        System.out.println(findConsecutiveOnes(n));
    }
    static int findConsecutiveOnes(int n){
        int res=0;
        while(n>0){
            res++;
            n=n&(n<<1);
        }
        return res;
    }
}
