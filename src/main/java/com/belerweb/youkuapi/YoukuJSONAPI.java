/*
 * Copyright 2011 the original author or authors.
 */
package com.belerweb.youkuapi;

import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import com.belerweb.youkuapi.constant.Constant;

/**
 * @author Jun
 *
 */
public final class YoukuJSONAPI extends YoukuAPI {

  @Override
  public JSONObject searchVideoByKeyword(String[] keywords, Integer page, Integer pageSize,
      Integer orderBy, Integer[] categorieIds, Integer searchScope, String fileType,
      Integer relatedWordsNum, Boolean advanceSearch, Integer limitDate) {
    String url =
        buikdSearchVideoByKeyword(keywords, Constant.RESULT_TYPE_JSON, page, pageSize, orderBy,
            categorieIds, searchScope, fileType, relatedWordsNum, advanceSearch, limitDate);
    System.out.println("Get url : " + url);
    try {
      return new JSONObject(IOUtils.toString(new URL(url).openStream(), "UTF-8"));
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

  @Override
  public JSONObject searchVideoByTag(String[] tags, Integer page, Integer pageSize,
      Integer orderBy, Integer[] categorieIds, Integer searchScope) {
    String url =
        buikdSearchVideoByTag(tags, Constant.RESULT_TYPE_JSON, page, pageSize, orderBy,
            categorieIds, searchScope);
    System.out.println("Get url : " + url);
    try {
      return new JSONObject(IOUtils.toString(new URL(url).openStream(), "UTF-8"));
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

}
