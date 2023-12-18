package com.growcontrol.plugins.example.server;

import com.growcontrol.server.gcServer;
import com.growcontrol.server.plugins.gcServerPlugin;
import com.poixson.plugins.xPluginManager;
import com.poixson.plugins.xPluginYML;


public class gcExample_ServerPlugin extends gcServerPlugin {



	public gcExample_ServerPlugin(final gcServer server,
			final xPluginManager<gcServerPlugin> manager, final xPluginYML yml) {
		super(server, manager, yml);
	}



}
