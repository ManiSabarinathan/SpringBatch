package  main.java.com.mypack;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ClientInfo")
public class ClientInfo {
	
	private String ProcessingApp;
	private String AddedByApp;
	private String ClientVersion;
	
	@XmlElement(name="ProcessingApp")
	public String getProcessingApp() {
		return ProcessingApp;
	}
	public void setProcessingApp(String processingApp) {
		ProcessingApp = processingApp;
	}
	
	
	@XmlElement(name="AddedByApp")
	public String getAddedByApp() {
		return AddedByApp;
	}
	public void setAddedByApp(String addedByApp) {
		AddedByApp = addedByApp;
	}
	
	@XmlElement(name="ClientVersion")
	public String getClientVersion() {
		return ClientVersion;
	}
	public void setClientVersion(String clientVersion) {
		ClientVersion = clientVersion;
	}
	@Override
	public String toString() {
		return "ClientInfo [ProcessingApp=" + ProcessingApp + ", AddedByApp=" + AddedByApp + ", ClientVersion="
				+ ClientVersion + "]";
	}
	
	

}
