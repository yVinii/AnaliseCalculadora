package Classes;
public class TesteSoma {
    public static void main(String[] args) {
        // Variáveis calculo para soma
        Soma calculo = new Soma();
        // Cenário
        // X + Positivo
        int soma= calculo.soma(1,6);
        System.out.println(soma);
        int soma1= calculo.soma(-2,5);
        System.out.println(soma1);
        int soma2= calculo.soma(0,4);
        System.out.println(soma2);
        // X + Negativo
        int soma3= calculo.soma(1,-3);
        System.out.println(soma3);
        int soma4= calculo.soma(-2,-2);
        System.out.println(soma4);
        int soma5= calculo.soma(0,-1);
        System.out.println(soma5);
        // X + Zero
        int soma6= calculo.soma(1,0);
        System.out.println(soma6);
        int soma7= calculo.soma(-2,0);
        System.out.println(soma7);
        int soma8= calculo.soma(0,0);
        System.out.println(soma8);
    }
    
}
