import interfaces.IBoard;
import interfaces.IGame;
import interfaces.IPlayer;
import interfaces.ISettings;

public class Game implements IGame {
	ISettings Configuracao;
	IBoard Tabuleiro; 
	IPlayer[] Jogadores;
	
	public void esperarJogada() {
		// TODO Auto-generated method stub

	}

	
	public void verificarJogada() {
		// TODO Auto-generated method stub

	}

	
	public void verificarFinal() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		System.out.println("foi!");		
	}
}