/*
 * By:     Matthew Fischer
 * Date:   
 */
package sortinginsertion;

/**
 *
 * @author Matthew Fischer
 */
public class SortingInsertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {4,3,6,9,1,7,8,0,2,5};
        
        arr = sort(arr);
        
        for(int x: arr){
            System.out.print(" " + x + ",");
        }
    }
    
    
    public static int[] sort(int[] arr){
        
        
        
        for(int check = 1;check < arr.length;check++){
            int key = arr[check];
            
            for(int swap = check; swap >= 0; swap--){
                if(swap == 0){
                    key = arr[swap];
                    arr[swap] = key;
                }
                else if(arr[swap] < arr[swap-1]){
                    key = arr[swap];
                    arr[swap] = arr[swap-1];
                    arr[swap-1] = key;
                }
            }
            
        }
        
        
        
        return arr;
    }
}
