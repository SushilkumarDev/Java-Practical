public class CodeforStaticvsinstancemethod {
    public static void print() {
        System.out.println("This is a static method");
    }

    public void display() {
        System.out.println("This is a non-static method");
    }
    
    public static void main(String[] args) {
        print();
        CodeforStaticvsinstancemethod pract = new CodeforStaticvsinstancemethod();
        pract.display();
    }
}
