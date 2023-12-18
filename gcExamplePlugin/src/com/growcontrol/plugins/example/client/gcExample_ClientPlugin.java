package com.growcontrol.plugins.example.client;

import com.growcontrol.client.plugins.gcClientPlugin;
import com.growcontrol.client.studio.gcStudio;
import com.poixson.plugins.xPluginManager;
import com.poixson.plugins.xPluginYML;


public class gcExample_ClientPlugin extends gcClientPlugin {



	public gcExample_ClientPlugin(final gcStudio client,
			final xPluginManager<gcClientPlugin> manager, final xPluginYML yml) {
		super(client, manager, yml);
	}



}
