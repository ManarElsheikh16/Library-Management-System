
package project.java.library;
import java.util.*;
import java.util.ArrayList;
import java.util.Date;
public class operation {
    ArrayList<Publication> list=new ArrayList<>();
    ArrayList<Student> stu=new ArrayList<Student>();
    ArrayList<Publication> stu_pub=new ArrayList<Publication>();

    public void search(String title)
    {
        for(int i=0; i<list.size(); i++)
        {
            Publication p=list.get(i);
            if(p.getTitle().equals(title))
            {
                System.out.println(p.getTitle());
            }
        }
    }
    public void add(Publication p)
    {
        list.add(p);
    }
    public void delete(Publication p)
    {
        if(!p.isBorrowed())
        {
            list.remove(p);
        }
    }
public void modify(String old_Title,String new_Title,double new_Price)
    {
        for(int i=0; i<list.size(); i++)
        {
            Publication p=list.get(i);
            if(p.getTitle().equals(old_Title))
            {
                 p.setTitle(new_Title);
                 p.setPrice(new_Price);
            }
          
        }
    }
    public void displayAvalible()
    {
        for(int i=0; i<list.size(); i++)
        {
            if(!list.get(i).isBorrowed())
            {
                System.out.println(list.get(i));
            }
        }
    }
   public void displayIsBorrowed()
   {
       for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).isBorrowed())
            {
                System.out.println(list.get(i));
            }
        }
   }
   public void displayOverPeriod()
   {
       for(int i=0; i<list.size(); i++)
       {
           if(list.get(i) instanceof Book)
           {
               if(list.get(i).getPeriod()>20)
               {
                   System.out.println(list.get(i));
               }
           }
           
           if(list.get(i).getPeriod()>12 )
                   {
                   System.out.println(list.get(i));
                   }
       }
   }
}
