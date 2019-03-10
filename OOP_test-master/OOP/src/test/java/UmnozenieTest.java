public class UmnozenieTest {
    @Test
    public void getOperator() throws Exception {
        Umnozenie oper=new Umnozenie();
        String actual=oper.getOperator();
        String expected="*";
        assertEquals(expected,actual);
        System.out.println("Знак умножения корректен");
    }

    @Test
    public void calculateResult() throws Exception {
        Umnozenie summat=new Umnozenie();
        double actual = summat.calculateResult();
        double expected = 50;
        assertThat(expected,equalTo(actual));
        System.out.println("Умножение отрабатывает корректно");
    }

}