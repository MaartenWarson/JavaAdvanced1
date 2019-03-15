package h9_opdr9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class Klok extends TimerTask {
	public void run() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		
		System.out.println(dateFormat.format(date));
	}
}
