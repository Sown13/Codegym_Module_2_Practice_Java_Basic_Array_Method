public class Practice3 {
    public static void main(String[] args) {
        String test = "C02 codegym";
        countChar(test, 'c');
        System.out.println(countChar2(test, 'c'));
    }
    public static void countChar(String string,char a){
        int count = 0;
        String newString = string.toLowerCase();
        for (byte i = 0; i < newString.length(); i++){
            if (newString.charAt(i) == a){
                count++;
            }
        }
        System.out.println(count);
    }

    public static int countChar2(String string, char a){
        return string.toLowerCase().split(String.valueOf(a).toLowerCase()).length - 1;
    }
}

// String != String[]; string.lenth() ; array.length - Nhớ dấu ngoặc ở string.length()
