package Ex1;

import org.example.Ex1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEx1 {

    @Test
    public void test1(){
        Ex1 ex1 = new Ex1();
        int[] a = {1,4,0,0};
        int[] b = {0,0};
        Assertions.assertArrayEquals(b, ex1.array(a));
    }

    @Test
    public void test2(){
        Ex1 ex1 = new Ex1();
        int[] a = {1,4};
        int[] b = {};
        Assertions.assertArrayEquals(b, ex1.array(a));
    }
}
