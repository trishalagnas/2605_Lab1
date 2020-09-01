
public class Test {

	public static void main(String[] args) {
        Date d1 = new Date(6, 05, 2000);
        Date d2 = new Date(7, 03, 1993);

            if(d1.compareTo(d2) == 1)
                System.out.println(d2.mon + "/" + d2.dd + "/" + d2.yr + " is earlier " + 
                		d1.mon + "/" + d1.dd + "/" + d1.yr );
            
            else if(d1.compareTo(d2) == -1)
                System.out.println(d1.mon + "/" + d1.dd + "/" + d1.yr +" is later " + 
                		d2.mon + "/" + d2.dd + "/" + d2.yr  );
            
            else {
                System.out.println(d1.mon + "/" + d1.dd + "/" + d1.yr + " and " + 
                		d2.mon + "/" + d2.dd + "/" + d2.yr + " are same ");
        }
    }
}
		

