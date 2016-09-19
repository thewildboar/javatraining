package it.my.TestOnline;

class Person {
	Person(String s, int i) {
		++pid;
		name = s;
		age = i;
	}

	static int pid;
	int age;
	String name;
}

