package day5;

interface MusicPlayer {
	  public static void commercial(String sponsor) {
	    System.out.println("Now for a message brought to you by " + sponsor);
	  } 
	  public void play();
}

class Smartphone implements MusicPlayer {
		public void play() {
			System.out.println("Playing from smartphone");
	}
}
	
public class Interface2 {
	public static void main(String[] args) {
		Smartphone motoG = new Smartphone();
	    MusicPlayer.commercial("Motorola");
	    motoG.play();
	}
}
