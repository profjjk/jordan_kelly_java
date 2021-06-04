package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ConverterIfTest {
    ConverterIf converter;

    @Before
    public void setUp() {
        converter = new ConverterIf();
    }

    @Test
    public void shouldReturnCorrespondingMonth() {
        assertEquals("January", converter.convertMonth(1));
        assertEquals("February", converter.convertMonth(2));
        assertEquals("March", converter.convertMonth(3));
        assertEquals("April", converter.convertMonth(4));
        assertEquals("May", converter.convertMonth(5));
        assertEquals("June", converter.convertMonth(6));
        assertEquals("July", converter.convertMonth(7));
        assertEquals("August", converter.convertMonth(8));
        assertEquals("September", converter.convertMonth(9));
        assertEquals("October", converter.convertMonth(10));
        assertEquals("November", converter.convertMonth(11));
        assertEquals("December", converter.convertMonth(12));
    }

    @Test
    public void shouldReturnCorrespondingDayOfWeek() {
        assertEquals("Sunday", converter.convertDay(1));
        assertEquals("Monday", converter.convertDay(2));
        assertEquals("Tuesday", converter.convertDay(3));
        assertEquals("Wednesday", converter.convertDay(4));
        assertEquals("Thursday", converter.convertDay(5));
        assertEquals("Friday", converter.convertDay(6));
        assertEquals("Saturday", converter.convertDay(7));
    }

    @Test
    public void shouldReturnNullIfNumberOutOfBounds() {
        assertNull(converter.convertMonth(13));
        assertNull(converter.convertDay(8));
    }
}