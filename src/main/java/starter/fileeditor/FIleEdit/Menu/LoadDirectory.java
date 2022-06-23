package starter.fileeditor.FIleEdit.Menu;

import org.bukkit.entity.Player;
import starter.fileeditor.FIleEdit.Paginated;

import java.io.File;

public abstract class LoadDirectory extends Paginated {

    public LoadDirectory(Player p) {
        super(p);
    }

    // ディレクトリのファイルとフォルダを返す
    public File[] getDirectory() {

        File file = new File(getRootDirectory());

        if (!(file.listFiles() == null)) {
            return file.listFiles();
        }

        return null;
    }

}
