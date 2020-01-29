import java.util.Scanner;

/**
 * Created by MM on 10/5/2019.
 */
public class Main {

    public static void main(String[] args) {


        System.out.println("choose num between 1-4:1)maryam azizgol  2)ahmad ojaghi 3)sara akbari  4)ali mahmoodi");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = Integer.parseInt(str);
        if (i == 1) {
          S1 a=new S1();
              a.display();
              a.display2();
              a.display3();

        } else if (i == 2) {
            S1 b=new S1();
           b.display();
            b.display2();
            b.display3();


        } else if (i == 3) {

            S1 c=new S1();
           c.display();
            c.display2();
            c.display3();


        } else if (i == 4) {
            S1 d=new S1();
            d.display();
            d.display2();
            d.display3();

        }





    }
}
