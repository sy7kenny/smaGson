package smaGson;

import java.util.List;

public class Devices {
 private String key;
 private List<String> channels;

public String getKey() {
	return key;
}
public void setKey(String key) {
	this.key = key;
}
public List<String> getChannels() {
	return channels;
}
public void setChannels(List<String> chPv) {
	this.channels = chPv;
}


@Override
public String toString() {
	return "Devices [key=" + key + ", channels=" + channels + "]";
}
 
}
