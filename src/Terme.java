
import java.lang.*;

public class Terme {
//Attributes
private String mot;
private String definition [];
private String type;
private int nbd;
private boolean bool ;

//constructors

public Terme ( String m ,String t ,String[] d) {
	
   this.mot=m;
	this.type=t;
	this.definition=new String[200];
	
}
public Terme(String m , String[] d) {
	this.mot=m;
	definition=d;
	
}
public Terme(String mot , String [] td,String type) {
 this.mot=mot;
this.definition=td;
 this.type=type;
}
//getters and setters
public String[]  getDefinition() {
	return definition;
}
public int getNRDefinition() {

	int NBDefinitions=0;
    for(int i=0;i>=definition.length;i++) {
	  	NBDefinitions++;
	}
    return NBDefinitions;
}
public String getType() {
	return type;
}
public void setType() {
	String tp = null;
	type=tp;
}
public String getMot()  {
	return mot;
}
public String[] setdefinition(String[] td) {
	return definition=td; 
}

//Methode to see if two terms are synonymes or not

public boolean EstSynonyme(Terme t ) {
	boolean bool=true;
	for(int i=0;i<=definition.length; i++) {
		if(t.definition[i].equals(t.definition[i])) {
			return bool=true;
		}else return bool=false;
	}
	return bool;
	
}

//Methode verbe 1er grp
public void EstUnVerbePremierGroupe() {
	boolean bool ;
	mot=mot.substring((mot.length()-2),2);
	 String SUFFIX_ER="er";
	 
	 for(int i=0;i<=definition[i].length();i++) {
		 
		 if(!mot.substring(mot.length()-2).equals(SUFFIX_ER)) {
			System.out.println("le verbe est premier");	 
		 }else System.out.println("le verbe n'est pas  premier");	 
	 }
}
//METHODE conjugaison verbe 1er grp
public static void ConjuguerVerbePremierGroupe(){
	   //LOCAL DECLARATION;
	    String[] PRONOMS = {"je","tu","il","nous","vous","elles"};
	    String[] SUFFIXES = {"e","es","e","ons","ez","ent"};
	    
	    if(Terme.EstUnVerbePremierGroupe()) {
	    	return mot.equals(mot.substring(0,mot.length()- SUFFIXE_ER.length()));	
	    }
	    
		for(int i=0;i<PRONOMS.length;i++) {
			
		    System.out.println(PRONOMS[i] + " " + mot + SUFFIXES[i]);
		}
		
	    }
//Methode that adds a definition to the definition tab

public void addDefinition(String []d) {
	
	definition = new String [1] ;
		
	}
	
}
//to string method
public void toString() {
	
	
}

}



























