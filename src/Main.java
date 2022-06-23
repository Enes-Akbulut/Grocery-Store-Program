import java.util.Scanner;
public class Main {
   //manav kasa programı

        double armut =2.14, elma = 3.67, domates =1.11, muz =0.95, patlıcan =5, toplamTutar;
        Scanner inp = new Scanner(System.in);
        System.out.println("merhaba hosgeldin guzel abim, ne alırsın ");
        System.out.print("kac kilo armut almak istersiniz?  ");
        armut= inp.nextDouble();
        System.out.print("kac kilo elma almak istersiniz?  ");
        elma= inp.nextDouble();
        System.out.print("kac kilo domates almak istersiniz?  ");
        domates= inp.nextDouble();
        System.out.print("kac kilo muz  almak istersiniz?  ");
        muz= inp.nextDouble();
        System.out.println("abi kusura bakma biraz zamlı patlıcanımız");
        System.out.print("kac kilo patlıcan almak istersiniz?  ");
        patlıcan= inp.nextDouble();
        toplamTutar=armut+elma+domates+muz+patlıcan;
        System.out.println("TOPLAM TUTAR = "+ toplamTutar);



    }
}
