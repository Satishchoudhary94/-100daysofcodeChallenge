public class Pairs {
    public static void PairsArray(int nums[]){
        
        for(int i =0; i<=nums.length; i++){
            int curr= nums[i];
           for(int j=i+1; j<nums.length; j++){
            System.out.print("("+curr+ ","+nums[j]+")");
        }
        System.out.println();
    }
    
}
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        PairsArray(nums);
        
    }
    
}
