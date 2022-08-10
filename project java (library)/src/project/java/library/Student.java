
package project.java.library;
public class Student extends Human {
 String department;
 String level;
    public Student(String name,String address,String phone,int age,String department,String level) {
        super(name,address,phone,age);
        this.department=department;
        this.level=level; 
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
}
