public class CountSetBitsNaive {
    public static void main(String[] args) {
        int n1=177894;
        int n2=17794;
        int n3=17894;
        System.out.println(countSetBitsm1(n1));
        System.out.println(countSetBitsm2(n2));
        System.out.println(countSetBitsm3(n3));

    }
    static int countSetBitsm1(int n){
        int res=0;
        while(n>0){
            if(n%2==1) res++;
            n=n/2;
        }
        return res;
    }
    static int countSetBitsm2(int n){
        int ans=0;
        while(n>0){
            if((n&1)==1) ans++;
            n=n>>1;
        }
        return ans;
    }
    static int countSetBitsm3(int n){
        int count=0;
        while(n>0){
            count=count+(n&1);
            n=n>>1;
        }
        return count;
    }
}
