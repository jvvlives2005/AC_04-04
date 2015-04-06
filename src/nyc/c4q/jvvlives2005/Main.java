package nyc.c4q.jvvlives2005;
/**
 * Created by c4q-joshelynvivas on 4/4/15.
 */
//package com.c4q.davisroman;
//
//
//public class Main {
//
//
//    public static com.c4q.davisroman.Principal createHierarchy(){
//        //Principal has her own class
//        com.c4q.davisroman.Principal judy          = new Principal("judy");
//
//        //Teacher has a class
//        Teacher msDiaz          = new Teacher("Ms.Diaz");
//        Teacher msArcentales    = new Teacher("Ms.Arcentales");
//        Teacher msLui           = new Teacher("Ms.Lui");
//
//        //Student has a class
//        Student kevin           = new Student("kevin");
//        Student amanda          = new Student("amanda");
//        Student billy           = new Student("billy");
//        Student ray             = new Student("ray");
//        Student mike            = new Student("mike");
//        Student stacy           = new Student("stacy");
//        Student jackie          = new Student("jackie");
//        Student laura           = new Student("laura");
//        Student tommy           = new Student("tommy");
//
//        //Lunchbox has a class
//        lunchbox redLunchbox    = new lunchbox("red");
//        lunchbox yellowLunchbox = new lunchbox("yellow");
//        lunchbox blackLunchBox  = new lunchbox("black");
//        lunchbox greenLunchbox  = new lunchbox("green");
//        lunchbox pinkLunchBox   = new lunchbox("pink");
//        lunchbox blueLunchbox   = new lunchbox("blue");
//
//        kevin.setLunchBox(redLunchbox);
//        kevin.setNumOfPencilsInPocket(2);
//
//        amanda.setLunchBox(yellowLunchbox);
//        amanda.setNumOfPencilsInPocket(3);
//
//        billy.setLunchBox(blackLunchBox);
//        billy.setNumOfPencilsInPocket(2);
//
//        ray.setLunchBox(blackLunchBox);
//        ray.setNumOfPencilsInPocket(3);
//
//        mike.setLunchBox(greenLunchbox);
//        mike.setNumOfPencilsInPocket(3);
//
//        stacy.setLunchBox(pinkLunchBox);
//        stacy.setNumOfPencilsInPocket(3);
//
//        jackie.setLunchBox(greenLunchbox);
//        jackie.setNumOfPencilsInPocket(3);
//
//        laura.setLunchBox(yellowLunchbox);
//        laura.setNumOfPencilsInPocket(2);
//
//        tommy.setLunchBox(blueLunchbox);
//        tommy.setNumOfPencilsInPocket(4);
//
//    // Added Student to the Teachers
//        msDiaz.addStudent(kevin);
//        msDiaz.addStudent(amanda);
//        msDiaz.addStudent(billy);
//
//        msArcentales.addStudent(ray);
//        msArcentales.addStudent(mike);
//        msArcentales.addStudent(stacy);
//
//        msLui.addStudent(jackie);
//        msLui.addStudent(laura);
//        msLui.addStudent(tommy);
//
//        judy.addTeacher(msDiaz);
//        judy.addTeacher(msArcentales);
//        judy.addTeacher(msLui);
//
//        return judy;
//
//    }
//
//    public static void main(String[] args) {
//
//        Principal judy = createHierarchy();
//
//        System.out.println("Number of students with a red lunchbox: " +
//                judy.numOfStudentsWithCertainColorLunchbox("red")  );
//
//        judy.studentsWithCertainColorLunchbox("yellow");
//
//        System.out.println("Ray's teacher is: " + judy.whoIsThisStudentsTeacher("ray"));
//
//        System.out.println("Teachers that have students with less than 3 pencils in their pocket:");
//        judy.teachersThatHaveStudentsWithLessThanACertainNumberOfPencils(3);
//
//
//    }
//}
