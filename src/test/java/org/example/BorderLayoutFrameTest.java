package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.BorderLayout;

public class BorderLayoutFrameTest {

    @Test
    void testFrameCreation() {
        BorderLayoutFrame frame = new BorderLayoutFrame();

        assertNotNull(frame);
    }

    @Test
    void testFrameTitle() {
        BorderLayoutFrame frame = new BorderLayoutFrame();

        assertEquals("BorderLayout Demo", frame.getTitle());
    }

    @Test
    void testLayoutManager() {
        BorderLayoutFrame frame = new BorderLayoutFrame();

        assertTrue(frame.getLayout() instanceof BorderLayout);
    }
}