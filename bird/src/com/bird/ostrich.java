package com.bird;

public class ostrich extends bird {
	private String Tweetmode;
	public ostrich(String color, int size) {
		super(color, size);
		// TODO Auto-generated constructor stub
	}
	public void shixin() {
		System.out.println("ÂéÈ¸Å£±Æ");
	}
	public String getTweetmode() {
		return Tweetmode;
	}
	public void setTweetmode(String tweetmode) {
		Tweetmode = tweetmode;
	}
}
