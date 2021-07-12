package linecomparision;

public class linecomparision {

	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparision");
		int x1,x2,y1,y2;
	    double dis;
	    x1=1;y1=1;x2=4;y2=4;
	    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
        if(x2-x1 == y2-y1)
        	System.out.println("x2-x1 equals y2-y1");
        else
        	System.out.println("x2-x1 not equals y2-y1");

	}

}
