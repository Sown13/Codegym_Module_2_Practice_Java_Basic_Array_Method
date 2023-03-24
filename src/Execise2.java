public class Execise2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = splice(arr,7,5);
        for (int num : newArr){
            System.out.println(num);
        }
    }
    public static int[] splice(int[] array, int newElement, int index){
        int[] newArr = new int[array.length];
        System.arraycopy(array,0,newArr,0,index);
        newArr[index] = newElement;
        System.arraycopy(array,index +1, newArr,index+1,newArr.length-index-1);
        return newArr;
    }
}
