package trips01;
import hotelSearch.*;
import java.text.ParseException;
import java.io.IOException;
public class Main {

	private static HotelsData test = new HotelsData();
	

	
	public static void main(String[] args) throws ParseException, IOException {
		//UI test = new UI();
		//test.dispUI();
		//hotelSearch.UserInterface session = new hotelSearch.UserInterface();
		test.search();
		test.disp();

		
	}

}
