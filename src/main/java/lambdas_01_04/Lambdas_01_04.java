/*
 * 
 */
package lambdas_01_04;

/**
 *
 * @author MFisher
 */
public class Lambdas_01_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //example of passing multiple values to a method using lambda 
        //notice that I do NOT have to specify the data type of a and b
        Calculate add =(a,b)-> a + b;
        Calculate difference = (a,b) -> Math.abs(a-b);
        Calculate divide =(a,b)-> (b != 0 ? a/b : 0);
        Calculate multiply = (x,y)-> x*y;
        
        
        System.out.println(add.calc(3,2));
        System.out.println(difference.calc(5,10));
        System.out.println(divide.calc(5, 0));
        
        System.out.println(multiply.calc(5, 10));
        
        
        Calculate3Int add3 =(a,b,c)-> a + b + c;
        Calculate3Int difference3 = (a,b, c) ->Math.abs(a-b-c);
        Calculate3Int divide3 =(a,b,c)-> c != 0 ? (b != 0 ? a/b : 0 ) / c : 0 ;
        Calculate3Int multiply3 = (x,y, z)-> x*y*z;
        
        
        System.out.println(add3.calc(3,2,6));
        System.out.println(difference3.calc(33,5,10));
        System.out.println(divide3.calc(50, 5 , 3));
        
        System.out.println(multiply3.calc(5, 10 , 2));
    }
    
}
