package com;

import java.util.Scanner;

/**
 * Created by WWWW on 2017/5/9.
 */
public class Main {
	private  static Scanner input=new Scanner(System.in );

	public static void main(String[] args) {
		 String[] books={"aaa","bbb","ccc"};
		while (true){
			String firstInput=input.next();
			switch (firstInput){
				case "1":
					System.out.println("book"+getBookName(books));
				case "2":
					System.out.println("book"+getBookNameByNumber(books));
			}

		}

	}

	private static String getBookNameByNumber(String[] books) {

	}

	private static String getBookName(String[] books) {
	}
}
