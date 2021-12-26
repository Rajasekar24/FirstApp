package com.collectionsWatch;

public class Feature {
	private int id;
	private boolean isdigital, isesim, isspeaker, ismic, isbluetooth, stopwatch, ishealthcare, showDate;

	public Feature(int id, boolean isdigital, boolean isesim, boolean isspeaker, boolean ismic, boolean isbluetooth,
			boolean stopwatch, boolean ishealthcare, boolean showDate) {
		super();
		this.id = id;
		this.isdigital = isdigital;
		this.isesim = isesim;
		this.isspeaker = isspeaker;
		this.ismic = ismic;
		this.isbluetooth = isbluetooth;
		this.stopwatch = stopwatch;
		this.ishealthcare = ishealthcare;
		this.showDate = showDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isIsdigital() {
		return isdigital;
	}

	public void setIsdigital(boolean isdigital) {
		this.isdigital = isdigital;
	}

	public boolean isIsesim() {
		return isesim;
	}

	public void setIsesim(boolean isesim) {
		this.isesim = isesim;
	}

	public boolean isIsspeaker() {
		return isspeaker;
	}

	public void setIsspeaker(boolean isspeaker) {
		this.isspeaker = isspeaker;
	}

	public boolean isIsmic() {
		return ismic;
	}

	public void setIsmic(boolean ismic) {
		this.ismic = ismic;
	}

	public boolean isIsbluetooth() {
		return isbluetooth;
	}

	public void setIsbluetooth(boolean isbluetooth) {
		this.isbluetooth = isbluetooth;
	}

	public boolean isStopwatch() {
		return stopwatch;
	}

	public void setStopwatch(boolean stopwatch) {
		this.stopwatch = stopwatch;
	}

	public boolean isIshealthcare() {
		return ishealthcare;
	}

	public void setIshealthcare(boolean ishealthcare) {
		this.ishealthcare = ishealthcare;
	}

	public boolean isShowDate() {
		return showDate;
	}

	public void setShowDate(boolean showDate) {
		this.showDate = showDate;
	}

	@Override
	public String toString() {
		return "Features [id=" + id + ", isdigital=" + isdigital + ", isesim=" + isesim + ", isspeaker=" + isspeaker
				+ ", ismic=" + ismic + ", isbluetooth=" + isbluetooth + ", stopwatch=" + stopwatch + ", ishealthcare="
				+ ishealthcare + ", showDate=" + showDate + "]";
	}

}
