package net.bukkit_plugin.kojima1021.NoChat;

import net.bukkit_plugin.kojima1021.NoChat.Event.Chat;
import net.bukkit_plugin.kojima1021.NoChat.command.MainCommand;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * NoChat メインクラス
 * @author kojima1021
 */
public class Main extends JavaPlugin implements Listener{
    //インスタンス
    private static Main instance;
    /**
     * メインクラスを取得します
     * @return instance
     */
    public static Main getInstance(){
        return instance;
    }
    //Plugin開始時
    @Override
    public void onEnable() {
        //初期設定完了
        getLogger().info("Ver.0.0.1");
        getLogger().info("Author : kojima1021");
        //コマンド登録
        getCommand("nochat").setExecutor(new MainCommand());
        //リスナー登録
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(
        		new Chat(), this);
        //インスタンス設定
        instance = this;
    }
    //Pluginun終了時
    @Override
    public void onDisable() {
        getLogger().info("プラグインを正常に終了しました。");
    }
}