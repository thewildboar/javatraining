package it.myTset.testExam;
/*
 * Fields and instance initializer blocks are run in the order in wich they appear in the file
 * The constructor runs after all fields and instance initializer blocks have run
 */
public class Chick {
	private String name="Fluffy";
	{System.out.println("setting field");}
	public Chick(){
		name="Tiny";
		System.out.println("settings constructor");
	}
	public static void main(String[] args){
		Chick chick = new Chick();
		System.out.println(chick.name);
	}
}