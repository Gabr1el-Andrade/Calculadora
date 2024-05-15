import static org.junit.Assert.*;
public class Test {

    @org.junit.Test
    public void testAdicionar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.adicionar(2, 3));
        assertEquals(0, calc.adicionar(-2, 2));
        assertEquals(-5, calc.adicionar(-2, -3));
    }

    @org.junit.Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(-1, calc.subtrair(2, 3));
        assertEquals(-4, calc.subtrair(-2, 2));
        assertEquals(1, calc.subtrair(-2, -3));
    }

    @org.junit.Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-4, calc.multiplicar(-2, 2));
        assertEquals(6, calc.multiplicar(-2, -3));
        assertEquals(0, calc.multiplicar(0, 3));
    }

    @org.junit.Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(-1, calc.dividir(-2, 2));
        assertEquals(1, calc.dividir(-3, -3));

        try {
            calc.dividir(1, 0);
            fail("Deveria lançar ArithmeticException ao dividir por zero");
        } catch (ArithmeticException e) {
        }
    }
}
