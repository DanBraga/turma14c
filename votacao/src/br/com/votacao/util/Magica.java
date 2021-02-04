package br.com.votacao.util;

import javax.swing.JOptionPane;

public class Magica {

	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	
	public static boolean b(String msg) {
		if (JOptionPane.showConfirmDialog(null, msg, "Votacao", JOptionPane.YES_NO_OPTION)==0) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
}
