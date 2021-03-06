
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ActionThreadPoolExecutor {

	public void getStarted() throws ClassNotFoundException, SQLException, IOException {
		System.out.println("-----------------------------------------------");
		System.out.println("Before start of all threads");
		ScheduleDAO sdo= new ScheduleDAO();
			
			ArrayList<HashMap<String, Object>> users = sdo.getUsers();
			System.out.println("List of Users" + users.size());
			if (users.size() > 0) {

			//	ExecutorService executor = Executors.newFixedThreadPool(users.size());// creating a pool of 1000
																							// threads
				for (int i = 0; i < users.size(); i++) {
					Worker worker = new Worker();
					worker.getForecastDataFromAgent((int) users.get(i).get("userId"),(String) users.get(i).get("usn"));
				}
				

			}
			System.out.println("Finished all threads");

		
			}
}
