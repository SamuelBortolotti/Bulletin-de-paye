package bulletindepaye;

import java.util.Scanner;

public class Bul1 {
	static final int EMPLOYE = 1; //choix de qualité du salarié
	static final int AGENTMAITRISE = 2;
	static final int CADRE = 3;
	
	
	
	public static int calculSalaire(int nbHeures,float salHoraire, float cotisations)//méthode calcul du salaire en fonction du nombre d'heures du salaire et des cotisations
	{
		
		if (nbHeures < 169)
		{
			return (int)(salHoraire * cotisations * nbHeures);
		}
		else if (nbHeures <= 180)
		{
			return (int)(salHoraire * 1.5 * cotisations * nbHeures);
		}
		else
		{
			return (int)(salHoraire * 1.6 * cotisations * nbHeures);
		}
	}


	public static void main(String[] args) {
		//selecteur position de l'employé
		//salaire horaire, variable
		//calcul de nombre d'heures 0-169 169-180 180+
		
		Scanner scanner = new Scanner(System.in); //lire l'entrée utilisateur
		
		System.out.println("Veuillez saisir votre salaire horaire");
		
		float salHoraire = scanner.nextFloat(); // à chaque fois qu'on appelle quelque chose ça va lire la ligne qu'on entre
		
		
		
		System.out.println("Veuillez entrer votre nombre d'heures effectuées ce mois-çi");
		System.out.println("rappel toutes heures au delà de 169 sont majorées!");
		int nbHeures = scanner.nextInt(); //IDEM
		
		
		
		System.out.println("Veuillez renseigner votre position");
		System.out.println("1= employé 2= agent de maîtrise 3= cadre");
		int posSalarie = scanner.nextInt(); //IDEM
		
		int salMensuel = 0;
		
		switch(posSalarie) //* commutateur avec choix
		{
		case EMPLOYE:
		salMensuel = calculSalaire(nbHeures, salHoraire, 0.80f); //* appelle une constante et la calcule avec un coef
		break;
		
		case AGENTMAITRISE:
		salMensuel = calculSalaire(nbHeures, salHoraire, 0.78f);
		break;
		
		case CADRE:
		salMensuel = calculSalaire(nbHeures, salHoraire, 0.75f);
		break;
		
		default:
		System.out.println("Position invalide"); //* erreur

	}
		
		
	System.out.println("salaire net mensuel " + salMensuel);	
	
	
	
	


}
}
