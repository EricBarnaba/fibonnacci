import org.junit.Assert;
import org.junit.Test;

public class ProdFibTest {

    @Test
    public void trueTest(){
        //Given
        long prod = 4895;
        //When
        long[] expected = new long[]{55,89,1};
        long[] actual = ProdFib.productFib(prod);
        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void falseTest(){
        //Given
        long prod = 5895;
        //When
        long[] expected = new long[]{89,114,0};
        long[] actual = ProdFib.productFib(prod);
        //Then
        Assert.assertArrayEquals(expected,actual);
    }


}
