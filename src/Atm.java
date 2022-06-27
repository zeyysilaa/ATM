import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciadi, sifre;
        int hak = 3, bakiye = 1500;
        int secenek;

        while(hak > 0) {
            System.out.print("Kullanici adiniz :");
            kullaniciadi = input.nextLine();
            System.out.print("Sifreniz : ");
            sifre = input.nextLine();

            if (kullaniciadi.equals("zeyysilaa") && sifre.equals("Churchill")){
                System.out.println("Hosgeldiniz!");
                do {
                    System.out.println("1-Para yatirma\n" + "2-Para cekme\n" + "3- Bakiye sorgulama\n" + "4-Cikis yap");
                    System.out.print("Yapmak istediginiz islemi seciniz : ");
                    secenek = input.nextInt();
                    switch (secenek) {
                        case 1:
                            System.out.print("Para miktari : ");
                            int yatirmamiktari = input.nextInt();
                            bakiye += yatirmamiktari;
                            System.out.println("Yeni bakiyeniz : " + bakiye);
                            break;
                        case 2:
                            System.out.print("Para miktari : ");
                            int cekmemiktari = input.nextInt();
                            if (cekmemiktari > bakiye) {
                                System.out.println("Yetersiz bakiye");
                                secenek = 4;
                            } else {
                                bakiye -= cekmemiktari;
                                System.out.println("Yeni bakiyeniz : " + bakiye);
                            }
                            break;
                        case 3 :
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                        case 4 :
                            System.out.println("Cikis yapildi, tekrar görüsmek üzere!");
                            break;
                    }
                }while (hak == 4);
                    System.out.println("Tekrar görüsmek üzere !");
                break;
            }else {
                hak--;
                System.out.println("Hatali kullanici adi veya sifre, tekrar deneyiniz.");
                if (hak == 0){
                    System.out.println("Hesabiniz bloke olmustur, banka ile iletisime geciniz.");
                }else {
                    System.out.println("Kalan hakkınız : " + hak);
                }
            }
        }





    }
}
