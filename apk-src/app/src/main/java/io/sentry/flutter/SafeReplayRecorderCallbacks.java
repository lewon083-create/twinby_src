package io.sentry.flutter;

import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class SafeReplayRecorderCallbacks implements ReplayRecorderCallbacks {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final AtomicInteger generationCounter = new AtomicInteger(0);

    @NotNull
    private final ReplayRecorderCallbacks delegate;
    private final int generationSnapshot;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void bumpGeneration() {
            SafeReplayRecorderCallbacks.generationCounter.incrementAndGet();
        }

        public final int currentGeneration() {
            return SafeReplayRecorderCallbacks.generationCounter.get();
        }

        private Companion() {
        }
    }

    public SafeReplayRecorderCallbacks(@NotNull ReplayRecorderCallbacks delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.generationSnapshot = Companion.currentGeneration();
    }

    private final void guard(Function0<Unit> function0) {
        if (this.generationSnapshot != Companion.currentGeneration()) {
            return;
        }
        try {
            function0.invoke();
        } catch (Throwable th2) {
            Log.w("Sentry", "Replay recorder callback failed", th2);
        }
    }

    @Override // io.sentry.flutter.ReplayRecorderCallbacks
    public void replayConfigChanged(int i, int i10, int i11) {
        if (this.generationSnapshot == Companion.currentGeneration()) {
            try {
                this.delegate.replayConfigChanged(i, i10, i11);
            } catch (Throwable th2) {
                Log.w("Sentry", "Replay recorder callback failed", th2);
            }
        }
    }

    @Override // io.sentry.flutter.ReplayRecorderCallbacks
    public void replayPaused() {
        if (this.generationSnapshot == Companion.currentGeneration()) {
            try {
                this.delegate.replayPaused();
            } catch (Throwable th2) {
                Log.w("Sentry", "Replay recorder callback failed", th2);
            }
        }
    }

    @Override // io.sentry.flutter.ReplayRecorderCallbacks
    public void replayReset() {
        if (this.generationSnapshot == Companion.currentGeneration()) {
            try {
                this.delegate.replayReset();
            } catch (Throwable th2) {
                Log.w("Sentry", "Replay recorder callback failed", th2);
            }
        }
    }

    @Override // io.sentry.flutter.ReplayRecorderCallbacks
    public void replayResumed() {
        if (this.generationSnapshot == Companion.currentGeneration()) {
            try {
                this.delegate.replayResumed();
            } catch (Throwable th2) {
                Log.w("Sentry", "Replay recorder callback failed", th2);
            }
        }
    }

    @Override // io.sentry.flutter.ReplayRecorderCallbacks
    public void replayStarted(@NotNull String replayId, boolean z5) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        if (this.generationSnapshot == Companion.currentGeneration()) {
            try {
                this.delegate.replayStarted(replayId, z5);
            } catch (Throwable th2) {
                Log.w("Sentry", "Replay recorder callback failed", th2);
            }
        }
    }

    @Override // io.sentry.flutter.ReplayRecorderCallbacks
    public void replayStopped() {
        if (this.generationSnapshot == Companion.currentGeneration()) {
            try {
                this.delegate.replayStopped();
            } catch (Throwable th2) {
                Log.w("Sentry", "Replay recorder callback failed", th2);
            }
        }
    }
}
