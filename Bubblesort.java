public class Bubblesort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        //time complexity is basically o(n^2)
        //thats why we generally dont prefer this sorting 
        //the other sorting can be donr in less time using O(logn) time complexity
        //bubble sort
        for(int i=0; i<arr.length-1; i++){
            // this i will run for n-1 times for n elements
            //now suppose j element will start to run at first nothing in an array is sorted
            //so step by step one one element will be sorted and put at ther back
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //now we will perform swaping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
