import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,r,fakn=1,fakr=1,farkfak=1,a,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyon için n sayısını giriniz");
        n=input.nextInt();
        System.out.println("Kombinasyon için r sayısını giriniz");
        r=input.nextInt();

        for(int i=1;i<=n;i++){
            fakn = fakn * i;
        }
        for(int i=1;i<=r;i++){
            fakr = fakr * i;
        }
        a=n-r;
        for(int i=1;i<=a;i++){
            farkfak = farkfak * i;
        }
        sonuc=fakn/(fakr*(farkfak));
        System.out.println(sonuc);





    }
}