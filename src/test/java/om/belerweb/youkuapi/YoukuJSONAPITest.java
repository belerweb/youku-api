package om.belerweb.youkuapi;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import com.belerweb.youkuapi.YoukuJSONAPI;

public class YoukuJSONAPITest {
	YoukuJSONAPI api = new YoukuJSONAPI();

	@Test
	public void testSearchVideoByKeyword() throws Exception {
		JSONObject result;
		try {
			api.searchVideoByKeyword(null, null, null, null, null, null, null, null, null, null);
		} catch (Exception e) {
			Assert.assertTrue(e instanceof RuntimeException);
		}

		result = api.searchVideoByKeyword(new String[] { "囧" }, 0, 0, null, null, null, null, null, null, null);
		Assert.assertNotNull(result);
		Assert.assertTrue(result.getInt("pageNo") == 1);
		Assert.assertTrue(result.getInt("pageSize") == 20);
		System.out.println(result);

		result = api.searchVideoByKeyword(new String[] { "美国" }, 1, 2, null, null, null, null, null, null, null);
		Assert.assertNotNull(result);
		Assert.assertTrue(result.getInt("pageNo") == 1);
		Assert.assertTrue(result.getInt("pageSize") == 2);
		System.out.println(result);

		result = api.searchVideoByKeyword(new String[] { "囧" }, 2, 5, null, null, null, null, null, null, null);
		Assert.assertNotNull(result);
		Assert.assertTrue(result.getInt("pageNo") == 2);
		Assert.assertTrue(result.getInt("pageSize") == 5);
		System.out.println(result);
	}

	@Test
	public void testSearchVideoByTag() throws Exception {
		JSONObject result = api.searchVideoByTag(new String[] { "囧" }, 0, 0, null, null, null);
		Assert.assertNotNull(result);
		Assert.assertTrue(result.getInt("pageNo") == 1);
		Assert.assertTrue(result.getInt("pageSize") == 20);
		System.out.println(result);
	}
}
