
package project.java.library;

import java.util.ArrayList;
import java.util.*;

public class ProjectJavaLibrary {
    public  static  void dis()
    {
     System.out.print("enter title");
     System.out.print("enter auther_name");
     System.out.print("enter price");
     System.out.print("enter publishing_House");
     System.out.print("enter date_Of_publication");
     System.out.print("enter pages");
     
    }
    public static void main(String[] args) {
        ArrayList<Publication> list=new ArrayList<>();
        ArrayList<Student> stu=new ArrayList<Student>();
        ArrayList<Publication> stu_pub=new ArrayList<Publication>();
        Scanner sc=new Scanner(System.in);
        Admin admin=new Admin("Admin","anything","0000", 16, "123");
      while(true){
          System.out.println("if student enter student\n if admin enter admin\n");
          String input=sc.next();
          if(input.equals("admin"))
          {
               System.out.println("Enter password\n");
               String pass=sc.next();
               if(input.equals("123"))
               {
                   while(true){
                       
                       int num=sc.nextInt();
                       switch(num)
                       {
                           case 1:
                               System.out.print("enter type_of_Publication");
                               if(sc.next()=="book")
                               {
                                    dis();
                                    Book b=new Book(sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),sc.next());
                               }
                               else if(sc.next()=="booklet"){
                                    dis();
                                    Booklet l=new Booklet(sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),sc.next());
                               }
                               else if(sc.next()=="Magazine"){
                                   dis();
                                   System.out.print("enter categoery");
                                   Magazine m=new Magazine(sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),sc.next(),sc.next());
                               }
                       
                       }
                       
                       
                       
                       // modify
                       //op.modify(input, input, new_Price);
                       
                       
                       
                       // Avaliable
                       // search
                       // delete
                       // displayIsBorrowed
                       //displayOverPeriod
                       
                       
                       //if enter exit 
                       // break;
                   }
               }
               else 
               {
               System.out.println("Erorr Password\n");
               }
          }
          else if(input.equals("student"))
          {
              // enter name , address , phone , age , dep, level            
          while(true){
             System.out.println("if . .. . .. b ....s\n");
           String re=sc.next();
          if(re.equals("b")){
              String name_title=sc.next();
             try{
                 stu.borrow(name_title,op);
             }
             catch(InvalidBorrowException e)
             {
                System.out.println("this publication not found");             
             }
          }
          else if(re.equals("s")){
          }
           else if(re.equals("exit")){
            break;
          }
          }
        }
      }
      
    } 
}
