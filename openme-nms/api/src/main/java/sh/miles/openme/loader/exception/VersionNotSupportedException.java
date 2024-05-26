package sh.miles.openme.loader.exception;

import org.jetbrains.annotations.NotNull;
import sh.miles.openme.loader.MinecraftVersion;

public class VersionNotSupportedException extends RuntimeException {

    public VersionNotSupportedException(@NotNull MinecraftVersion version) {
        super("The version %s is not currently supported seek support if you believe this is a mistake".formatted(version.getInternalName()));
    }

}
