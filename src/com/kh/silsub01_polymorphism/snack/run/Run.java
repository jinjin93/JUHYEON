package com.kh.silsub01_polymorphism.snack.run;

import java.util.Scanner;

import com.kh.silsub01_polymorphism.snack.controller.PlayerManager;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlayerManager pm = new PlayerManager();
		
		System.out.print("���̵� �Է� : ");
		String name = sc.nextLine();
		
		pm.starPlay(name);

	}

}