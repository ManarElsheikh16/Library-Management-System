/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.java.library;

/**
 *
 * @author LapTop MarKet
 */
public class Booklet extends Publication  {
    
    public Booklet(String title, String author_Name, double price, String publishing_House, String date_Of_publication, String pages) {
        super(title, author_Name, price, publishing_House, date_Of_publication, pages);
        super.id="Booklet";
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
   if(diff<=12)
   {
       return k;
   }
   else
       return (diff-12);
    }
    
    
    
}
