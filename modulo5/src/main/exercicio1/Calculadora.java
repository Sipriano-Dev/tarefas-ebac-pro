package exercicio1;

/**
 * Classe responsável por realizar operações matemáticas básicas
 * entre dois números inteiros.
 *
 * <p>Esta classe oferece métodos para soma, subtração, multiplicação
 * e divisão. A divisão segue as regras da aritmética inteira do Java.</p>
 *
 * <p><b>Observação:</b> A divisão por zero não é permitida e resulta
 * em {@link ArithmeticException}.</p>
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da soma entre {@code a} e {@code b}
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai um número inteiro de outro.
     *
     * @param a valor inicial
     * @param b valor a ser subtraído
     * @return resultado da subtração {@code a - b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da multiplicação entre {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide um número inteiro por outro.
     *
     * <p>Esta operação utiliza divisão inteira. Caso o divisor seja zero,
     * uma {@link ArithmeticException} será lançada.</p>
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão inteira {@code a / b}
     * @throws ArithmeticException se {@code b == 0}
     */
    public int dividir(int a, int b) {
        return a / b;
    }
}
