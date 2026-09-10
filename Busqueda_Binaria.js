function findElement(Array, low, high, targetValue) 
{
    while (low <= high)
    {
        //En java al parecer se usa Math.floor para la divicion entre equivalentes
        let mid = Math.floor(low + (high - low) / 2);

        //Verifca si el elemento esta presente en mid :3
        if (Array[mid] === targetValue)
        {
            return mid;
        }
        //Si targetValue es mayor se ignora la mitad izquierda
        else if (Array[mid] < targetValue)
        {
            low = mid + 1;
        }
        //Aqui si es menor se ignora la derecha 
        else
        {
            high = mid - 1;
        }
    }
    return -1;
}

const Array = [10, 20, 30, 40, 50, 60, 70, 80, 90];
const targetElement = 50;
const s = Array.length;

let idx = findElement(Array, 0, s - 1, targetElement);

if (idx !== -1) 
{
    console.log("El elemento se encuentra en la posicion: " + (idx + 1));
}
else
{
    console.log("El elemento no se encuentra");
}