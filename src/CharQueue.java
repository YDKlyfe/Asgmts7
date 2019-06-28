public class CharQueue {

	public static void main(String[] args) {
	    
	    CharQueue queue = new CharQueue();
	    String letters = "abcdefghij";
	    for(int i = 0; i < letters.length(); i++)
	    {
	        queue.enqueue(letters.charAt(i));
	        queue.printList();
	    }
	    
	    System.out.println("ALL LETTERS WERE STORED!");

        //Now, we print it backwards
        for(int i = 0; i < 7; i++)
        {
            System.out.println("Letter dequeued: "+queue.dequeue());
            queue.printList();
        }
	}
	
	//Fields for this class, array that holds the chars
	private char[] list;
	private int size;
	
	public CharQueue()
	{
	    list = new char[10];
	    size = 0;
	}
	
	public void enqueue(char c) throws RuntimeException
	{
	    if(size == 10)
	    {
	        throw new RuntimeException("Queue full");
	    }
	    else
	    {
	        list[size] = c;
	        size++;
	    }
	}
	
	
	public char dequeue() throws RuntimeException
	{
	    if(size==0)
	    {
	        throw new RuntimeException("Queue underflow"); 
	    }
	    else 
	    {
	        char toReturn = list[0];
	        size--;
	        for(int i = 0; i < size; i++)
	        {
	            list[i] = list[i+1];
	        }
	        return toReturn;
	    }
	}
	
	public void printList()
	{
	    System.out.print("Queue: ");
	    for(int i = 0; i < size; i++)
	    {
	        System.out.print(list[i] +" ");
	    }
	    System.out.println();
	}
}