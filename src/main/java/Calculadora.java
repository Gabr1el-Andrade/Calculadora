
/**
 * A classe Calculadora fornece métodos básicos para operações aritméticas.
 * As operações incluem adição, subtração, multiplicação e divisão.
 */
public class Calculadora {

    /**
     * Adiciona dois números inteiros.
     *
     * @param a o primeiro número
     * @param b o segundo número
     * @return a soma de a e b
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número inteiro do primeiro.
     *
     * @param a o número do qual será subtraído
     * @param b o número a subtrair
     * @return a diferença entre a e b
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a o primeiro número
     * @param b o segundo número
     * @return o produto de a e b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número inteiro pelo segundo.
     * Se o divisor for zero, lança uma ArithmeticException.
     *
     * @param a o número a ser dividido
     * @param b o divisor
     * @return o quociente da divisão de a por b
     * @throws ArithmeticException se b for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }
}
