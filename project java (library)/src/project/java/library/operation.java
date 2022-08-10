
package project.java.library;
import java.util.ArrayList;
import java.util.Date;
public class operation {
    ArrayList<Publication> list=new ArrayList<>();
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
        list.remove(p);
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
    public void borrow(String title)throws InvalidBorrowException
    {
       for(int i=0; i<list.size(); i++)
       {
           Publication p=list.get(i);
           if(p.getTitle().equals(title))
           {
  int dayIssue=0,monthIssue=0,yearIssue=0,dayReturn=0,monthReturn=0,yearReturn=0;
         Date issue=new Date(dayIssue,monthIssue,yearIssue);
         Date return1=new Date(dayReturn,monthReturn,yearReturn);
        
         p.setBorrowed(true);
           }
       }
        
        
    }
    
}
