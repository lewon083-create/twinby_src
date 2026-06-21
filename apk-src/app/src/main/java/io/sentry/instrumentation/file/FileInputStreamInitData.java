package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import io.sentry.SentryOptions;
import java.io.File;
import java.io.FileInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class FileInputStreamInitData {

    @NotNull
    final FileInputStream delegate;

    @Nullable
    final File file;

    @NotNull
    final SentryOptions options;

    @Nullable
    final ISpan span;

    public FileInputStreamInitData(@Nullable File file, @Nullable ISpan iSpan, @NotNull FileInputStream fileInputStream, @NotNull SentryOptions sentryOptions) {
        this.file = file;
        this.span = iSpan;
        this.delegate = fileInputStream;
        this.options = sentryOptions;
    }
}
