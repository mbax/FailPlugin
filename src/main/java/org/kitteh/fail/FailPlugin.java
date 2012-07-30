package org.kitteh.fail;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.plugin.java.JavaPlugin;

public class FailPlugin extends JavaPlugin {
    public final String PERM_STRING = "fail.ure";
    public final Permission PERM_OBJECT = new Permission(PERM_STRING,PermissionDefault.FALSE);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("This is message one.");
        if(sender.hasPermission(PERM_STRING)){
            sender.sendMessage("This is message two.");
        }
        this.getServer().broadcast("This is message three.", PERM_STRING);
        if(sender.hasPermission(PERM_OBJECT)){
            sender.sendMessage("This is message four.");
        }
        this.getServer().broadcastMessage("This is message five");
        sender.sendMessage("This is message six");
        return true;
    }

}
