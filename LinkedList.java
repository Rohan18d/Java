import java.util.Scanner;

/*In order to find middle element of linked list in one pass, you need to maintain two-pointer,
 *  one increment at each node while other increments after two nodes at a time, by having this
 *  arrangement, when the first pointer reaches the end, the second pointer will point to a 
 *   middle element of the linked list.*/

class LinkedListNode
{
	static LinkedListNode front;
	static int listlength,middlelistlength;
	int data;
	LinkedListNode next;
	LinkedListNode(int data)	
	{
		listlength++;
		this.data=data;
		if(listlength%2==0)
			middlelistlength++; 
	}
}
class LinkedListOps
{
	static LinkedListNode temp,temp1;
	int var,var1;
	Scanner s=new Scanner(System.in);
	public void add()
	{
		System.out.println("Enter the element:");
		var=s.nextInt();
		
		if(LinkedListNode.listlength==0)
			LinkedListNode.front=new LinkedListNode(var);
		else
		{
			temp=LinkedListNode.front;
		
			while(temp.next!=null)
			{
			temp=temp.next;
			}
			temp1=new LinkedListNode(var);
			temp.next=temp1;
		}
	}
	public void delete()
	{
		System.out.println("Enter the node to be deleted");
		var=s.nextInt();
		if(var>LinkedListNode.listlength)
			throw new RuntimeException("Node is not present");
		
		else
		{
			temp=LinkedListNode.front;
			var1=1;
			while(var1!=var)
			{
				temp1=temp;		//temp1 has previous node data.
				temp=temp.next;	//temp has present node data.
				var1++;
			}
			if(temp.next==null)
			{
				temp1.next=null;
				LinkedListNode.listlength--;
			}
			else
			{
				temp1.next=temp.next;
				LinkedListNode.listlength--;
			}
		}
	}
	public void display()
	{
		if(ifEmpty())
			throw new RuntimeException("LinkedList is Empty");
		temp=LinkedListNode.front;
		var=LinkedListNode.listlength;
		while(var!=0)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
			var--;
		}
	}
	public void middleNode()
	{
		temp=LinkedListNode.front;
		var=LinkedListNode.middlelistlength;
		while(var!=0)
		{
			temp=temp.next;
			var--;
		}
		System.out.print(temp.data+" ");
	}
	public boolean ifEmpty() 
	{
		return LinkedListNode.front==null;
	}
}

public class LinkedList {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		LinkedListOps o=new LinkedListOps();
		while(true)
		{		
			System.out.println("\n1.Add"
					+ "\n2.Delete"
					+ "\n3.Display LinkedList"
					+ "\n4.MiddleNode"
					+ "\n5.End");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1 :o.add();break;
			case 2 :o.delete();break;
			case 3 :o.display();break;
			case 4 :o.middleNode();break;
			case 5:System.exit(0);
			default: System.out.println("Game Over");
			}	
		}

	}

}
