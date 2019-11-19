package com.test.jacoco;

import javax.imageio.event.IIOReadWarningListener;
import java.util.Calendar;


public class HelloWorld {
    public HelloWorld() {

    }

    public String Method1() {
        return "Hello World";
    }

    public int Method2(int a, int b) {
        return a + b;
    }
    
    public int Method3(int a, int b, int c){
    	if((a>5&&b<0)||c>0) {
    		System.out.println("Condition 1");
    	}
    	else if(a<5 && c<-2 ) {
    		System.out.println("Condition 2");
    	}
    	else {
    		System.out.println("Condition 3");
    	}
    	return 0;
    }
    public int Method4(int a, int b, int c, int d, float e) {
    	if(a == 0) {
    		return 0;
    	}
    	int x = 0;
    	if((a == b) || ((c == d) && (bug(a)))) {
    		 x = 1; 
    	}
    	e = 1/x;
    	return 0;
    }
    public boolean bug(int a) {
    	if(a == 5) return true;
    	return false;
    }
    
    
    public boolean isTriangle(int a, int b, int c) {
    	/**
    	 * TODO: You need to complete this method to determine whether  a
    	 * triangle is formed or not when given the input edge a, b and c.
    	 */
    	int min = Math.min(a, Math.min(b, c));
    	if (min <= 0)
    		return false;
    	int max = Math.max(a, Math.max(b, c));
    	int mid = a + b + c - min - max;
    	return max - min < mid;
    }
    public boolean isBirthday(int year, int month, int day) {
    	/**
    	 * TODO: You need to complete this method to determine whether a 
    	 * legitimate date of birth between 1990/01/01 and 2019/10/01 is 
    	 * formed or not when given the input year, month and day.
    	 */
		Calendar begin = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		begin.clear();
		begin.set(1990, 1 - 1, 1);
		end.clear();
		end.set(2019, 10 - 1, 1);

		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(year, month - 1, day);
		calendar.setLenient(false);
		try {
			calendar.getTime();
		} catch (Exception e) {
			return false;
		}

		int r1 = calendar.compareTo(begin);
		int r2 = calendar.compareTo(end);
		if (r1 == 0 || r2 == 0)
			return true;
		if (r1 > 0 && r2 < 0)
			return true;
		return false;
    	
    }
    public Double miniCalculator(double a, double b, char op) {
    	/**
    	 * TODO: You need to complete this method to form a small calculator which 
    	 * can calculate the formula: "a op b", the op here can be four basic  
    	 * operation: "+","-","*","/". 
    	 */
		switch (op) {
			case '+':
				return a + b;
			case '-':
				return a - b;
			case '*':
				return a * b;
			case '/':
				return a / b;
			default: throw new IllegalArgumentException();
		}
    }
    
}
