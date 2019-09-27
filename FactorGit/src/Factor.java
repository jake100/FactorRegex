import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Factor {
	//example: x3 - 2x2 + -4x - 8

	String binomialFactorPattern = "^([a-zA-Z])(\\d+)\\s+([+-])\\s+(-?)(\\d+)(\\1)(\\d+)$";
	String originalFactorPattern = "^([a-zA-Z])(\\d+)\\s+([+-])\\s+(-?)(\\d+)(\\1)(\\d+)\\s+([+-])\\s+(-?)(\\d+)(\\1)\\s+([+-])\\s+(-?)(\\d)$";
    public Factor(String text)    
    {
    	String pattern = originalFactorPattern;
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
	    if (m.find())
	    {
	    	originalFactor(text);
	    	
	  
	    }
	    else 
	    {
	      	pattern = binomialFactorPattern;
	    	r = Pattern.compile(pattern);
	    	m = r.matcher(text);
	    	if(m.find())
	    	{
	    		bimomialFactor(text);
	    	}
	    	else System.out.println("NO MATCH");
	    }
    }
    public void bimomialFactor(String text)
    {
    	String pattern = binomialFactorPattern;
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
	    if (m.find())
	    {
	    	System.out.println("found: " + m.group(1));
	    	System.out.println("found: " + m.group(2));
	    	System.out.println("found: " + m.group(3));
	    	System.out.println("found: " + m.group(4));
	    	System.out.println("found: " + m.group(5));
	    	System.out.println("found: " + m.group(6));
	    	System.out.println("found: " + m.group(7));
	      }
	    else 
	    {
	         System.out.println("NO MATCH");
	    }
    }
    public void originalFactor(String text)
    {
    	String pattern = originalFactorPattern;
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
	    if (m.find())
	    {
	    	System.out.println("found: " + m.group(1));
	    	System.out.println("found: " + m.group(2));
	    	System.out.println("found: " + m.group(3));
	    	System.out.println("found: " + m.group(4));
	    	System.out.println("found: " + m.group(5));
	    	System.out.println("found: " + m.group(6));
	    	System.out.println("found: " + m.group(7));
	    	System.out.println("found: " + m.group(8));
	    	System.out.println("found: " + m.group(9));
	    	System.out.println("found: " + m.group(10));
	    	System.out.println("found: " + m.group(11));
	    	System.out.println("found: " + m.group(12));
	    	System.out.println("found: " + m.group(13));
	    	System.out.println("found: " + m.group(14));
	      }
	    else 
	    {
	         System.out.println("NO MATCH");
	    }
    }
    public static void main(String[] args) {
    	String example0 = "x3 - 2x2 + -4x - 8";
    	String example1 = "x2 + -2x2";
		System.out.println("first word:");
		new Factor(example0);
		System.out.println("second word:");
		new Factor(example1);
	}
}
