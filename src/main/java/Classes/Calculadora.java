package Classes;

/**
 * Uma classe que representa uma calculadora simples com operações matemáticas básicas.
 */
public class Calculadora {
    /**
     * Realiza uma operação de soma.
     *
     * @param a O primeiro operando.
     * @param b O segundo operando.
     * @return O resultado da soma de a e b.
     */
    public float Soma(int a, int b){
        return a + b;
    }

    /**
     * Realiza uma operação de subtração.
     *
     * @param a O operando do qual será subtraído.
     * @param b O operando a ser subtraído.
     * @return O resultado da subtração de a por b.
     */
    public float Substracao(int a, int b){
        return a - b;
    }

    /**
     * Realiza uma operação de multiplicação.
     *
     * @param a O primeiro fator.
     * @param b O segundo fator.
     * @return O resultado da multiplicação de a e b.
     */
    public float Multiplicacao(int a, int b){
        return a * b;
    }

    /**
     * Realiza uma operação de divisão.
     *
     * @param a O dividendo.
     * @param b O divisor.
     * @return O resultado da divisão de a por b.
     */
    public float Divisao(int a, int b){
        return a / b;
    }
}
