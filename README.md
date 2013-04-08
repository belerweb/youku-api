## Youku API ##

此项目是基于优酷面向合作方开放的API（**与现在http://dev.youku.com提供面向开发者的OpenAPI V2是不一样的**）开发的Java库。

优酷面向合作方开放的API在其官方网站上已找不到文档，但我们还可以从[**Wayback Machine**](http://web.archive.org/web/20120814163447/http://dev.youku.com/)找到2012年8月14号的快照。同时在[**http://belerweb.github.io/youku-api/**](http://belerweb.github.io/youku-api/)有一份从Wayback Machine拷贝的副本。

### 使用方法 ###
此项目已发布到Maven中央库，如果你使用在项目中使用了Maven，可以直接添加如下依赖：
```xml
	<dependency>
	    <groupId>com.belerweb</groupId>
	    <artifactId>youku-api</artifactId>
	    <version>1.0.0</version>
	</dependency>
```