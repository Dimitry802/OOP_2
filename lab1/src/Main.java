import java.util.Scanner;

public class Main {
    public static void zad_a(){
        for(int i = 0; i < 301; i++){
            if(i % 6 != 0 && i % 4 == 0){
                int d, s = 0;
                int temp = i;
                while(temp > 0){
                    d = temp % 10;
                    s += d;
                    temp /= 10;
                }
                if (s < 10) System.out.println(i);
            }
        }
    }
    public static void zad_b(){
        System.out.println("Введите слово(четное кол-во символов)");
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        if(word.length() % 2 != 0) {
            System.out.println("Ошибка");
            return;
        }
        int middle = word.length() / 2;
        char m1 = word.charAt(middle - 1);
        char m2 = word.charAt(middle);
        System.out.print(m1);
        System.out.println(m2);
    }
    public static void zad_c(){
        System.out.println("Введите строку");
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        int k = 1, min = 0, r = 1, start = 0, start0 = 0;
        char set = string.charAt(0);
        while(k < string.length()){
            if(string.charAt(k) == ' ' || k == string.length() - 1) {
                if(min == 0) {
                    min = r;
                }
                else if(r < min && r != 0){
                    min = r;
                    start = start0;
                }
                r = 0;
                set = ' ';
                start0 = k+1;
            }
            if(string.charAt(k) != set) {
                r++;
                set = string.charAt(k);
            }
            k++;
        }
        System.out.println();
        char out = string.charAt(start);
        while(out != ' '){
            System.out.print(out);
            start++;
            out = string.charAt(start);
        }
        System.out.println();;
    }
    public static void zad_d(){
        System.out.println("Введите строку(между словами ставьте один пробел");
        Scanner s = new Scanner(System.in);
        String l = s.nextLine();
        String[] words = l.split(" ");
        int ans = words.length;
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                if(!Character.isLetter(words[i].charAt(j)) ||
                        (words[i].charAt(j) >= '\u0400' && words[i].charAt(j) <= '\u04FF') ||
                        (words[i].charAt(j) >= '\u0500' && words[i].charAt(j) <= '\u052F')){
                    ans--; break;
                }
            }
        }
        System.out.println("Кол-во слов: " + ans);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String variant;
        ZAD_A a = new ZAD_A();
        while(true){
            System.out.println("Введите нужный подпункт задания(а,b,c,d); 0 - выход");
            variant = s.nextLine();
            if (variant.charAt(0) == 'a') a.ZAD_A();
            if (variant.charAt(0) == 'b') zad_b();
            if (variant.charAt(0) == 'c') zad_c();
            if (variant.charAt(0) == 'd') zad_d();
            if (variant.charAt(0) == '0') break;
        }
    }
}