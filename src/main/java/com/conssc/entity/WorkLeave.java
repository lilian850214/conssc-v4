package com.conssc.entity;


public class WorkLeave {
	private String uid;
	private Double annualleave;
	private Double sickleave;
	private Double peronalleave;
	private Double maternityleave;
	private Double exchangeleave;
	public WorkLeave(String uid, Double annualleave, Double sickleave, Double peronalleave, Double maternityleave,
			Double exchangeleave) {
		super();
		this.uid = uid;
		this.annualleave = annualleave;
		this.sickleave = sickleave;
		this.peronalleave = peronalleave;
		this.maternityleave = maternityleave;
		this.exchangeleave = exchangeleave;
	}
	public WorkLeave() {
		
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Double getAnnualleave() {
		return annualleave;
	}
	public void setAnnualleave(Double annualleave) {
		this.annualleave = annualleave;
	}
	public Double getSickleave() {
		return sickleave;
	}
	public void setSickleave(Double sickleave) {
		this.sickleave = sickleave;
	}
	public Double getPeronalleave() {
		return peronalleave;
	}
	public void setPeronalleave(Double peronalleave) {
		this.peronalleave = peronalleave;
	}
	public Double getMaternityleave() {
		return maternityleave;
	}
	public void setMaternityleave(Double maternityleave) {
		this.maternityleave = maternityleave;
	}
	public Double getExchangeleave() {
		return exchangeleave;
	}
	public void setExchangeleave(Double exchangeleave) {
		this.exchangeleave = exchangeleave;
	}
	@Override
	public String toString() {
		return "WorkLeave [uid=" + uid + ", annualleave=" + annualleave + ", sickleave=" + sickleave + ", peronalleave="
				+ peronalleave + ", maternityleave=" + maternityleave + ", exchangeleave=" + exchangeleave + "]";
	}
	
	
	

}
