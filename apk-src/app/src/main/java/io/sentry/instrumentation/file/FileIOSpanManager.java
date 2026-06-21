package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import io.sentry.ISpan;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryOptions;
import io.sentry.SentryStackTraceFactory;
import io.sentry.SpanDataConvention;
import io.sentry.SpanStatus;
import io.sentry.util.Platform;
import io.sentry.util.StringUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class FileIOSpanManager {
    private long byteCount;

    @Nullable
    private final ISpan currentSpan;

    @Nullable
    private final File file;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private SpanStatus spanStatus = SpanStatus.OK;

    @NotNull
    private final SentryStackTraceFactory stackTraceFactory;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @FunctionalInterface
    public interface FileIOCallable<T> {
        T call();
    }

    public FileIOSpanManager(@Nullable ISpan iSpan, @Nullable File file, @NotNull SentryOptions sentryOptions) {
        this.currentSpan = iSpan;
        this.file = file;
        this.options = sentryOptions;
        this.stackTraceFactory = new SentryStackTraceFactory(sentryOptions);
        SentryIntegrationPackageStorage.getInstance().addIntegration("FileIO");
    }

    private void finishSpan() {
        if (this.currentSpan != null) {
            String strByteCountToString = StringUtils.byteCountToString(this.byteCount);
            File file = this.file;
            if (file != null) {
                this.currentSpan.setDescription(getDescription(file));
                if (this.options.isSendDefaultPii()) {
                    this.currentSpan.setData("file.path", this.file.getAbsolutePath());
                }
            } else {
                this.currentSpan.setDescription(strByteCountToString);
            }
            this.currentSpan.setData("file.size", Long.valueOf(this.byteCount));
            boolean zIsMainThread = this.options.getThreadChecker().isMainThread();
            this.currentSpan.setData(SpanDataConvention.BLOCKED_MAIN_THREAD_KEY, Boolean.valueOf(zIsMainThread));
            if (zIsMainThread) {
                this.currentSpan.setData(SpanDataConvention.CALL_STACK_KEY, this.stackTraceFactory.getInAppCallStack());
            }
            this.currentSpan.finish(this.spanStatus);
        }
    }

    @NotNull
    private String getDescription(@NotNull File file) {
        String strByteCountToString = StringUtils.byteCountToString(this.byteCount);
        if (!this.options.isSendDefaultPii()) {
            int iLastIndexOf = file.getName().lastIndexOf(46);
            return (iLastIndexOf <= 0 || iLastIndexOf >= file.getName().length() + (-1)) ? pe.a.f("*** (", strByteCountToString, ")") : z.f("***", file.getName().substring(iLastIndexOf), " (", strByteCountToString, ")");
        }
        return file.getName() + " (" + strByteCountToString + ")";
    }

    @Nullable
    public static ISpan startSpan(@NotNull IScopes iScopes, @NotNull String str) {
        ISpan transaction = Platform.isAndroid() ? iScopes.getTransaction() : iScopes.getSpan();
        if (transaction != null) {
            return transaction.startChild(str);
        }
        return null;
    }

    public void finish(@NotNull Closeable closeable) {
        try {
            try {
                closeable.close();
            } catch (IOException e3) {
                this.spanStatus = SpanStatus.INTERNAL_ERROR;
                if (this.currentSpan != null) {
                    this.currentSpan.setThrowable(e3);
                }
                throw e3;
            }
        } finally {
            finishSpan();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T performIO(@NotNull FileIOCallable<T> fileIOCallable) throws IOException {
        try {
            T tCall = fileIOCallable.call();
            if (tCall instanceof Integer) {
                int iIntValue = ((Integer) tCall).intValue();
                if (iIntValue != -1) {
                    this.byteCount += (long) iIntValue;
                    return tCall;
                }
            } else if (tCall instanceof Long) {
                long jLongValue = ((Long) tCall).longValue();
                if (jLongValue != -1) {
                    this.byteCount += jLongValue;
                }
            }
            return tCall;
        } catch (IOException e3) {
            this.spanStatus = SpanStatus.INTERNAL_ERROR;
            ISpan iSpan = this.currentSpan;
            if (iSpan != null) {
                iSpan.setThrowable(e3);
            }
            throw e3;
        }
    }
}
