public class ordenamiento {
    public static void main(String[] args) {
        // Inicialización de datos de entrada
        int[] arreglo = {905, 210, 550, 102, 443};
        int n = arreglo.length;

        // Recorrido desde la segunda posición (índice 1)
        for (int i = 1; i < n; i++) {
            int clave = arreglo[i];
            int j = i - 1;

            // Desplazamiento de elementos mayores hacia la derecha
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }

            // Inserción del elemento actual en su posición correcta
            arreglo[j + 1] = clave;
        }

        // Imprimir el arreglo ordenado para verificar el resultado
        System.out.print("Arreglo ordenado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}