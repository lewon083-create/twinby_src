package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class DefaultScopesStorage implements IScopesStorage {

    @NotNull
    private static final ThreadLocal<IScopes> currentScopes = new ThreadLocal<>();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class DefaultScopesLifecycleToken implements ISentryLifecycleToken {

        @Nullable
        private final IScopes oldValue;

        public DefaultScopesLifecycleToken(@Nullable IScopes iScopes) {
            this.oldValue = iScopes;
        }

        @Override // io.sentry.ISentryLifecycleToken, java.lang.AutoCloseable
        public void close() {
            DefaultScopesStorage.currentScopes.set(this.oldValue);
        }
    }

    @Override // io.sentry.IScopesStorage
    public void close() {
        currentScopes.remove();
    }

    @Override // io.sentry.IScopesStorage
    @Nullable
    public IScopes get() {
        return currentScopes.get();
    }

    @Override // io.sentry.IScopesStorage
    public ISentryLifecycleToken set(@Nullable IScopes iScopes) {
        IScopes iScopes2 = get();
        currentScopes.set(iScopes);
        return new DefaultScopesLifecycleToken(iScopes2);
    }

    @Override // io.sentry.IScopesStorage
    public void init() {
    }
}
