package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1(){

        Demo1 demo1 = mock(Demo1.class);
//        demo1.demo(1);
        demo1.demo(1);
        verify(demo1).demo(1);

        when(demo1.demo(1)).thenReturn("123");
//        when(demo1.demo(1)).thenThrow(new RuntimeException());
        when(demo1.demo(99)).thenReturn("{'user':'tom','age':'23'}");

        System.out.println(demo1.demo(1));
        System.out.println(demo1.demo(99));

    }

    public static class  Demo1{

        public String demo(int i){
            return "测试";
        }

    }


    public void demo2(){

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程");
            }
        });

    }

}
