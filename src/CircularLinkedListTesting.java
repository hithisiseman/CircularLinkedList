import static org.junit.Assert.*;

import org.junit.Test;

public class CircularLinkedListTesting {

	@Test
	public void testpushFront1() {
		
		CircularLinkedList list = new CircularLinkedList();
		CircularLinkedList.Node N;
		list.size=0;
		if(list.head!=null)
			list.pushFront(1);
		
		assertEquals(0,list.size);
		
	}
	
	@Test
	public void testpushFront2() {
		
		CircularLinkedList list = new CircularLinkedList();
		
		list.size=0;
		list.pushFront(2);
		list.pushFront(3);
	
		assertEquals(2,list.size);
		
	}
	
	@Test
	public void testpushFront3() {
		
		CircularLinkedList list = new CircularLinkedList();
		list.size=0;
		
		for(int i=0;i<4;i++) {
			list.pushFront(i);
		}
		
		assertEquals(4,list.size);
		
	}
	
	@Test
	public void testpushBack1() {
		
		CircularLinkedList list = new CircularLinkedList();
		assertEquals(0,list.size);
		
	}
	
	
	@Test
	public void testpushBack2() {
		
		CircularLinkedList list = new CircularLinkedList();
		list.size=0;
		list.pushBack(1);
		assertEquals(1,list.size);
		
	}
	
	
	@Test
	public void testpushBack3() {
		
		CircularLinkedList list = new CircularLinkedList();
		list.size=0;
		
		for(int i=0;i<=40;i++) {
			list.pushBack(i);
		}
		
		assertEquals(41,list.size);
		
	}
	

	@Test
	public void testpushBack4() {
		
		CircularLinkedList list = new CircularLinkedList();
		list.size=0;
		list.pushBack(41);
		list.pushBack(42);
		assertEquals(2,list.size);
		
	}
	
	@Test
	public void testpopFront1() {
		
		CircularLinkedList list = new CircularLinkedList();
		list.size=0;
		list.pushFront(1);
		list.popFront();
		assertEquals(0,list.size);
		
	}
	
	@Test
	public void testpopFront2() {
			
			CircularLinkedList list = new CircularLinkedList();
			list.size=0;
			list.pushFront(1);
			list.pushFront(2);
			list.pushFront(3);
			list.popFront();
			list.popFront();
			assertEquals(1,list.size);
			
		}
	
	@Test
	public void testpopFront3() {
			
			CircularLinkedList list = new CircularLinkedList();
			list.size=0;
			for(int i=0;i<5;i++) {
				list.pushFront(i);
				list.popFront();
			}
			assertEquals(0,list.size);
			
		}
	
	@Test
	public void testpopFront4() {
			
			CircularLinkedList list = new CircularLinkedList();
			list.size=0;
			for(int i=0;i<5;i++) {
				list.pushFront(i);
				
			}
			
			list.popFront();
			assertEquals(4,list.size);
			
		}
	
	@Test
	public void testpopFront5() {
			
			CircularLinkedList list = new CircularLinkedList();
			list.size=0;
			for(int i=0;i<5;i++) {
				list.pushFront(i);
				
			}
			
			for(int i=0;i<2;i++) {	
				list.popFront();
			}
			assertEquals(3,list.size);
			
		}
	
	@Test
	public void testpopBack1() {
		
		CircularLinkedList list = new CircularLinkedList();
		list.size=0;
		list.pushBack(1);
		list.popBack();
		assertEquals(0,list.size);
	}

	@Test
	public void testpopBack2() {
			
			CircularLinkedList list = new CircularLinkedList();
			list.size=0;
			list.pushBack(1);
			list.pushBack(2);
			list.pushBack(3);
			list.popBack();
			list.popBack();
			assertEquals(1,list.size);
			
		}
	
	@Test
	public void testpopBack3() {
			
			CircularLinkedList list = new CircularLinkedList();
			list.size=0;
			for(int i=0;i<5;i++) {
				list.pushBack(i);
				list.popBack();
			}
			assertEquals(0,list.size);
			
		}
	
	@Test
	public void testpopBack4() {
			
			CircularLinkedList list = new CircularLinkedList();
			list.size=0;
			for(int i=0;i<5;i++) {
				list.pushBack(i);
				
			}
			
			list.popBack();
			assertEquals(4,list.size);
			
		}
	
	@Test
	public void testpopBack5() {
			
			CircularLinkedList list = new CircularLinkedList();
			list.size=0;
			for(int i=0;i<5;i++) {
				list.pushBack(i);
				
			}
			
			for(int i=0;i<2;i++) {	
				list.popBack();
			}
			assertEquals(3,list.size);
			
		}
}
