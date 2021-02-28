public class OneOddOccurenceOptimal {
    public static void main(String[] args) {
        int array[]={4,4,3,5,5,4,4,3,3};
        System.out.println(findOddOcuurence(array));
    }
    static int findOddOcuurence(int array[]){
        int ans=array[0];
        for (int i=1;i<array.length;i++){
            ans^=array[i];
        }
        return ans;
    }
}
