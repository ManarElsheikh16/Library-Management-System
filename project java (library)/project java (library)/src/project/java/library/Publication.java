
package project.java.library;
import java.util.*;
import java.util.Date;

public abstract class Publication {
    String id;
    String title;
    String author_Name;
    double price;
    String publishing_House;
    String date_Of_publication;
    boolean borrowed ;
    String pages;
    double total_prise;
    double total_fine;
    int num_borrowed;
    int dayIssue=0;int monthIssue=0;int yearIssue=0;
    int dayReturn=0; int monthReturn=0;int yearReturn=0;

    public Publication(String title, String author_Name, double price, String publishing_House, String date_Of_publication, String pages) {
        this.title = title;
        this.author_Name = author_Name;
        this.price = price;
        this.publishing_House = publishing_House;
        this.date_Of_publication = date_Of_publication;
        this.borrowed = false;
        this.pages = pages;
        this.total_prise=0;
        this.num_borrowed=0;
        this.total_fine=0;
        
    }

   

    public void setPages(String pages) {
        this.pages = pages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor_Name(String author_Name) {
        this.author_Name = author_Name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setPublishing_House(String publishing_House) {
        this.publishing_House = publishing_House;
    }
    public void setDate_Of_publication(String date_Of_publication) {
        this.date_Of_publication = date_Of_publication;
    }
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor_Name() {
        return author_Name;
    }
    public double getPrice() {
        return price;
    }
    public String getPublishing_House() {
        return publishing_House;
    }
    public String getDate_Of_publication() {
        return date_Of_publication;
    }
    public boolean isBorrowed() {
        return borrowed;
    }   
    public abstract int getPeriod();
    public String getPages() {
        return pages;
    }
    public int getDayIssue() {
        return dayIssue;
    }
    public int getMonthIssue() {
        return monthIssue;
    }
    public int getYearIssue() {
        return yearIssue;
    }
    public int getDayReturn() {
        return dayReturn;
    }
    public int getMonthReturn() {
        return monthReturn;
    }
    public int getYearReturn() {
        return yearReturn;
    }
    public void setDayIssue(int dayIssue) {
        if(32>dayIssue&&dayIssue>0)
            this.dayIssue = dayIssue;
    }
    public void setMonthIssue(int monthIssue) {
        if(12>monthIssue&&monthIssue>0)
            this.monthIssue = monthIssue;
    }
    public void setYearIssue(int yearIssue) {
        if(yearIssue>0)
            this.yearIssue = yearIssue;
    }
    public void setDayReturn(int dayReturn) {
        if(32>dayIssue&&dayIssue>0)
            this.dayReturn = dayReturn;
    }
    public void setMonthReturn(int monthReturn) {
        if(12>monthReturn&&monthReturn>0)
            this.monthReturn = monthReturn;
    }
    public void setYearReturn(int yearReturn) {
        if(yearReturn>0)
            this.yearReturn = yearReturn;
    } 
}
