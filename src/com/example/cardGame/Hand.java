package com.example.cardGame;

import java.util.ArrayList;

public class Hand {
	Pack p = new Pack();
	ArrayList<Card> cardsInHand = new ArrayList<Card>();

	public Hand(String S) {
		if (S.equals("poker")) {
			for (int i = 0; i < 5; i++) {
				cardsInHand.add(p.drawFromPack());
			}
		}

		else if (S.equals("rummy")) {
			for (int j = 0; j < 13; j++) {
				cardsInHand.add(p.drawFromPack());
			}
		}
	}

	public ArrayList<Card> showHand() {
		System.out.println("Cards in Hand: " + cardsInHand);
		return cardsInHand;

	}

	public static void main(String args[]) {
		Hand[] players = new Hand[2];

		for (int i = 0; i < players.length; i++) {
			players[i] = new Hand("poker");
			players[i].showHand();
		}

	}

}
