public class TwoOddOccuring {
    public static void main(String[] args) {
        int array[]={3,4,3,4,5,4,4,6,7,7};
        findTwoOddOccurences(array);
    }
    static void findTwoOddOccurences(int array[]){
        int xor=array[0];
        for(int i=1;i< array.length;i++){
            xor^=array[i];
        }
        int rmsb=xor&~(xor-1);
        int res0=0,res1=0;
        for(int i=0;i< array.length;i++){
            if ((array[i]&rmsb)==0) res0^=array[i];
            else res1^=array[i];
        }
        System.out.println(res0+" "+res1);
    }
}
