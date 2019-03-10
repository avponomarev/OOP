public class DelenieTest {
    @Test
    public void getOperator() throws Exception {
        Delenie oper=new Delenie();
        String actual=oper.getOperator();
        String expected="/";
        assertEquals(expected,actual);
        System.out.println("Знак деления корректен");
    }

    @Test
    public void calculateResult() throws Exception {
        Delenie summat=new Delenie();
        double actual = summat.calculateResult();
        double expected = 2;
        assertThat(expected,equalTo(actual));
        System.out.println("деление отрабатывает корректно");

    }

}