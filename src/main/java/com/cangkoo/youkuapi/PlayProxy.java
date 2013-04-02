package com.cangkoo.youkuapi;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import com.cangkoo.youkuapi.bean.VideoObject;

@SuppressWarnings("rawtypes")
public class PlayProxy {

	private static final String PLAY_LIST_URL = "http://v.youku.com/player/getPlayList";

	private static final String BASE_VIDEO_URL = "http://f.youku.com/player/getFlvPath";

	private VideoObject video;

	public PlayProxy(VideoObject videoObject) {
		this.video = videoObject;
	}

	public String getVideoURL() {
		try {
			JSONObject playLitData = getPlayListDate();
			String url = BASE_VIDEO_URL
					+ "/sid/"
					+ (new Date().getTime() + "" + (1000 + new Date().getTime() % 1000) + "" + ((int) (Math.random() * 9000) + 1000))
					+ "_00";
			JSONObject data = playLitData.getJSONArray("data").getJSONObject(0);
			JSONObject streamfileids = data.getJSONObject("streamfileids");
			if (streamfileids == null || streamfileids.length() == 0) {
				throw new RuntimeException("No streamfileids found or streamfileids is empty.");
			}
			Iterator keys = streamfileids.keys();
			String key = (String) keys.next();
			url = url + "/st/" + (key.equals("hd2") ? "flv" : key);
			url = url + "/fileid/" + new RandomProxy(data.getInt("seed")).cgHun(streamfileids.getString(key));

			JSONArray segs = data.getJSONObject("segs").getJSONArray(key);
			int ts = 0;
			if (segs != null && segs.length() > 0) {
				JSONObject seg = segs.getJSONObject(0);
				ts = seg.getInt("seconds");
				String k = seg.getString("k");
				if (StringUtils.isEmpty(k)) {
					k = data.getString("key2")
							+ Long.toHexString(Long.parseLong(data.getString("key1"), 16)
									^ Long.parseLong("A55AA5A5", 16));
				}
				url = url + "?K=" + k;
			}

			if (key.equals("flv") || key.equals("flvhd")) {
				url = url + "&hd=0";
			} else if (key.equals("mp4")) {
				url = url + "&hd=1";
			} else if (key.equals("hd2")) {
				url = url + "&hd=2";
			}

			url = url + "&myp=0";
			url = url + "&ts=" + ts;
			System.out.println("Video proxy url is " + url);

			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			connection.setInstanceFollowRedirects(false);
			String videoUrl = connection.getHeaderField("Location");
			System.out.println("Get video real url : " + videoUrl);
			return videoUrl;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private JSONObject getPlayListDate() {
		try {
			String url = PLAY_LIST_URL + "/VideoIDS/" + video.getVideoid() + "/timezone/+08/version/5/source/out"
					+ "?ran=" + ((int) (Math.random() * 9999)) + "&password=" + "&n=3";
			System.out.println("Video data url is " + url);
			return new JSONObject(IOUtils.toString(new URL(url).openStream(), "UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
