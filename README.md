
# soal 1
    1. Buatlah perulangan hingga 100 menggunakan Java dengan output sebagai berikut:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    (Your Name)
    (Your Name)
    (Your Name)
penjelasan:
Di dalam loop, ada sebuah pernyataan kondisional if-else yang memeriksa apakah nilai i kurang dari 10 atau tidak. Jika i kurang dari 10, maka program akan mencetak nilai i menggunakan System.out.println(i);. Jika i sama dengan atau lebih besar dari 10, maka program akan mencetak teks "Aurel" menggunakan System.out.println("Aurel");

code:
 
    **public class Soal1 {
        public static void main(String[] args) {
            for(int i = 1 ; i<=100; i++){
                if(i<10){
                    System.out.println(i);
                }
                else{
                    System.out.println("Aurel");
                }
            }
        }
    }
    **
## output:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    Aurel
    Aurel
    Aurel

# soal 2

## 2. Buatlah program bebas, dengan menerapkan if else dalam perulangan while
## penjelasan:
    Scanner sc = new Scanner(System.in);
            int angka;
            int kali= 0; 
Scanner sc = new Scanner(System.in); digunakan untuk membaca masukan dari pengguna yang diketikkan melalui keyboard
int angka; Ini adalah deklarasi variabel angka yang akan digunakan untuk menyimpan angka-angka yang dimasukkan oleh pengguna.
int kali = 0;: Ini adalah deklarasi variabel kali. Variabel ini digunakan untuk menyimpan total penjumlahan dari semua angka yang dimasukkan oleh pengguna.

    System.out.println("Masukkan angka yang anda ingin masukkan dan jika sudah ketik 0 lalu enter");
            while (true) {
                angka = sc.nextInt();
while (true) {: Ini adalah awal dari loop while yang akan terus berjalan selama kondisinya selalu benar (dalam hal ini, selalu benar karena kondisinya adalah true). Ini berarti loop akan berjalan terus-menerus tanpa henti sampai suatu waktu Anda menggunakan pernyataan break untuk keluar dari loop.
angka = sc.nextInt();: Dalam setiap iterasi loop, program menggunakan objek Scanner (sc) untuk membaca angka yang dimasukkan oleh pengguna. Metode nextInt() dari objek Scanner digunakan untuk membaca integer (angka bulat) yang dimasukkan oleh pengguna.

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
if (angka == 0) {: Ini adalah pernyataan kondisional if yang memeriksa apakah nilai angka yang dimasukkan oleh pengguna sama dengan 0.
break digunakan untuk keluar dari loop while yang berjalan tanpa henti. Ini akan menghentikan eksekusi loop dan memungkinkan program melanjutkan ke pernyataan di luar loop.
else {: Jika nilai angka tidak sama dengan 0 (kondisi if tidak terpenuhi), maka program akan masuk ke blok else. Dalam blok ini, program akan menjalankan pernyataan kali -= angka;. Ini berarti program akan mengurangkan nilai angka dari variabel kali.

## output:

    Masukkan angka yang anda ingin masukkan dan jika sudah ketik 0 lalu enter
    12
    1
    5
    0
    Hasilnya adalah...
    maka hasil penjumlahannya adalah-18

# Soal 3

## 3. Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan
### code:

    import java.util.Scanner;
    public class soal3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("masukkan tanggal lahir anda = ");
            int tanggal = sc.nextInt();
            System.out.println("masukkan bulan lahir anda = ");
            int bulan = sc.nextInt();
    
            String zodiac = "";
    
            switch (bulan){
                case 1:
                    zodiac = (tanggal<=19) ? "capricorn" : "Aquarius";
                    break;
                case 2:
                    zodiac = (tanggal <=18) ? "Aquarius" : "Pisces";
                    break;
                case 3:
                    zodiac = (tanggal <=20) ? "Pisces" : "Aries";
                    break;
                case 4:
                    zodiac = (tanggal <=19) ? "Aries" : "Taurus";
                    break;
                case 5:
                    zodiac = (tanggal <=20) ? "Taurus" : "Gemini";
                    break;
                case 6:
                    zodiac = (tanggal <=20) ? "Gemini" : "Cancer";
                    break;
                case 7:
                    zodiac = (tanggal <=22) ? "Cancer" : "Leo";
                    break;
                case 8:
                    zodiac = (tanggal <=22) ? "Leo" : "Virgo";
                    break;
                case 9:
                    zodiac = (tanggal <=22) ? "Virgo" : "Libra";
                    break;
                case 10:
                    zodiac = (tanggal <=22) ? "Libra" : "Scorpio";
                    break;
                case 11:
                    zodiac = (tanggal <=21) ? "Scorpio" : "Sagitarius";
                    break;
                case 12:
                    zodiac = (tanggal <=21) ? "Sagitarius" : "Capricon";
                    break;
                default:
                    System.out.println("bulan yang anda sebutkan tidak valid");
            }
            System.out.println("ZODIAC KAMU ADALAH " + zodiac);
    
        }
    }
### penjelasan:
import java.util.Scanner;adalah pernyataan impor (import statement) dalam bahasa pemrograman Java. Fungsi dari pernyataan ini adalah untuk mengimpor kelas Scanner dari pustaka standar Java yang disebut java.util.
                  
    Scanner sc = new Scanner(System.in);
            System.out.println("masukkan tanggal lahir anda = ");
            int tanggal = sc.nextInt();
            System.out.println("masukkan bulan lahir anda = ");
            int bulan = sc.nextInt();
  int tanggal = sc.nextInt();: Setelah mencetak pesan, program menggunakan objek Scanner (sc) untuk membaca angka bulat yang dimasukkan oleh pengguna.
  int bulan = sc.nextInt();: Program kemudian menggunakan objek Scanner (sc) untuk membaca angka bulat kedua yang dimasukkan oleh pengguna, yang merupakan bulan lahir mereka. 

     String zodiac = "";

        switch (bulan){
            case 1:
                zodiac = (tanggal<=19) ? "capricorn" : "Aquarius";
                break;
            case 2:
                zodiac = (tanggal <=18) ? "Aquarius" : "Pisces";
                break;
  switch digunakan untuk memilih salah satu dari beberapa blok kode untuk dieksekusi berdasarkan nilai yang ditentukan dalam variabel bulan
  case 1:: Ini adalah label case yang sesuai dengan nilai bulan yang sama dengan 1. 
  break digunakan untuk menghentikan eksekusi switch dan melanjutkan ke pernyataan setelah switch.


  ### output:
  
    masukkan tanggal lahir anda = 
    
    17
    masukkan bulan lahir anda = 
    12
    ZODIAC KAMU ADALAH Sagitarius

## soal 4

## 4. Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for
## code:

    public class soal4 {
            public static void main(String[] args) {
                String[] sahabat = {"Aurel", "Aulia"};
                System.out.println("tim bangku depan:");
                for (int i = 0; i < sahabat.length; i++) {
                    System.out.println(sahabat[i]);
                }
            }
        }
## penjelasan:
String[] sahabat = {"Aurel", "Aulia"};: Di sini, sebuah array string dengan nama "sahabat" 
or (int i = 0; i < sahabat.length; i++) {: Ini adalah loop for yang digunakan untuk mengulanginya sebanyak sahabat.length kali. sahabat.length adalah panjang dari array "sahabat", yang dalam hal ini adalah 2. Oleh karena itu, loop akan berjalan dua kali.

## output:

    tim bangku depan:
    Aurel
    Aulia


