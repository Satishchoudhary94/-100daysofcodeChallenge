public class SubArray {
    public static void PrintSubArray(int num[]){
        for(int i=0; i<=num.length; i++){
            int start = num[i];
            for(int j=1; j<=num.length; j++){
                int end = num[j];
                for(int k=start; k<=end; k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int num[] = {1,2,3,45,5,6,7};
        PrintSubArray(num);
        
    }
    
}
