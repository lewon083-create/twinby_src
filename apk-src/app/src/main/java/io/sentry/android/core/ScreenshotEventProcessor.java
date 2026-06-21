package io.sentry.android.core;

import a0.i1;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import io.sentry.EventProcessor;
import io.sentry.Hint;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.internal.util.Debouncer;
import io.sentry.android.core.internal.util.ScreenshotUtils;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ScreenshotEventProcessor implements EventProcessor {
    private static final int DEBOUNCE_MAX_EXECUTIONS = 3;
    private static final long DEBOUNCE_WAIT_TIME_MS = 2000;
    private static final long MASKING_TIMEOUT_MS = 2000;

    @NotNull
    private final BuildInfoProvider buildInfoProvider;
    private final boolean isReplayAvailable;

    @NotNull
    private final SentryAndroidOptions options;
    private final AtomicBoolean isReplayModuleAbsenceLogged = new AtomicBoolean(false);

    @NotNull
    private final Debouncer debouncer = new Debouncer(AndroidCurrentDateProvider.getInstance(), 2000, 3);

    public ScreenshotEventProcessor(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull BuildInfoProvider buildInfoProvider, boolean z5) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
        this.isReplayAvailable = z5;
        if (sentryAndroidOptions.isAttachScreenshot()) {
            IntegrationUtils.addIntegrationToSdkVersion("Screenshot");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062  */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Bitmap applyMasking(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r7, @org.jetbrains.annotations.NotNull io.sentry.android.replay.viewhierarchy.ViewHierarchyNode r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            io.sentry.android.replay.util.MaskRenderer r2 = new io.sentry.android.replay.util.MaskRenderer     // Catch: java.lang.Throwable -> L42
            r2.<init>()     // Catch: java.lang.Throwable -> L42
            boolean r3 = r7.isMutable()     // Catch: java.lang.Throwable -> L23
            if (r3 != 0) goto L26
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L23
            r4 = 1
            android.graphics.Bitmap r3 = r7.copy(r3, r4)     // Catch: java.lang.Throwable -> L23
            if (r3 != 0) goto L21
            r7.recycle()     // Catch: java.lang.Throwable -> L1f
            r2.close()     // Catch: java.lang.Throwable -> L1d
            return r0
        L1d:
            r8 = move-exception
            goto L44
        L1f:
            r8 = move-exception
            goto L39
        L21:
            r1 = r4
            goto L27
        L23:
            r8 = move-exception
            r3 = r7
            goto L39
        L26:
            r3 = r7
        L27:
            r2.renderMasks(r3, r8, r0)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L35
            boolean r8 = r7.isRecycled()     // Catch: java.lang.Throwable -> L1f
            if (r8 != 0) goto L35
            r7.recycle()     // Catch: java.lang.Throwable -> L1f
        L35:
            r2.close()     // Catch: java.lang.Throwable -> L1d
            return r3
        L39:
            r2.close()     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r2 = move-exception
            r8.addSuppressed(r2)     // Catch: java.lang.Throwable -> L1d
        L41:
            throw r8     // Catch: java.lang.Throwable -> L1d
        L42:
            r8 = move-exception
            r3 = r7
        L44:
            io.sentry.android.core.SentryAndroidOptions r2 = r6.options
            io.sentry.ILogger r2 = r2.getLogger()
            io.sentry.SentryLevel r4 = io.sentry.SentryLevel.ERROR
            java.lang.String r5 = "Failed to mask screenshot"
            r2.log(r4, r5, r8)
            if (r1 == 0) goto L5c
            boolean r8 = r3.isRecycled()
            if (r8 != 0) goto L5c
            r3.recycle()
        L5c:
            boolean r8 = r7.isRecycled()
            if (r8 != 0) goto L65
            r7.recycle()
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.ScreenshotEventProcessor.applyMasking(android.graphics.Bitmap, io.sentry.android.replay.viewhierarchy.ViewHierarchyNode):android.graphics.Bitmap");
    }

    @Nullable
    private ViewHierarchyNode buildViewHierarchy(@NotNull Activity activity) {
        try {
            View rootView = (activity.getWindow() == null || activity.getWindow().peekDecorView() == null || activity.getWindow().peekDecorView().getRootView() == null) ? null : activity.getWindow().peekDecorView().getRootView();
            if (rootView == null) {
                return null;
            }
            ViewHierarchyNode viewHierarchyNodeFromView = ViewHierarchyNode.Companion.fromView(rootView, null, 0, this.options.getScreenshot());
            ViewsKt.traverse(rootView, viewHierarchyNodeFromView, this.options.getScreenshot(), this.options.getLogger(), null);
            return viewHierarchyNodeFromView;
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to build view hierarchy", th2);
            return null;
        }
    }

    @Nullable
    private ViewHierarchyNode captureViewHierarchy(@NotNull Activity activity) {
        ScreenshotEventProcessor screenshotEventProcessor;
        if (this.options.getThreadChecker().isMainThread()) {
            return buildViewHierarchy(activity);
        }
        AtomicReference atomicReference = new AtomicReference(null);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            screenshotEventProcessor = this;
        } catch (Throwable th2) {
            th = th2;
            screenshotEventProcessor = this;
        }
        try {
            activity.runOnUiThread(new i1(screenshotEventProcessor, atomicReference, activity, countDownLatch, 9));
            if (countDownLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                return (ViewHierarchyNode) atomicReference.get();
            }
            screenshotEventProcessor.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting for view hierarchy capture on main thread", new Object[0]);
            return null;
        } catch (Throwable th3) {
            th = th3;
            screenshotEventProcessor.options.getLogger().log(SentryLevel.ERROR, "Failed to capture view hierarchy", th);
            return null;
        }
    }

    private boolean isMaskingEnabled() {
        return !this.options.getScreenshot().getMaskViewClasses().isEmpty() && this.isReplayAvailable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$captureViewHierarchy$1(AtomicReference atomicReference, Activity activity, CountDownLatch countDownLatch) {
        try {
            atomicReference.set(buildViewHierarchy(activity));
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] lambda$process$0(Bitmap bitmap) {
        return ScreenshotUtils.compressBitmapToPng(bitmap, this.options.getLogger());
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public Long getOrder() {
        return 10000L;
    }

    @Override // io.sentry.EventProcessor
    @NotNull
    public SentryTransaction process(@NotNull SentryTransaction sentryTransaction, @NotNull Hint hint) {
        return sentryTransaction;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3 A[PHI: r2
      0x00a3: PHI (r2v6 android.graphics.Bitmap) = (r2v5 android.graphics.Bitmap), (r2v8 android.graphics.Bitmap) binds: [B:33:0x0090, B:39:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // io.sentry.EventProcessor
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.SentryEvent process(@org.jetbrains.annotations.NotNull io.sentry.SentryEvent r6, @org.jetbrains.annotations.NotNull io.sentry.Hint r7) {
        /*
            r5 = this;
            boolean r0 = r6.isErrored()
            if (r0 != 0) goto L8
            goto Lb9
        L8:
            io.sentry.android.core.SentryAndroidOptions r0 = r5.options
            boolean r0 = r0.isAttachScreenshot()
            r1 = 0
            if (r0 != 0) goto L21
            io.sentry.android.core.SentryAndroidOptions r7 = r5.options
            io.sentry.ILogger r7 = r7.getLogger()
            io.sentry.SentryLevel r0 = io.sentry.SentryLevel.DEBUG
            java.lang.String r2 = "attachScreenshot is disabled."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r7.log(r0, r2, r1)
            return r6
        L21:
            boolean r0 = r5.isReplayAvailable
            if (r0 != 0) goto L4e
            io.sentry.android.core.SentryAndroidOptions r0 = r5.options
            io.sentry.android.core.SentryScreenshotOptions r0 = r0.getScreenshot()
            java.util.Set r0 = r0.getMaskViewClasses()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4e
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.isReplayModuleAbsenceLogged
            r0 = 1
            boolean r7 = r7.getAndSet(r0)
            if (r7 != 0) goto Lb9
            io.sentry.android.core.SentryAndroidOptions r7 = r5.options
            io.sentry.ILogger r7 = r7.getLogger()
            io.sentry.SentryLevel r0 = io.sentry.SentryLevel.WARNING
            java.lang.String r2 = "Screenshot masking requires sentry-android-replay module"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r7.log(r0, r2, r1)
            return r6
        L4e:
            io.sentry.android.core.CurrentActivityHolder r0 = io.sentry.android.core.CurrentActivityHolder.getInstance()
            android.app.Activity r0 = r0.getActivity()
            if (r0 == 0) goto Lb9
            boolean r2 = io.sentry.util.HintUtils.isFromHybridSdk(r7)
            if (r2 == 0) goto L5f
            goto Lb9
        L5f:
            io.sentry.android.core.internal.util.Debouncer r2 = r5.debouncer
            boolean r2 = r2.checkForDebounce()
            io.sentry.android.core.SentryAndroidOptions r3 = r5.options
            io.sentry.android.core.SentryAndroidOptions$BeforeCaptureCallback r3 = r3.getBeforeScreenshotCaptureCallback()
            if (r3 == 0) goto L74
            boolean r2 = r3.execute(r6, r7, r2)
            if (r2 != 0) goto L77
            goto Lb9
        L74:
            if (r2 == 0) goto L77
            goto Lb9
        L77:
            io.sentry.android.core.SentryAndroidOptions r2 = r5.options
            io.sentry.util.thread.IThreadChecker r2 = r2.getThreadChecker()
            io.sentry.android.core.SentryAndroidOptions r3 = r5.options
            io.sentry.ILogger r3 = r3.getLogger()
            io.sentry.android.core.BuildInfoProvider r4 = r5.buildInfoProvider
            android.graphics.Bitmap r2 = io.sentry.android.core.internal.util.ScreenshotUtils.captureScreenshot(r0, r2, r3, r4)
            if (r2 != 0) goto L8c
            goto Lb9
        L8c:
            boolean r3 = r5.isMaskingEnabled()
            if (r3 == 0) goto La3
            io.sentry.android.replay.viewhierarchy.ViewHierarchyNode r3 = r5.captureViewHierarchy(r0)
            if (r3 != 0) goto L9c
            r2.recycle()
            return r6
        L9c:
            android.graphics.Bitmap r2 = r5.applyMasking(r2, r3)
            if (r2 != 0) goto La3
            goto Lb9
        La3:
            io.sentry.android.core.q r3 = new io.sentry.android.core.q
            r4 = 1
            r3.<init>(r5, r2, r4)
            java.lang.String r2 = "screenshot.png"
            java.lang.String r4 = "image/png"
            io.sentry.Attachment r1 = io.sentry.Attachment.fromByteProvider(r3, r2, r4, r1)
            r7.setScreenshot(r1)
            java.lang.String r1 = "android:activity"
            r7.set(r1, r0)
        Lb9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.ScreenshotEventProcessor.process(io.sentry.SentryEvent, io.sentry.Hint):io.sentry.SentryEvent");
    }
}
