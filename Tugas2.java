import java.util.Scanner;

public class Tugas2 {
    static int penjumlahanRekursif (int f, int i){
        if (i == f){
            System.out.print(i);
            return i;
        }
        System.out.print(i + "+");
        return i + penjumlahanRekursif(f, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai f : ");
        int f = input.nextInt();

        System.out.print("Hasil penjumlahan : ");
        int hasil = penjumlahanRekursif(f, 1);

        System.out.println(" = " + hasil);
    }
}
