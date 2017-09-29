package Java8Date;

public class StudentCompareTo implements Comparable{

    private int id;
    private String fName;
    private double cGpa;

    public int getId() {
        return id;
    }
    public String getfName(){
        return fName;
    }
    public double getcGpa(){
        return cGpa;
    }

    public StudentCompareTo(int id, String fName,double cGpa){
        super();
        this.id = id;
        this.fName = fName;
        this.cGpa = cGpa;
    }

    @Override
    public int compareTo(Object o) {
        StudentCompareTo s = (StudentCompareTo) o;
        if (s.getcGpa() == getcGpa()) {
            if (s.getfName() == getfName())
                return s.getId() - getId();
         else {
            return s.getfName().compareTo(getfName());
        }
        } else if(s.getcGpa() > getcGpa()){
            return 1;
        }else return -1;
    }


}
