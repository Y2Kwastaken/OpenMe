package sh.miles.openme;

import net.md_5.bungee.api.chat.BaseComponent;
import sh.miles.openme.api.OpenMeGeneric;
import sh.miles.openme.api.OpenMeProvider;
import sh.miles.openme.loader.OpenMeLoader;

/**
 * The easiest to use access point for OpenMe
 *
 * @since 1.0.0-SNAPSHOT
 */
public final class OpenMe {

    private boolean setup = false;
    private OpenMeProvider provider;

    /**
     * Sets up OpenMe
     *
     * @throws IllegalStateException thrown if OpenMe is already running
     */
    public void setup() throws IllegalStateException {
        if (setup) {
            throw new IllegalStateException("Can not setup OpenMe if it has already been setup");
        }
        OpenMeLoader.INSTANCE.activate();
        provider = OpenMeLoader.INSTANCE.openMe();
        setup = true;
    }

    /**
     * Destroys the set up OpenMe
     *
     * @throws IllegalStateException thrown if OpenMe is not running
     */
    public void destroy() throws IllegalStateException {
        if (!setup) {
            throw new IllegalStateException("Can not destroy OpenMe if it has not been setup");
        }
        OpenMeLoader.INSTANCE.disable();
    }

    public OpenMeGeneric<String> string() throws IllegalStateException {
        if (!setup) {
            throw new IllegalStateException("Can not use OpenMe if it has not been setup");
        }
        return this.provider.string();
    }

    public OpenMeGeneric<BaseComponent> bungee() throws IllegalStateException {
        if (!setup) {
            throw new IllegalStateException("Can not use OpenMe if it has not been setup");
        }
        return this.provider.bungee();
    }

}
