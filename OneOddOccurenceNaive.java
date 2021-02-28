public class OneOddOccurenceNaive {
    public static void main(String[] args) {
        int array[]={4,3,4,4,4,5,5};
        System.out.println(findOddOccurence(array));
    }
    static int findOddOccurence(int array[]){
        for(int i=0;i< array.length;i++){
            int count=0;
            for(int j=0;j< array.length;j++){
                if (array[i]==array[j]) count++;
            }
            if(count%2!=0) return array[i];
        }
        return -1;
    }
}
