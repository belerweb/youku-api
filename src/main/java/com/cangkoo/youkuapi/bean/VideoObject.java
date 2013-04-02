/*
 * Copyright 2011 the original author or authors.    
 */
package com.cangkoo.youkuapi.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author Jun
 *
 */
/**
 * @author Jun
 *
 */
@JsonIgnoreProperties
public class VideoObject {

	/**
	 * 视频ID，例如：XMzIwMDI2OTA4
	 */
	private String videoid;

	/**
	 * 视频标题，例如：
	 */
	private String title;

	/**
	 * 快照（图片），例如：http://g2.ykimg.com/0100641F464EB68735B3C205435F555977BEA1-D219-3A29-07AA-A6894A8A38E2
	 */
	private String snapshot;

	/**
	 * 播放地址，例如：http://v.youku.com/v_show/id_XMzIwMDI2OTA4.html
	 */
	private String playurl;

	/**
	 * 视频链接地址，例如：http://v.youku.com/v_show/id_XMzIwMDI2OTA4.html
	 */
	private String link;

	/**
	 * 描述，例如：<a href="http://v.youku.com/v_show/id_XMzIwMDI2OTA4.html" title="美国Kensington 39265 电池双充电底座" target="_blank"><img src="http://g2.ykimg.com/0100641F464EB68735B3C205435F555977BEA1-D219-3A29-07AA-A6894A8A38E2" border="0" width="120" height="90" vspace="4" hspace="4" /></a> <p>美国Kensington 39265 iPhone4电池组和</p>
	 */
	private String description;

	/**
	 * 时长，例如：02:26
	 */
	private String duration;

	/**
	 * 关键词，多个关键词英文半角逗号间隔，例如：美国,Kensington,39265,iPhone4,电池组,双充电底座,含备用电池
	 */
	private String keywords;

	/**
	 * 作者，例如：鹏曙数码专营店@taobao
	 */
	private String author;

	/**
	 * 评论网址，例如：http://v.youku.com/v_show/id_XMzIwMDI2OTA4.html#comments
	 */
	private String comments;

	/**
	 * 发布时间，例如：2011-11-06 21:35:31
	 */
	private String pubDate;

	/**
	 * GUID，例如：XMzIwMDI2OTA4
	 */
	private String guid;

	/**
	 * 视频Flash地址，例如：http://player.youku.com/player.php/partnerid/XMTI5Mgfr/sid/XMzIwMDI2OTA4/v.swf
	 */
	private String swfurl;

	/**
	 * 发布时间，例如：8分钟前
	 */
	private String pubtime;

	/**
	 * 视频所有者用户名，例如：鹏曙数码专营店@taobao
	 */
	private String ownerusername;

	/**
	 * 视频所有者链接，例如：http://u.youku.com/user_show/id_UMzUzMjA1NTg4.html
	 */
	private String owneruserlink;

	/**
	 * 例如：0
	 */
	private int uptimes;

	/**
	 * 例如：http://www.youku.com/index/img/ico_up.gif
	 */
	private String upurl;

	/**
	 * 例如：0
	 */
	private int downtimes;

	/**
	 * 例如：http://www.youku.com/index/img/ico_down.gif
	 */
	private String downurl;

	/**
	 * 播放次数，例如：7
	 */
	private int playtimes;

	/**
	 * 评论次数，例如：0
	 */
	private int commenttimes;

	/**
	 * 例如：7
	 */
	private int pv;

	/**
	 * 例如：3
	 */
	private int state;

	/**
	 * 例如：0
	 */
	private int publicType;

	/**
	 * GUIDN，例如：80006727
	 */
	private int guidn;

	/**
	 * 视频质量，例如：标清
	 */
	private String quality;

	/**
	 * 分类ID，例如：-1
	 */
	private int category;

	/**
	 * 被收藏次数，例如：7
	 */
	private int favtimes;

	public String getVideoid() {
		return videoid;
	}

	public void setVideoid(String videoid) {
		this.videoid = videoid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSnapshot() {
		return snapshot;
	}

	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getPlayurl() {
		return playurl;
	}

	public void setPlayurl(String playurl) {
		this.playurl = playurl;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getSwfurl() {
		return swfurl;
	}

	public void setSwfurl(String swfurl) {
		this.swfurl = swfurl;
	}

	public String getPubtime() {
		return pubtime;
	}

	public void setPubtime(String pubtime) {
		this.pubtime = pubtime;
	}

	public String getOwnerusername() {
		return ownerusername;
	}

	public void setOwnerusername(String ownerusername) {
		this.ownerusername = ownerusername;
	}

	public String getOwneruserlink() {
		return owneruserlink;
	}

	public void setOwneruserlink(String owneruserlink) {
		this.owneruserlink = owneruserlink;
	}

	public int getUptimes() {
		return uptimes;
	}

	public void setUptimes(int uptimes) {
		this.uptimes = uptimes;
	}

	public String getUpurl() {
		return upurl;
	}

	public void setUpurl(String upurl) {
		this.upurl = upurl;
	}

	public int getDowntimes() {
		return downtimes;
	}

	public void setDowntimes(int downtimes) {
		this.downtimes = downtimes;
	}

	public String getDownurl() {
		return downurl;
	}

	public void setDownurl(String downurl) {
		this.downurl = downurl;
	}

	public int getPlaytimes() {
		return playtimes;
	}

	public void setPlaytimes(int playtimes) {
		this.playtimes = playtimes;
	}

	public int getCommenttimes() {
		return commenttimes;
	}

	public void setCommenttimes(int commenttimes) {
		this.commenttimes = commenttimes;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getPublicType() {
		return publicType;
	}

	public void setPublicType(int publicType) {
		this.publicType = publicType;
	}

	public int getGuidn() {
		return guidn;
	}

	public void setGuidn(int guidn) {
		this.guidn = guidn;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getFavtimes() {
		return favtimes;
	}

	public void setFavtimes(int favtimes) {
		this.favtimes = favtimes;
	}

}
