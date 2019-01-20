import org.junit.Test;

public class MainTestClass extends MainClass {
    @Test
    public void testGetLocalNumber() {
        if (this.number != 14) {
            System.out.println("Wrong number" + this.number);
        } else {
            System.out.println("Right number" + this.number);
        }
    }
}
