public class BinarySearch {
    public static int BinarySearchFind(int num[] , int key){
        int start = 0;
        int end = num.length;
        
        
        while (start<= end ) {
            int mid = (start+end)/2;
            if(num[mid] == key){
                return mid;
            }
            if (num[mid] < key) {
                start = mid+1;       
            }else{
                end = mid-1;

            }
           
    }
    return -1;
            
 }
    
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 9;
        int index = BinarySearchFind(num, key);
        System.out.println("The index of the number is " + index);
        
    }
    
}
