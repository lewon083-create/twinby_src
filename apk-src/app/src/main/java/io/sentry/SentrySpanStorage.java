package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class SentrySpanStorage {

    @Nullable
    private static volatile SentrySpanStorage INSTANCE;

    @NotNull
    private static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();

    @NotNull
    private final Map<String, ISpan> spans = new ConcurrentHashMap();

    private SentrySpanStorage() {
    }

    @NotNull
    public static SentrySpanStorage getInstance() {
        if (INSTANCE == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                if (INSTANCE == null) {
                    INSTANCE = new SentrySpanStorage();
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th2) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return INSTANCE;
    }

    @Nullable
    public ISpan get(@Nullable String str) {
        return this.spans.get(str);
    }

    @Nullable
    public ISpan removeAndGet(@Nullable String str) {
        return this.spans.remove(str);
    }

    public void store(@NotNull String str, @NotNull ISpan iSpan) {
        this.spans.put(str, iSpan);
    }
}
