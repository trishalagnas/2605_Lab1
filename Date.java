	public class Date implements Comparable<Date> {
		
	    int mon;
	    int dd;
	    int yr;

	    Date(int m, int d, int y) {
	        this.mon = m;
	        this.dd = d;
	        this.yr = y;
	    }
	    public int compareTo(Date other) {
	    	
	        if (this.yr < other.yr)	        	
	            return -1;
	        
	        else if(this.yr > other.yr)        	
	            return 1;
	        
	        else{
	        	
	            if(this.mon < other.mon)
	                return -1;
	            
	            else if(this.mon > other.mon)
	                return 1;
	            
	            else{            	
	                if(this.dd < other.dd)
	                    return -1;
	                
	                else if(this.dd > other.dd)
	                    return 1;
	                
	                else{
	                    return 0;
	                }
	            }
	        }
	    }
	}
