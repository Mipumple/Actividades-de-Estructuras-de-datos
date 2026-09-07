public class Array_dos_dimenciones
{
     public static void main(String[] args) 
     {
        int[][] Array =
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        for( int Filas = 0; Filas < Array.length; Filas++)
        {//Alparecer ahora se encierra la varible fila para qeu java sepa el numero de filas qeu tiene la matriz
         //pero al parecer se puden hacer de diferentes dimenciones. :3
            for( int Columnas = 0; Columnas < Array[Filas].length; Columnas++)
            {
                System.out.print(Array[Columnas][Filas] + "\t");
            }

                System.out.println();
        }

     }

}