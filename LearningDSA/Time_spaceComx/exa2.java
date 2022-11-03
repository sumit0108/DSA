package LearningDSA.Time_spaceComx;

public class exa2 {

    public static void main(String[] args) {

        int[] array = {1,3,4,5};

        exa2 a = new exa2();
        a.printPair(array);
        
    }

    public void printPair(int [] arr){

        for(int i = 0 ; i<arr.length; i++){  //--------------->>O(N)

            for(int j =0; j<arr.length; j++){ //--------------->>O(N)*

                System.out.println(arr[i]+ ""+ arr[j]);
            }

        }

    }
    
}
// Now the time&space complexcity in -->> O(N^2)