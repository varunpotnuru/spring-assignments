package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "moviedemo")
@NamedQuery(name="movie.findAll", query="SELECT m  FROM Student m") 
public class Movie
{
	@Id
	private int id;
	
	@Column(name = "Moviename")
	private String moviename;
	@Column(name = "Theatrename")
	private String theatrename;
	@Column(name= "Screenname")
	private String screenname;
	@Column(name = "Showname")
	private String showname;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getMoviename() 
	{
		return moviename;
	}
	public void setMoviename(String moviename)
	{
		this.moviename = moviename;
	}
	public String getTheatrename()
	{
		return theatrename;
	}
	public void setTheatrename(String theatrename)
	{
		this.theatrename = theatrename;
	}
	public String getScreenname()
	{
		return screenname;
	}
	public void setScreenname(String screenname)
	{
		this.screenname= screenname;
	}
	public String getShowname()
	{
		return showname;
	}
    public void setShowname(String showname)
    {
    	this.showname = showname;
    }
}
