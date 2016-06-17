/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackcalculator;

/**
 *
 * @author bonassara
 */
public class StackCalculator {

    
    public static void main(String[] args) {
        
        VectorStack V; 
      
        

                
        // TODO code application logic here
    }
    
    public int evaluate (VectorStack V)
    {
        int currNum;
        char operator;
        
        currNum = V.pop();
        operator = V.pop();
        
        while(V.isEmpty() == false)
        {
            if (V.peek() == '(')
            {
                if (operator == '+')
                {
                    operator = V.pop();
                    currNum += evaluate(V);
                    operator = V.pop();
                }
                if (operator == '-')
                {
                    operator = V.pop();
                    currNum -= evaluate(V);
                    operator = V.pop();
                }
                if (operator == '*')
                {
                    operator = V.pop();
                    currNum *= evaluate(V);
                    operator = V.pop();
                }
                if (operator == '/')
                {
                    operator = V.pop();
                    currNum /= evaluate(V);
                    operator = V.pop();
                }
                             
            }
                
               switch(operator)
            {
                case '+': 
                    currNum += V.pop();
                    break;
                case '-':
                    currNum -= V.pop();
                    break;
                case '*':
                    currNum *= V.pop();
                    break;
                case '/':
                    currNum /= V.pop();
                    break;
                case ')':
                    return currNum;
                
            }
            
               
            operator = V.pop();
        }
        
        return currNum;        
    }
}
