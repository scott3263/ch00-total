package kr.co.applestar.ch07;

abstract class Unit{
	int x, y;
	abstract void move(int x, int y) ;
	void stop() {
	}
}

class Marine extends Unit{
	void move(int x, int y) {
	}
	void steamPack() {
	}
}
class Tank extends Unit{
	void move(int x, int y) {
	}
	void changeMode() {
	}
}

class Dropship extends Unit{
	void move(int x, int y) {
	}
	void load() {
	}
	void unload() {
	}
}
public class Ex7_10 {

	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
//		Unit[] group = new Unit[3];
//		group[0] = new Marine();
//		group[1] = new Tank();
//		group[2] = new Dropship();
		
		for (int i = 0 ; i < group.length ; i++) {
			group[i].move(100,  200);
		}
		
	}

}
