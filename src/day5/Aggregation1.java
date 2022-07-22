package day5;

class Music{
	//instance variable
	String song;
	Music(String s){
		song=s;
	}
	void play() {
		System.out.println(song+"  is playing now");
	}
}
class Theater{
	//Connecting classes between Music  and Theater class by storing Music class reference as shown below.
	Music m;
	Theater(Music m){
		this.m=m;
	}
	void playmusic() {
		m.play();
	}
}

public class Aggregation1 {
	public static void main(String[] args) {
		Music m=new Music("Give me some sunshine");
		Theater t=new Theater(m);
		t.playmusic();
	}
}
