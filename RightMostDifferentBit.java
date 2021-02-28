public class RightMostDifferentBit {
    public static void main(String[] args) {
        int m=11,n=9;
        System.out.println(findRightMostDifferentBit(m,n));
    }
    static int findRightMostDifferentBit(int m,int n){
        int xor=m^n;
        if(xor==0) return -1;
        int count=0;
        while(xor>0){
            if((xor&1)==1) break;
            else count++;
            xor=xor>>1;
        }
        return count+1;
    }
}

