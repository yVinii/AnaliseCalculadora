package Classes;
public class TesteMultiplicacao {
    public static void main(String[] args) {
        // Váriaveis calculo para multiplicação
        Multiplicacao calculo = new Multiplicacao();
        // Cenários
        // X * Positivo
        int vezes = calculo.multiplicacao(1, 6);
        System.out.println(vezes);
        int vezes1 = calculo.multiplicacao(-2, 5);
        System.out.println(vezes1);
        int vezes2 = calculo.multiplicacao(0, 4);
        System.out.println(vezes2);
        // X * Negativo
        int vezes3 = calculo.multiplicacao(1, -3);
        System.out.println(vezes3);
        int vezes4 = calculo.multiplicacao(-2, -2);
        System.out.println(vezes4);
        int vezes5 = calculo.multiplicacao(0, -1);
        System.out.println(vezes5);
        // X * Zero
        int vezes6 = calculo.multiplicacao(1, 0);
        System.out.println(vezes6);
        int vezes7 = calculo.multiplicacao(-2, 0);
        System.out.println(vezes7);
        int vezes8 = calculo.multiplicacao(0, 0);
        System.out.println(vezes8);
    }
    
}
