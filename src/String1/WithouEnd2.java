package String1;

/*С учетом строки возвращаем версию без первого и последнего символов строки.
        Строка может быть любой длины, включая 0.
        withouEnd2("Hello") → "ell"
        withouEnd2("abc") → "b"
        withouEnd2("ab") → ""*/

public class WithouEnd2 {
    public String withouEnd2(String str) {
        int i = str.length();
        if (i < str.length() - 1){
            return "";
        }
            return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        WithouEnd2 end2 = new WithouEnd2();
        String str = "Hello";
        System.out.println(end2.withouEnd2(str));
    }
}
