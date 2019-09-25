import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Factor {
	//example: x3 -2x2 + -4x - 8

    public Factor(String text)    
    {
    	String pattern = "^([a-zA-Z])(\\d+) ([+-]) (-?)(\\d+)(\\1)(\\d+) ([+-]) (-?)(\\d+)(\\1) ([+-]) (-?)(\\d)$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
	    if (m.find())
	    {
	    	originalFactor(text);
	    	
	  
	    }
	    else 
	    {
	      	pattern = "^([a-zA-Z])(\\d+) ([+-]) (-?)(\\d+)(\\1)(\\d+)$";
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
    	String pattern = "^([a-zA-Z])(\\d+) ([+-]) (-?)(\\d+)(\\1)(\\d+)$";
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
    	String pattern = "^([a-zA-Z])(\\d+) ([+-]) (-?)(\\d+)(\\1)(\\d+) ([+-]) (-?)(\\d+)(\\1) ([+-]) (-?)(\\d)$";
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
		new Factor("x2 - -2x2");
	}
}
