import java.util.Scanner;

public class Unicode {
public static void main(String[] args) {                                
        Scanner in = new Scanner(System.in);
        
        int sum1 = 0;
        int sum2 = 0;
        System.out.print("Enter first word: ");             
        String input = in.nextLine();
        System.out.print("Enter second word: ");
        String inputTwo = in.nextLine();
        
        Integer[] text = new Integer[input.length()];
        for(int i=0;i<input.length();i++) {
            text[i] = input.codePointAt(i);  
            System.out.println(text[i] + " ");
            
            sum1 = sum1 + text[i];
        
        }
        Integer[] textTwo = new Integer[inputTwo.length()];
        for(int i2=0;i2<inputTwo.length();i2++) {
            textTwo[i2] = inputTwo.codePointAt(i2);  
            System.out.println(textTwo[i2] + " ");
            
            sum2 = sum2 + textTwo[i2];
            
            
            
        }
        System.out.println("The sum of your first entry is " + sum1);
        System.out.println("The sum of your second entry is " + sum2);
        
        int sum3 = sum1 - sum2;
        System.out.println("The absolute difference is: "+ Math.abs(sum3));
    
        
        
}

}
