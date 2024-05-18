package Patterns.Array;
public class LinearSearch {
    public static int LinearSearchSort(int num[], int key){
        for(int i=0; i<= num.length; i++){
            if(num[i] == key){
                return i;  
        }
    }
    return -1;
}
  public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 6;
       
        int index = LinearSearchSort(num, key);
        if (index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index " + index);
        }  
    }
    
}
