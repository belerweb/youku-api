/*
 * Copyright 2011 the original author or authors.
 */
package com.belerweb.youkuapi;

import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import com.belerweb.youkuapi.bean.VideoSearchResult;
import com.belerweb.youkuapi.constant.Constant;

/**
 * @author Jun
 *
 */
public final class YoukuBeanAPI extends YoukuAPI {
  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  @Override
  public VideoSearchResult searchVideoByKeyword(String[] keywords, Integer page, Integer pageSize,
      Integer orderBy, Integer[] categorieIds, Integer searchScope, String fileType,
      Integer relatedWordsNum, Boolean advanceSearch, Integer limitDate) {
    String url =
        buikdSearchVideoByKeyword(keywords, Constant.RESULT_TYPE_JSON, page, pageSize, orderBy,
            categorieIds, searchScope, fileType, relatedWordsNum, advanceSearch, limitDate);
    System.out.println("Get url : " + url);
    try {
      return OBJECT_MAPPER.readValue(new URL(url).openStream(), VideoSearchResult.class);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public VideoSearchResult searchVideoByTag(String[] tags, Integer page, Integer pageSize,
      Integer orderBy, Integer[] categorieIds, Integer searchScope) {
    String url =
        buikdSearchVideoByTag(tags, Constant.RESULT_TYPE_JSON, page, pageSize, orderBy,
            categorieIds, searchScope);
    System.out.println("Get url : " + url);
    try {
      return OBJECT_MAPPER.readValue(new URL(url).openStream(), VideoSearchResult.class);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

}
