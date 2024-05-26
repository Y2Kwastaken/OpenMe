package sh.miles.openme.nms.impl.v1_20_R3;

import net.md_5.bungee.api.chat.BaseComponent;
import net.minecraft.world.inventory.AbstractContainerMenu;
import org.bukkit.craftbukkit.v1_20_R3.util.CraftChatMessage;
import org.jetbrains.annotations.NotNull;
import sh.miles.openme.api.OpenMeProvider;
import sh.miles.openme.api.OpenMeGeneric;
import sh.miles.openme.nms.impl.v1_20_R3.internal.ComponentUtils;

public class OpenMeProviderImpl implements OpenMeProvider {

    private final OpenMeGeneric<String> string;
    private final OpenMeGeneric<BaseComponent> bungee;

    public OpenMeProviderImpl() {
        this.string = new OpenMeGenericImpl<>((final AbstractContainerMenu menu, final String title) -> CraftChatMessage.fromString(title)[0]);
        this.bungee = new OpenMeGenericImpl<>((final AbstractContainerMenu menu, final BaseComponent title) -> ComponentUtils.toMinecraftChat(title));
    }

    @NotNull
    @Override
    public OpenMeGeneric<String> string() {
        return this.string;
    }

    @NotNull
    @Override
    public OpenMeGeneric<BaseComponent> bungee() {
        return this.bungee;
    }
}
