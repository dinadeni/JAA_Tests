import org.junit.Test;

public class MainTestClass extends MainClass {
    
    @Test
    public void myFirstTest() {
        System.out.println(this.getLocalNumber());
    }

    @Test
    public void testGetLocalNumber() {
        int a = this.getLocalNumber();

        if (a != 14) {
            System.out.println("Wrong number:" + a);
        } else {
            System.out.println("Right number:" + a);
        }
    }
}
