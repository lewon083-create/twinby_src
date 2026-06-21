package io.sentry.featureflags;

import io.sentry.ISentryLifecycleToken;
import io.sentry.ScopeType;
import io.sentry.SentryOptions;
import io.sentry.protocol.FeatureFlag;
import io.sentry.protocol.FeatureFlags;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class FeatureFlagBuffer implements IFeatureFlagBuffer {

    @NotNull
    private volatile CopyOnWriteArrayList<FeatureFlagEntry> flags;

    @NotNull
    private final AutoClosableReentrantLock lock;
    private int maxSize;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class FeatureFlagEntry {

        @NotNull
        private final String flag;

        @NotNull
        private final Long nanos;
        private final boolean result;

        public FeatureFlagEntry(@NotNull String str, boolean z5, @NotNull Long l10) {
            this.flag = str;
            this.result = z5;
            this.nanos = l10;
        }

        @NotNull
        public FeatureFlag toFeatureFlag() {
            return new FeatureFlag(this.flag, this.result);
        }
    }

    private FeatureFlagBuffer(int i) {
        this.lock = new AutoClosableReentrantLock();
        this.maxSize = i;
        this.flags = new CopyOnWriteArrayList<>();
    }

    @NotNull
    public static IFeatureFlagBuffer create(@NotNull SentryOptions sentryOptions) {
        int maxFeatureFlags = sentryOptions.getMaxFeatureFlags();
        return maxFeatureFlags > 0 ? new FeatureFlagBuffer(maxFeatureFlags) : NoOpFeatureFlagBuffer.getInstance();
    }

    @NotNull
    public static IFeatureFlagBuffer merged(@NotNull SentryOptions sentryOptions, @Nullable IFeatureFlagBuffer iFeatureFlagBuffer, @Nullable IFeatureFlagBuffer iFeatureFlagBuffer2, @Nullable IFeatureFlagBuffer iFeatureFlagBuffer3) {
        int maxFeatureFlags = sentryOptions.getMaxFeatureFlags();
        if (maxFeatureFlags <= 0) {
            return NoOpFeatureFlagBuffer.getInstance();
        }
        return merged(maxFeatureFlags, iFeatureFlagBuffer instanceof FeatureFlagBuffer ? (FeatureFlagBuffer) iFeatureFlagBuffer : null, iFeatureFlagBuffer2 instanceof FeatureFlagBuffer ? (FeatureFlagBuffer) iFeatureFlagBuffer2 : null, iFeatureFlagBuffer3 instanceof FeatureFlagBuffer ? (FeatureFlagBuffer) iFeatureFlagBuffer3 : null);
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    public void add(@Nullable String str, @Nullable Boolean bool) {
        if (str == null || bool == null) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            int size = this.flags.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (this.flags.get(i).flag.equals(str)) {
                    this.flags.remove(i);
                    break;
                }
                i++;
            }
            this.flags.add(new FeatureFlagEntry(str, bool.booleanValue(), Long.valueOf(System.nanoTime())));
            if (this.flags.size() > this.maxSize) {
                this.flags.remove(0);
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
        ArrayList arrayList = new ArrayList();
        Iterator<FeatureFlagEntry> it = this.flags.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toFeatureFlag());
        }
        return new FeatureFlags(arrayList);
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IFeatureFlagBuffer m620clone() {
        return new FeatureFlagBuffer(this);
    }

    private FeatureFlagBuffer(int i, @NotNull CopyOnWriteArrayList<FeatureFlagEntry> copyOnWriteArrayList) {
        this.lock = new AutoClosableReentrantLock();
        this.maxSize = i;
        this.flags = copyOnWriteArrayList;
    }

    @NotNull
    private static IFeatureFlagBuffer merged(int i, @Nullable FeatureFlagBuffer featureFlagBuffer, @Nullable FeatureFlagBuffer featureFlagBuffer2, @Nullable FeatureFlagBuffer featureFlagBuffer3) {
        ScopeType scopeType;
        FeatureFlagEntry featureFlagEntry;
        CopyOnWriteArrayList<FeatureFlagEntry> copyOnWriteArrayList = featureFlagBuffer == null ? null : featureFlagBuffer.flags;
        CopyOnWriteArrayList<FeatureFlagEntry> copyOnWriteArrayList2 = featureFlagBuffer2 == null ? null : featureFlagBuffer2.flags;
        CopyOnWriteArrayList<FeatureFlagEntry> copyOnWriteArrayList3 = featureFlagBuffer3 == null ? null : featureFlagBuffer3.flags;
        int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
        int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
        int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
        if (size == 0 && size2 == 0 && size3 == 0) {
            return NoOpFeatureFlagBuffer.getInstance();
        }
        int i10 = size - 1;
        int i11 = size2 - 1;
        int i12 = size3 - 1;
        FeatureFlagEntry featureFlagEntry2 = (copyOnWriteArrayList == null || i10 < 0) ? null : copyOnWriteArrayList.get(i10);
        FeatureFlagEntry featureFlagEntry3 = (copyOnWriteArrayList2 == null || i11 < 0) ? null : copyOnWriteArrayList2.get(i11);
        FeatureFlagEntry featureFlagEntry4 = (copyOnWriteArrayList3 == null || i12 < 0) ? null : copyOnWriteArrayList3.get(i12);
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        while (linkedHashMap.size() < i && (featureFlagEntry2 != null || featureFlagEntry3 != null || featureFlagEntry4 != null)) {
            if (featureFlagEntry2 != null) {
                scopeType = ScopeType.GLOBAL;
                featureFlagEntry = featureFlagEntry2;
            } else {
                scopeType = null;
                featureFlagEntry = null;
            }
            if (featureFlagEntry3 != null && (featureFlagEntry == null || featureFlagEntry3.nanos.longValue() > featureFlagEntry.nanos.longValue())) {
                scopeType = ScopeType.ISOLATION;
                featureFlagEntry = featureFlagEntry3;
            }
            if (featureFlagEntry4 != null && (featureFlagEntry == null || featureFlagEntry4.nanos.longValue() > featureFlagEntry.nanos.longValue())) {
                scopeType = ScopeType.CURRENT;
                featureFlagEntry = featureFlagEntry4;
            }
            if (featureFlagEntry == null) {
                break;
            }
            if (!linkedHashMap.containsKey(featureFlagEntry.flag)) {
                linkedHashMap.put(featureFlagEntry.flag, featureFlagEntry);
            }
            if (ScopeType.CURRENT.equals(scopeType)) {
                i12--;
                featureFlagEntry4 = (copyOnWriteArrayList3 == null || i12 < 0) ? null : copyOnWriteArrayList3.get(i12);
            } else if (ScopeType.ISOLATION.equals(scopeType)) {
                i11--;
                featureFlagEntry3 = (copyOnWriteArrayList2 == null || i11 < 0) ? null : copyOnWriteArrayList2.get(i11);
            } else if (ScopeType.GLOBAL.equals(scopeType)) {
                i10--;
                featureFlagEntry2 = (copyOnWriteArrayList == null || i10 < 0) ? null : copyOnWriteArrayList.get(i10);
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        Collections.reverse(arrayList);
        return new FeatureFlagBuffer(i, new CopyOnWriteArrayList(arrayList));
    }

    private FeatureFlagBuffer(@NotNull FeatureFlagBuffer featureFlagBuffer) {
        this.lock = new AutoClosableReentrantLock();
        this.maxSize = featureFlagBuffer.maxSize;
        this.flags = new CopyOnWriteArrayList<>(featureFlagBuffer.flags);
    }
}
