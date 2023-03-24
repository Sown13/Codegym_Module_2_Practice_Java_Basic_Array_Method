import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = {2,5,67,12,56,123,235,125,6,2,5,7,10};
        int[] newArr = deleteElement(numbers);
        for(int number : newArr){
            System.out.println(number);
        }
    }

    public static int[] deleteElement(int[] numberArr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ban muon xoa");
        int x = scanner.nextInt();
        int countDel = 0;
        for (int num : numberArr){
            if (x == num){
                countDel++;
            }
        }
        int[] newArr = new int[numberArr.length - countDel];
        for (int i =0, j = 0; i < numberArr.length; i++){
            if (numberArr[i] != x ){
                newArr[j] = numberArr[i];
                j++;
            }
        }
        return newArr;
    }
}

