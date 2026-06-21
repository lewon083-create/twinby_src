package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class OptionsContainer<T> {

    @NotNull
    private final Class<T> clazz;

    private OptionsContainer(@NotNull Class<T> cls) {
        this.clazz = cls;
    }

    @NotNull
    public static <T> OptionsContainer<T> create(@NotNull Class<T> cls) {
        return new OptionsContainer<>(cls);
    }

    @NotNull
    public T createInstance() {
        return this.clazz.getDeclaredConstructor(null).newInstance(null);
    }
}
