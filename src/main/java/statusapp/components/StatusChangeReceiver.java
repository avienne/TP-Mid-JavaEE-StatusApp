package statusapp.components;

import statusapp.components.Statuses;
import javax.annotation.Resource;
import javax.ejb.MessageDriven;
import javax.ejb.EJB; 

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import java.util.logging.Level;
import java.util.logging.Logger;

@MessageDriven(mappedName = "jms/ParticipantStatusBroadcast")
public class StatusChangeReceiver implements MessageListener{

	@EJB
	Statuses statuse;

	@Override 
	public void onMessage(Message message){
		if(message instanceof TextMessage){
			try{
				TextMessage newstatus = (TextMessage) message;
				statuse.addStatus(newstatus.getText());
			}catch (JMSException ex){LOG.log(Level.SEVERE, null, ex);}
		}
	}
  private static final Logger LOG = Logger.getLogger(StatusChangeReceiver.class.getName());

}