public class arr_sort_incr {

    public static boolean iSorted(int arr[], int i){
        if (arr.length-1 == i) {
            return true;
            
        }
        if (arr[i] < arr[i+1]) {
            return iSorted(arr, i+1);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        boolean sorts = iSorted(arr, 0);
        System.out.println(sorts);
    }
}
