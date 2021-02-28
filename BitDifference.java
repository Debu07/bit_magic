public class BitDifference {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println(findBitDifference(a,b));
    }
    static int findBitDifference(int a,int b){
        int xor=a^b;
        int count=0;
        if(xor==0) return count;
        while(xor>0){
            count+=xor&1;
            xor=xor>>1;
        }
        return count;
    }
}
