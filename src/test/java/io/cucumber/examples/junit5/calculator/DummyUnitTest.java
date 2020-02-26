package io.cucumber.examples.junit5.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DummyUnitTest {

    @Test
    public void dummyTest(){
        Assertions.assertEquals(1,1);
    }
}
