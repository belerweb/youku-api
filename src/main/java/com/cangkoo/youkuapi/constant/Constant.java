/*
 * Copyright 2011 the original author or authors.    
 */
package com.cangkoo.youkuapi.constant;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jun
 *
 */
public final class Constant {

	/**
	 * XML result
	 */
	public static final int RESULT_TYPE_XML = 2;

	/**
	 * JSON result
	 */
	public static final int RESULT_TYPE_JSON = 3;
	/**
	 * flvhd file
	 */
	public static final String FILETYPE_FLVHD = "flvhd";
	/**
	 * hd file
	 */
	public static final String FILETYPE_HD = "hd";
	/**
	 * hd2 file
	 */
	public static final String FILETYPE_HD2 = "hd2";
	/**
	 * flv file
	 */
	public static final String FILETYPE_FLV = "flv";
	/**
	 * 3gp file
	 */
	public static final String FILETYPE_3GP = "3gp";
	/**
	 * 3gphd file
	 */
	public static final String FILETYPE_3GPHD = "3gphd";

	/**
	 * 所有文件类型
	 */
	public static final List<String> FILETYPES = Arrays.asList(new String[] { FILETYPE_FLVHD, FILETYPE_HD,
			FILETYPE_HD2, FILETYPE_FLV, FILETYPE_3GP, FILETYPE_3GPHD });

	/**
	 * 上传时间排序
	 */
	public static final int ORDER_BY_UPLOAD_TIME = 1;
	/**
	 * 播放次数排序
	 */
	public static final int ORDER_BY_PLAY_TIME = 2;
	/**
	 * 评论次排序
	 */
	public static final int ORDER_BY_COMMENT_NUMBER = 3;
	/**
	 * 是否被收藏排序
	 */
	public static final int ORDER_BY_IS_COLLECTED = 4;
	/**
	 * 相关度排序
	 */
	public static final int ORDER_BY_RELEVANCE = 6;

}
