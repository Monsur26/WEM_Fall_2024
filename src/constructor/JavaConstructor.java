package constructor;

public class JavaConstructor {


/*
    is used for creating objects
    Constructors are used to retrieve information via object or create newer instances of objects with variety of values
    Java provides Default Contractor to create object
    if you create a constructor then the default constructor is not going to work, you have to create a non-parametized
    constructor which is the same as default constructor.
    Constructor with parameter can take variables from class as the values in order to create objects. Those value are
    assigned with "this" keyword.
 */
    String name;
    int age;
    public JavaConstructor(){

    } // this is same as default constructor, we had to define this one because we created other contributors.

    public JavaConstructor(int a){
        this.age =a;
        System.out.println("the age is :" +a);
    }
    public JavaConstructor(String name, int age ){
        this.age= age;
        this.name=name;

        System.out.println("Student Name : "+ name+ "\nStudent Age :"+age );
    }

    public static void main(String[] args) {
        JavaConstructor jv1 = new JavaConstructor();
        jv1.name= "Monsur";
        System.out.println(jv1.name);

        JavaConstructor jv2 = new JavaConstructor(90);
        System.out.println(jv2);

        JavaConstructor student1 = new JavaConstructor("Monsur",23);
        JavaConstructor student2 = new JavaConstructor("Boris",18);
        JavaConstructor student3 = new JavaConstructor("Mo",28);
        JavaConstructor student4 = new JavaConstructor("Rayhan",29);

    }
}
