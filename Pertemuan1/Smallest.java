package Pertemuan1;
/**
* Program berikut untuk mencoba pemakaian label pada break
*/ 
public class Smallest {
    public static void main(String arg[])
    {
        int a, b;
        Mulai:
        for(a=0; a<2; a++)
        {
            for(b=0; b<3; b++)
            {
                if(b==2)
                    break Mulai;
                System.out.println("a=" + a + " ; b=" + b);
            }
        }
    }
}

/** program pengecekan kondisi yang menggunakan perulangan dan break untuk mengakhiri program 
 */