package org.tarena.note.util;

import java.util.UUID;

public class NoteUtil {
	public static String createUUID(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	
}
