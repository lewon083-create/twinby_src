package io.sentry.android.replay.util;

import a1.c;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.ReplayRecording;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ReplayCache;
import io.sentry.rrweb.RRWebEvent;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class PersistableLinkedList extends ConcurrentLinkedDeque<RRWebEvent> {
    public static final int $stable = 8;

    @NotNull
    private final Function0<ReplayCache> cacheProvider;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final ScheduledExecutorService persistingExecutor;

    @NotNull
    private final String propertyName;

    public PersistableLinkedList(@NotNull String propertyName, @NotNull SentryOptions options, @NotNull ScheduledExecutorService persistingExecutor, @NotNull Function0<ReplayCache> cacheProvider) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(persistingExecutor, "persistingExecutor");
        Intrinsics.checkNotNullParameter(cacheProvider, "cacheProvider");
        this.propertyName = propertyName;
        this.options = options;
        this.persistingExecutor = persistingExecutor;
        this.cacheProvider = cacheProvider;
    }

    private final void persistRecording() {
        ReplayCache replayCache = (ReplayCache) this.cacheProvider.invoke();
        if (replayCache == null) {
            return;
        }
        ReplayRecording replayRecording = new ReplayRecording();
        replayRecording.setPayload(new ArrayList(this));
        if (this.options.getThreadChecker().isMainThread()) {
            this.persistingExecutor.submit(new c(this, replayRecording, replayCache, 25));
            return;
        }
        StringWriter stringWriter = new StringWriter();
        this.options.getSerializer().serialize(replayRecording, new BufferedWriter(stringWriter));
        replayCache.persistSegmentValues$sentry_android_replay_release(this.propertyName, stringWriter.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void persistRecording$lambda$1(PersistableLinkedList persistableLinkedList, ReplayRecording replayRecording, ReplayCache replayCache) {
        StringWriter stringWriter = new StringWriter();
        persistableLinkedList.options.getSerializer().serialize(replayRecording, new BufferedWriter(stringWriter));
        replayCache.persistSegmentValues$sentry_android_replay_release(persistableLinkedList.propertyName, stringWriter.toString());
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean addAll(@NotNull Collection<? extends RRWebEvent> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean zAddAll = super.addAll(elements);
        persistRecording();
        return zAddAll;
    }

    public /* bridge */ boolean contains(RRWebEvent rRWebEvent) {
        return super.contains((Object) rRWebEvent);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public boolean add(@NotNull RRWebEvent element) {
        Intrinsics.checkNotNullParameter(element, "element");
        boolean zAdd = super.add(element);
        persistRecording();
        return zAdd;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof RRWebEvent) {
            return contains((RRWebEvent) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(RRWebEvent rRWebEvent) {
        return super.remove((Object) rRWebEvent);
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof RRWebEvent) {
            return remove((RRWebEvent) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.Deque, java.util.Queue
    @NotNull
    public RRWebEvent remove() {
        RRWebEvent rRWebEvent = (RRWebEvent) super.remove();
        persistRecording();
        Intrinsics.b(rRWebEvent);
        return rRWebEvent;
    }
}
