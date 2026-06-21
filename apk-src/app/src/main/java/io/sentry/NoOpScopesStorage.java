package io.sentry;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpScopesStorage implements IScopesStorage {
    private static final NoOpScopesStorage instance = new NoOpScopesStorage();

    private NoOpScopesStorage() {
    }

    public static NoOpScopesStorage getInstance() {
        return instance;
    }

    @Override // io.sentry.IScopesStorage
    @Nullable
    public IScopes get() {
        return NoOpScopes.getInstance();
    }

    @Override // io.sentry.IScopesStorage
    public ISentryLifecycleToken set(@Nullable IScopes iScopes) {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopesStorage
    public void close() {
    }

    @Override // io.sentry.IScopesStorage
    public void init() {
    }
}
