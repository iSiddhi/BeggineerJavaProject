// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Arrays;
public class Max{
    public static void main(String[] args){
        int arr[] ={1,3,23,9,18};
        // swap(arr, 1, 3);
        System.out.println(max(arr));
    }
    //imagine array is not empty
    static int max(int[] arr){
        int maxVal= arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
            
            
        }
        return maxVal;
        
        
        
    
    }
    
}
