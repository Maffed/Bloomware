package me.offeex.ofx.api.event;

import me.offeex.ofx.Main;
import me.zero.alpine.listener.Listenable;
import net.minecraft.client.MinecraftClient;

public class EventProcessor implements Listenable {
	
	public static EventProcessor instance;
	MinecraftClient mc = MinecraftClient.getInstance();

	public EventProcessor() {
		instance = this;
		Main.EVENTBUS.subscribe(this);
	}

}

//i meant prefix and help on the last commit btw lol.