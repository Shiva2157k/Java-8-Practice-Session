package Java8Date;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<StudentCompareTo> studentList = new ArrayList<StudentCompareTo>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            StudentCompareTo st = new StudentCompareTo(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList);

        for(StudentCompareTo st: studentList){

            System.out.println(st.getfName());
        }
    }
}
