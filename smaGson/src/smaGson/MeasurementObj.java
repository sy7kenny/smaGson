package smaGson;

public class MeasurementObj {
	private double pv;
	private double batCur;

	public MeasurementObj(float pv, float batCur) {
		this.pv = pv;
		this.batCur = batCur;
	}

	public double getPv() {
		return pv;
	}

	public void setPv(double pv2) {
		this.pv = pv2;
	}

	public double getBatCur() {
		return batCur;
	}

	public void setBatCur(double batCur2) {
		this.batCur = batCur2;
	}

}