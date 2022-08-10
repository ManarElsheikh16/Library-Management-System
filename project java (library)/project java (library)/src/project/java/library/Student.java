
package project.java.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Human {
 String department;
 String level;
    public Student(String name,String address,String phone,int age,String department,String level) 
    {
        super(name,address,phone,age);
        this.department=department;
        this.level=level; 
    }
    public void borrow(String title,ArrayList<Publication> list,ArrayList<Student> stu,ArrayList<Publication> stu_pub)throws InvalidBorrowException
    {
        
       for(int i=0; i<list.size(); i++)
       {
           Publication p=list.get(i);
           if(p.getTitle().equals(title))
           {
               if(!list.get(i).isBorrowed())
               {
               Scanner sc=new Scanner(System.in);
               int day_iss=sc.nextInt();
               list.get(i).setDayIssue(day_iss);
               int month_iss=sc.nextInt();
               list.get(i).setMonthIssue(month_iss);
               int year_iss=sc.nextInt(); 
               list.get(i).setYearIssue(year_iss);
               list.get(i).setBorrowed(true);
               list.get(i).num_borrowed++;
               list.get(i).total_prise+=list.get(i).getPrice();
               stu.add(this);
               stu_pub.add(list.get(i));
               list.remove(list.get(i));
               break;
               }
               else
               {
                   throw new InvalidBorrowException();
               }
           }
       }
    } 
    public void return_book(String title,ArrayList<Publication> stu_pub,ArrayList<Publication> list)throws InvalidReturnException
    {
       for(int i=0; i<stu_pub.size(); i++)
       {
           Publication p=stu_pub.get(i);
           if(p.getTitle().equals(title))
           {
               if(p.isBorrowed()){
               Scanner sc=new Scanner(System.in);
               int day_ret=sc.nextInt();
               stu_pub.get(i).setDayReturn(day_ret);
               int month_ret=sc.nextInt();
               stu_pub.get(i).setMonthReturn(month_ret);
               int year_ret=sc.nextInt(); 
               stu_pub.get(i).setYearReturn(year_ret);
               stu_pub.get(i).setBorrowed(false);
               list.add(stu_pub.get(i));
               stu_pub.remove(stu_pub.get(i));
               break;
               }
               else{
                   throw new InvalidReturnException();
               }
           }
           else
               System.out.print(title +"wrong title");
               
       }
    } 
    public void search_Book(Admin A,String title,ArrayList<Publication> list)
    {
        if(A.search_Book(title,list))
            System.out.println( title+" is available " );
        else
            System.out.println( title+" is not available " );
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDepartment() {
        return department;
    }

    public String getLevel() {
        return level;
    }
    public void displayAvalible(ArrayList<Publication> list)
    {
        for(int i=0; i<list.size(); i++)
        {
            if(!list.get(i).isBorrowed())
            {
                System.out.println(list.get(i));
            }
        }
    }
}
