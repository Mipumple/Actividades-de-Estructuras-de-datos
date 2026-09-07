#include <iostream>
#include <cstdlib>
#include <vector>

using namespace std;

int main()
{
    int TwoDimencionalArray[3][3]= { //Se dimenciona el Array en este caso es de 3x3
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
    };

    std:cout << "Los elementos del array son: " << endl;
    for (int i = 0; i < 3; i++) //controla las filas con la variable i
    {
        for (int j = 0; j < 3; j++)//Controla las columnas con la variable j
        {
            std::cout << TwoDimencionalArray[j][i] << " "; //Aqui se invierten j e i para que imprima las columnas 
        }
        std::cout << "\n";
    }
    return 0;
}