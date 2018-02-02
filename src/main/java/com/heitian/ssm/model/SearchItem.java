package com.heitian.ssm.model;

public class SearchItem {

	private String label;
	private String bank;
	private Integer send;
	private Integer success;
	private Integer truesuccess;
	private Integer fail;
	private Integer unknow;
	private Integer pv;
	private Integer uv;
	private Integer ip;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public Integer getSend() {
		return send;
	}
	public void setSend(Integer send) {
		this.send = send;
	}
	public Integer getSuccess() {
		return success;
	}
	public void setSuccess(Integer success) {
		this.success = success;
	}
	public Integer getTruesuccess() {
		return truesuccess;
	}
	public void setTruesuccess(Integer truesuccess) {
		this.truesuccess = truesuccess;
	}
	public Integer getFail() {
		return fail;
	}
	public void setFail(Integer fail) {
		this.fail = fail;
	}
	public Integer getUnknow() {
		return unknow;
	}
	public void setUnknow(Integer unknow) {
		this.unknow = unknow;
	}
	public Integer getPv() {
		return pv;
	}
	public void setPv(Integer pv) {
		this.pv = pv;
	}
	public Integer getUv() {
		return uv;
	}
	public void setUv(Integer uv) {
		this.uv = uv;
	}
	public Integer getIp() {
		return ip;
	}
	public void setIp(Integer ip) {
		this.ip = ip;
	}
	
}
