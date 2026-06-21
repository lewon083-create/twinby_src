package io.sentry;

import io.sentry.protocol.SentryStackFrame;
import io.sentry.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryStackTraceFactory {
    private static final int STACKTRACE_FRAME_LIMIT = 100;

    @NotNull
    private final SentryOptions options;

    public SentryStackTraceFactory(@NotNull SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Nullable
    public static Boolean isInApp(@Nullable String str, @NotNull List<String> list, @NotNull List<String> list2) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getInAppCallStack$0(SentryStackFrame sentryStackFrame) {
        return Boolean.TRUE.equals(sentryStackFrame.isInApp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getInAppCallStack$1(SentryStackFrame sentryStackFrame) {
        String module = sentryStackFrame.getModule();
        boolean z5 = false;
        if (module != null && (module.startsWith("sun.") || module.startsWith("java.") || module.startsWith("android.") || module.startsWith("com.android."))) {
            z5 = true;
        }
        return !z5;
    }

    @NotNull
    public List<SentryStackFrame> getInAppCallStack(@NotNull Throwable th2) {
        List<SentryStackFrame> stackFrames = getStackFrames(th2.getStackTrace(), false);
        if (stackFrames == null) {
            return Collections.EMPTY_LIST;
        }
        List<SentryStackFrame> listFilterListEntries = CollectionUtils.filterListEntries(stackFrames, new f(6));
        return !listFilterListEntries.isEmpty() ? listFilterListEntries : CollectionUtils.filterListEntries(stackFrames, new f(7));
    }

    @Nullable
    public List<SentryStackFrame> getStackFrames(@Nullable StackTraceElement[] stackTraceElementArr, boolean z5) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z5 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    SentryStackFrame sentryStackFrame = new SentryStackFrame();
                    sentryStackFrame.setInApp(isInApp(className));
                    sentryStackFrame.setModule(className);
                    sentryStackFrame.setFunction(stackTraceElement.getMethodName());
                    sentryStackFrame.setFilename(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        sentryStackFrame.setLineno(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    sentryStackFrame.setNative(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(sentryStackFrame);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    @NotNull
    public List<SentryStackFrame> getInAppCallStack() {
        return getInAppCallStack(new Exception());
    }

    @Nullable
    public Boolean isInApp(@Nullable String str) {
        return isInApp(str, this.options.getInAppIncludes(), this.options.getInAppExcludes());
    }
}
