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

}
