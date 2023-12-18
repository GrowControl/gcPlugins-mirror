package com.growcontrol.plugins.arduino.server;

import com.growcontrol.server.gcServer;
import com.growcontrol.server.plugins.gcServerPlugin;
import com.poixson.plugins.xPluginManager;
import com.poixson.plugins.xPluginYML;


public class gcArduino_ServerPlugin extends gcServerPlugin {



	public gcArduino_ServerPlugin(final gcServer server,
			final xPluginManager<gcServerPlugin> manager, final xPluginYML yml) {
		super(server, manager, yml);
	}



}
