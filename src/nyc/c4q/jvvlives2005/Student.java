package nyc.c4q.jvvlives2005;
/**
 * Created by c4q-joshelynvivas on 4/5/15.
 */

import java.util.HashMap;

public class Student {
    private String name;
    private int    numOfPencilsInPocket;
    lunchbox myLunchbox;
    HashMap<String, Student> myStudents = new HashMap<String, Student>();

    public Student(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getNumOfPencilsInPocket()
    {
        return numOfPencilsInPocket;
    }

    public void setNumOfPencilsInPocket(int numOfPencilsInPocket){
        this.numOfPencilsInPocket = numOfPencilsInPocket;
    }
    public void setLunchBox(lunchbox item){
        //myLunchbox = item;
        //public lunchbox getLunchBox(){
        //return myLunchbox;
        // }
    }
}
