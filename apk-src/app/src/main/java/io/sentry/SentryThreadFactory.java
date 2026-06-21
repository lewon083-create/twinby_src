package io.sentry;

import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryThreadFactory {

    @NotNull
    private final SentryStackTraceFactory sentryStackTraceFactory;

    public SentryThreadFactory(@NotNull SentryStackTraceFactory sentryStackTraceFactory) {
        this.sentryStackTraceFactory = sentryStackTraceFactory;
    }

    @NotNull
    private SentryThread getSentryThread(boolean z5, @NotNull StackTraceElement[] stackTraceElementArr, @NotNull Thread thread, boolean z10) {
        List<SentryStackFrame> stackFrames;
        SentryThread sentryThread = new SentryThread();
        sentryThread.setName(thread.getName());
        sentryThread.setPriority(Integer.valueOf(thread.getPriority()));
        sentryThread.setId(Long.valueOf(thread.getId()));
        sentryThread.setDaemon(Boolean.valueOf(thread.isDaemon()));
        sentryThread.setState(thread.getState().name());
        sentryThread.setCrashed(Boolean.valueOf(z5));
        if (z10 && (stackFrames = this.sentryStackTraceFactory.getStackFrames(stackTraceElementArr, false)) != null && !stackFrames.isEmpty()) {
            SentryStackTrace sentryStackTrace = new SentryStackTrace(stackFrames);
            sentryStackTrace.setSnapshot(Boolean.TRUE);
            sentryThread.setStacktrace(sentryStackTrace);
        }
        return sentryThread;
    }

    @Nullable
    public List<SentryThread> getCurrentThread(boolean z5) {
        HashMap map = new HashMap();
        Thread threadCurrentThread = Thread.currentThread();
        map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        return getCurrentThreads(map, null, false, z5);
    }

    @Nullable
    public List<SentryThread> getCurrentThreads(@Nullable List<Long> list, boolean z5, boolean z10) {
        return getCurrentThreads(Thread.getAllStackTraces(), list, z5, z10);
    }

    @Nullable
    public List<SentryThread> getCurrentThreads(@Nullable List<Long> list, boolean z5) {
        return getCurrentThreads(Thread.getAllStackTraces(), list, false, z5);
    }

    @Nullable
    public List<SentryThread> getCurrentThreads(@NotNull Map<Thread, StackTraceElement[]> map, @Nullable List<Long> list, boolean z5, boolean z10) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread key = entry.getKey();
            arrayList.add(getSentryThread((key == threadCurrentThread && !z5) || !(list == null || !list.contains(Long.valueOf(key.getId())) || z5), entry.getValue(), entry.getKey(), z10));
        }
        return arrayList;
    }
}
