package project.java.library;
public class Human {
  private  String name;
    private String address;
    private String phone;
    private int age;
    Human(String name,String address,String phone,int age)
    {
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        if(phone.length()==11)
        {
        this.phone = phone;
        }
    }

    public void setAge(int age) {
        if(age>0)
        {
        this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
   
}
