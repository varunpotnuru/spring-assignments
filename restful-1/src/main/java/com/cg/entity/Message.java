package com.cg.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Message {
	
	private String text;
	private Date date;
	
	public Message(String text)
	{
		super();
		this.text = text;
		this.date = new Date();
	}
	
	public Message()
	{
		
	}
	public String getText()
	{
		return text;
	}
	public void setText(String text)
	{
		this.text = text;
	}
	public Date getDate()
	{
		return date;
	}
	public void setDate(Date date)
	{
		this.date  = date;
	}
	public Message(String text,Date date)
	{
		this.text = text;
		this.date = date;
	}
	

}
