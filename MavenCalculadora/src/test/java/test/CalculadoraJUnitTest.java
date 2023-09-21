/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import Classes.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pichau
 */
public class CalculadoraJUnitTest {
    // Setando contas
    Soma contaSoma = new Soma();
    Subtracao contaSubtracao = new Subtracao();
    Multiplicacao contaMultiplicacao = new Multiplicacao();
    Divisao contaDivisao = new Divisao();
    
    // Testes de Soma
    @Test
    public void SomarPositivoPositivo(){
        contaSoma.soma(1, 2);
    }
    @Test
    public void SomarPositivoNegativo(){
        contaSoma.soma(1, -2);
    }
    @Test
    public void SomarPositivoZero(){
        contaSoma.soma(1, 0);
    }
    @Test
    public void SomarNegativoPositivo(){
        contaSoma.soma(-2, 1);
    }
    @Test
    public void SomarNegativoNegativo(){
        contaSoma.soma(-2, -2);
    }
    @Test
    public void SomarNegativoZero(){
        contaSoma.soma(-2, 0);
    }
    @Test
    public void SomarZeroPositivo(){
        contaSoma.soma(0, 2);
    }
    @Test
    public void SomarZeroNegativo(){
        contaSoma.soma(0, -2);
    }
    @Test
    public void SomarZeroZero(){
        contaSoma.soma(0, 0);
    }
    
    // Testes de Subtração
    @Test
    public void SubtrairPositivoPositivo(){
        contaSubtracao.subtrair(1, 2);
    }
    @Test
    public void SubtrairPositivoNegativo(){
        contaSubtracao.subtrair(1, -2);
    }
    @Test
    public void SubtrairPositivoZero(){
        contaSubtracao.subtrair(1, 0);
    }
    @Test
    public void SubtrairNegativoPositivo(){
        contaSubtracao.subtrair(-2, 1);
    }
    @Test
    public void SubtrairNegativoNegativo(){
        contaSubtracao.subtrair(-2, -2);
    }
    @Test
    public void SubtrairNegativoZero(){
        contaSubtracao.subtrair(-2, 0);
    }
    @Test
    public void SubtrairZeroPositivo(){
        contaSubtracao.subtrair(0, 2);
    }
    @Test
    public void SubtrairZeroNegativo(){
        contaSubtracao.subtrair(0, -2);
    }
    @Test
    public void SubtrairZeroZero(){
        contaSubtracao.subtrair(0, 0);
    }
    
    // Testes de Multiplicação
    @Test
    public void MultiplicarPositivoPositivo(){
        contaMultiplicacao.multiplicacao(1, 2);
    }
    @Test
    public void MultiplicarPositivoNegativo(){
        contaMultiplicacao.multiplicacao(1, -2);
    }
    @Test
    public void MultiplicarPositivoZero(){
        contaMultiplicacao.multiplicacao(1, 0);
    }
    @Test
    public void MultiplicarNegativoPositivo(){
        contaMultiplicacao.multiplicacao(-2, 1);
    }
    @Test
    public void MultiplicarNegativoNegativo(){
        contaMultiplicacao.multiplicacao(-2, -2);
    }
    @Test
    public void MultiplicarNegativoZero(){
        contaMultiplicacao.multiplicacao(-2, 0);
    }
    @Test
    public void MultiplicarZeroPositivo(){
        contaMultiplicacao.multiplicacao(0, 2);
    }
    @Test
    public void MultiplicarZeroNegativo(){
        contaMultiplicacao.multiplicacao(0, -2);
    }
    @Test
    public void MultiplicarZeroZero(){
        contaMultiplicacao.multiplicacao(0, 0);
    }
    
    // Testes de Divisão
    @Test
    public void DividirPositivoPositivo(){
        contaDivisao.dividir(1, 2);
    }
    @Test
    public void DividirPositivoNegativo(){
        contaDivisao.dividir(1, -2);
    }
    @Test
    public void DividirNegativoPositivo(){
        contaDivisao.dividir(-2, 1);
    }
    @Test
    public void DividirNegativoNegativo(){
        contaDivisao.dividir(-2, -2);
    }
    @Test
    public void DividirZeroPositivo(){
        contaDivisao.dividir(0, 2);
    }
    @Test
    public void DividirZeroNegativo(){
        contaDivisao.dividir(0, -2);
    }
}
