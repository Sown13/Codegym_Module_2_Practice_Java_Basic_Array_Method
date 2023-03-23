public class Practice1 {
    public static void main(String[] args) {
        int[] testArray = {0,97,9,10,7};
        int[] newArr = reverse(testArray);
        for (int i = 0; i< testArray.length; i++){
            System.out.println(newArr[i]);
        }
    }
    public static int[] reverse(int[] mainArray){
        int[] reverseArray = new int[mainArray.length];
        for (int i = 0, j = mainArray.length-1; i < mainArray.length && j > 0 ; i++, j--){
            reverseArray[i] = mainArray[j] ;
        } return reverseArray;
    }
}
