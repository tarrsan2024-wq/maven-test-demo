package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AppTest 
{
    @Test
    void testAdd() 
    {
        Assertions.assertEquals(5, App.add(2, 3));
    }
}
