package sh.miles.openme.api;

import net.md_5.bungee.api.chat.BaseComponent;
import org.jetbrains.annotations.NotNull;

/**
 * The default entry point for OpenMeProvider
 *
 * @since 1.0.0-SNAPSHOT
 */
public interface OpenMeProvider {

    /**
     * Gets the OpenMeProvider implementation for legacy strings
     *
     * @return the OpenMeGeneric implementation for legacy strings
     * @since 1.0.0-SNAPSHOT
     */
    @NotNull
    OpenMeGeneric<String> string();

    /**
     * Gets the OpenMeProvider implementation for Bungee Chat
     *
     * @return the OpenMeGeneric implementation for Bungee Chat
     * @since 1.0.0-SNAPSHOT
     */
    @NotNull
    OpenMeGeneric<BaseComponent> bungee();

}
