package chapter22;

import java.util.Random;

public class Run1 {
	int[] playerRandom;
	String[] playerJump;

	public void jump(int[] Random) {
		Random = this.playerRandom;
		for (int i = 0; i < playerRandom.length; i++) {
			playerRandom[i] = new Random().nextInt(4);// 0~3
		}

	}
	
	public Run1() {}

	public Run1(int[] Random, String[] Jump) {

		Random = this.playerRandom;
		Jump = this.playerJump;

		for (int i = 0; i < Jump.length; i++) {
			switch (Random[i]) {
			case 0:
				Jump[i] += "";

			case 1:
				Jump[i] += " ";

			case 2:
				Jump[i] += "  ";

			case 3:
				Jump[i] += "   ";

			}
		}

	}

}