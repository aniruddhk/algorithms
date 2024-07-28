import JavaFeatures.Thread1;
import JavaFeatures.Thread2;
import JavaFeatures.Thread3;
import JavaFeatures.Thread4;

public class ConcurrencyTest {
    public String printNumbers() throws InterruptedException {
        StringBuilder output = new StringBuilder();

        Thread t1 = new Thread(new Thread1(output));
        Thread t2 = new Thread(new Thread2(output));
        Thread t3 = new Thread(new Thread3(output));
        Thread t4 = new Thread(new Thread4(output));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        return output.toString();
    }
}
