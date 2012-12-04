package statusapp.components;

import java.io.Serializable;
import javax.ejb.Singleton;
import javax.ejb.Stateful;
import javax.jms.ConnectionFactory;
import javax.jms.Topic;
import java.util.List;
import java.util.ArrayList;
import javax.inject.Named;



import static java.util.Collections.unmodifiableList;

@Singleton
public class Statuses implements Serializable{
	private List<String> stats;


	public  Statuses(){
	 this.stats = new ArrayList<String>();
	}

	public void addStatus(String status){
		stats.add(status);

	}
	public List<String> getStatus(){
		return unmodifiableList(stats);
	}

}