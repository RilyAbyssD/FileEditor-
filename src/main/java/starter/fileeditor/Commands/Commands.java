package starter.fileeditor.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import starter.fileeditor.FIleEdit.Menu.EditMenu;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        EditMenu editMenu = new EditMenu(p);
        editMenu.openInventory();

        return true;
    }
}
