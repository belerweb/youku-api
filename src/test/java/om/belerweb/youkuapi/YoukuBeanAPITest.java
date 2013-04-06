package om.belerweb.youkuapi;

import org.junit.Assert;
import org.junit.Test;

import com.belerweb.youkuapi.YoukuBeanAPI;
import com.belerweb.youkuapi.bean.VideoSearchResult;

public class YoukuBeanAPITest {
  YoukuBeanAPI api = new YoukuBeanAPI();

  @Test
  public void testSearchVideoByKeyword() throws Exception {
    VideoSearchResult result;
    try {
      api.searchVideoByKeyword(null, null, null, null, null, null, null, null, null, null);
    } catch (Exception e) {
      Assert.assertTrue(e instanceof RuntimeException);
    }

    result =
        api.searchVideoByKeyword(new String[] {"美国"}, 0, 0, null, null, null, null, null, null,
            null);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.getPageNo() == 1);
    Assert.assertTrue(result.getPageSize() == 20);
    System.out.println(result);

    result =
        api.searchVideoByKeyword(new String[] {"美国"}, 1, 2, null, null, null, null, null, null,
            null);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.getPageNo() == 1);
    Assert.assertTrue(result.getPageSize() == 2);
    System.out.println(result);

    result =
        api.searchVideoByKeyword(new String[] {"美国"}, 2, 5, null, null, null, null, null, null,
            null);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.getPageNo() == 2);
    Assert.assertTrue(result.getPageSize() == 5);
    System.out.println(result);
  }

  @Test
  public void testSearchVideoByTag() throws Exception {
    VideoSearchResult result = api.searchVideoByTag(new String[] {"美国"}, 0, 0, null, null, null);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.getPageNo() == 1);
    Assert.assertTrue(result.getPageSize() == 20);
    System.out.println(result);
  }

}
