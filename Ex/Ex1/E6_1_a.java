package Ex.Ex1;

public class E6_1_a {
    public static void main(String[] args){
        int a = 2;
        int res = 0;
        for (int i = 0; i <= 49 ; i++) {
            res += a;
            a += 2;
        }
        System.out.println(res);
    }
}
