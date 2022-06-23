package starter.fileeditor.FIleEdit;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public abstract class Paginated extends FileManager {

    public Paginated(Player p) {
        super(p);
    }

    public ItemStack makeItem(Material material, String displayName, String... lore) {

        ItemStack item = new ItemStack(material);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(displayName);

        itemMeta.setLore(Arrays.asList(lore));
        item.setItemMeta(itemMeta);

        return item;
    }

    public void addPageBorder() {

        Inventory inv = Bukkit.createInventory(null, 54, "");

        setInv(inv);

        getInv().setItem(48, makeItem(Material.DARK_OAK_BUTTON, ChatColor.GREEN + "前ページ"));

        getInv().setItem(49, makeItem(Material.BARRIER, ChatColor.DARK_RED + "閉じる"));

        getInv().setItem(50, makeItem(Material.DARK_OAK_BUTTON, ChatColor.GREEN + "次ページ"));

    }

}
