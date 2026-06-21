package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.util.thread.IThreadChecker;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ScreenshotUtils {
    private static final long CAPTURE_TIMEOUT_MS = 1000;

    public static Bitmap captureScreenshot(@NotNull Activity activity, @NotNull ILogger iLogger, @NotNull BuildInfoProvider buildInfoProvider) {
        return captureScreenshot(activity, AndroidThreadChecker.getInstance(), iLogger, buildInfoProvider);
    }

    public static byte[] compressBitmapToPng(Bitmap bitmap, @NotNull ILogger iLogger) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    bitmap.recycle();
                    if (byteArrayOutputStream.size() <= 0) {
                        iLogger.log(SentryLevel.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                        byteArrayOutputStream.close();
                        return null;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (Throwable th2) {
                iLogger.log(SentryLevel.ERROR, "Compressing bitmap failed.", th2);
            }
        }
        return null;
    }

    private static boolean isActivityValid(@NotNull Activity activity) {
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$captureScreenshot$0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i) {
        atomicBoolean.set(i == 0);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$captureScreenshot$1(View view, Canvas canvas, ILogger iLogger, CountDownLatch countDownLatch) {
        try {
            view.draw(canvas);
        } catch (Throwable th2) {
            try {
                iLogger.log(SentryLevel.ERROR, "Taking screenshot failed (view.draw).", th2);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public static byte[] takeScreenshot(@NotNull Activity activity, @NotNull ILogger iLogger, @NotNull BuildInfoProvider buildInfoProvider) {
        return takeScreenshot(activity, AndroidThreadChecker.getInstance(), iLogger, buildInfoProvider);
    }

    @SuppressLint({"NewApi"})
    public static byte[] takeScreenshot(@NotNull Activity activity, @NotNull IThreadChecker iThreadChecker, @NotNull ILogger iLogger, @NotNull BuildInfoProvider buildInfoProvider) {
        return compressBitmapToPng(captureScreenshot(activity, iThreadChecker, iLogger, buildInfoProvider), iLogger);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3 A[RETURN] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap captureScreenshot(@org.jetbrains.annotations.NotNull android.app.Activity r11, @org.jetbrains.annotations.NotNull io.sentry.util.thread.IThreadChecker r12, @org.jetbrains.annotations.NotNull io.sentry.ILogger r13, @org.jetbrains.annotations.NotNull io.sentry.android.core.BuildInfoProvider r14) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.ScreenshotUtils.captureScreenshot(android.app.Activity, io.sentry.util.thread.IThreadChecker, io.sentry.ILogger, io.sentry.android.core.BuildInfoProvider):android.graphics.Bitmap");
    }
}
