package Java8Date;

public class ReverseString {

    public static void main(String[] args){

        String input = "Hello World";

        StringBuilder ir = new StringBuilder();

        ir.append(input);

        ir = ir.reverse();

        for(int i = 0; i<ir.length();i++){
            System.out.print(ir.charAt(i));
        }
    }
}
