package Java8Date;

import java.util.*;

public class LambdaCompareTo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<NewStudentCompareTo> studentList = new ArrayList<NewStudentCompareTo>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            NewStudentCompareTo st = new NewStudentCompareTo(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, Comparator.comparing(NewStudentCompareTo ::getcGpa).reversed()
        .thenComparing(NewStudentCompareTo::getfName)
        .thenComparing(NewStudentCompareTo::getId));

        for(NewStudentCompareTo st: studentList){

            System.out.println(st.getfName());
        }
    }
}
