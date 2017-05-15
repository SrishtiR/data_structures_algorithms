package Random;

public class DeleteNodeAtPos extends LinkedList{
	NodeLL deleteNode(int pos, NodeLL head) {
		NodeLL temp = head;
		int count = 0;
		while(count < pos-1) {
			temp = temp.next;
			count++;
		}
		NodeLL delnext = temp.next;
		temp.next = delnext.next;
		return head;
		
	

	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.printList();
		DeleteNodeAtPos n = new DeleteNodeAtPos();
		ll.head = n.deleteNode(1,ll.head);
		ll.printList();
	}
}
