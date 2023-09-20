package Classes;
public class TesteSubtracao {
    public static void main(String[] args) {
        // Variáveis calculo para subtração
        Subtracao calculo = new Subtracao();
        // Cenários
        // X - Positvo
        int sub = calculo.subtrair(1, 6);
        System.out.println(sub);
        int sub1 = calculo.subtrair(-2, 5);
        System.out.println(sub1);
        int sub2 = calculo.subtrair(0, 4);
        System.out.println(sub2);
        // X - Negativo
        int sub3 = calculo.subtrair(1, -3);
        System.out.println(sub3);
        int sub4 = calculo.subtrair(-2, -2);
        System.out.println(sub4);
        int sub5 = calculo.subtrair(0, -1);
        System.out.println(sub5);
        // X - Zero
        int sub6 = calculo.subtrair(1, 0);
        System.out.println(sub6);
        int sub7 = calculo.subtrair(-2, 0);
        System.out.println(sub7);
        int sub8 = calculo.subtrair(0, 0);
        System.out.println(sub8);
    }
    
}
