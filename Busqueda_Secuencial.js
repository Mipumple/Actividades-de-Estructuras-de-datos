function findEle(inputArr, targetEle)
{
    for (let i = 0; i < inputArr.length; i++)
    {
        if (inputArr[i] === targetEle)
        {
            return i;
        }
    }
    //No se encuentra el elemento, retornamos -1
    return -1;
}
//Ponemos el Array
const inputArr = [12, 34, 10, 6, 40, 89, 98, 57, 16, 69];
//Ponemos que elemento queremos buscar
const targetEle = 69;

//Operacion de busqueda
let idx = findEle(inputArr, targetEle);

//Un if para mostrar si se encuentra o no el elemento en el array y en que indice se encuentra
if (idx !== -1)
{
    console.log(inputArr);

    console.log(`El elemento se encuentra en el indice ${idx}`);
}
else
{
    console.log(`El elemento no se encuentra en el array`);
}