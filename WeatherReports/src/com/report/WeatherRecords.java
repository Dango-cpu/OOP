package com.report;

public class WeatherRecords {
	private Date date;
	private TemperatureRange today;
	private TemperatureRange normal;
	private TemperatureRange record;
	private double precipitation;
	
	public WeatherRecords(Date date, TemperatureRange today, TemperatureRange normal, TemperatureRange record, double precipitation) {
		this.setDate(date);
		this.setToday(today);
		this.setNormal(normal);
		this.setRecord(record);
		this.setPrecipitation(precipitation);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TemperatureRange getToday() {
		return today;
	}

	public void setToday(TemperatureRange today) {
		this.today = today;
	}

	public TemperatureRange getNormal() {
		return normal;
	}

	public void setNormal(TemperatureRange normal) {
		this.normal = normal;
	}

	public TemperatureRange getRecord() {
		return record;
	}

	public void setRecord(TemperatureRange record) {
		this.record = record;
	}

	public double getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(double precipitation) {
		this.precipitation = precipitation;
	}
}
