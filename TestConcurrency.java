import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
public class TestConcurrency {

    @RepeatedTest(500)
    public void test() throws InterruptedException {
        ConcurrencyTest concurrency = new ConcurrencyTest();
        String result = concurrency.printNumbers();
        Assertions.assertEquals("1234", result);
    }


}
