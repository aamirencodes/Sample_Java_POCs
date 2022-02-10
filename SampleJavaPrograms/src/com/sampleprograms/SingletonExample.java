package com.sampleprograms;

class SingletonExam {
	private static SingletonExam singletonInstance = null;

	private SingletonExam() {
		System.out.println("I'm from singleton class");
	}

	public static SingletonExam getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new SingletonExam();
		}

		return singletonInstance;
	}
}

public class SingletonExample {

	public static void main(String[] args) {

		SingletonExam s1 = SingletonExam.getInstance();

		SingletonExam s2 = SingletonExam.getInstance();

		System.out.println("Hashcode of x is " + s1.hashCode());
		System.out.println("Hashcode of y is " + s2.hashCode());
		
		// Condition check
        if (s1 == s2) {
 
            // Print statement
            System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
        }
 
        else {
            // Print statement
            System.out.println(
                "Three objects DO NOT point to the same memory location on the heap");
        }

	}

}
