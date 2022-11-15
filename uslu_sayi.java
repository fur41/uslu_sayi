import java.util.Scanner;

    public class uslu_sayi {
    
    public static void main(String[] args) {
      
        Scanner inp= new Scanner(System.in);


        int a , b ,total=1;

        System.out.print("Taban sayıyı giriniz :");

        a =inp.nextInt();

        

        System.out.print("Üssü giriniz :");

        b=inp.nextInt();

        for (int i = 1; i <= b; i++)total=total*a; {System.out.println("Sonuç :"+total);
            
        }

    }
}
