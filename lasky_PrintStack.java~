public class lasky_PrintStack extends LinkedStackClass
{
  
  public void printStack(LinkedStackClass<Integer> theStack)
  {
    LinkedStackClass<Integer> theTempStack = new LinkedStackClass<Integer>();
    while(!theStack.isEmptyStack())
    {
      System.out.print(theStack.peek() + " ");
      theTempStack.push(theStack.peek());
      theStack.pop();
    }
    while(!theTempStack.isEmptyStack())
    {
      theStack.push(theTempStack.peek());
      theTempStack.pop();
    }
      
    
   
  }
}
    

