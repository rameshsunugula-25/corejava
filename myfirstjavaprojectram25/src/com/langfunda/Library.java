package com.langfunda;

public class Library {
	static String libraryname="VCUDE";
	static String librarianname="Reddy";
	int bookid;
	String booktitle;
	String authorname;
	int availablecopies;
	void instancemethod() {
		
		System.out.println("bookid:"+bookid);
		System.out.println("booktitle:"+booktitle);
		System.out.println("authorname:"+authorname);
		System.out.println("availablecopies:"+availablecopies);

	}
	void staticmethod() {
		System.out.println("libraryname:"+libraryname);
		System.out.println("librarianname:"+librarianname);
	}
	public static void main(String[] args) {
		Library i = new Library();
		i.bookid=25;
		i.booktitle="spidey";
		i.authorname="destindanielcretton";
		i.availablecopies=10;
		i.staticmethod();
		i.instancemethod();
		
}
	
	
}
