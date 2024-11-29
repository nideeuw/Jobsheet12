public class Tugas4 {
    static int hitungPasanganMarmut(int bulan){
        if (bulan == 1 || bulan == 2){
            return 1;
        }
        return hitungPasanganMarmut(bulan - 1 ) + hitungPasanganMarmut(bulan - 2);
    }
    
    public static void main(String[] args) {
        int bulan = 12;

        System.out.println("Bulan ke-\tTotal Pasangan");
        for (int i = 1; i <= bulan; i++) {
            System.out.println(i + "\t\t" + hitungPasanganMarmut(i));
        }
    }
}
