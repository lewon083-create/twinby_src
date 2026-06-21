package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.appsflyer.internal.m;
import io.sentry.protocol.SentryThread;
import io.sentry.util.thread.IThreadChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidThreadChecker implements IThreadChecker {
    private static final AndroidThreadChecker instance = new AndroidThreadChecker();
    public static volatile long mainThreadSystemId = Process.myTid();

    private AndroidThreadChecker() {
        new Handler(Looper.getMainLooper()).post(new m(4));
    }

    public static AndroidThreadChecker getInstance() {
        return instance;
    }

    public static long getThreadId(@NotNull Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0() {
        mainThreadSystemId = Process.myTid();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public long currentThreadSystemId() {
        return Process.myTid();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    @NotNull
    public String getCurrentThreadName() {
        return isMainThread() ? SentryThread.JsonKeys.MAIN : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(long j10) {
        return getThreadId(Looper.getMainLooper().getThread()) == j10;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(@NotNull Thread thread) {
        return isMainThread(getThreadId(thread));
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread() {
        return isMainThread(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(@NotNull SentryThread sentryThread) {
        Long id2 = sentryThread.getId();
        return id2 != null && isMainThread(id2.longValue());
    }
}
