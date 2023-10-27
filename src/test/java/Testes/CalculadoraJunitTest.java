package Testes;
import Classes.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Uma classe de teste para a classe Calculadora que testa várias operações matemáticas.
 */
public class CalculadoraJunitTest {
    Calculadora calculo = new Calculadora();

    // Testes de soma
    @Test
    public void SomaPositivoPositivo(){
        calculo.Soma(10, 10);
    }
    @Test
    public void SomaPositivoNegativo(){
        calculo.Soma(10, -10);
    }
    @Test
    public void SomaPositivoZero(){
        calculo.Soma(10, 0);
    }
    @Test
    public void SomaNegativoPositivo(){
        calculo.Soma(-10, 10);
    }
    @Test
    public void SomaNegativoNegativo(){
        calculo.Soma(-10, -10);
    }
    @Test
    public void SomaNegativoZero(){
        calculo.Soma(-10, 0);
    }
    @Test
    public void SomaZeroPositivo(){
        calculo.Soma(0, 10);
    }
    @Test
    public void SomaZeroNegativo(){
        calculo.Soma(0, -10);
    }
    @Test
    public void SomaZeroZero(){
        calculo.Soma(0, 0);
    }

    // Testes de subtração
    @Test
    public void SubPositivoPositivo(){
        calculo.Substracao(10, 10);
    }
    @Test
    public void SubPositivoNegativo(){
        calculo.Substracao(10, -10);
    }
    @Test
    public void SubPositivoZero(){
        calculo.Substracao(10, 0);
    }
    @Test
    public void SubNegativoPositivo(){
        calculo.Substracao(-10, 10);
    }
    @Test
    public void SubNegativoNegativo(){
        calculo.Substracao(-10, -10);
    }
    @Test
    public void SubNegativoZero(){
        calculo.Substracao(-10, 0);
    }
    @Test
    public void SubZeroPositivo(){
        calculo.Substracao(0, 10);
    }
    @Test
    public void SubZeroNegativo(){
        calculo.Substracao(0, -10);
    }
    @Test
    public void SubZeroZero(){
        calculo.Substracao(0, 0);
    }

    // Testes de multiplicação
    @Test
    public void VezesPositivoPositivo(){
        calculo.Multiplicacao(10, 10);
    }
    @Test
    public void VezesPositivoNegativo(){
        calculo.Multiplicacao(10, -10);
    }
    @Test
    public void VezesPositivoZero(){
        calculo.Multiplicacao(10, 0);
    }
    @Test
    public void VezesNegativoPositivo(){
        calculo.Multiplicacao(-10, 10);
    }
    @Test
    public void VezesNegativoNegativo(){
        calculo.Multiplicacao(-10, -10);
    }
    @Test
    public void VezesNegativoZero(){
        calculo.Multiplicacao(-10, 0);
    }
    @Test
    public void VezesZeroPositivo(){
        calculo.Multiplicacao(0, 10);
    }
    @Test
    public void VezesZeroNegativo(){
        calculo.Multiplicacao(0, -10);
    }
    @Test
    public void VezesZeroZero(){
        calculo.Multiplicacao(0, 0);
    }

    // Testes de divisão
    @Test
    public void DivPositivoPositivo(){
        calculo.Divisao(10, 10);
    }
    @Test
    public void DivPositivoNegativo(){
        calculo.Divisao(10, -10);
    }
    @Test
    public void DivNegativoPositivo(){
        calculo.Divisao(-10, 10);
    }
    @Test
    public void DivNegativoNegativo(){
        calculo.Divisao(-10, -10);
    }
    @Test
    public void DivZeroPositivo(){
        calculo.Divisao(0, 10);
    }
    @Test
    public void DivZeroNegativo(){
        calculo.Divisao(0, -10);
    }
}
