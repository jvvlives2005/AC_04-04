package nyc.c4q.jvvlives2005;
/**
 * Created by c4q-joshelynvivas on 4/5/15.
 */

import java.util.HashMap;

//Principal to Teachers
public class Principal {
    private String name;
    HashMap<String, Teacher> myTeachers = new HashMap<String, Teacher>();

    public Principal(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void addTeacher(Teacher teacher)
    {
        this.addTeacher(teacher);
    }
    // Given a color, return the number of students that have this
    // color lunchbox
    /*public int numOfStudentsWithCertainColorLunchbox(String color){
        int count = 0;
        for(String teacher : myTeachers.keySet()){
            for(String myS : myTeachers.get(teacher).getStudents().keySet()){
                Student myS1 = myTeachers.get(teacher).getStudents().get(myS);

                if(myS1.getLunchBox().getColor().equals(color)){
                    count++
                }
            }
        }
        return count;
    }*/

    // Similar to the one above except that you should print the
    // names of students that have this color lunchbox.
    public void studentsWithCertainColorLunchbox(String color){
        //FIXME
    }

    // Given a student's name, return the student's teacher.
    // If no teacher is found, then print "new student"
    public String whoIsThisStudentsTeacher(String studentname){
        //FIXME
        return "";
    }

    // Print the teachers who have students with less than 3 pencils
    // in their pocket.
    public void teachersThatHaveStudentsWithLessThanACertainNumberOfPencils(int numOfPencils ){
        //FIXME
    }

}

