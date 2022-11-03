package LearningDSA.Time_spaceComx;

import java.util.Arrays;

public class exa4 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        
        exa4 m = new exa4();
        m.reverse(array);
        
    }
    
    public void reverse(int[] arr){

       

        for( int i=0; i<arr.length/2; i++){  //==? here we are itrate only half of the array that's why the time&space complex -->> O(N/2)

            int last = arr.length-i-1;
            int temp = arr[i];
            arr[i]=arr[last];
            arr[last] = temp;


        }

        System.out.println(Arrays.toString(arr));
    }
}
