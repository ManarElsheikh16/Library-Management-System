
package project.java.library;
public class Book extends Publication{
    
    public Book(String title, String author_Name, double price, String publishing_House, String date_Of_publication, String pages) {
        super(title, author_Name, price, publishing_House, date_Of_publication,  pages);
        super.id="Book";
    }
    

    @Override
    public int getPeriod() {
        int diff,k=0;
     if(monthReturn>=monthIssue)
     {
  diff=(( monthReturn-monthIssue)*30+dayReturn)-dayIssue;
     }
     else 
     {
         diff=((((monthReturn+monthIssue)-monthIssue)*30)+dayReturn)-dayIssue;
     }
     if(diff<=20)
     {
         return k;
     }
     else 
     {
         return (diff-20);
     }
     
    }
   
    }
    

