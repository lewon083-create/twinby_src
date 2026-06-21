package io.sentry.flutter;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import he.e;
import io.appmetrica.analytics.impl.cp;
import io.sentry.IScope;
import io.sentry.Sentry;
import io.sentry.android.replay.Recorder;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.protocol.SentryId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
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
@Metadata
public final class SentryFlutterReplayRecorder implements Recorder {

    @NotNull
    private final ReplayRecorderCallbacks callbacks;

    @NotNull
    private final ReplayIntegration integration;

    public SentryFlutterReplayRecorder(@NotNull ReplayRecorderCallbacks callbacks, @NotNull ReplayIntegration integration) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(integration, "integration");
        this.callbacks = callbacks;
        this.integration = integration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfigurationChanged$lambda$3(SentryFlutterReplayRecorder sentryFlutterReplayRecorder, ScreenshotRecorderConfig screenshotRecorderConfig) {
        try {
            sentryFlutterReplayRecorder.callbacks.replayConfigChanged(screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getFrameRate());
        } catch (Exception e3) {
            Log.w("Sentry", "Failed to propagate configuration change to Flutter", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$5(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.callbacks.replayPaused();
        } catch (Exception e3) {
            Log.w("Sentry", "Failed to pause replay recorder", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$4(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.callbacks.replayReset();
        } catch (Exception e3) {
            Log.w("Sentry", "Failed to reset replay recorder", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$2(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.callbacks.replayResumed();
        } catch (Exception e3) {
            Log.w("Sentry", "Failed to resume replay recorder", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            String string = sentryFlutterReplayRecorder.integration.getReplayId().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            d0 d0Var = new d0();
            Sentry.configureScope(new e(12, d0Var));
            sentryFlutterReplayRecorder.callbacks.replayStarted(string, d0Var.f27507b);
        } catch (Exception e3) {
            Log.w("Sentry", "Failed to start replay recorder", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1$lambda$0(d0 d0Var, IScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        d0Var.f27507b = Intrinsics.a(scope.getReplayId(), SentryId.EMPTY_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$6(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.callbacks.replayStopped();
        } catch (Exception e3) {
            Log.w("Sentry", "Failed to stop replay recorder", e3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        stop();
    }

    @Override // io.sentry.android.replay.Recorder
    public void onConfigurationChanged(@NotNull ScreenshotRecorderConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        new Handler(Looper.getMainLooper()).post(new cp(20, this, config));
    }

    @Override // io.sentry.android.replay.Recorder
    public void pause() {
        new Handler(Looper.getMainLooper()).post(new a(this, 1));
    }

    @Override // io.sentry.android.replay.Recorder
    public void reset() {
        new Handler(Looper.getMainLooper()).post(new a(this, 4));
    }

    @Override // io.sentry.android.replay.Recorder
    public void resume() {
        new Handler(Looper.getMainLooper()).post(new a(this, 3));
    }

    @Override // io.sentry.android.replay.Recorder
    public void start() {
        new Handler(Looper.getMainLooper()).post(new a(this, 0));
    }

    @Override // io.sentry.android.replay.Recorder
    public void stop() {
        new Handler(Looper.getMainLooper()).post(new a(this, 2));
    }
}
