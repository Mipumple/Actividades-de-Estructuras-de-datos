const array = 
[
    //Array papuuuu
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];
//Optenemos el tamaño y las filas papu
for (let fila = 0; fila < array.length; fila++)
 {
    let textoFila = "";
    //Otro for para las columnas papu
    for (let columnas = 0; columnas < array.length; columnas++)
    {
        //Aqui se acomulan las variables del texto con un tabulador \t
        textoFila += array[columnas][fila]  + "\t";
    }
    //Aqui se imprime el texto de la fila papu
    console.log(textoFila);
 }