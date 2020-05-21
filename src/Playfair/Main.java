package Playfair;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
//	static String[][] matricePlayfair = new String[5][5];

	public static ArrayList<String> pregatesteParola(String parola) {
		ArrayList<String> temp = new ArrayList<String>();
//		static String parola_S; // _parola cu litere singulare = nerepetate
		ArrayList<String> ALparola_S = new ArrayList<String>(); // Array List _parola cu litere singulare =
		// nerepetate
		parola = parola.toUpperCase();
		temp.clear();
		for (int i = 0; i < parola.length(); i++) {
			if (!String.valueOf(parola.charAt(i)).equals("J"))
				temp.add(String.valueOf(parola.charAt(i)));
			else
				temp.add("I");
		}
		for (String s : temp) {
			if (!ALparola_S.contains(s)) {
				ALparola_S.add(s);
			}
		}
		return ALparola_S;
	}

	public static ArrayList<String> pregatesteMesajul(String mesaj) {
		ArrayList<String> temp = new ArrayList<String>();
		ArrayList<String> ALmesaj_M = new ArrayList<String>(); // Modificat Q in loc de spatiul dintre litere & numar
																// par de litere

		mesaj = mesaj.toUpperCase();
		temp.clear();
		ALmesaj_M.clear();
		for (int i = 0; i < mesaj.length(); i++) {
			if (!String.valueOf(mesaj.charAt(i)).equals("J")) {
				temp.add(String.valueOf(mesaj.charAt(i)));
			} else {
				temp.add("I");
			}
		}
		for (String s : temp) {
			if (!s.equals(" ")) {
				ALmesaj_M.add(s);
			} else {
				ALmesaj_M.add("Q");
			}
		}
		if (ALmesaj_M.size() % 2 != 0) {
			ALmesaj_M.add("Q");
		}
		return ALmesaj_M;
	}

	public static String[][] pregatesteMatriceaPlayfair(String parola) {

		String[][] MatriceaPlayfair = new String[5][5];
		ArrayList<String> temp2 = new ArrayList<String>();
		ArrayList<String> temp3 = new ArrayList<String>(); // Modificat
		ArrayList<String> ALparola_S = new ArrayList<String>(); // Array List _parola cu litere singulare =
		// nerepetate

		ALparola_S = pregatesteParola(parola);

		String temp1[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
				"T", "U", "V", "W", "X", "Y", "Z" };
		for (String s : temp1) {
			temp2.add(s);
		}

		for (String s : ALparola_S) {
			temp3.add(s);
		}
		for (String s : temp2) {
			if (!temp3.contains(s)) {
				temp3.add(s);
			}
		}
//		System.out.println(temp3);

		int count = 0;

		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				MatriceaPlayfair[y][x] = temp3.get(count++);
			}

		}

		return MatriceaPlayfair;
	}

	public static void main(String[] args) {

		String parola = "criptografie"; // parola formata doar din litere
		String mesaj = "jos si in criptografie tacerea e de aur"; // mesaj format doar din litere

		String[][] MatriceaPlayfair = new String[5][5];
		MatriceaPlayfair = pregatesteMatriceaPlayfair(parola);
		System.out.println(Arrays.deepToString(MatriceaPlayfair));

//		System.out.println(pregatesteParola(parola));
//		System.out.println(pregatesteParola(parola).size());
//		System.out.println(pregatesteParola(parola));//
//		System.out.println(pregatesteMesajul(mesaj));
//		System.out.println(pregatesteMesajul(mesaj).size());
//		System.out.println(pregatesteMesajul(mesaj));
//		System.out.println(MatriceaPlayfair[4][3]);

	}

}
