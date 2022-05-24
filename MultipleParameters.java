public class MultipleParameters {

    static void myMethod(String name, int age){

        System.out.println(name+" is "+age+" year old.");
    }

    public static void main(String[] args) {
        myMethod("Amit Kashyap",24);
        myMethod("Arvind Kashyap",22);
    }
}
