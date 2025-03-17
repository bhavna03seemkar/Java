public class Insertionsort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        //using insertion sort
        //now running the for loop for the iteration 
        //of element for the traversal
        for(int i=1; i<arr.length; i++){
            int current = arr[i]; //for unsorted array
            int j=i-1;//for sorted array element storage
            while(j >= 0 && current< arr[j]){
                arr[j+1] = arr[j];
                j--;
            } 
            // for the placement of element in the correct position
            arr[j+1]=current;
        }
        printArray(arr);
    }
}
