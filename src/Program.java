import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entities.Comment;
import Entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyy HH:mm:ss");
		
		Comment c1 = new Comment ("Habe a nice trip!");
		Comment c2 = new Comment ("Wow that's awesome!");
		
		Post p1 = new Post (
				sdf.parse ("21/06/2018 13:05:04"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
	}
}
