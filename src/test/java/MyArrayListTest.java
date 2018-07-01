import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyArrayListTest <T>{

    @Before
    public void setup(){


    }


    @Test
    public void initializationTestNoParameters(){
        MyArrayList myArrayList = new MyArrayList();
        int expected = 0;
        int actual = myArrayList.size();
        assertEquals(expected,actual);
    }

    @Test
    public void initializationTestLengthParameter(){
        MyArrayList myArrayList = new MyArrayList(10);
        int expected = 10;
        int actual = myArrayList.size();
        assertEquals(expected,actual);
    }

    @Test
    public void addTestAddNoParameters(){
        T t = null;
        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.add(t);
        int expected = 11;
        int actual = myArrayList.size();
        assertEquals(expected,actual);
    }

    @Test
    public void addTestAddNoParametersAddsAtEnd(){
        T t = null;
        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.add(t);
        T expected = null;
        T actual = (T) myArrayList.get(10);
        assertEquals(expected,actual);
    }

    @Test
    public void addTestAddWithSpecifiedIndex(){
        T t = null;
        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.add(t, 4);
        int expected = 11;
        int actual = myArrayList.size();
        assertEquals(expected,actual);
    }

    @Test
    public void addTestAddWithSpecifiedIndexAddsAtIndex(){
        T t = null;
        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.add(t, 4);
        T expected = null;
        T actual = (T) myArrayList.get(4);
        assertEquals(expected,actual);
    }

    @Test
    public void removeTestForValue(){
        MyArrayList myArrayList = new MyArrayList(10);
        T actual = (T) myArrayList.remove(4);
        T expected = null;
        assertEquals(expected,actual);
    }

    @Test
    public void removeTestForSize(){
        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.remove(4);
        int expected = 9;
        int actual = myArrayList.size();
        assertEquals(expected,actual);
    }

    @Test
    public void setTestForSize(){
        T t = null;
        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.set(4, t);
        int expected = 10;
        int actual = myArrayList.size();
        assertEquals(expected,actual);
    }

    @Test
    public void setTestForReturn(){
        T t = null;
        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.set(4, t);
        T expected = (T) myArrayList.get(4);
        T actual = (T) myArrayList.set(4, t);
        assertEquals(expected,actual);
    }

    @Test
    public void setTestForSet(){
        String expected = "bear";
        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.set(4, expected);
        String actual = (String) myArrayList.get(4);
        assertEquals(expected,actual);
    }

    @Test
    public void clearTestForSize(){

        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.clear();
        int expected = 0;
        int actual = myArrayList.size();
        assertEquals(expected,actual);
    }

    @Test
    public void clearTestForNull(){

        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.clear();
        T expected = null;
        T actual = (T) myArrayList.get(4);

        assertEquals(expected,actual);
    }

    @Test
    public void clearTestIsEmpty(){

        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.clear();
        boolean actual = myArrayList.isEmpty();

        assertTrue(actual);
    }

    @Test
    public void isEmptyTest(){
        MyArrayList myArrayList = new MyArrayList(10);
        boolean actual = myArrayList.isEmpty();

        assertFalse(actual);
    }

    @Test
    public void containsTestFalse(){
        MyArrayList myArrayList = new MyArrayList(10);
        boolean actual = myArrayList.contains("bear");
        assertFalse(actual);
    }

    @Test
    public void containsTestTrue(){
        String expected = "bear";
        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.set(4, expected);

        boolean actual = myArrayList.contains("bear");

        assertTrue(actual);
    }



}
