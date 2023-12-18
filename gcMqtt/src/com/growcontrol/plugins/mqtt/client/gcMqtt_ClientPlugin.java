package com.growcontrol.plugins.mqtt.client;

import com.growcontrol.client.plugins.gcClientPlugin;
import com.growcontrol.client.studio.gcStudio;
import com.poixson.plugins.xPluginManager;
import com.poixson.plugins.xPluginYML;


public class gcMqtt_ClientPlugin extends gcClientPlugin {



	public gcMqtt_ClientPlugin(final gcStudio client,
			final xPluginManager<gcClientPlugin> manager, final xPluginYML yml) {
		super(client, manager, yml);
	}



}
