package Pertemuan1;
/*
*Program berikut untuk mencoba statemen break
*/
public class CobaBreak
{
    public static void main(String arg[])
    {
        for (int i=0; i<10; i++)
        {
            for (int j=0; j<i+1; j++)
            {
                if(j==5)
                    break;
                System.out.print('*');
            }
            System.out.println();
        }
    }
} 
