package Pertemuan1;
/**
 * Contoh program penggunaan operator logika
 */
public class Prak2lat5 {
    public static void main (String args[]){
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b)= " + ! (a && b));

    }
    
}
/** && berarti AND. harus bernilai true and true = true
 *  || berarti OR. kedua operand benilai false = true
 * ! berarti NOT. untuk mengembalikan nilai boolean
 */