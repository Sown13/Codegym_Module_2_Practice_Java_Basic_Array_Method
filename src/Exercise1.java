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
        int indexDel = 0;
        for (byte i = 0; i < numberArr.length; i++){
            if (x == numberArr[i]){
                indexDel = i;
            }
        }
        int[] newArr = new int[numberArr.length - 1];
        for (int i = 0; i < indexDel; i++){
            newArr[i] = numberArr[i];
        }
        for (int i = indexDel; i < newArr.length; i++){
            newArr[i] = numberArr[i+1];
        }
        return newArr;
    }
}

// chua xoa dc nhieu so giong nhau, need fix
