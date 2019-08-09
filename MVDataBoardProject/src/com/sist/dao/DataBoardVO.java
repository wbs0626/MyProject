package com.sist.dao;
import java.util.*;
/*
 *     Oracle 
 *     ������
 *       CHAR(1~2000byte)
 *       VARCHAR2(1~4000byte)
 *       CLOB(4GB) ==================> String (9i => InputStream, 10g~ String) 12c,18c
 *                                     => �������  => i , g , c
 *     ������
 *       NUMBER(10) 
 *       NUMBER(7,2) ================> int,double
 *     ��¥��
 *       DATE        ================> java.util.Date
 *       TIMESTAMP
 *     ��Ÿ�� ===> �̹���(�׸�),�ִϸ��̼�,������ (4GB)
 *       BLOB : binary
 *       BFILE  =====================> InputStream (file����)
 */
public class DataBoardVO {
    private int no;
    private String name;
    private String subject;
    private String content;
    private String pwd;
    private Date regdate;
    private int hit;
    private String filename;
    private int filesize;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getFilesize() {
		return filesize;
	}
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}
	   
}
