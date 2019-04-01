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
    //int i=0;
    TodoList ins = new TodoList();
    String st1 = "FirstOne";
    String st2 = "SecondOne";
    ins.add(st1); //adding string 1 into new instance 
    ins.add(st2); //adding string 2 into new instance 
    ins.moveUp(1);
    String result = ins.elementAt(0);
    assertEquals(true,st2.equals(result));
//fail("Not yet implemented");
}

@Test
public void testMoveDown() 
{
    System.out.println("Test MoveDown");
    //int i=0;
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
    System.out.println("Test Add");
    boolean sizeFlag=false,correctString=false;
    TodoList ins = new TodoList();
    String st1 = "FirstOne";
    /// Check the Size of list before and after the adding function
    int initialSize = ins.size(); // List size expecdted to be = 0
    ins.add(st1);
    int addedSize = ins.size(); // List size expecdted to be = 1
    if (initialSize+1==addedSize)
        sizeFlag = true;
    /// Check if the right element added
    String result = ins.elementAt(0); // getting the newly added element
    if (result.equals(st1))
        correctString = true;
    assertEquals(true,sizeFlag&&correctString);
//fail("Not yet implemented");
}

@Test
public void testEditAt() 
{
    System.out.println("Test Edit");
    TodoList ins = new TodoList();
    int elementIndex = 0;
    String st1 = "FirstOne";
    ins.add(st1);
    /// Check if the selected element modified
    String st2 = "ModifiedOne";
    ins.editAt(elementIndex, st2); // Modified element with new one
    String result = ins.elementAt(elementIndex); // getting the newly modified element
    assertEquals(true,result.equals(st2));
//fail("Not yet implemented");
}

@Test
public void testRemoveAt() 
{
    System.out.println("Test Remove");
    TodoList ins = new TodoList();
    String st1 = "FirstOne";
    ins.add(st1);
    /// Check if the selected element deleted
    ins.removeAt(0); // delete element
    int size = ins.size(); // check if the element is deleted and empty
    assertEquals(true,size==0);
//fail("Not yet implemented");
}

@Test
public void testSize() 
{
    System.out.println("Test Size");
    TodoList ins = new TodoList();
    String st1 = "FirstOne";
    int initSize = 0;
    ins.add(st1); // add element 
    int actualSize = ins.size(); // initialize actual size of list and check the actual size
    assertEquals(actualSize,initSize+1);
//fail("Not yet implemented");
}
    
}
