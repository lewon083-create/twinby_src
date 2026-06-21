package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryExceptionFactory {

    @NotNull
    private final SentryStackTraceFactory sentryStackTraceFactory;

    public SentryExceptionFactory(@NotNull SentryStackTraceFactory sentryStackTraceFactory) {
        this.sentryStackTraceFactory = sentryStackTraceFactory;
    }

    @NotNull
    private SentryException getSentryException(@NotNull Throwable th2, @Nullable Mechanism mechanism, @Nullable Long l10, @Nullable List<SentryStackFrame> list, boolean z5) {
        Package r02 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        SentryException sentryException = new SentryException();
        String message = th2.getMessage();
        if (r02 != null) {
            name = name.replace(r02.getName() + ".", "");
        }
        String name2 = r02 != null ? r02.getName() : null;
        if (list != null && !list.isEmpty()) {
            SentryStackTrace sentryStackTrace = new SentryStackTrace(list);
            if (z5) {
                sentryStackTrace.setSnapshot(Boolean.TRUE);
            }
            sentryException.setStacktrace(sentryStackTrace);
        }
        sentryException.setThreadId(l10);
        sentryException.setType(name);
        sentryException.setMechanism(mechanism);
        sentryException.setModule(name2);
        sentryException.setValue(message);
        return sentryException;
    }

    @NotNull
    public Deque<SentryException> extractExceptionQueue(@NotNull Throwable th2) {
        return extractExceptionQueueInternal(th2, new AtomicInteger(-1), new HashSet<>(), new ArrayDeque(), null);
    }

    public Deque<SentryException> extractExceptionQueueInternal(@NotNull Throwable th2, @NotNull AtomicInteger atomicInteger, @NotNull HashSet<Throwable> hashSet, @NotNull Deque<SentryException> deque, @Nullable String str) {
        Mechanism mechanism;
        Thread threadCurrentThread;
        Throwable th3;
        boolean zIsSnapshot;
        Deque<SentryException> deque2 = deque;
        String str2 = str;
        int i = atomicInteger.get();
        Throwable cause = th2;
        while (cause != null) {
            HashSet<Throwable> hashSet2 = hashSet;
            if (!hashSet2.add(cause)) {
                break;
            }
            if (str2 == null) {
                str2 = "chained";
            }
            int i10 = 0;
            if (cause instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) cause;
                mechanism = exceptionMechanismException.getExceptionMechanism();
                Throwable throwable = exceptionMechanismException.getThrowable();
                threadCurrentThread = exceptionMechanismException.getThread();
                zIsSnapshot = exceptionMechanismException.isSnapshot();
                th3 = throwable;
            } else {
                mechanism = new Mechanism();
                threadCurrentThread = Thread.currentThread();
                th3 = cause;
                zIsSnapshot = false;
            }
            Mechanism mechanism2 = mechanism;
            deque2.addFirst(getSentryException(th3, mechanism2, threadCurrentThread != null ? Long.valueOf(threadCurrentThread.getId()) : null, this.sentryStackTraceFactory.getStackFrames(th3.getStackTrace(), Boolean.FALSE.equals(mechanism2.isHandled())), zIsSnapshot));
            if (mechanism2.getType() == null) {
                mechanism2.setType(str2);
            }
            if (atomicInteger.get() >= 0) {
                mechanism2.setParentId(Integer.valueOf(i));
            }
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            mechanism2.setExceptionId(Integer.valueOf(iIncrementAndGet));
            Throwable[] suppressed = th3.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                while (i10 < length) {
                    extractExceptionQueueInternal(suppressed[i10], atomicInteger, hashSet2, deque2, "suppressed");
                    i10++;
                    hashSet2 = hashSet;
                    deque2 = deque;
                }
            }
            cause = th3.getCause();
            deque2 = deque;
            str2 = null;
            i = iIncrementAndGet;
        }
        return deque;
    }

    @NotNull
    public List<SentryException> getSentryExceptions(@NotNull Throwable th2) {
        return getSentryExceptions(extractExceptionQueue(th2));
    }

    @NotNull
    public List<SentryException> getSentryExceptionsFromThread(@NotNull SentryThread sentryThread, @NotNull Mechanism mechanism, @NotNull Throwable th2) {
        SentryStackTrace stacktrace = sentryThread.getStacktrace();
        if (stacktrace == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(getSentryException(th2, mechanism, sentryThread.getId(), stacktrace.getFrames(), true));
        return arrayList;
    }

    @NotNull
    private List<SentryException> getSentryExceptions(@NotNull Deque<SentryException> deque) {
        return new ArrayList(deque);
    }
}
