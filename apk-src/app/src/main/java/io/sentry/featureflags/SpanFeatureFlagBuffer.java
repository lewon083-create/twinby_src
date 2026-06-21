package io.sentry.featureflags;

import io.sentry.ISentryLifecycleToken;
import io.sentry.protocol.FeatureFlag;
import io.sentry.protocol.FeatureFlags;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SpanFeatureFlagBuffer implements IFeatureFlagBuffer {
    private static final int MAX_SIZE = 10;

    @Nullable
    private Map<String, Boolean> flags = null;

    @NotNull
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    private SpanFeatureFlagBuffer() {
    }

    @NotNull
    public static IFeatureFlagBuffer create() {
        return new SpanFeatureFlagBuffer();
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    public void add(@Nullable String str, @Nullable Boolean bool) {
        if (str == null || bool == null) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.flags == null) {
                this.flags = new LinkedHashMap(10);
            }
            if (this.flags.size() < 10 || this.flags.containsKey(str)) {
                this.flags.put(str, bool);
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

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    @Nullable
    public FeatureFlags getFeatureFlags() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            Map<String, Boolean> map = this.flags;
            if (map != null && !map.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.flags.size());
                for (Map.Entry<String, Boolean> entry : this.flags.entrySet()) {
                    arrayList.add(new FeatureFlag(entry.getKey(), entry.getValue().booleanValue()));
                }
                FeatureFlags featureFlags = new FeatureFlags(arrayList);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return featureFlags;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return null;
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

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IFeatureFlagBuffer m622clone() {
        return create();
    }
}
