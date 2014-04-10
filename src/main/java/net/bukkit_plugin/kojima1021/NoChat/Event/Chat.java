package net.bukkit_plugin.kojima1021.NoChat.Event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chat implements Listener {

	@EventHandler
    public void ChatEvent(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
        if(!p.hasPermission("nochat.use")){
            p.sendMessage(ChatColor.GOLD + "[NoChat]"
            + ChatColor.RED + " あなたがチャットを打つ権限はありません。 /You do not have the right you hit the chat.(nochat.use)");
            e.setCancelled(true);
        }
    }

}