package starter.fileeditor.FIleEdit;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public abstract class FileManager {

    // プレイヤー
    private Player p;

    // GUI用インベントリー
    private Inventory inv;

    // プレイヤーの表示しているページ数
    private int pageNumber = 0;

    // 1ページの最大要素数
    private final int MAX_ITEM_PER_PAGE = 45;

    // ルートディレクトリパス
    private final String ROOT_DIRECTORY = "plugins/";

    public FileManager(Player p) {
        p = this.p;
    }

    // ファイルエディタGUIを開く
    public void openInventory() {
        setColumns();

        p.openInventory(inv);
    }

    public abstract void setColumns();



    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setP(Player p) {
        this.p = p;
    }

    public Player getP() {
        return p;
    }

    public int getMaxItemPerPage() {
        return MAX_ITEM_PER_PAGE;
    }

    public String getRootDirectory() {
        return ROOT_DIRECTORY;
    }
}
