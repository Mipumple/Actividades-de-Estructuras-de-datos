//Definimos el Array
const Array = [40, 50, 60, 70, 80, 90];
//Definimos el leer para capturar valorea algo que no tenia ni idea
const readline = require('readline');
//Creamos la interfas
const rl = readline.createInterface
({
  input: process.stdin,
  output: process.stdout
});
//Mostramos el Array antes del cambio
console.log("Array antes de la eliminacion: ", Array);
//Preguntamos que elemento quiere eliminar de 0 al 5 y lo capturamos con la variable respuesta
rl.question("Que elemento desea eliminar? (es del (0-5)) ", (respuesta) =>
{
    //Leemos la respuesta y la convertimos a numero
    let elemento = Number(respuesta);
    //Utilizamos splice para eliminar el elemento en la posicion que el usuario elija
    //en este caso el valor de la variable elemento, elemento seria el numero y el 1 simboliza la cantidad
    Array.splice(elemento, 1);
    console.log("Array despues de la eliminacion: ", Array);
  //cerramos la interfas
    rl.close();
});