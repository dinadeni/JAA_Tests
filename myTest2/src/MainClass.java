import org.junit.Test;

public class MainClass
{
    int number = 14;
    @Test
    public void getLocalNumber() {
        System.out.println(this.number);
    }
}
