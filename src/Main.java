import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        year= input.nextInt();

        if(year % 4 == 0) // 4'ün katı
        {
            if(year % 100 == 0) // 100'ün katı yıllar
            {
                if(year % 400 == 0) // 100'ün katı olanların 400'e tam bölünenleri
                {
                    System.out.println(year + " bir artık yıldır !");
                }
                else
                {
                    System.out.println(year + " bir artık yıl değildir !");
                }
            }
            else
            {
                System.out.println(year + "bir artık yıldır !");
            }
        }
        else
        {
            System.out.println(year + " bir artık yıl değildir !");
        }

    }
}