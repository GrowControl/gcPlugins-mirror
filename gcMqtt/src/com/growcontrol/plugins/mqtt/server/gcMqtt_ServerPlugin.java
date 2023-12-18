package com.growcontrol.plugins.mqtt.server;

import com.growcontrol.server.plugins.gcServerPlugin;

import com.poixson.plugins.xPluginManager;
import com.poixson.plugins.xPluginYML;


public class gcMqtt_ServerPlugin extends gcServerPlugin {



	public gcMqtt_ServerPlugin(final gcServer server,
			final xPluginManager<gcServerPlugin> manager, final xPluginYML yml) {
		super(server, manager, yml);
	}



}
