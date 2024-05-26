package sh.miles.openme.nms.impl.v1_20_R4;

import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import org.bukkit.craftbukkit.v1_20_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sh.miles.openme.api.OpenMeGeneric;
import sh.miles.openme.api.exception.InventoryCreateException;
import sh.miles.openme.nms.impl.v1_20_R4.menu.MenuBuilder;

import java.util.function.BiFunction;

public class OpenMeGenericImpl<T> implements OpenMeGeneric<T> {

    private final BiFunction<AbstractContainerMenu, T, Component> titleSetter;

    public OpenMeGenericImpl(@NotNull final BiFunction<AbstractContainerMenu, T, Component> titleSetter) {
        this.titleSetter = titleSetter;
    }

    @NotNull
    @Override
    public InventoryView createGeneric9x1(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.GENERIC_9x1).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createGeneric9x2(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.GENERIC_9x2).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createGeneric9x3(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.GENERIC_9x3).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createGeneric9x4(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.GENERIC_9x4).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createGeneric9x5(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.GENERIC_9x5).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createGeneric9x6(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.GENERIC_9x6).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createGeneric3x3(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.GENERIC_3x3).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createAnvil(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.ANVIL).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createBlastFurnace(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.BLAST_FURNACE).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createBrewingStand(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.BREWING_STAND).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createCrafting(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.CRAFTING).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createEnchantment(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.ENCHANTMENT).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createFurnace(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.FURNACE).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createGrindstone(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.GRINDSTONE).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createHopper(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.HOPPER).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createLectern(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.LECTERN).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createLoom(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.LOOM).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createShulker(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.SHULKER_BOX).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createSmithing(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.SMITHING).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createSmoker(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.SMOKER).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createCartographyTable(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.CARTOGRAPHY_TABLE).getBukkitView();
    }

    @NotNull
    @Override
    public InventoryView createStoneCutter(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException {
        return create(player, title, MenuType.STONECUTTER).getBukkitView();
    }

    @NotNull
    private AbstractContainerMenu create(@NotNull final Player player, @Nullable final T title, @NotNull final MenuType<?> type) {
        final CraftPlayer craftPlayer = (CraftPlayer) player;
        final var menu = MenuBuilder.INSTANCE.build(craftPlayer, type);
        menu.checkReachable = false;
        if (title != null) {
            menu.setTitle(titleSetter.apply(menu, title));
        } else {
            menu.setTitle(Component.translatable(getDefaultTitle(type)));
        }
        return menu;
    }

    @Nullable
    private static String getDefaultTitle(MenuType<?> type) {
        String translationKey = null;
        if (type == MenuType.GENERIC_9x1 || type == MenuType.GENERIC_9x2 || type == MenuType.GENERIC_9x3) {
            translationKey = "container.chest";
        } else if (type == MenuType.GENERIC_9x4 || type == MenuType.GENERIC_9x5 || type == MenuType.GENERIC_9x6) {
            translationKey = "container.chestDouble";
        } else if (type == MenuType.GENERIC_3x3) {
            translationKey = "container.dispenser";
        } else if (type == MenuType.CRAFTER_3x3) {
            translationKey = "container.crafter";
        } else if (type == MenuType.ANVIL) {
            translationKey = "container.repair";
        } else if (type == MenuType.BEACON) {
            translationKey = "container.beacon";
        } else if (type == MenuType.BLAST_FURNACE) {
            translationKey = "container.blast_furnace";
        } else if (type == MenuType.BREWING_STAND) {
            translationKey = "container.brewing";
        } else if (type == MenuType.CRAFTING) {
            translationKey = "container.crafting";
        } else if (type == MenuType.ENCHANTMENT) {
            translationKey = "container.enchant";
        } else if (type == MenuType.FURNACE) {
            translationKey = "container.furnace";
        } else if (type == MenuType.GRINDSTONE) {
            translationKey = "container.grindstone_title";
        } else if (type == MenuType.HOPPER) {
            translationKey = "container.hopper";
        } else if (type == MenuType.LECTERN) {
            translationKey = "container.lectern";
        } else if (type == MenuType.LOOM) {
            translationKey = "container.loom";
        } else if (type == MenuType.SHULKER_BOX) {
            translationKey = "container.shulkerBox";
        } else if (type == MenuType.SMITHING) {
            translationKey = "container.upgrade";
        } else if (type == MenuType.SMOKER) {
            translationKey = "container.smoker";
        } else if (type == MenuType.CARTOGRAPHY_TABLE) {
            translationKey = "container.cartography_table";
        } else if (type == MenuType.STONECUTTER) {
            translationKey = "container.stonecutter";
        }
        return translationKey;
    }
}
