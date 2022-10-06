import java.util.Scanner;

public class hesapMakinesi {
    public static int toplama(int sayi1, int sayi2) {
        return (sayi1 + sayi2);
    }

    public static int cikarma(int sayi1, int sayi2) {
        return (sayi1 - sayi2);
    }

    public static double bolme(int sayi1, int sayi2) {
        return (double) sayi1 / sayi2;
    }

    public static int carpma(int sayi1, int sayi2) {
        return (sayi1 * sayi2);
    }

    public static int toplama(int sayi1, int sayi2, int sayi3) {
        return (sayi1 + sayi2 + sayi3);
    }

    public static int cikarma(int sayi1, int sayi2, int sayi3) {
        return (sayi1 - sayi2 - sayi3);
    }

    public static double bolme(int sayi1, int sayi2, int sayi3) {
        return ((double) sayi1 / sayi2 / sayi3);
    }

    public static int carpma(int sayi1, int sayi2, int sayi3) {
        return (sayi1 * sayi2 * sayi3);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Hesap makinesine hoşgeldiniz...");
        String islemler = "Yapmak istediğiniz işlemi seçiniz \n" +
                "Programdan cikmak icin 1 e basiniz...\n" +
                "Toplama işlemi için 2 e basınız... \n" +
                "Cikarma islemi için 3 ye basınız \n" +
                "Carpma islemi icin 4 e basiniz \n" +
                "Bolme islemi icin 5 e basiniz..\n";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(islemler);

            String islem = scanner.nextLine();
            if (islem.equals("1")) {
                System.out.println("Programdan cikiliyor...");
                break;

            } else if (islem.equals("2")) {
                System.out.println("Kac tane sayi girmek istiyorsunuz ? 2 veya 3");
                int kactane = scanner.nextInt();
                if (kactane == 2) {
                    System.out.println("Lütfen 1. sayiyi giriniz : ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("Lütfen 2. sayiyi giriniz : ");
                    int sayi2 = scanner.nextInt();
                    int toplam = toplama(sayi1, sayi2);
                    System.out.println("Sayilarin toplami " +toplam);
                } else if (kactane == 3) {
                    System.out.println("Lütfen 1. sayiyi giriniz : ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("Lütfen 2. sayiyi giriniz : ");
                    int sayi2 = scanner.nextInt();
                    System.out.println("Lütfen 3. sayiyi giriniz : ");
                    int sayi3 = scanner.nextInt();
                    int toplam = toplama(sayi1, sayi2, sayi3);
                    System.out.println("Sayilarin toplami " +toplam);
                }
                else {
                    System.out.println("Bu durum için uygun islem bulunmamaktadır...");
                }
            } else if (islem.equals("3")) {
                System.out.println("Kac tane sayi girmek istiyorsunuz ? 2 veya 3");
                int kactane = scanner.nextInt();
                if (kactane == 2) {
                    System.out.println("Lütfen 1. sayiyi giriniz : ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("Lütfen 2. sayiyi giriniz : ");
                    int sayi2 = scanner.nextInt();
                    int fark = cikarma(sayi1, sayi2);
                    System.out.println("Sayilarin farki = " + fark);

                } else if (kactane == 3) {
                    System.out.println("Lütfen 1. sayiyi giriniz : ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("Lütfen 2. sayiyi giriniz : ");
                    int sayi2 = scanner.nextInt();
                    System.out.println("Lütfen 3. sayiyi giriniz : ");
                    int sayi3 = scanner.nextInt();
                    int fark = cikarma(sayi1, sayi2, sayi3);
                    System.out.println("Sayilarin farki = " + fark);
                }
                else {
                    System.out.println("Bu islem icin uygun method bulunmamaktadır.. ");
                }


            }
            else if (islem.equals("4")) {
                System.out.println("Kac tane sayi girmek istiyorsunuz ? 2 veya 3");
                int kactane = scanner.nextInt();
                if (kactane == 2) {
                    System.out.println("Lütfen 1. sayiyi giriniz : ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("Lütfen 2. sayiyi giriniz : ");
                    int sayi2 = scanner.nextInt();
                    int carpma = carpma(sayi1, sayi2);
                    System.out.println("Sayilarin toplami " +carpma);
                } else if (kactane == 3) {
                    System.out.println("Lütfen 1. sayiyi giriniz : ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("Lütfen 2. sayiyi giriniz : ");
                    int sayi2 = scanner.nextInt();
                    System.out.println("Lütfen 3. sayiyi giriniz : ");
                    int sayi3 = scanner.nextInt();
                    int carp = carpma(sayi1, sayi2, sayi3);
                    System.out.println("Sayilarin toplami " +carp);
                }
                else {
                    System.out.println("Bu durum için uygun islem bulunmamaktadır...");
                }
            }
            else if (islem.equals("5")) {
                System.out.println("Kac tane sayi girmek istiyorsunuz ? 2 veya 3");
                int kactane = scanner.nextInt();
                if (kactane == 2) {
                    System.out.println("Lütfen 1. sayiyi giriniz : ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("Lütfen 2. sayiyi giriniz : ");
                    int sayi2 = scanner.nextInt();
                    double bolme = bolme(sayi1, sayi2);
                    System.out.println("Sayilarin bolumu " +bolme);
                } else if (kactane == 3) {
                    System.out.println("Lütfen 1. sayiyi giriniz : ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("Lütfen 2. sayiyi giriniz : ");
                    int sayi2 = scanner.nextInt();
                    System.out.println("Lütfen 3. sayiyi giriniz : ");
                    int sayi3 = scanner.nextInt();
                    double bolum = bolme(sayi1, sayi2, sayi3);
                    System.out.println("Sayilarin bölümü " +bolum);
                }
                else {
                    System.out.println("Bu durum için uygun islem bulunmamaktadır...");
                }
            }


        }


    }
}



