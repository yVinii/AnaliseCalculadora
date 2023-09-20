package Classes;
public class TesteDivisao {
    public static void main(String[] args) {
        // Variáveis calculo para divisão
        Divisao calculo = new Divisao();
        Divisao calculo1 = new Divisao();
        Divisao calculo2 = new Divisao();
        Divisao calculo3 = new Divisao();
        Divisao calculo4 = new Divisao();
        Divisao calculo5 = new Divisao();
        Divisao calculo6 = new Divisao();
        // Cenários
        // Positivo / Positivo
        double div = calculo.dividir(16, 4);
        System.out.println(div);
        // Negativo / Positivo
        double div1 = calculo1.dividir(-32, 16);
        System.out.println(div1);
        // Negativo / Negativo
        double div2 = calculo2.dividir(-24, -2);
        System.out.println(div2);
        // Positivo / Negativo
        double div3 = calculo3.dividir(28, -7);
        System.out.println(div3);
        // Zero / Positivo
        double div4 = calculo4.dividir(0, 4);
        System.out.println(div4);
        // Zero / Negativo
        double div5 = calculo5.dividir(0, -2);
        System.out.println(div5);
}
    
}
