import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select;
        int balance = 2450;
        int price;

        while (right > 0) {
            System.out.print("Kullanıcı Adı: ");
            userName = input.nextLine();

            System.out.print("Şifre: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("java8")) {
                System.out.println("Merhaba, Bankamıza Hoş Geldiniz. ");
                do {
                    System.out.println("Lütfen Giriş Yapmak İstediğiniz İşlemi Seçiniz: ");
                    System.out.println(
                            "1- Para Yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye Sorgulama \n" +
                                    "4- Çıkış Yap");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Para Miktarı: ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Çekilecek Para Miktarı: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz Yetersiz !");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz:  " + balance);
                            break;

                    }

                } while (select != 4);
                System.out.println("Güle Güle :( ");
                break;
            } else {
                right--;
                System.out.println("Hatalı Giriş Yaptınız Tekrar Deneyiniz !");
                if (right == 0) {
                    System.out.println("3'kez Hatalı giriş yaptınız Hesabınız bloke olmuştur." +
                            " Lütfen Bankamız ile iletişime Geçiniz ! ");
                } else {
                    System.out.println("Kalan Giriş Hakkınız: " + right);
                }
            }
        }
    }
}
