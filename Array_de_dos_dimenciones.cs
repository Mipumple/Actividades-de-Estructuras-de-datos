using System;

namespace Array_de_dos_dimenciones
{
    class program
     {           
        static void Main()
        {
            //ARRAY
                int[,] Array =
                    {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                    };
                    // El GetLenght sirve para obtener el numero de filas UwU
                    for(int fila =0; fila < Array.GetLength(0); fila++)
                    {
                        // Aqui ahora el GtLenght obtiene las columnas UwU
                       for(int columna = 0; columna < Array.GetLength(1); columna++)

                          {
                            //Aqui se imprime la matiz de dos dimensiones (El \t sirve para que se vea bien UwU)
                             Console.Write(Array[columna, fila] + "\t");
                          }
                        //Aqui salta la linea cuando termine de escribirla
                        Console.WriteLine();
                    }

        }
     }
}