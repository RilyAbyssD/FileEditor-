package starter.fileeditor;

import org.bukkit.plugin.java.JavaPlugin;
import starter.fileeditor.Commands.Commands;

public final class FileEditor extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("file").setExecutor(new Commands());



    }


}
