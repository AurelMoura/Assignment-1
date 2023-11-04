import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        int kali= 0;

        System.out.println("Masukkan angka yang anda ingin masukkan dan jika sudah ketik 0 lalu enter");
        while (true) {
            angka = sc.nextInt();

            if (angka ==0) {
                System.out.println("Hasilnya adalah...");
                break;
            }
            else{
                kali -= angka;
            }
        }
        System.out.println("maka hasil penjumlahannya adalah" + kali);
    }
}
