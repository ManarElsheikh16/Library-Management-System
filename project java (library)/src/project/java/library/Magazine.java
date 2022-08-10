
package project.java.library;
public class Magazine extends Publication {
   String categoery;

    public Magazine(String categoery, String title, String author_Name, double price, String publishing_House, String date_Of_publication, boolean borrowed, String pages) {
        super(title, author_Name, price, publishing_House, date_Of_publication, borrowed, pages);
        this.categoery = categoery;
    }
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
     if(diff<=12)
   {
       return k;
   }
   else
       return (diff-12);
    }
    
}
