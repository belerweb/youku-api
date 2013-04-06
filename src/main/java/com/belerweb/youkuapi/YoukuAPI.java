/*
 * Copyright 2011 the original author or authors.
 */
package com.belerweb.youkuapi;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.apache.commons.lang.StringUtils;

import com.belerweb.youkuapi.constant.APIConstant;
import com.belerweb.youkuapi.constant.Constant;
import com.belerweb.youkuapi.constant.ParameterConstant;

/**
 * @author Jun
 * 
 */
public abstract class YoukuAPI {

  /**
   * @param keywords 关键字，至少指定一个
   * @param page 页码，不小于1
   * @param pageSize 每页记录数，1-100，默认20
   * @param orderBy 排序方式，1.上传时间 2.播放数 3.评论数量 4.被收藏次数 6.相关程度
   * @param categorieIds 要查找的分类的ID，可有可无
   * @param searchScope 搜索范围，0. 全部(默认) 1. 合作商
   * @param fileType 文件格式，flvhd. 标清，hd. 高清，hd2. 超清，flv 3gp 3gphd.手机格式
   * @param relatedWordsNum 相关搜索词个数，默认0，不显示
   * @param advanceSearch 是否开启高级搜索，默认不开启
   * @param limitDate 指定时间段搜索，仅在开启高级搜索时有效，1.本日 7.本周 31.本月
   * @return 搜索结果
   */
  public abstract Object searchVideoByKeyword(String[] keywords, Integer page, Integer pageSize,
      Integer orderBy, Integer[] categorieIds, Integer searchScope, String fileType,
      Integer relatedWordsNum, Boolean advanceSearch, Integer limitDate);

  public abstract Object searchVideoByTag(String[] tags, Integer page, Integer pageSize,
      Integer orderBy, Integer[] categorieIds, Integer searchScope);

  protected String buikdSearchVideoByKeyword(String[] keywords, int returnType, Integer page,
      Integer pageSize, Integer orderBy, Integer[] categorieIds, Integer searchScope,
      String fileType, Integer relatedWordsNum, Boolean advanceSearch, Integer limitDate) {
    if (keywords == null || keywords.length == 0) {
      throw new RuntimeException("searchVideoByKeyword 至少需要一个关键词。");
    }
    ArrayList<String> tmp = new ArrayList<String>();
    tmp.add(ParameterConstant.PID + "=" + PID.getPid());
    try {
      tmp.add(ParameterConstant.SEARCH_VALUE + "="
          + URLEncoder.encode(StringUtils.join(keywords, " "), "UTF-8"));
    } catch (UnsupportedEncodingException e) {
      // Ignore exception
    }
    tmp.add(ParameterConstant.RETURN_TYPE + "=" + returnType);
    tmp.add(ParameterConstant.PAGE + "=" + ((page == null || page < 1) ? 1 : page));
    tmp.add(ParameterConstant.PAGE_SIZE + "="
        + ((pageSize == null || pageSize < 1 || pageSize > 100) ? 20 : pageSize));
    if (orderBy != null
        && (orderBy == 1 || orderBy == 2 || orderBy == 3 || orderBy == 4 || orderBy == 6)) {
      tmp.add(ParameterConstant.ORDER_BY + "=" + orderBy);
    }
    if (categorieIds != null) {
      tmp.add(ParameterConstant.CATEGORIE + "=" + StringUtils.join(categorieIds, ","));
    }
    if (searchScope != null && (searchScope == 0 || searchScope == 1)) {
      tmp.add(ParameterConstant.SEARCH_SCOPE + "=" + searchScope);
    }
    if (fileType != null && (Constant.FILETYPES.indexOf(fileType) != -1)) {
      tmp.add(ParameterConstant.FILE_TYPE + "=" + fileType);
    }
    if (relatedWordsNum != null && relatedWordsNum >= 0) {
      tmp.add(ParameterConstant.RELATED_WORDS_NUM + "=" + relatedWordsNum);
    }
    if (advanceSearch != null && advanceSearch) {
      tmp.add(ParameterConstant.ADVANCE + "=" + 1);
      if (categorieIds != null) {
        tmp.add(ParameterConstant.CATEGORIES + "=" + StringUtils.join(categorieIds, "|"));
      }
      if (limitDate != null && (limitDate == 1 || limitDate == 7 || limitDate == 31)) {
        tmp.add(ParameterConstant.LIMIT_DATE + "=" + limitDate);
      }

    }

    return APIConstant.API_PTVIDEO_ST_3 + StringUtils.join(tmp, "&");
  }

  protected String buikdSearchVideoByTag(String[] tags, int returnType, Integer page,
      Integer pageSize, Integer orderBy, Integer[] categorieIds, Integer searchScope) {
    if (tags == null || tags.length == 0) {
      throw new RuntimeException("buikdSearchVideoByTags 至少需要一个标签。");
    }
    ArrayList<String> tmp = new ArrayList<String>();
    tmp.add(ParameterConstant.PID + "=" + PID.getPid());
    try {
      tmp.add(ParameterConstant.SEARCH_VALUE + "="
          + URLEncoder.encode(StringUtils.join(tags, " "), "UTF-8"));
    } catch (UnsupportedEncodingException e) {
      // Ignore exception
    }
    tmp.add(ParameterConstant.RETURN_TYPE + "=" + returnType);
    tmp.add(ParameterConstant.PAGE + "=" + ((page == null || page < 1) ? 1 : page));
    tmp.add(ParameterConstant.PAGE_SIZE + "="
        + ((pageSize == null || pageSize < 1 || pageSize > 100) ? 20 : pageSize));
    if (orderBy != null
        && (orderBy == 1 || orderBy == 2 || orderBy == 3 || orderBy == 4 || orderBy == 6)) {
      tmp.add(ParameterConstant.ORDER_BY + "=" + orderBy);
    }
    if (categorieIds != null) {
      tmp.add(ParameterConstant.CATEGORIE + "=" + StringUtils.join(categorieIds, ","));
    }
    if (searchScope != null && (searchScope == 0 || searchScope == 1)) {
      tmp.add(ParameterConstant.SEARCH_SCOPE + "=" + searchScope);
    }

    return APIConstant.API_PTVIDEO_ST_1 + StringUtils.join(tmp, "&");
  }

}
