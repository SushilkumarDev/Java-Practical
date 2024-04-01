
public class CodeforStaticvsinstancevariable {
    public static String name;

    public CodeforStaticvsinstancevariable(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("The name is " + name);
    }

    public static void main(String[] args) {
        CodeforStaticvsinstancevariable manish = new CodeforStaticvsinstancevariable("Manish");
        manish.print();
        CodeforStaticvsinstancevariable atulya = new CodeforStaticvsinstancevariable("Atulya");
        atulya.print();
        manish.print();
    }
}