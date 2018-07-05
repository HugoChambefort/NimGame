package model;

public class Batons {
	private int nbBaton;
	 
	 public void setNbBaton(int nbBaton) {
		this.nbBaton = nbBaton;
	}

	 public int getNbBaton() {
	 	return nbBaton;
	 }
	 
	 public int EnleverBaton(int nbBatonEnlever) {
			this.setNbBaton(this.getNbBaton() - nbBatonEnlever);
			return this.getNbBaton();
	 }

}
