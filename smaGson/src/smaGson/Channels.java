package smaGson;

public class Channels {
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
	return "Channels [unit=" + unit + ", meta=" + meta + ", name=" + name
			+ ", value=" + value + "]";
}

}
