package smaGson;

public class RequestPar {
private String version;
private String id;
private String proc;;
private String format;
private String passwd;

private Params params;
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

public String getProc() {
	return proc;
}

public void setProc(String proc) {
	this.proc = proc;
}


public String getFormat() {
	return format;
}

public void setFormat(String format) {
	this.format = format;
}

public String getPasswd() {
	return passwd;
}

public void setPasswd(String passwd) {
	this.passwd = passwd;
}

public Params getParams() {
	return params;
}

public void setParams(Params params) {
	this.params = params;
}

@Override
public String toString() {
	return "RequestPar [version=" + version + ", id=" + id + ", proc=" + proc
			+ ", format=" + format + ", passwd="
			+ passwd + ", params=" + params + "]";
}




}
