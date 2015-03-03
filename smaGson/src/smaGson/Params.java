package smaGson;

import java.util.List;

public class Params {
 private List<Devices> devices;

public List<Devices> getDevices() {
	return devices;
}

public void setDevices(List<Devices> devices) {
	this.devices = devices;
}

@Override
public String toString() {
	return "Params [devices=" + devices + "]";
}

}
