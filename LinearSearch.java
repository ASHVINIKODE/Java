public class LinearSearch {
    public static void main(String[] args) {
        int[] num = { 22, 3, 4, 5, 66, 765, 34, 54, 32, 87, 544 };
        int target = 54;
        int ans = linsearch(num, target);
        System.out.println(ans);
    }

    // search in the array:return the index if item found
    // otherwise if item not found return-1
    static int linsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            // chcek for element at every index if it is=target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
