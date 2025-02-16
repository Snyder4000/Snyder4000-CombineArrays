
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int a1= arr1.length;
        int a2 = arr2.length;
        int[] newArray = new int[a1 + a2];
        System.arraycopy(arr1, 0, newArray, 0, a1);
        System.arraycopy(arr2, 0, newArray, a1, a2);
        return newArray;
    }
}
