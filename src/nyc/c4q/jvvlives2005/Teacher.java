package nyc.c4q.jvvlives2005;
/**
 * Created by c4q-joshelynvivas on 4/4/15.
 */

import java.util.HashMap;

public class Teacher {
    private String name;
    HashMap<String, Student> students = new HashMap<String, Student>();

    public Teacher(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void addStudent(Student student)
    {
        students.put(student.getName(), student);
    }

    public void showStudents(){
        for(String studentName : students.keySet()){
            Student myS1 =  students.get(studentName);
            System.out.println(myS1.getName());
        }
    }


}

