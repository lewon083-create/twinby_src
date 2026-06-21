package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.hints.Flushable;
import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnvelopeSender extends DirectoryProcessor implements IEnvelopeSender {

    @NotNull
    private final ILogger logger;

    @NotNull
    private final IScopes scopes;

    @NotNull
    private final ISerializer serializer;

    public EnvelopeSender(@NotNull IScopes iScopes, @NotNull ISerializer iSerializer, @NotNull ILogger iLogger, long j10, int i) {
        super(iScopes, iLogger, j10, i);
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required.");
        this.serializer = (ISerializer) Objects.requireNonNull(iSerializer, "Serializer is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processFile$0(Flushable flushable) {
        if (flushable.waitFlush()) {
            return;
        }
        this.logger.log(SentryLevel.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processFile$1(Throwable th2, File file, Retryable retryable) {
        retryable.setRetry(false);
        this.logger.log(SentryLevel.INFO, th2, "File '%s' won't retry.", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processFile$2(File file, Retryable retryable) {
        if (retryable.isRetry()) {
            this.logger.log(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            safeDelete(file, "after trying to capture it");
            this.logger.log(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    private void safeDelete(@NotNull File file, @NotNull String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.logger.log(SentryLevel.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th2) {
            this.logger.log(SentryLevel.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.DirectoryProcessor
    public boolean isRelevantFileName(@NotNull String str) {
        return str.endsWith(EnvelopeCache.SUFFIX_ENVELOPE_FILE);
    }

    @Override // io.sentry.DirectoryProcessor
    public /* bridge */ /* synthetic */ void processDirectory(@NotNull File file) {
        super.processDirectory(file);
    }

    @Override // io.sentry.IEnvelopeSender
    public void processEnvelopeFile(@NotNull String str, @NotNull Hint hint) {
        Objects.requireNonNull(str, "Path is required.");
        processFile(new File(str), hint);
    }

    @Override // io.sentry.DirectoryProcessor
    public void processFile(@NotNull File file, @NotNull Hint hint) {
        ILogger iLogger;
        e eVar;
        if (!file.isFile()) {
            this.logger.log(SentryLevel.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!isRelevantFileName(file.getName())) {
            this.logger.log(SentryLevel.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.logger.log(SentryLevel.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    SentryEnvelope sentryEnvelopeDeserializeEnvelope = this.serializer.deserializeEnvelope(bufferedInputStream);
                    if (sentryEnvelopeDeserializeEnvelope == null) {
                        this.logger.log(SentryLevel.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                    } else {
                        this.scopes.captureEnvelope(sentryEnvelopeDeserializeEnvelope, hint);
                    }
                    HintUtils.runIfHasTypeLogIfNot(hint, Flushable.class, this.logger, new b(0, this));
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e3) {
                this.logger.log(SentryLevel.ERROR, e3, "File '%s' cannot be found.", file.getAbsolutePath());
                iLogger = this.logger;
                eVar = new e(1, this, file);
                HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, iLogger, eVar);
            } catch (IOException e7) {
                this.logger.log(SentryLevel.ERROR, e7, "I/O on file '%s' failed.", file.getAbsolutePath());
                iLogger = this.logger;
                eVar = new e(1, this, file);
                HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, iLogger, eVar);
            } catch (Throwable th4) {
                this.logger.log(SentryLevel.ERROR, th4, "Failed to capture cached envelope %s", file.getAbsolutePath());
                HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, this.logger, new n(this, th4, file));
                iLogger = this.logger;
                eVar = new e(1, this, file);
                HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, iLogger, eVar);
            }
        } finally {
            HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, this.logger, new e(1, this, file));
        }
    }
}
