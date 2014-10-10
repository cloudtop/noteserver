package org.tarena.note.util;

import java.util.UUID;

public class NoteUtil {
	public static String createUUID(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			System.out.println(createUUID());
		}
	}
	
}
