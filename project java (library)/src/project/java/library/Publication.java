
package project.java.library;
import java.util.*;
import java.util.Date;

public abstract class Publication {
    String title;
    String author_Name;
    double price;
    String publishing_House;
    String date_Of_publication;
    boolean borrowed;
    String pages;
    int dayIssue=0;int monthIssue=0;int yearIssue=0;
    int dayReturn=0; int monthReturn=0;int yearReturn=0;

    public Publication(String title, String author_Name, double price, String publishing_House, String date_Of_publication, boolean borrowed, String pages) {
        this.title = title;
        this.author_Name = author_Name;
        this.price = price;
        this.publishing_House = publishing_House;
        this.date_Of_publication = date_Of_publication;
        this.borrowed = borrowed;
        this.pages = pages;
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
        this.dayIssue = dayIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }

    public void setDayReturn(int dayReturn) {
        this.dayReturn = dayReturn;
    }

    public void setMonthReturn(int monthReturn) {
        this.monthReturn = monthReturn;
    }

    public void setYearReturn(int yearReturn) {
        this.yearReturn = yearReturn;
    }
    
}
