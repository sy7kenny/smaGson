package smaGson;

import java.util.List;

public class Detail {
private String format;
private String proc;
private String version;
private String id;
private Result result;

public Detail(){

	
}

public String getFormat() {
	return format;
}

public void setFormat(String format) {
	this.format = format;
}

public String getProc() {
	return proc;
}

public void setProc(String proc) {
	this.proc = proc;
}

public String getVersion() {
	return version;
}

public void setVersion(String version) {
	this.version = version;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public Result getResult() {
	return result;
}

public void setResult(Result result) {
	this.result = result;
}

@Override
public String toString() {
	return "Detail [format=" + format + ", proc=" + proc + ", version="
			+ version + ", id=" + id + ", result=" + result + "]";
}

}

class Result{
	private List<ResultDev> devices;

	public List<ResultDev> getDevices() {
		return devices;
	}

	public void setDevices(List<ResultDev> devices) {
		this.devices = devices;
	}

	@Override
	public String toString() {
		return "Result [devices=" + devices + "]";
	}
	
}

class ResultDev{
private String key;
private List<Channel> channels;
public String getKey() {
	return key;
}
public void setKey(String key) {
	this.key = key;
}
public List<Channel> getChannels() {
	return channels;
}
public void setChannels(List<Channel> channels) {
	this.channels = channels;
}
@Override
public String toString() {
	return "ResultDev [key=" + key + ", channels=" + channels + "]";
}

}
class Channel{
	private String unit;
	private String meta;
	private String name;
	private String value;
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getMeta() {
		return meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Channel [unit=" + unit + ", meta=" + meta + ", name=" + name
				+ ", value=" + value + "]";
	}
	
	
}