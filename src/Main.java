import java.util.Scanner;

public class Main {
    public static int ebob(int sayi1, int sayi2){
        int ebob = 1;
        for(int i = 1; i <= sayi1 && i <= sayi2; i++){
            if((sayi1 % i == 0) && (sayi2 % i ==0)){
                ebob = i;
            }
        }
        return ebob;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ebobunu almak istediğiniz 1. sayiyi giriniz :");
        int birinciSayi= scanner.nextInt();
        System.out.println("Ebobunu almak istediğiniz 2. sayiyi giriniz :");
        int ikinciSayi= scanner.nextInt();
        ebob(birinciSayi,ikinciSayi);

        System.out.println("iki sayinin ebobu = "+ebob(birinciSayi,ikinciSayi));



    }
}