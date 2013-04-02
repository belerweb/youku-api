/*
 * Copyright 2011 the original author or authors.    
 */
package com.cangkoo.youkuapi.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author Jun
 *
 */
@JsonIgnoreProperties
public class ImageObject {

	/**
	 * 图片URL，例如：http://www.youku.com/index/img/youkulogo.gif
	 */
	private String url;

	/**
	 * 图片标题，例如：优酷网-中国第一视频网，提供视频播放，视频发布，视频搜索
	 */
	private String title;

	/**
	 * 图片点击链接，例如：http://www.youku.com
	 */
	private String link;

	/**
	 * 图片描述，例如：视频服务平台，提供视频播放，视频发布，视频搜索、视频分享
	 */
	private String description;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

}
