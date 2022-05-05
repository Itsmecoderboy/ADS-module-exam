class ReverseLinkedList{
	static Node head=null;
	static Node rear=null;
	static Node front=null;
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			data=d;
			next=null;
			prev=null;
		}
	}
	
	static Node insertData(int data){
		Node new_Node=new Node(data); 
		System.out.println("c");
		if(head==null){
			head=new_Node;
			front=head;
			return head;
		}
		new_Node.next=null;
		rear=front;
		front.next=new_Node.prev;
		
		
		
		
		
		while(head!=null){
			front.next=new_Node;
			front=front.next;
		}
		//n.next=new_Node;
		return head;
		
	}
	static Node reverse(Node head){
		Node n=head;
		Node prev=null;
		while(n.front!=null){
			prev=n;
			n=n.next;
		}
		head.next=n;
		head=n;
			n.next=prev;	
			prev.next=head;
			head=n;
			head.next=null;
			display();
			return head;
		
	}
	
	static void display(){
		Node n=head;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
	//System.out.print("Null");
		
	}
	public static void main(String[] args){
		ReverseLinkedList r1=new ReverseLinkedList();
		insertData(1);
		insertData(2);
		insertData(3);
		insertData(4);
		insertData(5);
		display();
		
		//reverse(head);
		
	}
}