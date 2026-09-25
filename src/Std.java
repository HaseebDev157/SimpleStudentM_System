public class Std{
    public int Rollno;
    public String Name;
    public int age;
    public String gender;
    public String email;
    public String department;

    public Std(int rollno,String name,int age,String gender,String email,String department){
        this.Rollno=rollno;
        this.Name=name;
        this.age=age;
        this.gender=gender;
        this.email=email;
        this.department=department;
    }

public int getRollno() {
    return Rollno;
}
public void setRollno(int rollno) {
        this.Rollno = rollno;
}
public String getName() {
    return Name;
}
public void setName(String name) {
        this.Name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
        this.age = age;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
        this.gender = gender;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
        this.email = email;
}
public String getDepartment() {
    return department;
}
public void setDepartment(String department) {
        this.department = department;
}
public void printdetails(){
        System.out.println("-----Student Details-----");
        System.out.println("Rollno:" + Rollno);
        System.out.println("Name:" + Name);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender);
        System.out.println("Email:" + email);
        System.out.println("Department:" + department);
}
}
