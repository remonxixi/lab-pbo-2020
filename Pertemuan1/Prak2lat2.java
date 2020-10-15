package Pertemuan1;
/**
 * Program contoh penggunaan operator assigment. 
 */
public class Prak2lat2 {
    public static void main (String arg[]) {
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        System.out.println("c = a + b = " + c );

        c += a;
        System.out.println("c += a = " + c );

        c -= a;
        System.out.println("c -= a = " + c );

        c *= a;
        System.out.println("c *= a = " + c );

        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c );

        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = " + c );
        
        c <<= 2;
        System.out.println("c <<= 2 = " + c );

        c >>= 2;
        System.out.println("c >>= 2 = " + c );

        c >>= 2;
        System.out.println("c >>= 2 = " + c );

        c %= a;
        System.out.println("c %= a = " + c );

        c ^= a;
        System.out.println("c ^= a = " + c );

        c |= a;
        System.out.println("c |= a = " + c );
    }
}
/** code diatas adalah contoh penggunaan operator assigment.
*   operator ini digunakan untuk memberi/mengisi nilai ke dalam variabel tertentu.
    contoh a = 5, jadi operator = disini memberi/mengisi variabel a dengan nilai 5.
    sehingga bisa kita ketahui bahwa nilai dari variabel a adalah 5.
*/
