package Lesson_4;

public class Person {
    private String name;
    private String job_title;
    private String email;
    private String tel_number;
    private  int salary;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel_number() {
        return tel_number;
    }

    public void setTel_number(String tel_number) {
        this.tel_number = tel_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String job_title, String email, String tel_number, int salary, int age) {
        this.name = name;
        this.job_title = job_title;
        this.email = email;
        this.tel_number = tel_number;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job_title='" + job_title + '\'' +
                ", email='" + email + '\'' +
                ", tel_number='" + tel_number + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
