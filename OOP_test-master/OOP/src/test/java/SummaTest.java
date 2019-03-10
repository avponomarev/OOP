public class SummaTest {
    @Test
    public void getOperator() throws Exception {
        Summa oper=new Summa();
        String actual=oper.getOperator();
        String expected="+";
        assertEquals(expected,actual);
        System.out.println("Знак сумма корректен");
    }

    @Test
    public void calculateResult() throws Exception {
        Minus summat=new Minus();
        double actual = summat.calculateResult();
        double expected = 5;
        assertThat(expected,equalTo(actual));
        System.out.println("Сложение отрабатывает корректно");
    }

}