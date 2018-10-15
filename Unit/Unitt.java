package com.company;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnitT {

    @Test
    void FirstUnitTest(){
        assertEquals(Main.Check(1,2,3), false);
    }

    @Test
    void SecondUnitTest(){
        assertEquals(Main.Check(2,4,4), true);
    }

    @Test
    void ThirdUnitTest(){
        assertEquals(Main.Check(4,4,2), true);
    }

    @Test
    void FouthUnitTest(){
        assertEquals(Main.Check(1,0,3), false);
    }

    @Test
    void FifthUnitTest(){
        assertEquals(Main.Check(1,-2,0), false);
    }

    @Test
    void SixthUnitTest(){
        assertEquals(Main.Check(1,1,1), true);
    }

    @Test
    void SeventhUnitTest(){
        assertEquals(Main.Check(1,-1,1), false);
    }

    @Test
    void EighthUnitTest(){
        assertEquals(Main.Check(0,2,0), false);
    }

    @Test
    void NinthUnitTest(){
        assertEquals(Main.Check(10,2,10), true);
    }

    @Test
    void TenthUnitTest(){
        assertEquals(Main.Check(3,100,2), false);
    }
}
