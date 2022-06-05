package BinarySearch;

public class binarySearch {

    public static void main(String[] args) {
        int[] arr = {-22,-15,1,7,20,35,55};
        System.out.println(iterativeBinarySearch(arr,55));
        System.out.println(recursiveBinarySearch(arr,-22));
    }


    public static int iterativeBinarySearch(int[] input, int value  ){
        int start =0;
        int end = input.length-1;

        while (start<=end){
            int piv = (end+start)/2;
            if(input[piv] == value){
                return piv;
            }
            if(input[piv]<value){
                start = piv+1;
            }
            else{
                end = piv-1;
            }
        }
        return -1;
    }
    // -----------------------------------------recursion way---------------------

    public static int recursiveBinarySearch(int[]input, int value){
      return recursionSearch(input,  0,  input.length-1,  value);
    }
    public static int recursionSearch(int[] input, int start, int end, int value  ){
        int piv = (start+end)/2;
        if(start> end ) return -1;
        if(input[piv] == value) return piv;
        else if(input[piv]>value) return recursionSearch(input,start,end-1,value);
        else return recursionSearch(input,start+1,end,value);

    }
}
