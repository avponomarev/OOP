public class MinusTest {
    @Test
    public void getOperator() throws Exception {
        Minus oper=new Minus();
        String actual=oper.getOperator();
        String expected="-";
        assertEquals(expected,actual);
        System.out.println("Знак минус корректен");
    }

    @Test
    public void calculateResult() throws Exception {
        Minus summat=new Minus();
        double actual = summat.calculateResult();
        double expected = 5;
        assertThat(expected,equalTo(actual));
        System.out.println("Вычитание отрабатывает корректно");
    }

}