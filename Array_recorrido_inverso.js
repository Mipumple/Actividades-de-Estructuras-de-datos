//Definimos el Array
const Array = [ [40, 50, 60, 70, 80, 90] ];
//Textooooo
console.log("Recorrido inverso del Array");
console.log("Los elementos del Array son: ");

//Esta parte es para imprimir el array y que se vea bonito :3
let resultado = "";

//Utilizamos en este caso solo un siclo for para capturar el Array\
//en este caso ponemos Array.legth para inicar desde el final del array y -1 para que valla retrocediendo
for (let i = Array.length - 1; i >= 0; i--) 
    
    //Aqui ponemos que es igual al al valor de array para que lo imprima
    //Este si lo saque con Ia por que no me gustaba como se miraba 
    resultado += Array[i] + " ";
{
    //Imprimimos el Array poniendo resultado por que este tiene el valor del Array
    console.log(resultado);
}