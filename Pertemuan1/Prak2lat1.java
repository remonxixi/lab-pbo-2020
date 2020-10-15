package Pertemuan1;
/**
* Program berikut untuk mencoba operator aritmetika
*/
public class Prak2lat1 {
    public static void main (String args[]){
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +   (a++));
        System.out.println("b--   = " +   (a--));

        //check the difference in d++ and ++d
        System.out.println("d++   = " +   (d++));
        System.out.println("++d   = " +   (++d));
    }
}    
/** code diatas adalah contoh program penggunaan operator aritmatika.
 *  Operator Aritmatika adalah operator matematis yang terdiri 
 *  dari operator penambahan, pengurangan, perkalian, pembagian, modulus, plus, dan minus.
 *  operator ini digunakan untuk melakukan perhitungan matematika.
 *  d++ mengeluarkan nilai asli sesuai dengan inisialisasi nilainya yaitu = 25
 *  ++d (++) diawal pada kode tersebut berrti menambahkan jumlah nilai asli dengan nilai 1
 *  sebanyak 2 kali sehingga outputnya bernilai 27. karena 1+1+25.
 */