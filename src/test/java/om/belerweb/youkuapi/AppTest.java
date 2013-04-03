package om.belerweb.youkuapi;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import com.belerweb.youkuapi.YoukuJSONAPI;

public class AppTest {
	YoukuJSONAPI api = new YoukuJSONAPI();

	@Test
	public void testSearchVideoByKeyword() throws Exception {
		JSONObject result = api.searchVideoByKeyword(new String[] { "美女" }, 0, 0, null, null, null, null, null, null,
				null);
		Assert.assertNotNull(result);
		Assert.assertTrue(result.getInt("pageNo") == 1);
		Assert.assertTrue(result.getInt("pageSize") == 20);
		System.out.println(result);
	}
}
