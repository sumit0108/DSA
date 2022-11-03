package LearningDSA.Time_spaceComx;

public class exa3 {

    public static void main(String[] args) {

        int[] array = {1,3,4,5};

        exa3 a = new exa3();
        a.printPair(array);
        
    }

    public void printPair(int [] arr){

        for(int i = 0 ; i<arr.length; i++){  //--------------->>O(N)

            for(int j =i+1; j<arr.length; j++){ //--------------->>O(N)*

                System.out.println(arr[i]+ ""+ arr[j]);
            }

        }

    }
    
}
