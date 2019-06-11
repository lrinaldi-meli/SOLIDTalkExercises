package com.meli.training.Isp.example;

import com.meli.training.lsp.example.Rectangle;
import com.meli.training.lsp.example.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void testSetWidth_Rectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);

        assertEquals(5, rectangle.getWidth());
        assertEquals(20, rectangle.getArea());
    }

    @Test
    public void testSetWidth_Square() {
        Rectangle rectangle = new Square();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        assertEquals(5, rectangle.getWidth());
        assertEquals(20, rectangle.getArea());
    }
}