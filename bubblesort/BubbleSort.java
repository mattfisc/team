/*
 * By:     Matthew Fischer
 * Date:   
 */
package bubblesort;

/**
 *
 * @author Matthew Fischer
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Bubble Sort
        int[] arr = {4,2,6,8,7,3,9,5};
        
        for(int i = 0; i < arr.length-1;i++){
           
            // swap needed
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i = 0;
            }
            // swap not needed
        }
        
        // output
        for(int x: arr){
            System.out.print(" " + x + ",");
        }
        
    }
    
}
