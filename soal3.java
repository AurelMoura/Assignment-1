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
