import org.junit.*;

public class CalculatorTestSuccessful {
    private static ICalculator calculator;

    @BeforeClass
    public static void initCalculator(){
        calculator = new Calculator();
    }

    @Before
    public void beforeEachTest(){
        System.out.println("Test start.");
    }

    @After
    public void afterEachTest(){
        System.out.println("Test end.");
    }

    @Test
    public void testSum(){
        int result = calculator.sum(2, 2);
        Assert.assertEquals(4, result);
    }

    @Test (expected = Exception.class)
    public void testDivException() throws Exception{
        calculator.div(10,0);
    }

    @Test
    public void testEquals(){
        boolean res = calculator.equals(20,20);
        Assert.assertTrue(res);
    }
}
