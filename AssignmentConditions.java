package ConditionalClasses;

public class AssignmentConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int maths = 60;
        int science = 60;
        int english = 61;
        float averagemarks = ((maths + science + english)/3);
        
        if(averagemarks <= 40)
        	System.out.print("fail" + " Please work hard next time");
        	
        else if (averagemarks>=41 && averagemarks <= 59)
        	System.out.print("C Grad" + " Keep improving");
        	
        else if (averagemarks>=60 && averagemarks <= 74)
        	System.out.print("B Grad" + " Keep improving");
        
        else if(averagemarks>=75 && averagemarks <= 89)
            System.out.print("A Grad" + " Excellent performance!");	
            
        else if(averagemarks>=90 && averagemarks <= 100)
          	System.out.print("A+ Grad" + " Excellent performance!");
        else
        	System.out.print("invalid");
        
	}
	
}

