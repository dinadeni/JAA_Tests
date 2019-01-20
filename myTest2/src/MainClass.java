import org.junit.Test;

public class MainClass
{
    public int getLocalNumber() {
        return 14;
    }

    @Test
    public void myFirstTest() {
        System.out.println(this.getLocalNumber());
    }
}
