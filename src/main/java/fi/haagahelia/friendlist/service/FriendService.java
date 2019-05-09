package fi.haagahelia.friendlist.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fi.haagahelia.friendlist.domain.Friend;

@Service 
public class FriendService {
	
	private static ArrayList<Friend> friends;

	
	public static ArrayList<Friend> getFriend(){
		friends = new ArrayList<Friend>();
		
		//if(friends.isEmpty()) {
		Friend f1 = new Friend("John", "Snow");
		Friend f2 = new Friend("John", "Smith");
		Friend f3 = new Friend("John", "Travolta");
		
		friends.add(f1);
		friends.add(f2);
		friends.add(f3);
		//}
		
		return friends;
	}
	
	public static void addFriend(Friend friend) {
		
		friends.add(friend);
		
	}
	
	public static void nameToFriend(String name) {
		
		Friend f = new Friend();
		
		name.trim();
		String[] split = name.split("\\s+");
		System.out.println(split[0]+ " "+split[1]);
		f.setFirstName(split[0]);
		f.setLastName(split[1]);
		
		addFriend(f);
	}

}
