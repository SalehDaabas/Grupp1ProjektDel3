package grupp1Del3;

import java.util.ArrayList;
import java.util.Scanner;

public class Passenger {

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> nameList = new ArrayList<String>();

    private int age;
    private String name;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void passengerList(){

        nameList.add(name);
    }

    public void showList(){
        System.out.println("Här är Listan på alla Passagerare");
        System.out.println(nameList);
    }

    public void createPassenger(){
        System.out.println("Var god och mata in resenärens för- och efter namn");
        setName(scanner.next());
    }




}
