package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import io.sentry.SentryOptions;
import java.io.File;
import java.io.FileOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class FileOutputStreamInitData {
    final boolean append;

    @NotNull
    final FileOutputStream delegate;

    @Nullable
    final File file;

    @NotNull
    final SentryOptions options;

    @Nullable
    final ISpan span;

    public FileOutputStreamInitData(@Nullable File file, boolean z5, @Nullable ISpan iSpan, @NotNull FileOutputStream fileOutputStream, @NotNull SentryOptions sentryOptions) {
        this.file = file;
        this.append = z5;
        this.span = iSpan;
        this.delegate = fileOutputStream;
        this.options = sentryOptions;
    }
}
