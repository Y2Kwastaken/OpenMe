package sh.miles.openme.api.exception;

import org.jetbrains.annotations.NotNull;

public class InventoryCreateException extends IllegalStateException {

    public InventoryCreateException(@NotNull final String exception) {
        super(exception);
    }
}
