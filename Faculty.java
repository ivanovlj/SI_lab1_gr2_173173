import java.io.*;
import java.util.*;
class Faculty {
    String name;
    List<Student>students;

    public Faculty(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }
    public void addStudent(Student nov){
        this.students.add(nov);
    }
    public void deleteStudent(Student student){
        for (int i=0;i<this.students.size();i++){
            if (this.students.get(i).equals(student)){
                this.students.remove(this.students.get(i));
            }
        }
    }
    public double StudentsAverageGrade(){
        double suma=0;
        for (int i=0;i<this.students.size();i++){
            suma+=this.students.get(i).getAverage();
        }
        suma/=this.students.size();
        return suma;
    }

}
