import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        int sayac = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        if(mat < 0 || mat > 100){
            System.out.println("Matematik Notunuz Ortalamaya Dahil Değil. ");
        }else{
            total += mat;
            sayac++;
        }
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        if(fizik < 0 || fizik > 100){
            System.out.println("Fizik Notunuz Ortalamaya Dahil Değil. ");
        }else{
            total += fizik;
            sayac++;
        }
        System.out.println("Türkçe Notunuz : ");
        turkce = input.nextInt();
        if(turkce < 0 || turkce > 100){
            System.out.println("Türkçe Notunuz Ortalamaya Dahil Değil. ");
        }else{
            total += turkce;
            sayac++;
        }
        System.out.println("Kimya Notunuz : ");
        kimya = input.nextInt();
         if(kimya < 0 || kimya > 100){
             System.out.println("Kimya Notunuz Ortalamaya Dahil Değil. ");
         }else{
            total += kimya;
            sayac++;
        }
        System.out.println("Müzik Notunuz : ");
        muzik = input.nextInt();
         if(muzik < 0 || muzik > 100){
             System.out.println("Müzik Notunuz Ortalamaya Dahil Değil. ");
         }else{
            total += muzik;
            sayac++;
        }

        double avarage = (double) total / sayac;

        if(avarage < 55){
            System.out.println("Sınıfta kaldınız. ");
        }else{
            System.out.println("Tebrikler, sınıfı geçtiniz. ");
        }

        System.out.println("Ortalamanız : " + avarage);


    }
}