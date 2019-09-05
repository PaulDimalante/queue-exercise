package com.pauldimalante.queueexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueExerciseApplicationTests {
//	public static void main() {
//		QueueExerciseApplicationTests me = new QueueExerciseApplicationTests();
//		me.emptyQueueShouldReturnNull();
//	}

	@Before
	public void beforeRoutine() {};

	@After
	public void afterRoutine() {};

	@Test
	public void emptyQueueShouldReturnNull() {
		MyQueue myQueue = new MyQueue();
		assertNull(myQueue.Front());
		assertNull(myQueue.Rear());
		assertNull(myQueue.Dequeue());
	}

	@Test
	public void QueueWithOneItemShouldReturnSameItem() {
		Object expected = new Object();
		MyQueue myQueue = new MyQueue();
		myQueue.Enqueue(expected);
		assertEquals(myQueue.Front(), expected);
		assertEquals(myQueue.Rear(), expected);
		assertEquals(myQueue.Dequeue(), expected);
	}

	@Test
	public void QueueWithMoreThanOneItemShouldReturnDifferentItem() {
		Object expectedFirst = new Object();
		Object expectedLast = new Object();
		MyQueue myQueue = new MyQueue();
		myQueue.Enqueue(expectedFirst);
		myQueue.Enqueue(expectedLast);
		assertEquals(myQueue.Front(), expectedFirst);
		assertEquals(myQueue.Rear(), expectedLast);
		assertEquals(myQueue.Dequeue(), expectedFirst);
	}

}
