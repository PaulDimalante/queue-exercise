package com.pauldimalante.queueexercise;

//import org.junit.After;
//import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;


public class MyQueueTests {
//	public static void main() {
//		QueueExerciseApplicationTests me = new QueueExerciseApplicationTests();
//		me.emptyQueueShouldReturnNull();
//	}

//	@Before
//	public void beforeRoutine() {};
//
//	@After
//	public void afterRoutine() {};

	@Test
	public void emptyQueueShouldReturnException() {
		MyQueue myQueue = new MyQueue();
		assertThrows(NoSuchElementException.class, () -> myQueue.front());
		assertThrows(NoSuchElementException.class, () -> myQueue.rear());
		assertThrows(NoSuchElementException.class, () -> myQueue.dequeue());
	}

	@Test
	public void QueueWithOneItemShouldReturnSameItem() {
		Object expected = new Object();
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(expected);
		assertEquals(myQueue.front(), expected);
		assertEquals(myQueue.rear(), expected);
		assertEquals(myQueue.dequeue(), expected);
	}

	@Test
	public void QueueWithMoreThanOneItemShouldReturnDifferentItem() {
		Object expectedFirst = new Object();
		Object expectedLast = new Object();
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(expectedFirst);
		myQueue.enqueue(expectedLast);
		assertEquals(myQueue.front(), expectedFirst);
		assertEquals(myQueue.rear(), expectedLast);
		assertEquals(myQueue.dequeue(), expectedFirst);
	}

}
