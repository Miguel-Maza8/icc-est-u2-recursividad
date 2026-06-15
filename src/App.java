public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("  Ejercicio 1 ");
        System.out.println("suma consecutiva del 5 ");
        int res = runEjercicio1(5);
        System.out.println( "resultado es " + res);
        System.out.println();

        System.out.println(" Ejercicio 2 ");
        long res2 = runEjercicio2(2,40);
        System.out.println("Es " + res2);


    }
    // Escribe una funcion recursiva que calcule la suma de 
    // todos los numeros enteros consecutivos desde 1 hasta 
    // a un numero dado n . Por ejemplo , si n es igual a 5 , 
    // la funcion debe devolver 1+2+3+4+5 = 15 .
    public static int runEjercicio1( int n ) { // n = 5
        // caso base n = 1
        if (n == 1){
            return 1 ;
         }
        // caso recursivo 
         int res =  n + runEjercicio1(n-1);
         return res;
    }
     // Potencia de un numero : Escribe una funcion recursiva que calcule
    // la potencia deun numero base elevado a un exponente entero exponente.
    // Por ejemplo, si la base es 2 y exponente es 3 , la funcion debe devolver 2 3 = 8
    public static long runEjercicio2( int base, int exponente ){
         // caso base 
         if ( exponente == 1){
            return base;
         }
        
         return base * runEjercicio2(base, exponente-1);
         

      }
}
