/*
 * Copyright 2011 the original author or authors.
 */
package com.belerweb.youkuapi;


/**
 * @author Jun
 * 
 */
public final class PID {

  private static String pid;

  /**
   * Get Pattern ID
   * 
   * @return PID
   */
  public static String getPid() {
    if (pid == null) {
      pid = System.getenv("Youku.PID");
    }
    if (pid == null) {
      pid = System.getProperty("Youku.PID");
    }
    if (pid == null) {
      throw new RuntimeException("No Youku.PID config.");
    }
    return pid;
  }

}
