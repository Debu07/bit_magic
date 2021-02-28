public class FirstSetBit {
    public static void main(String[] args) {
        int n=18;
        System.out.println("position of first set bit is: "+firstSetBitPosition(n));
    }
    static int firstSetBitPosition(int n){
        int count=0;
        if(n==0) return count;
        while(n>0){
            if((n&1)==1) break;
            else count++;
            n=n>>1;
        }
        return count+1;
    }

}
