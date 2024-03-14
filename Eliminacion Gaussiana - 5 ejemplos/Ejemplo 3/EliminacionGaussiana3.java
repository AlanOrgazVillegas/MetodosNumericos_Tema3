package eliminaciongaussiana3;

/**
 *
 * @author Alan
 */
public class EliminacionGaussiana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //paso 1 declarar matriz a resolver
        double[][] matriz = {
            {2, -1, 3, 5},
            {2, 2, 3, 7},
            {-2, 3, 1, -3}
        };
        /*
        x=5/2
        y=2/3
        z=2/9
         */
        //paso 2 declarar un vector de la solucion
        double[] solucion = resolverSistema(matriz);
        //mostrar la solución
        System.out.println("Solución:");
        for (int i = 0; i < solucion.length; i++) {
            System.out.println("x[" + i + "] = " + solucion[i]);
        }
    }

    //metodo para resolver la matriz que retorna un vevtor de tipo double que reciba la matriz
    public static double[] resolverSistema(double[][] matriz) {
        //declaro una variable donde guarde la longitud de la matriz
        int n = matriz.length;
        //declaro un vector del tamaño de la solucion
        double[] solucion = new double[n];
        for (int i = 0; i < n; i++) {
            // Hacer los elementos debajo de la diagonal i-ésima igual a cero
            for (int j = i + 1; j < n; j++) {
                double factor = matriz[j][i] / matriz[i][i];
                for (int k = i; k < n + 1; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
        // Sustitución hacia atrás
        for (int i = n - 1; i >= 0; i--) {
            solucion[i] = matriz[i][n] / matriz[i][i];
            for (int j = i - 1; j >= 0; j--) {
                matriz[j][n] -= matriz[j][i] * solucion[i];
            }
        }

        return solucion;
    }
}