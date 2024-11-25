public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//        String greet = "Hello World!";
//
//        char[] helloArray = {'H','E','L','L','O'};
//        String helloString = new String(helloArray);
//        System.out.println(helloString);
//        System.out.println(helloString.length());
        String inputString = "Dot saw I was Tod";
        int len = inputString.length();

        char[] tempCharArray = new char[len];
        char[] chars = new char[len];

        for (int i = 0; i < len; i++){
            tempCharArray[i] = inputString.charAt(i);
        }

        for (int j = 0; j < len; j++){
            chars[j] = tempCharArray[len-1-j];
        }

        int flg = 0;
        for(int i = 0; i < len; i++){
            if(tempCharArray[i] != chars[i]){
               flg = 1;
                break;
            }
        }
        if(flg == 1){
            System.out.println("not a palindrome");
        } else {
            System.out.println("It is a palindrome");
        }


    }
}