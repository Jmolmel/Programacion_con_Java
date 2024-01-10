package matematicas;

public class FuncionExtra {

    /**
     * Calcula la posición de fibonacci
     *
     * @param n La posición en la secuencia de Fibonacci.
     * @return
     */

    public static long encuentraFibonacci(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long primero = 0;
        long segundo = 1;

        for (long i = 2; i <= n; i++) {
            long siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

        return segundo;
    }
}
