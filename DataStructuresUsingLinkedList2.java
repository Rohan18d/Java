import java.util.Scanner;

class Node
	{
	    static Node top,temp;
	    Node next;
		int data;
		static int listlength;
		Node(int data)
		{
			this.data=data;
			listlength++;
		}
	}
class Stack
{
	Scanner s=new Scanner(System.in);

	public void push() 
	{
		System.out.println("Push Element:");
		int data=s.nextInt();
		Node.temp=new Node(data);
		//Previous node address should be copied to new node's next variable.
		Node.temp.next=Node.top;		/*As the previous node address contains in top variable first we have
		 								  to copy the address from top to new node variable next and then update the top with new node
		 								  address */
		Node.top=Node.temp;
	}
	public void pop() 
	{
		if(ifEmpty())
			throw new RuntimeException("Stack is Empty");
		System.out.println("Deleted data: "+Node.top.data);
		Node.top=Node.top.next;
	}

	public boolean ifEmpty() 
	{
		return Node.top.next==null;
	}

	public void display()
	{
		Node.temp=Node.top;
		while(Node.temp.next!=null)
		{
			System.out.println(Node.temp.data);
			Node.temp=Node.temp.next;
		}
		System.out.println(Node.temp.data);
		System.out.println("The length of LinkedList: "+Node.listlength);
	}
	
}
public class DataStructuresUsingLinkedList2 {
	
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		Stack stack=new Stack();
		while(true)
		{		
			System.out.println("\n1.Push"
					+ "\n2.Pop"
					+ "\n3.Display Stack"
					+ "\n4.End");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1 :stack.push();break;
			case 2 :stack.pop();break;
			case 3:stack.display();break;
			case 4:System.exit(0);
			default: System.out.println("Game Over");
			}	
		}
	}
}
