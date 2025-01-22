public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        for(int i=0;i<input.length; i++){
            int num = input[i];
            for(int k=0;k<i; k++){
                if(num<input[k]){
                    input[i]=input[k];
                    input[k]=input[i];
                }
            }
        }
    }
}
