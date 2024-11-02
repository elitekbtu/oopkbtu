package practice5;
import java.util.*;

public class Example4 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String input = in.nextLine();
      double leftOperand, result, rightOperand;
      String leftString, operator, rightString;
      StringTokenizer tokenizer;
      tokenizer = new StringTokenizer(input, " ");
      while (tokenizer.hasMoreTokens()) {
         String expression = tokenizer.nextToken();
         StringTokenizer exprTokenizer = new StringTokenizer(expression, "+*-/ ", true);
         try {
            leftString = exprTokenizer.nextToken();
            operator = exprTokenizer.nextToken();
            rightString = exprTokenizer.nextToken();
            leftOperand = Double.parseDouble(leftString);
            rightOperand = Double.parseDouble(rightString);

            if (operator.equals("+"))
               result = leftOperand + rightOperand;
            else if (operator.equals("-"))
               result = leftOperand - rightOperand;
            else if (operator.equals("*"))
               result = leftOperand * rightOperand;
            else if (operator.equals("/"))
               result = leftOperand / rightOperand;
            else
               result = 0.0;
            System.out.println("Result: " + result);
         } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax");
         } catch (NumberFormatException nfe) {
            System.out.println("One or more operands is not a number");
         }
         in.close();
      }
   }
}
