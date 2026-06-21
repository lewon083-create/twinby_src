package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import java.io.File;
import java.io.FileDescriptor;
import java.io.OutputStreamWriter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryFileWriter extends OutputStreamWriter {
    public SentryFileWriter(@NotNull String str) {
        super(new SentryFileOutputStream(str));
    }

    public SentryFileWriter(@NotNull String str, boolean z5) {
        super(new SentryFileOutputStream(str, z5));
    }

    public SentryFileWriter(@NotNull File file) {
        super(new SentryFileOutputStream(file));
    }

    public SentryFileWriter(@NotNull File file, boolean z5) {
        super(new SentryFileOutputStream(file, z5));
    }

    public SentryFileWriter(@NotNull FileDescriptor fileDescriptor) {
        super(new SentryFileOutputStream(fileDescriptor));
    }

    public SentryFileWriter(@NotNull File file, boolean z5, @NotNull IScopes iScopes) {
        super(new SentryFileOutputStream(file, z5, iScopes));
    }
}
