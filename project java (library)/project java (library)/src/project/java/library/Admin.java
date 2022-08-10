
package project.java.library;

import java.util.ArrayList;

public class Admin extends Human {
    
private String passward;
 
        
    public Admin(String name,String address,String phone,int age,String passward) {
        super(name,address,phone,age);
        this.passward=passward;
    }
    public String getPassward() {
        return passward;
    }
    public boolean search_Book(String title,ArrayList<Publication> list)
    {
        boolean x=false;
        for(int i=0; i<list.size(); i++)
        {
            Publication p=list.get(i);
            if(p.getTitle().equals(title))
            {
               if(list.get(i).borrowed==false ){
                    x=true;    
                    break;
               }
               
            }
        }
        return x;
    }
    public  void add_Book(Publication P,ArrayList<Publication> list)
    {
     list.add(P);
    }
    public void modify_Book(String old_Title,String new_Title,double new_Price,ArrayList<Publication> list)
    {
        for(int i=0; i<list.size(); i++)
        {
            Publication p=list.get(i);
            if(p.getTitle().equals(old_Title))
            {
                 list.get(i).setTitle(new_Title);
                 list.get(i).setPrice(new_Price);
            }
          
        }
    }
    public void delete_Book(String title,ArrayList<Publication> list)
    {
        for(int i=0; i<list.size(); i++)
        {
            Publication p=list.get(i);
            if(p.getTitle().equals(title))
            {
                if(!p.isBorrowed())
                {
                    list.remove(p);
                }
            }
        }
    }
    public void displayIsBorrowed(ArrayList<Publication> list)
   {
       for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).isBorrowed())
            {
                System.out.println(list.get(i));
            }
        }
   }
    public void displayOverPeriod(ArrayList<Publication> list)
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
    public  double fine(Publication p)
    {
      int fine=  p.getPeriod();
      double money = fine*0.10*p.getPrice();
      p.total_fine+=money;
      return money;
    }
    public  void displayPayement(ArrayList<Publication> list1,ArrayList<Publication> list)
    {
        for(int i=0; i<list.size();i++)
        {
            System.out.println(list.get(i).getTitle()+" total_prise:"+list.get(i).total_prise+
                    " and total_fine:"+list.get(i).total_fine);
        }
        for(int i=0; i<list1.size();i++)
        {
            System.out.println(list1.get(i).getTitle()+" total_prise:"+list1.get(i).total_prise+
                    " and total_fine:"+list1.get(i).total_fine);
        }
    
    }
}

