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

console.log("Array antes de la insercion: ", Array);
//Preguntamos que elemnto quiere ingresar y lo capturamos con la variable respuesta
// y con el rl (readLine)
rl.question("Que elemento desea agregar? ", (respuesta) =>
{
  //Lo guardamos como elemento y capturamos su valor nuerico con Number(respuesta) para que no se guarde como string
    let elemento = Number(respuesta);
  //Lo guardamos en el array con push que es para agregar al final del array
    Array.push(elemento);
  //Imprimimos el array con el nuevo elemento insertado al final del array
    console.log("Array despues de la insercion: ", Array);
  //cerramos la interfas
    rl.close();
});