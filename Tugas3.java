import java.util.Scanner;
public class Tugas3 {
    static boolean cekPrima(int n, int d){
        if (n < 2){
            return false;
        }
        if (d == 1){
            return true;
        }
        if (n % d == 0){
            return false;
        }
        return cekPrima(n, d - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan n : ");
        int n = input.nextInt();

        boolean hasil = cekPrima(n, n - 1);

        if (hasil){
            System.out.println(n + " adalah bilangan prima");
        }else{
            System.out.println(n + " bukan bilangan prima");
        }
    }
}
