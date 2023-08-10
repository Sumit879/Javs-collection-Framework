import java.util.*;
public class insertion {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,6};
        // for(int i = 0 ; i<arr.length; i++){
        //     int min = i;
        //     for(int j = i+1 ; j<arr.length ;j++){
        //         if(arr[min]>arr[j]){
        //             min = j;
        //         }
        //     }
        //     int temp = arr[min];
        //     arr[min] = arr[i];
        //     arr[i] = temp;
        // }
        //  for (int i = 1; i < arr.length; ++i) {
        //     int key = arr[i];
        //     int j = i - 1;
 
        //     while (j >= 0 && arr[j] > key) {
        //         arr[j + 1] = arr[j];
        //         j = j - 1;
        //     }
        //     arr[j + 1] = key;
        // }
    
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}
