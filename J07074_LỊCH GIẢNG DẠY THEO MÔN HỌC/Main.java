

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> subjects = new ArrayList<>();
        while(n-- != 0){
            subjects.add(new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        sc = new Scanner(new File("LICHGD.in"));
        HashMap<String, String> map = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Course> courses = new ArrayList<>();
        while(m-- != 0){
            String temp = sc.nextLine();
            for(Subject x : subjects){
                if(x.getSubjectID().equals(temp)){
                    Course course = new Course(temp, x.getSubjectName(), x.getCreditNumber(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
                    courses.add(course);
                    map.put(course.getSubjectID(), course.getSubjectName());
                }
            }
        }
        Collections.sort(courses);
        String queryCourse = sc.nextLine();
        System.out.println("LICH GIANG DAY MON " + map.get(queryCourse) + ":");
        for(Course x : courses){
            if(x.getSubjectID().equals(queryCourse)){
                System.out.println(x);
            }
        }
    }

}