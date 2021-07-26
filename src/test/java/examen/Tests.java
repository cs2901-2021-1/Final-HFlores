package examen;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void test01() throws IOException{

        Usuario user = new Usuario("harlop", "polrah");
        Assert.assertTrue(user.Login());

        Usuario user2 = new Usuario("harlop", "harlop");
        Assert.assertFalse(user.Login());

    }

    @Test
    public void test02() throws IOException{
        Centro centro1 = new Centro("centro1",0,0,true);



    }



    @Test(invocationCount = 2)
    public void test03() throws Exception {
    }


}
