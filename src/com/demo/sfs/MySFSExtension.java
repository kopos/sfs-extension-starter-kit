package com.demo.sfs;

import com.smartfoxserver.v2.extensions.SFSExtension;

public class MySFSExtension extends SFSExtension {

	public void init() {
		trace("MySFSExtension Init method fired");
		initEventHandlers();
		initClientRequestHandlers();
	}
	
	private void initEventHandlers() {
		
	}
	
	private void initClientRequestHandlers() {
		
	}

	@Override
	public void destroy() {
		trace("MySFSExtension destory fired");
	}
}
