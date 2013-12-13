package com.thoughtworks.ns.env;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {
    ImmutableList<Integer> immutableList = ImmutableList.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//    DigitalConverter digitalConverter = new DigitalConverter();
@Test
    public void OddReturnTest() throws Exception
    {
        List<Integer> list = Lists.newArrayList(1, 3, 5, 7, 9);
        assertEquals(list, HelloWorld.OddReturn(immutableList)) ;
    }
    @Test
    public void EvenMultiplyTwoTest() throws Exception
    {
        List<Integer> list = Lists.newArrayList(1,4,3,8,5,12,7,16,9,20);
        assertEquals(list, HelloWorld.EvenMultiplyTwo(immutableList));
    }
    @Test
    public void FindTest() throws Exception
    {
        String message = HelloWorld.Find(immutableList, 1);
        assertEquals(message, "Hello, 1");
        message = HelloWorld.Find(immutableList,-1);
        assertEquals(message,"Not found");
        message = HelloWorld.Find(immutableList,2);
        assertEquals(message,"Hello, 2");
    }
    @Test
    public void testSum() throws Exception {
        assertThat(3, is(HelloWorld.sum(1, 2)));
    }
}
