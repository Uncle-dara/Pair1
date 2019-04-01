/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.dojos.swing.todo.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class TodoListTest {
    
    public TodoListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of moveUp method, of class TodoList.
     */
    @Test
public void testMoveUp() 
{
    System.out.println("Test MoveUp");
    int i=0;
    TodoList ins = new TodoList();
    String st1 = "FirstOne";
    String st2 = "SecondOne";
    ins.add(st1);
    ins.add(st2);
    ins.moveUp(1);
    String result = ins.elementAt(0);
    assertEquals(true,st2.equals(result));
//fail("Not yet implemented");
}

@Test
public void testMoveDown() 
{
    System.out.println("Test MoveDown");
    int i=0;
    TodoList ins = new TodoList();
    String st1 = "FirstOne";
    String st2 = "SecondOne";
    ins.add(st1);
    ins.add(st2);
    ins.moveDown(0);
    String result = ins.elementAt(1);
    assertEquals(true,st1.equals(result));
//fail("Not yet implemented");
}

@Test
public void testAdd() 
{
//fail("Not yet implemented");
}

@Test
public void testEditAt() 
{
//fail("Not yet implemented");
}

@Test
public void testRemoveAt() 
{
//fail("Not yet implemented");
}

@Test
public void testSize() 
{
//fail("Not yet implemented");
}
    
}
