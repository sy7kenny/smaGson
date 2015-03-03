package smaGson;

import java.util.List;

public class RespDevices {

	private String key;
	private List<Channels> channels;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<Channels> getChannels() {
		return channels;
	}
	public void setChannels(List<Channels> channels) {
		this.channels = channels;
	}
	@Override
	public String toString() {
		return "RespDevices [key=" + key + ", channels=" + channels + "]";
	}
	
}
