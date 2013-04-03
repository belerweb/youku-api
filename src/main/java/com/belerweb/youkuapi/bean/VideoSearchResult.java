/*
 * Copyright 2011 the original author or authors.    
 */
package com.belerweb.youkuapi.bean;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author Jun
 *
 */
@JsonIgnoreProperties
public class VideoSearchResult {

	/**
	 * 来源网站，例如：www.youku.com
	 */
	private String website;

	/**
	 * 网站管理员电子邮件，例如：webmaster@youku.com
	 */
	private String webmaster;

	/**
	 * 标题，例如：优酷视频
	 */
	private String title;

	/**
	 * 描述，例如：优酷视频
	 */
	private String description;

	/**
	 * 网站链接，例如：http://www.youku.com
	 */
	private String link;

	/**
	 * 数据日期，例如：2011-11-06 07:35:24
	 */
	private String lastBuildDate;

	/**
	 * 生成工具，例如：Novajax Feed Writer
	 */
	private String generator;

	/**
	 * 视频总数
	 */
	private int total;

	/**
	 * 视频总数
	 */
	private int totalSize;

	private int currSize;

	/**
	 * 每页视频数
	 */
	private int pageSize;

	/**
	 * 页码
	 */
	private int pageNo;

	/**
	 * 网站LOGO
	 */
	private ImageObject image;

	/**
	 * 视频列表
	 */
	private List<VideoObject> item;

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getWebmaster() {
		return webmaster;
	}

	public void setWebmaster(String webmaster) {
		this.webmaster = webmaster;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getLastBuildDate() {
		return lastBuildDate;
	}

	public void setLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	public String getGenerator() {
		return generator;
	}

	public void setGenerator(String generator) {
		this.generator = generator;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int getCurrSize() {
		return currSize;
	}

	public void setCurrSize(int currSize) {
		this.currSize = currSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public ImageObject getImage() {
		return image;
	}

	public void setImage(ImageObject image) {
		this.image = image;
	}

	public List<VideoObject> getItem() {
		return item;
	}

	public void setItem(List<VideoObject> item) {
		this.item = item;
	}

}
