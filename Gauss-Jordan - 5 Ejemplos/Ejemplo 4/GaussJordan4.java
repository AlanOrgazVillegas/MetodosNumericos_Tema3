package gauss.jordan4;

/**
 *
 * @author Alan
 */
public class GaussJordan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] matriz = {
            {2,3,4,20},
            {3,-5,-1,-10},
            {-1,2,-3,-6}
        };
        /*
        x1 = 1
        x2 = 2
        x3 = 3
        */
        double[] solucion = resolverSistema(matriz);
        
        System.out.println("Solución:");
        for (int i = 0; i < solucion.length; i++) {
            System.out.println("x[" + i + "] = " + solucion[i]);
        }
    }
    
    public static double[] resolverSistema(double[][] matriz) {
        int n = matriz.length;
        double[] solucion = new double[n];
        
        // Convertir la matriz a una forma escalonada reducida por filas (forma escalonada reducida por Gauss-Jordan)
        for (int i = 0; i < n; i++) {
            // Dividir la fila i-ésima para que el elemento diagonal sea igual a 1
            double divisor = matriz[i][i];
            for (int j = i; j < n + 1; j++) {
                matriz[i][j] /= divisor;
            }
            
            // Hacer cero los elementos por encima y por debajo del elemento diagonal
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = matriz[k][i];
                    for (int j = i; j < n + 1; j++) {
                        matriz[k][j] -= factor * matriz[i][j];
                    }
                }
            }
        }
        
        // Extraer la solución del sistema de ecuaciones de la última columna
        for (int i = 0; i < n; i++) {
            solucion[i] = matriz[i][n];
        }
        
        return solucion;
    }
    
}
