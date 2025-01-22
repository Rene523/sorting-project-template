public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");
        for(int i =0; i<input.length;i++){
            int min = input[i];
            for(int k =0; k<input.length;k++){
                if(min>input[k]){
                    input[i]=input[k];
                    input[k]=input[i];
                }
            }
        }
    }
}
