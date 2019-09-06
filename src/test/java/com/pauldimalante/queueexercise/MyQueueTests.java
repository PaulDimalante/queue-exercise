package com.pauldimalante.queueexercise;

//import org.junit.After;
//import org.junit.Before;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MyQueueTests {
	public static void main() {
		MyQueueTests me = new MyQueueTests();
		me.emptyNodeQueueShouldReturnException();
		//me.nodeQueueWithOneItemShouldReturnSameItem();
		//me.nodeQueueWithMoreThanOneItemShouldReturnDifferentItem();
	}

//	@Before
//	public void beforeRoutine() {};
//
//	@After
//	public void afterRoutine() {};

	@Test
	public void emptyNodeQueueShouldReturnException() {
		MyQueue myNodeQueue = new MyQueue();
		assertThrows(NoSuchElementException.class, () -> myNodeQueue.front());
		assertThrows(NoSuchElementException.class, () -> myNodeQueue.rear());
		assertThrows(NoSuchElementException.class, () -> myNodeQueue.dequeue());
	}

	@Test
	public void nodeQueueWithOneItemShouldReturnSameItem() {
		Object expected = new Object();
		MyQueue myNodeQueue = new MyQueue();
		myNodeQueue.enqueue(expected);
		Object front = myNodeQueue.front();
		Object rear = myNodeQueue.rear();
		Object dequeue = myNodeQueue.dequeue();
		assertEquals(front, expected);
		assertEquals(rear, expected);
		assertEquals(dequeue, expected);
	}

	@Test
	public void nodeQueueWithMoreThanOneItemShouldReturnDifferentItem() {
		Object expectedFirst = new Object();
		Object expectedMiddle = new Object();
		Object expectedLast = new Object();
		MyQueue myNodeQueue = new MyQueue();
		myNodeQueue.enqueue(expectedFirst);
		myNodeQueue.enqueue(expectedMiddle);
		myNodeQueue.enqueue(expectedLast);
		Object actualFirst = myNodeQueue.front();
		Object actualLast = myNodeQueue.rear();
		Object actualDequeueFirst = myNodeQueue.dequeue();
		Object actualDequeueMiddle = myNodeQueue.dequeue();
		Object actualDequeueLast = myNodeQueue.dequeue();
		assertEquals(actualFirst, expectedFirst);
		assertEquals(actualLast, expectedLast);
		assertEquals(actualDequeueFirst, expectedFirst);
		assertEquals(actualDequeueMiddle, expectedMiddle);
		assertEquals(actualDequeueLast, expectedLast);
		assertThrows(NoSuchElementException.class, () -> myNodeQueue.dequeue());
	}

}
