package com.colabriq.test.module;

import com.colabriq.endpoint.EndpointModule;

/**
 * This exists mainly so we can easily pick up properties files from the test classpath
 */
public class EndpointTestRunner {
	public static void main(String[] args) throws Exception {
		EndpointModule.main(args);
	}
}
