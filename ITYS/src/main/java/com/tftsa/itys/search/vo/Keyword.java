package com.tftsa.itys.search.vo;

public class Keyword implements java.io.Serializable {
	private static final long serialVersionUID = 5557L;
	
	private int key_no;
	
	private String type_per;

	public Keyword() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Keyword(int key_no, String type_per) {
		super();
		this.key_no = key_no;
		this.type_per = type_per;
	}

	public int getKey_no() {
		return key_no;
	}

	public void setKey_no(int key_no) {
		this.key_no = key_no;
	}

	public String getType_per() {
		return type_per;
	}

	public void setType_per(String type_per) {
		this.type_per = type_per;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
