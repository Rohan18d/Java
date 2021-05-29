import java.util.Scanner;

public class ConventionalStack {
	static int array[],capacity,top;
	static Scanner s=new Scanner(System.in);
	
	ConventionalStack(int capacity)
	{
		array=new int[capacity];
		ConventionalStack.capacity=capacity;
		top=-1;
	}
	
	public static void push()
	{
		if(isFull())
			throw new RuntimeException("Stack is Full");
		System.out.println("Push Element:");
		array[++top]=s.nextInt();
		
	}
	public static boolean isFull() 
	{
		return top==capacity-1;
	}
	public static boolean isEmpty()
	{
		return top==-1;
	}
	public static void pop()
	{
		if(isEmpty())
			throw new RuntimeException("Stack is Empty");
		System.out.println(array[top--]); 
	}
	public static void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	

	public static void main(String[] args) 
	{
		System.out.println("Enter the capacity of Stack to be created :");
		int capacity =s.nextInt();
		ConventionalStack stack=new ConventionalStack(capacity);
		
	while(true)
	{		
		System.out.println("1.Push"
				+ "\n2.Pop"
				+ "\n3.Display Stack"
				+ "\n4.End");
		int choice=s.nextInt();
		
		switch(choice)
		{
		case 1 :push();break;
		case 2 :pop();break;
		case 3:display();break;
		case 4:System.exit(1);
		default: System.out.println("Game Over");
		}
	}	

	}

}
