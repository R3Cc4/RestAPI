package org.vamsi.restapi.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.vamsi.restapi.messenger.models.Message;
import org.vamsi.restapi.messenger.models.Profile;

public class DatabaseClass {

		private static Map<Long,Message> messages= new HashMap<>();
		private static Map<String,Profile> profiles = new HashMap<>();

		public DatabaseClass(){
			
		}
public static Map<Long,Message> getMessages(){
	
	return messages;
}
public static Map<String,Profile> getProfiles(){
	return profiles;
}
}
