public class LargestNum {
    public static int getLargest(int num[]){
        int largest = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int num[] = {1,4,5,6,7,8,9,10};
        System.out.println(getLargest(num));
        
    }
    
}
