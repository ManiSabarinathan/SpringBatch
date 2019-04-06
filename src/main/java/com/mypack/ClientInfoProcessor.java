package  main.java.com.mypack;

import org.springframework.batch.item.ItemProcessor;



public class ClientInfoProcessor implements ItemProcessor<ClientInfo,ClientInfo> {

	@Override
	public ClientInfo process(ClientInfo item) throws Exception {
		System.out.println("Processing item :: " + item);
		return item;
	}

}
