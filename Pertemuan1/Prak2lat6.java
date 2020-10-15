package Pertemuan1;

public class Prak2lat6 {
    public static void main (String arg[]){
        int a,b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " +b);

        b = (a == 10) ? 20:30;
        System.out.println("Value of b is : " +b);
    }
    
}

/** Contoh Operator lainnya adalah operator conditional(?:)
 * yang melibatkan 3 operand sekaligus untuk mengecek
 * ekspresi boolean, jika true maka di pilih sebelah kiri,
 * jika false dipilih sebelah kanan
 * pada b = (a == 1) bernilai false. maka yang dipilih adalah yang sebelah kanan
 * sehingga nilai b adalah 30.
 * pada b = (a == 10) bernilai true sehingga nilai b = 20 (dipilih yang sebelah kiri)
 */