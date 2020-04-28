/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversearray;

import java.util.Arrays;

/**
 *
 * @author ronneyismael
 */
public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * take starting index = 0 and ending index
         * 
         * compare the starting and ending index
         * perform swapping using a third variable 
         * increment starting index and decrement ending index.
         * print the array
         */
        
        int arr[] = {2,6,14,7,9,5,8,10};
       System.out.println("Before reverse"+ Arrays.toString(arr));
        int start =0 ;
        int end =7;        
        while(start<end){            
            int temp ;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;            
        }
        System.out.print("reverseed array");
        System.out.print(Arrays.toString(arr));
        
        
        
    }
    
}
