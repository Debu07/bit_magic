public class MissingNumber {
    public static void main(String[] args) {
        int array[]={1,5,3,2};
        System.out.println(findMissingNumber(array));
    }
    static int findMissingNumber(int array[]){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        int ans=0;
        int n=array.length;
        for(int i=1;i<=n+1;i++){
            ans+=i;
        }
        return ans-sum;
    }
}
