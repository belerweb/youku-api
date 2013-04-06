/*
 * Copyright 2011 the original author or authors.
 */
package com.belerweb.youkuapi.constant;

/**
 * @author Jun
 *
 */
public final class APIConstant {

  /**
   * 视频上传API:纯数据方式上传接口
   */
  public static final String API_UPLOAD = "http://api.youku.com/upload/uploadPackage?";

  /**
   * 视频分类API:获取视频分类
   */
  public static final String API_PTCATEGORY = "http://api.youku.com/api_ptcategory?";

  /**
   * 视频专辑API:按分类聚合专辑
   */
  public static final String API_PTPLAYLIST = "http://api.youku.com/api_ptplaylist?";

  /**
   * 视频专辑API:专辑详细信息
   */
  public static final String API_PTPLAYLISTINFO = "http://api.youku.com/api_ptplaylistinfo?";

  /**
   * 视频聚合API:按标签聚合视频
   */
  public static final String API_PTVIDEO_ST_1 = "http://api.youku.com/api_ptvideo/st_1?";

  /**
   * 视频聚合API:按分类聚合视频
   */
  public static final String API_PTVIDEO_ST_2 = "http://api.youku.com/api_ptvideo/st_2?";

  /**
   * 视频聚合API:按关键字聚合视频
   */
  public static final String API_PTVIDEO_ST_3 = "http://api.youku.com/api_ptvideo/st_3?";

  /**
   * 视频聚合API:按专辑聚合视频
   */
  public static final String API_PTVIDEO_ST_8 = "http://api.youku.com/api_ptvideo/st_8?";

  /**
   * 视频聚合API:按节目聚合视频
   */
  public static final String API_PTVIDEO_ST_11 = "http://api.youku.com/api_ptvideo/st_11?";

  /**
   * 视频聚合API:合作商上传的视频
   */
  public static final String API_PARTNERVIDEO = "http://api.youku.com/api_partnervideo?";

  /**
   * 视频聚合API:视频详细信息
   */
  public static final String API_PTVIDEOINFO = "http://api.youku.com/api_ptvideoinfo?";

  /**
   * 视频聚合API:相关视频
   */
  public static final String API_PTVIDEO_ST_3_STYPE_RELATED =
      "http://api.youku.com/api_ptvideo/st_3_stype_related?";

  /**
   * 视频聚合API:CMS数据源列表聚合
   */
  public static final String API_GETTOPICDSDATALIST_DS =
      "http://api.youku.com/api_getTopicDSDataList?datatp=ds&";

  /**
   * 视频聚合API:CMS数据源视频聚合
   */
  public static final String API_GETTOPICDSDATALIST =
      "http://api.youku.com/api_getTopicDSDataList?";

  /**
   * 用户API:获取用户上传视频
   */
  public static final String API_PTVIDEO_ST_5 = "http://api.youku.com/api_ptvideo/st_5?";

  /**
   * 用户API:获取用户收藏视频
   */
  public static final String API_PTVIDEO_ST_10 = "http://api.youku.com/api_ptvideo/st_10?";

  /**
   * 用户API:站外自动注册登陆
   */
  public static final String API_PTUSER_ACTION_LOGIN2 =
      "http://api.youku.com/api_ptuser/action_login2?";

  /**
   * 用户API:站外用户与优酷用户绑定
   */
  public static final String API_PTUSER_ACTION_BIND2 =
      "http://api.youku.com/api_ptuser/action_bind2?";

  /**
   * 排行/推荐API:首页推荐视频
   */
  public static final String API_GETINDEXRECVIDEOS = "http://api.youku.com/api_getIndexRecVideos?";

  /**
   * 排行/推荐API:搜索排行
   */
  public static final String API_PTKEYWORDS = "http://api.youku.com/api_ptkeywords?";

  /**
   * 排行/推荐API:热点视频
   */
  public static final String API_GETHOTVIDEOS = "http://api.youku.com/api_getHotVideos?";

}
