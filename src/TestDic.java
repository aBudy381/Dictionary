
import java.util.Scanner;
public class TestDic {

	public static void main(String[] args) {

Scanner sc = new Scanner(system.in);
Terme tr1,tr2,tr3,tr4,tr5;
String mot ;
Dictionnaire ds;
Dictionnaire d = new Dictionnaire ("le min LAROUSSE",10);
String [] definition= {"activite d'ordre physique ou mental, non impose","activite de loisir"};
tr1 = new Terme("jeux",definition,"nom");
d.Enrechir(tr1);
tr2 = new Terme("jeuer","s'amouser en utilisant un objet ou une activité","verbe");
d.Enrechir(tr2);
tr3 = new Terme("chanter","produire des sons plus ou moins modulés","verbe");
d.Enrechir(tr3);
tr4 = new Terme("distraction","activite d'ordre physique ou mental, non imposee","nom");
d.Enrechir(tr4);
tr5 = new Terme("passe-temps","activite d'ordre physique , non impose","nom");
d.Enrechir(tr5);
Terme tr6 = new Terme("chanter","faire entendre un chant","nom");
d.Enrechir(tr5);
d.afficher();
if (tr1.EstSynonyme(tr4)) {
	System.out.println (tr1.getMot()+"et"+tr4.getMot()+"sont sysnonyms");
}
else {
	System.out.println (tr1.getMot()+"et"+tr4.getMot()+"ne sont pas  sysnonyms");
	
}
System.out.println("donner un mot :");
mot.next();
d.getSynonymes(mot);

System.out.println ("\n Liste des verbes du premier groupe conjugés au présent : ");
d.ListeVerbePremierGroupe();
	}

}
