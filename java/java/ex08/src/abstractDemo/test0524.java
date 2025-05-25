package abstractDemo;

public class test0524 {
    
    /**
* TODO: 定義 Person 類，含 name, age 兩個 String 屬性
*/
static class Person {
protected String name;
protected String age;
public Person(String name, String age) {
    this.name = name;
    this.age = age;

// TODO: 實作建構子：為 name 與 age 賦值
}
@Override
public String toString() {
return String.format("Person[name=%s, age=%s]", name, age);
}
}

/**
* TODO: 定義 Student 類，繼承 Person，並新增 school, studentNumber, email 三個
String 屬性
*/
static class Student extends Person {
private String school;
private String studentNumber;
private String email;
public Student(String name, String age, String school, String studentNumber, String
email) {
    super(name, age);
    this.school = school;
    this.studentNumber = studentNumber;
    this.email = email;

// TODO: 呼叫 super(name, age)
// TODO: 初始化 school, studentNumber, email
}
@Override
public String toString() {
    return String.format("Student[name=%s, age=%s, school=%s, studentNumber=%s, email=%s]",
                    name, age, school, studentNumber, email);
// TODO: 回傳格式 "Student[name=?, age=?, school=?, studentNumber=?, email=?]"

}
public static void main(String[] args) {
    Student s1 = new Student("Alice","20","Ncu","S12345","alice@example.com");
    Student s2 = new Student("Bob","21","Ncu","S54321","bob@example.com");
    System.out.println(s1);
    System.out.println(s2);

// TODO: 建立至少兩個 Student 實例，範例：
// Student s1 = new Student(...);
// TODO: 列印所有 Student 物件的 toString()
}
}
}