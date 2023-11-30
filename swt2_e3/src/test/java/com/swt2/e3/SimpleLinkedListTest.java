package com.swt2.e3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
public class SimpleLinkedListTest 
{
    /**
     * Rigorous Test :-)
     */
    private SimpleLinkedList<Integer> testList = new SimpleLinkedList<Integer>();
    
    @BeforeEach
    public void init(){
        this.testList = new SimpleLinkedList<Integer>();
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void new_list_is_empty(){
        assertTrue(testList.isEmpty());
    }

    @Test
    public void add_does_not_throw_exception_on_first_add(){
        assertDoesNotThrow(() -> testList.add(1));
    }

    @Test
    public void contains_element_after_add(){
        testList.add(1);
        assertFalse(testList.isEmpty());
        assertEquals(1, testList.size());
        assertTrue(testList.contains(1));
    }

    @Test 
    public void multiple_adds(){
        testList.add(1);
        testList.add(2);
        testList.add(3);
        assertFalse(testList.isEmpty());
        assertEquals(3, testList.size());
        assertTrue(testList.containsAll(Arrays.asList(1, 2, 3)));
    }
}
