
package my_project;

import javax.swing.JOptionPane;


public class insert {
    
private int a[];
private int size;
int pos,w;
private String out=""; 
private int count=0;


//.......................
public insert(){
   
}

//******************************
public void add_insert(){
       
        
    
//int pos;
 size=Integer.parseInt(JOptionPane.showInputDialog("enter the size array"));
 a=new int[size];
 for (int f=0;f<a.length;f++) {   
    pos=Integer.parseInt(JOptionPane.showInputDialog("enter index array"));

    if( count<a.length && pos<=count  && pos>=0){
        for(int i=count;i>pos;i-- )
            a[i]=a[i-1];
        a[pos]=Integer.parseInt(JOptionPane.showInputDialog("enter the value::"));
        count++;
    
    



}
else if(pos >count)
    JOptionPane.showMessageDialog(null, "enter the position :::");
else if(a[pos] >a.length)
    JOptionPane.showMessageDialog(null, "EROOR ARRAY IS FUUULLL::");
else
    JOptionPane.showMessageDialog(null, "errrrorr@@");
 }
print();
}
   //...........................

public void print(){
    out="";
    for (int i = 0; i < a.length; i++) 
        out+=a[i]+"  ";
    
    JOptionPane.showMessageDialog(null, out+ " ");

}
//................................................
  
   
    //------------------
   public void delete()
   {
      int m,k=-1;
       out="enter value to delete\n";
    for(int i=0;i<count;i++)
        out=out+a[i]+"  ";
    JOptionPane.showMessageDialog(null, out);
    
      m=Integer.parseInt(JOptionPane.showInputDialog("enter value to delete: "));
      for(int i=0;i<count;i++)
      {
         if(m==a[i])
         {
             if(i==a.length)
             {
                 count--;
                 k=i;
             }
             else
             {
                for(int j=i;j<count-1;j++)
                    a[j]=a[j+1];
                count--;
                k=i;
           }
             break;
             }
         
      }
    if(k==-1)
        JOptionPane.showMessageDialog(null, "value not found");
    else
    {
    out="";
    for(int i=0;i<count;i++)
        out=out+a[i]+"  ";
    JOptionPane.showMessageDialog(null, out);
    }
    
   }
   //===============================================;
   
   public void Exit()
   {
      System.exit(0);
   }
//===================================================;
    public void add_delete_ofarray(){
       insert v=new insert();

//..................................
int w;
        while (true) {
w=Integer.parseInt(JOptionPane.showInputDialog(
        "[1]=اضافه عنصر الئ المصفوفه\n"
       
        + "[2]=طباعه المصفوفه قبل الازاحه\n"
        + "[3]=حذف عنصر من المصفوفه\n"
        
        + "[4]=خروج من البرنامج\n"));

     
        switch(w){
           
            case 1:
                v.add_insert();
                 break;
        
        
           
                       
                 
                 
            case 2:
                v.print();
                break;
            case 3:
                v.delete();
                break;
            case 4:
               v.Exit();
               break;
          
        
        
        }
        
        
        
    }
    
    }
}
