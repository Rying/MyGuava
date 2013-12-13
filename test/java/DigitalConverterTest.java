package java;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.List;

import static org.junit.Assert.assertEquals;
/**
 * Created with IntelliJ IDEA.
 * User: ry
 * Date: 13-12-12
 * Time: 下午2:48
 * To change this template use File | Settings | File Templates.
 */
public class DigitalConverterTest {
    ImmutableList<Integer> immutableList = ImmutableList.of(1,2,3,4,5,6,7,8,9,10);
    DigitalConverter digitalConverter = new DigitalConverter();
    public void OddReturnTest()
    {
        List<Integer> list = Lists.newArrayList(1, 3, 5, 7, 9);
        assertEquals(list, digitalConverter.OddReturn(immutableList)) ;
    }

    public void EvenMultiplyTwoTest()
    {
        List<Integer> list = Lists.newArrayList(1,4,3,8,5,12,7,16,9,20);
        assertEquals(list, digitalConverter.EvenMultiplyTwo(immutableList));
    }

    public void FindTest()
    {
        String message = digitalConverter.Find(immutableList, 1);
        assertEquals(message, "Hello, 1");
        message = digitalConverter.Find(immutableList,-1);
        assertEquals(message,"Not found");
        message = digitalConverter.Find(immutableList,2);
        assertEquals(message,"Hello, 2");
    }

}
