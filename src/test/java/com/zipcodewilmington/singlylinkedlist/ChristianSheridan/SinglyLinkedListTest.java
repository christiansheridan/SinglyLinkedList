package com.zipcodewilmington.singlylinkedlist.ChristianSheridan;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    SinglyLinkedList testList = new SinglyLinkedList();

    @Before
    public void testSetUp(){

    }

    @Test
    public void addTest(){
        testList.add(1);
        int expected = 1;
        int actual = testList.head.data;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        testList.add(1);
        testList.add(2);
        testList.remove(1);
        int actual = testList.head.data;

        Assert.assertEquals(2, actual);
    }

    @Test
    public void containsTest(){
        testList.add(1);
        testList.add(2);

        boolean expected = true;
        boolean actual = testList.contains(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findTest(){
        testList.add(1);
        testList.add(2);

        int expected = 1;
        int actual = testList.find(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest(){
        testList.add(1);
        testList.add(2);
        testList.add(3);

        int expected = 3;
        int actual = testList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        testList.add(2);
        testList.add(4);
        testList.add(103);

        int expected = 2;
        int actual = testList.get(0);
    }

    @Test
    public void copyTest(){
        testList.add(2);
        testList.add(4);
        testList.add(103);
        testList.add(1);

        SinglyLinkedList expected = testList;
        SinglyLinkedList actual = testList.copy();

        int expectedInt = expected.get(2);
        int actualInt = actual.get(2);


        Assert.assertEquals(expectedInt, actualInt);
    }

    @Test
    public void sort(){
        testList.add(2);
        testList.add(5);
        testList.add(3);
        testList.add(1);

        testList.sort();

        Assert.assertTrue(testList.get(0)<testList.get(1) && testList.get(1)<testList.get(2) && testList.get(2)<testList.get(3));
    }



}
