
package my_project;

import javax.swing.JOptionPane;


public class stack_op {
    
     private int top=-1,size;
    private double stack[],stack1[];
    private String out="";
    
    
    //-----------------------------
    
    public stack_op()
    {
        size = Integer.parseInt(JOptionPane.showInputDialog("أدخل حجم المكدس: "));
        stack = new double[size];
        
    }
    
    //+++++++++++++++++++++++++++++++++
    
    public void Clear()
    {
        top = -1;
    }
    
    //++++++++++++++++++++++++++++++++++++
    
    public boolean IsFull()
    {
        if(top==size-1)
            return true;
        else
            return false;
    }
    
    //++++++++++++++++++++++++++++++++++++
    
    public boolean IsEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    
    //+++++++++++++++++++++++++++++++++++++
    
    public void Push(double val)
    {
        top++;
        stack[top]=val;
    }
    
    //++++++++++++++++++++++++++++++++++++
    
    public void Pop()
    {
        JOptionPane.showMessageDialog(null, "القيمة التي تم حذفها من المكدس هي : \n "+stack[top]);
        top--;
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++
    
    public String ShowStack()
    {
        out="";
       for(int i=0;i<top;i++)
       {
           out+= stack[i]+" , ";
       }
        return out;
    }
    
    //+++++++++++++++++++++++++++++++++++++
    
    public void ResizeSq(int newsize)
    {
        size = newsize;
        stack1 = new double[stack.length];
        for(int i=0;i<stack.length;i++)
        {
            if(stack[i]!=0)
                stack1[i]=stack[i];
            else
                break;
        }
        
        stack = new double[size];
        for(int j=0;j<stack1.length;j++)
        {
         
            if(stack1[j]!=0)
                stack[j]=stack1[j];
            else
                break;
        }
        
    }
    
    //++++++++++++++++++++++++++++++++++++++++++

    public int getSize() {
        return size;
    }
    
    
}
