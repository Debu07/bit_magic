public class MissingNumberII {
    public static void main(String[] args) {
        int array[]={1,5,3,2};
        System.out.println(findMissingNumber(array));
    }
    static int findMissingNumber(int array[]){
        int ans1=0,ans2=0;
        for(int i=0;i< array.length;i++){
            ans1^=array[i];
        }
        for(int i=1;i<= array.length+1;i++){
            ans2^=i;
        }
        return ans1^ans2;
    }
}
