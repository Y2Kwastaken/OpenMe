package sh.miles.openme.api;

import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sh.miles.openme.api.exception.InventoryCreateException;

/**
 * A Generic implementation of OpenMeProvider which provides a generic access to set a title of different types onto an OpenMeProvider
 *
 * @param <T> the type of the title
 */
public interface OpenMeGeneric<T> {

    /**
     * Creates a Generic9x1 menu for the player
     *
     * @param player the player to create the generic9x1 for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createGeneric9x1(@NotNull final Player player, @Nullable T title) throws InventoryCreateException;

    /**
     * Creates a Generic9x2 menu for the player
     *
     * @param player the player to create the generic9x2 for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createGeneric9x2(@NotNull final Player player, @Nullable T title) throws InventoryCreateException;

    /**
     * Creates a Generic9x3 menu for the player
     *
     * @param player the player to create the generic9x3 for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createGeneric9x3(@NotNull final Player player, @Nullable T title) throws InventoryCreateException;

    /**
     * Creates a Generic9x4 menu for the player
     *
     * @param player the player to create the generic9x4 for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createGeneric9x4(@NotNull final Player player, @Nullable T title) throws InventoryCreateException;

    /**
     * Creates a Generic9x5 menu for the player
     *
     * @param player the player to create the generic9x5 for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createGeneric9x5(@NotNull final Player player, @Nullable T title) throws InventoryCreateException;

    /**
     * Creates a Generic9x6 menu for the player
     *
     * @param player the player to create the generic9x6 for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createGeneric9x6(@NotNull final Player player, @Nullable T title) throws InventoryCreateException;

    /**
     * Creates a Generic3x3 menu for the player
     *
     * @param player the player to create the generic3x3 for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createGeneric3x3(@NotNull final Player player, @Nullable T title) throws InventoryCreateException;


    /**
     * Creates an anvil menu for the player
     *
     * @param player the player to create the anvil for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createAnvil(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a blast furnace menu for the player
     *
     * @param player the player to create the blast furnace for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createBlastFurnace(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a brewing stand menu for the player
     *
     * @param player the player to create the brewing stand for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createBrewingStand(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a crafting menu for the player
     *
     * @param player the player to create the crafting menu for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createCrafting(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates an enchantment table menu for the player
     *
     * @param player the player to create the enchantment table menu for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createEnchantment(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a furnace menu for the player
     *
     * @param player the player to create the furnace for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createFurnace(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a grindstone menu for the player
     *
     * @param player the player to create the grindstone for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createGrindstone(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a hopper menu for the player
     *
     * @param player the player to create the hopper for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createHopper(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a lectern menu for the player
     *
     * @param player the player to create the lectern for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createLectern(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a loom menu for the player
     *
     * @param player the player to create the loom for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createLoom(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a shulker menu for the player
     *
     * @param player the player to create the shulker for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createShulker(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a smithing menu for the player
     *
     * @param player the player to create the smithing for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createSmithing(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a smoker menu for the player
     *
     * @param player the player to create the smoker for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createSmoker(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a cartography table menu for the player
     *
     * @param player the player to create the cartography table menu for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createCartographyTable(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;

    /**
     * Creates a stonecutter menu for the player
     *
     * @param player the player to create the stonecutter menu for
     * @param title  the title
     * @return the inventory view
     * @throws InventoryCreateException if an exception occurs during inventory creation process
     */
    @NotNull
    InventoryView createStoneCutter(@NotNull final Player player, @Nullable final T title) throws InventoryCreateException;
}
