
package my_project;

import javax.swing.JOptionPane;


public class queue_op {
     private int front=0,tail=-1,size;
    private double q[],deletedvalue,res[];
    private String out="";
    
    //-------------------------------
    public queue_op()
    {
       size= Integer.parseInt(JOptionPane.showInputDialog("أدخل حجم الطابور: "));
        q = new double[size];
       
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++
    
    public void Clear()
    {
        front = 0;
        tail = -1;
    }
    
    //++++++++++++++++++++++++++++++++++++++++
    
    public boolean IsEmpty()
    {
        if(tail<front)
            return true;
        else
            return false;
    }
    
    //++++++++++++++++++++++++++++++++++++++++
    
    public boolean IsFull()
    {
        if(tail == size-1)
            return true;
        else
            return false;
    }
    
    //++++++++++++++++++++++++++++++++++++++++++++
    
    public void Add(double v)
    {
        tail++;
        q[tail]=v;
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++++
    
    public void Delete( )
    {
        deletedvalue =q[front];
        front++;
       // tail--;
        
    }
    
    //++++++++++++++++++++++++++++
    
    public String ShowQueue()
    {
        out="";
        for(int i=front;i<=tail;i++)
            out+=(int)q[i]+" , ";
        return out;
    }
    
    //+++++++++++++++++++++++++++++++++

    public double getDeletedvalue() {
        return deletedvalue;
    }
    
    //+++++++++++++++++++++++++++++++++++++

    public void setQsize(int qsize) {
        q=new double[qsize];
        Clear();
    }
    
    //++++++++++++++++++++++++++++++++++++++

    public int getSize() {
        return size;
    }
    
    //++++++++++++++++++++++++++++++++
    public void Resize(int newsize)
    {
        size = newsize;
        res=new double[q.length];
        for(int i=0;i<q.length;i++)
        {
            if(q[i]!=0)
                res[i]=q[i];
            else
                break;
        }
        q=new double[size];
        for(int j=0;j<res.length;j++)
        {
         
            if(res[j]!=0)
                q[j]=res[j];
            else
                break;
        }
    }
    
    //++++++++++++++++++++++++++++++++++

    public int getFront() {
        return front;
    }
    
    //++++++++++++++++++++++++++

    public int getTail() {
        return tail;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }
    
    
    
    
    
    
}
