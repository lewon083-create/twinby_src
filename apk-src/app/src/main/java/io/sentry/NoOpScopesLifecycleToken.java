package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpScopesLifecycleToken implements ISentryLifecycleToken {
    private static final NoOpScopesLifecycleToken instance = new NoOpScopesLifecycleToken();

    private NoOpScopesLifecycleToken() {
    }

    public static NoOpScopesLifecycleToken getInstance() {
        return instance;
    }

    @Override // io.sentry.ISentryLifecycleToken, java.lang.AutoCloseable
    public void close() {
    }
}
