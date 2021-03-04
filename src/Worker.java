
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

class Worker {
	public  int userId;
	public String usn;
	final  String urlForForecast ="http://139.59.30.199:8080/et_forecast/rest/getForecastFromDevice/";
	public Worker() {
		
	}


	private void processmessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void getForecastDataFromAgent(int userId, String usn) throws ClassNotFoundException, SQLException,IOException {
		HttpConnectorHelper httpconnectorhelper= new HttpConnectorHelper();
		int response = httpconnectorhelper
				.sendPostWithToken(urlForForecast+usn);
		
		
	}
}