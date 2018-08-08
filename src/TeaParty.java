
public class TeaParty {

public String title;


       public String welcome(String name, boolean isWoman, boolean isKnighted)
       {
    	  if(isWoman == true) {
    		  this.title = "Ms. ";
    	  }
    	  else if(isWoman == false) {
    		  this.title = "Mr. ";
    	  }
    	  
    	  if(isKnighted == true ) {
    		  this.title = "Sir ";
    	  }
    	  else if(isKnighted ==false) {
    		  
    	  }
    	  
return "Hello " + this.title + name;
       }

}