package model;

import java.util.Scanner;

import controller.*;

public class Referee{
	private int restart;
	private boolean gagnant;
	private boolean bonBaton;
	private Batons batons;
	private Player player;
	private Player IA;
	
	
	public Referee() {
		restart = 1;
		batons = new Batons();
		player = new Player(batons);
		IA = new Player(batons);
	}
	


	public void EnleverBaton(int nbBatonEnlever) {
		batons.EnleverBaton(nbBatonEnlever);
	}

	public int getNbBaton() {
		return batons.getNbBaton();
	}

	public void setNbBaton(int nbBaton) {
		batons.setNbBaton(nbBaton);
	}
	

	public boolean getBonBaton() {
		return bonBaton;
	}

	public void setBonBaton(boolean bonBaton) {
		this.bonBaton = bonBaton;
	}


	public void setRestart(int restart) {
		this.restart = restart;
	}
	
	public int getRestart() {
		return restart;
	}
	
	public void rejouer() {
		System.out.println("\nVoulez-vous recommencer ? [1 pour oui/0 pour non]");
		Scanner sc2 = new Scanner(System.in);
		this.setRestart(sc2.nextInt());
		
		if(getRestart() < 0 || getRestart() > 1) {
			System.out.println("\n	Vous vous etes tromper vous de pouvez pas entrer la valeur " + getRestart());
			rejouer();
		}
	}
	
	
	public void setGagnant(boolean i) {
		gagnant = i;
	}
	
	private boolean getGagnant() {
		return gagnant;
	}
	
	public void annonceGagnant() {
		if(this.getGagnant() == false) {
			System.out.println("Bravo! Vous avez gagner\n");
		}else {
			System.out.println("Désolé... Vous avez perdu\n");
		}
	}
	

	public int DebutPartie() {
		this.setRestart(1);
		this.setNbBaton(21);
		System.out.println("\n\n	Il y a " + this.getNbBaton() + " que le meilleur gagne");
		return batons.getNbBaton();
	}
	
	
	public int afficherBatonDeLIa(int batonIA) {
		 System.out.println("\n	C'est au tour de l'IA il reste " + this.getNbBaton() + " \n\n	L'IA a retiré " + batonIA);
		 return batonIA;
	 }
	
	 
	public void afficherBaton() {
		 System.out.println("\n 	L'IA a jouer et il reste " + this.getNbBaton() + "\n");
	 }


	public int verifierJeu(int nb_baton_enlever) {
		this.setBonBaton(true);
		
		if(nb_baton_enlever < 1 || nb_baton_enlever > 3) {
			System.out.println("        Vous vous etes trompé veuillez entrer un nombre entre 1 et 3.");
			this.setBonBaton(false);
		}
		
		if(nb_baton_enlever > this.getNbBaton()) {
			System.out.println("        Vous ne pouvez pas enlever plus de baton qu'il n'en reste.\n        Il en reste : " + this.getNbBaton());
			this.setBonBaton(false);
		}	
		return nb_baton_enlever;
	}
	
	
	public void demanderBaton() {
		System.out.println("\nEntrez un nombre entre 1 et 3: ");
	}
	

	public void setNbDeBatonAEnlever(int nbDeBatonAEnlever) {
		player.setNbDeBatonAEnlever(nbDeBatonAEnlever);
	}
	

	public int getNbDeBatonAEnlever() {
		return player.getNbDeBatonAEnlever();
	}
	

	public int demanderBatonJoueur() {
		return player.demanderBatonJoueur();
	}
	

	public int demanderBatonIA() {
		return IA.demanderBaton(batons.getNbBaton());
	}
}