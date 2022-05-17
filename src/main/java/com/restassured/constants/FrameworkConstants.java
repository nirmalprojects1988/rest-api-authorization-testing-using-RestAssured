package com.restassured.constants;

public final class FrameworkConstants {
	
	
	private FrameworkConstants() {
		
	}
	
	private static final String BAISC_AUTH_URI="basic-auth";
	private static final String DIGEST_AUTH_URI="digest-auth";
	private static final String RESOURCEPATH=System.getProperty("user.dir")+"/src/test/resources";
	private static final String CONFIGFILEPATH=RESOURCEPATH+"/config/Framework.properties";
	private static final String SIGNATURE_METHOD="HMAC-SHAI";
	private static final String CONSUMER_KEY="RKCGzna7bv9YD57c";
	private static final String CONSUMER_SECRET="D+EdQ-gs$-%@2Nu7";
	private static final String OAUTH1_URI="oauth1";
	
	public static String getOauth1Uri() {
		return OAUTH1_URI;
	}

	public static String getConsumerSecret() {
		return CONSUMER_SECRET;
	}

	public static String getConsumerKey() {
		return CONSUMER_KEY;
	}

	public static String getSignatureMethod() {
		return SIGNATURE_METHOD;
	}

	public static String getDigestAuthUri() {
		return DIGEST_AUTH_URI;
	}

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}
	
	public static String getBasicauthURI() {
		return BAISC_AUTH_URI;
	}
	
	
	
}
