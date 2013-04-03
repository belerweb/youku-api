/*
 * Copyright 2011 the original author or authors.    
 */
package com.belerweb.youkuapi;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * @author Jun
 *
 */
public final class YoukuAPIConfig {

	private YoukuAPIConfig() {
	}

	private static Configuration instant;

	/**
	 * @return A configuration object.
	 */
	public static Configuration getInConfiguration() {
		return instant;
	}

	static {
		try {
			instant = new PropertiesConfiguration("config.properties");

			// TODO Remove the code and make youku api runnable on android.
			System.setProperty("java.version", "1.5.0_01");
		} catch (ConfigurationException e) {
			// Ignore, because assume there is always a config.properties file.
			e.printStackTrace();
		}
	}

}
