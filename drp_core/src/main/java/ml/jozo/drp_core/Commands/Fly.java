package ml.jozo.drp_core.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("Tento příkaz může použít pouze hráč");
            return true;
        }

        Player player = (Player) sender;

        if (player.getAllowFlight()){
            player.setAllowFlight(false);
            player.sendMessage("Létání bylo vypnutu");
        } else {
            player.setAllowFlight(true);
            player.sendMessage("Létání bylo zapnuto");
        }
        return true;

    }
}
