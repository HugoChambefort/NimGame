package controller;
import java.util.Scanner;
import model.*;

public class Player {
	public int nbDeBatonAEnlever;
	public static Batons baton;
	
	public Player(Batons baton) {
		nbDeBatonAEnlever = 0;
		setBaton(baton);
	}
	
	public void setNbDeBatonAEnlever(int nbDeBatonAEnlever) {
		this.nbDeBatonAEnlever = nbDeBatonAEnlever;
	}
	
	public int getNbDeBatonAEnlever() {
		return nbDeBatonAEnlever;
	}

	public Batons getBaton() {
		return baton;
	}

	public void setBaton(Batons baton) {
		this.baton = baton;
	}
	
	public int demanderBatonJoueur() {
		Scanner sc = new Scanner(System.in);
		setNbDeBatonAEnlever(sc.nextInt());
		return getNbDeBatonAEnlever();
	}
	
	public int demanderBaton(int nb_baton) {
		if(nb_baton == 2) {
			setNbDeBatonAEnlever(1 + (int)(Math.random() * 2));
		}else if(nb_baton == 1) {
			setNbDeBatonAEnlever(1);
		}else {
			setNbDeBatonAEnlever(1 + (int)(Math.random() * 3));
		}
		return this.getNbDeBatonAEnlever();
	}
	
	

}
