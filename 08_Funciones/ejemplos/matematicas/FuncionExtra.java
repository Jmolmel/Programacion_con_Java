package matematicas;

public class FuncionExtra {

    public static long encuentraFibonacci(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long primero = 0;
        long segundo = 1;
        long siguiente = 0;

        for (long i = 2; i <= n; i++) {
            siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

        return primero; // pinta primero, porque si ponemos 10 en el número Fibonacci se pasa sumando +1
    }
}
