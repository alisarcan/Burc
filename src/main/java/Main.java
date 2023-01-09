import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month,day;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day = input.nextInt();

        if ((day<=0) || (day>31) || (month<=0) || (month>12)) {
            System.out.println("Hatalı Giriş Yaptınız!!!");
        }else if ((month == 12) && (day >= 22) || ((month == 1) && (day <= 21))) {
            System.out.println("Oglak Burcu");
        } else if ((month == 1) && (day >= 22) || ((month == 2) && (day <= 19))) {
            System.out.println("Kova Burcu");
        } else if ((month == 2) && (day >= 20) || ((month == 3) && (day <= 20))) {
            System.out.println("Balik Burcu");
        } else if ((month == 3) && (day >= 21) || ((month == 4) && (day <= 20))) {
            System.out.println("Koc Burcu");
        } else if ((month == 4) && (day >= 21) || ((month == 5) && (day <= 21))) {
            System.out.println("Boga Burcu");
        } else if ((month == 5) && (day >= 22) || ((month == 6) && (day <= 22))) {
            System.out.println("Ikizler Burcu");
        } else if ((month == 6) && (day >= 23) || ((month == 7) && (day <= 22))) {
            System.out.println("Yengec Burcu");
        } else if ((month == 7) && (day >= 23) || ((month == 8) && (day <= 22))) {
            System.out.println("Aslan Burcu");
        } else if ((month == 8) && (day >= 23) || ((month == 9) && (day <= 22))) {
            System.out.println("Basak Burcu");
        } else if ((month == 9) && (day >= 23) || ((month == 10) && (day <= 22))) {
            System.out.println("Terazi Burcu");
        } else if ((month == 10) && (day >= 23) || ((month == 11) && (day <= 21))) {
            System.out.println("Akrep Burcu");
        } else if ((month == 11) && (day >= 22) || ((month == 12) && (day <= 21))) {
            System.out.println("Yay Burcu");
        } else if ((month == 12) && (day >= 22) || ((month == 1) && (day <= 21))) {
            System.out.println("Oglak Burcu");


        }
    }
}
