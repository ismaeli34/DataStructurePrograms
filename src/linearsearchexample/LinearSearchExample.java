/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearchexample;

import java.util.Arrays;

/**
 *
 * @author ronneyismael
 */
public class LinearSearchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {2, 8, 10, 11, 34, 89};
        int size = arr.length;
        int key = 34;
        int n= 9;
        
        System.out.println("Array before deletion");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+ " ");
        }
        
    
        int deleteResult = deleteElement(key,arr,size);
                System.out.println("Array after deletion");

            for(int i =0;i<deleteResult;i++){
                System.out.println(arr[i]+ " ");

            }
   
        
       
        
        int insertionResult = insertElement(n, arr,key);
        if(insertionResult == 1){
            System.out.println("Element are " + Arrays.toString(arr));
        }else{
            System.out.println("Element are" + Arrays.toString(arr));

        }
       
int result =searchElement(key, arr);
        if(result == -1){ 
            System.out.println("Element " + key + " is not present" + " in " + Arrays.toString(arr));
      }else{
            System.out.println("Element " + key + " is  present" + " in " + Arrays.toString(arr));

        }

    }

    /**
     * *
     *
     * This method is used to search the element present in the array
     * take a for loop and iterate with all the integer elements
     * compare the key element with all the elements starting from index 0
     * if 
     * key is equal to the array[index] then return the index(positive)
     * else
     * return negative index
     * 
     * 
     *
     * @param key
     * @param arr
     * @return
     */
    public static int searchElement(int key, int arr[]) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) 
                    return i;                          
            }
    return -1;

    }

    /***
     * This method is used to insert an element in a particular index .
     * If the array length is greater than index
     * then insert the element(key) in the particular index and return 1
     * 
     * @param element
     * @param arr
     * @return 
     */
    public static int insertElement(int index, int arr[],int key) {
        
        if(arr.length>index){
          arr[index]=key;
          return 1;
            
        }

        return -1;
    }
    
    
    /****
     * This method is used to delete the element from the array.
     * It takes 3 arguments key,arr and size 
     * it checks whether the  element to be deleted is present inside the array by calling searchElement
     * if it is present then iterate using for-loop upto size-1 and do a left shift of element using
     *                      arr[i] = arr[i+1] and return size-1 
     * @param key
     * @param arr
     * @param size
     * @return 
     */
    public static int deleteElement(int key, int arr[],int size){
        int searchResultPosition = searchElement(key, arr);
        System.out.println("position"+ searchResultPosition);
        if(searchResultPosition == -1){
            System.out.println("Element is not present");
            return size;
        }
            int i;
            for( i = searchResultPosition ; i<size-1;i++){
                arr[i] = arr[i+1];
            }
            
        
        return size-1;
        
        
    }

}
