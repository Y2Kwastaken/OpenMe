package sh.miles.openme.loader;

import com.google.common.base.Preconditions;
import sh.miles.openme.api.OpenMeProvider;
import sh.miles.openme.loader.exception.VersionNotSupportedException;
import sh.miles.openme.utility.ReflectionUtils;

/**
 * Provides Management for NMS Classes
 */
public final class OpenMeLoader {

    public static final OpenMeLoader INSTANCE = new OpenMeLoader();
    private static final String PATH = "sh.miles.openme.nms.impl.%s.%s";

    private OpenMeProvider handler;
    private boolean active = false;

    private OpenMeLoader() {
    }

    /**
     * Activates PineappleNMS and supplies a loader to the OpenMeLoader
     *
     * @throws IllegalStateException        if PineappleNMS is already active
     * @throws VersionNotSupportedException given the server is on is not supported
     * @since 1.0.0-SNAPSHOT
     */
    public void activate() throws IllegalStateException, VersionNotSupportedException {
        Preconditions.checkState(!this.active, "You can not active PineappleNMS while it is active");
        try {
            var clazz = Class.forName(PATH.formatted(MinecraftVersion.CURRENT.getProtocolVersion(), OpenMeProvider.class.getSimpleName() + "Impl"));
            this.handler = (OpenMeProvider) ReflectionUtils.safeInvoke(ReflectionUtils.getConstructor(clazz, new Class[0]));
        } catch (ClassNotFoundException e) {
            throw new VersionNotSupportedException(MinecraftVersion.CURRENT);
        }
        this.active = true;
    }

    /**
     * Disables PineappleNMS and fails all other interactions
     */
    public void disable() {
        this.handler = null;
        this.active = false;
    }

    /**
     * Verifies whether or not NMS active
     *
     * @throws IllegalStateException thrown if NMS is not active
     */
    public void verifyNMS() throws IllegalArgumentException {
        if (!this.active) {
            throw new IllegalStateException("This method can not be accessed when NMS is disabled");
        }
    }

    /**
     * Gets whether or not the OpenMeLoader is active.
     *
     * @return the boolean
     */
    public boolean isActive() {
        return this.active;
    }


    public OpenMeProvider openMe() {
        return this.handler;
    }

}
