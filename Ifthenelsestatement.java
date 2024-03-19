
public class Ifthenelsestatement {
    
    public static void main(String[] args) {
        
        // 100 - 5
        // 91 to 99 - A
        // 81 to 90 - B
        
        // anything below that is failed
        
        int studentScore = 101;
        
        if (studentScore >= 100) {
            System.out.println("You scored S grade");
        } 
        else if (studentScore > 90 && studentScore < 100) {
            System.out.println("You scored A grade");
        } 
        else if (studentScore > 80 && studentScore < 91) {
            System.out.println("You scored B grade");
        } 
        else {
            System.out.println("You failed");
        }
    }
}