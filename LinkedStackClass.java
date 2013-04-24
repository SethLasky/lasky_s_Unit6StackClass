
public class LinkedStackClass<T> implements StackADT<T>
{
        
    private class StackNode<T>
    {
        public T info;
        public StackNode<T> link;
           
        public StackNode()
        {
            info = null;
            link = null;
        }
         
        public StackNode(T elem, StackNode<T> ptr)
        {
            info = elem;
            link = ptr;
        }

        public String toString()
        {
            return info.toString();
        }
    }

    private StackNode<T> stackTop;  
    
    public LinkedStackClass()
    {
        stackTop = null;
    }

       
    public void initializeStack()
    {
        stackTop = null;
    }
    
    public boolean isEmptyStack()
    {
        return (stackTop == null);
    }

    public boolean isFullStack()
    {
        return false;
    }

      
    public void push(T newElement)
    {
        StackNode<T> newNode; 
        newNode = new
                  StackNode<T>(newElement, stackTop); 

        stackTop = newNode; 
    } 

    public T peek() throws StackUnderflowException
    {
        if (stackTop == null)
            throw new StackUnderflowException();

        return stackTop.info;
    }
    public void pop() throws StackUnderflowException
    {
        if (stackTop == null)
            throw new StackUnderflowException();

        stackTop = stackTop.link;  
    }
}