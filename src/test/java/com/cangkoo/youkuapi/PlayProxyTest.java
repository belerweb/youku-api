package com.cangkoo.youkuapi;

import org.junit.Assert;
import org.junit.Test;

import com.cangkoo.youkuapi.bean.VideoObject;
import com.cangkoo.youkuapi.bean.VideoSearchResult;

public class PlayProxyTest {

	@Test
	public void testGetVideoURL() throws Exception {
		VideoSearchResult result;
		YoukuBeanAPI api = new YoukuBeanAPI();
		try {
			api.searchVideoByKeyword(null, null, null, null, null, null, null, null, null, null);
		} catch (Exception e) {
			Assert.assertTrue(e instanceof RuntimeException);
		}

		result = api.searchVideoByKeyword(new String[] { "测试" }, 0, 0, null, null, null, null, null, null, null);
		Assert.assertNotNull(result);
		Assert.assertTrue(result.getPageNo() == 1);
		Assert.assertTrue(result.getPageSize() == 20);

		VideoObject videoObject = result.getItem().get(0);
		System.out.println("Video swf url is " + videoObject.getSwfurl());
		PlayProxy playProxy = new PlayProxy(videoObject);
		String videoURL = playProxy.getVideoURL();
		Assert.assertNotNull(videoURL);
		System.out.println(videoURL);
	}

}
