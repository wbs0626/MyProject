package com.sist.dao;
/*
 *   NO                                        NOT NULL NUMBER
 BNO                                                NUMBER
 ID                                        NOT NULL VARCHAR2(20)
 NAME                                      NOT NULL VARCHAR2(34)
 MSG                                       NOT NULL CLOB
 REGDATE                                            DATE
 */
import java.util.*;
public class DataBoardReplyVO {
    private int no;
    private int bno;
    private String id;
    private String name;
    private String msg;
    private Date regdate;
    private String dbday;
    
	public String getDbday() {
		return dbday;
	}
	public void setDbday(String dbday) {
		this.dbday = dbday;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
   
}
