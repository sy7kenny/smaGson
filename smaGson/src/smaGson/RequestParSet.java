package smaGson;

public class RequestParSet {
	private String version;
	private String id;
	private String proc;;
	private String format;
	private String passwd;

	private ParamsSet params;

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

	public ParamsSet getParams() {
		return params;
	}

	public void setParams(ParamsSet params) {
		this.params = params;
	}
	
}
