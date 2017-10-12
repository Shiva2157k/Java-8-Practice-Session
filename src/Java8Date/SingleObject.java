package Java8Date;

public class SingleObject {

    private static SingleObject instance;// = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        if(instance == null) {
            synchronized (SingleObject.class) {
                if(instance == null){
                    instance = new SingleObject();
                }

            }
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Hello Singleton..!!");
    }
}
//private static instantiation
//private constructor
//public static get method