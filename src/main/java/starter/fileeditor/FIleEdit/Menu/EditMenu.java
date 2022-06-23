package starter.fileeditor.FIleEdit.Menu;

import org.bukkit.entity.Player;
import starter.fileeditor.FIleEdit.FileManager;

public class EditMenu extends LoadDirectory {

    public EditMenu(Player p) {
        super(p);
    }

    @Override
    public void setColumns() {

        // 戻るボタン 次ボタン 終了ボタンを追加
        addPageBorder();



    }

}
