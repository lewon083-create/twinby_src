package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import io.sentry.ISpan;
import io.sentry.ScopesAdapter;
import io.sentry.instrumentation.file.FileIOSpanManager;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryFileOutputStream extends FileOutputStream {

    @NotNull
    private final FileOutputStream delegate;

    @NotNull
    private final FileIOSpanManager spanManager;

    private static FileDescriptor getFileDescriptor(@NotNull FileOutputStream fileOutputStream) throws FileNotFoundException {
        try {
            return fileOutputStream.getFD();
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileOutputStreamInitData init(@Nullable File file, boolean z5, @Nullable FileOutputStream fileOutputStream, @NotNull IScopes iScopes) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iScopes, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z5);
        }
        return new FileOutputStreamInitData(file, z5, iSpanStartSpan, fileOutputStream, iScopes.getOptions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$write$0(int i) throws IOException {
        this.delegate.write(i);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$write$1(byte[] bArr) throws IOException {
        this.delegate.write(bArr);
        return Integer.valueOf(bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$write$2(byte[] bArr, int i, int i10) throws IOException {
        this.delegate.write(bArr, i, i10);
        return Integer.valueOf(i10);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.spanManager.finish(this.delegate);
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final int i) throws IOException {
        this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.d
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return this.f26040a.lambda$write$0(i);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.spanManager.performIO(new c(this, bArr, 2));
    }

    public SentryFileOutputStream(@Nullable String str) {
        this(str != null ? new File(str) : null, false, (IScopes) ScopesAdapter.getInstance());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i10) throws IOException {
        this.spanManager.performIO(new b(this, bArr, i, i10, 1));
    }

    public SentryFileOutputStream(@Nullable String str, boolean z5) {
        this(init(str != null ? new File(str) : null, z5, null, ScopesAdapter.getInstance()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileOutputStreamInitData init(@NotNull FileDescriptor fileDescriptor, @Nullable FileOutputStream fileOutputStream, @NotNull IScopes iScopes) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iScopes, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(fileDescriptor);
        }
        return new FileOutputStreamInitData(null, false, iSpanStartSpan, fileOutputStream, iScopes.getOptions());
    }

    public SentryFileOutputStream(@Nullable File file) {
        this(file, false, (IScopes) ScopesAdapter.getInstance());
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Factory {
        public static FileOutputStream create(@NotNull FileOutputStream fileOutputStream, @Nullable String str) {
            if (isTracingEnabled(ScopesAdapter.getInstance())) {
                return new SentryFileOutputStream(SentryFileOutputStream.init(str != null ? new File(str) : null, false, fileOutputStream, ScopesAdapter.getInstance()));
            }
            return fileOutputStream;
        }

        private static boolean isTracingEnabled(@NotNull IScopes iScopes) {
            return iScopes.getOptions().isTracingEnabled();
        }

        public static FileOutputStream create(@NotNull FileOutputStream fileOutputStream, @Nullable String str, boolean z5) {
            if (isTracingEnabled(ScopesAdapter.getInstance())) {
                return new SentryFileOutputStream(SentryFileOutputStream.init(str != null ? new File(str) : null, z5, fileOutputStream, ScopesAdapter.getInstance()));
            }
            return fileOutputStream;
        }

        public static FileOutputStream create(@NotNull FileOutputStream fileOutputStream, @Nullable File file) {
            return isTracingEnabled(ScopesAdapter.getInstance()) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, false, fileOutputStream, ScopesAdapter.getInstance())) : fileOutputStream;
        }

        public static FileOutputStream create(@NotNull FileOutputStream fileOutputStream, @Nullable File file, boolean z5) {
            return isTracingEnabled(ScopesAdapter.getInstance()) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, z5, fileOutputStream, ScopesAdapter.getInstance())) : fileOutputStream;
        }

        public static FileOutputStream create(@NotNull FileOutputStream fileOutputStream, @NotNull FileDescriptor fileDescriptor) {
            return isTracingEnabled(ScopesAdapter.getInstance()) ? new SentryFileOutputStream(SentryFileOutputStream.init(fileDescriptor, fileOutputStream, ScopesAdapter.getInstance()), fileDescriptor) : fileOutputStream;
        }

        public static FileOutputStream create(@NotNull FileOutputStream fileOutputStream, @Nullable File file, @NotNull IScopes iScopes) {
            return isTracingEnabled(iScopes) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, false, fileOutputStream, iScopes)) : fileOutputStream;
        }
    }

    public SentryFileOutputStream(@Nullable File file, boolean z5) {
        this(init(file, z5, null, ScopesAdapter.getInstance()));
    }

    public SentryFileOutputStream(@NotNull FileDescriptor fileDescriptor) {
        this(init(fileDescriptor, null, ScopesAdapter.getInstance()), fileDescriptor);
    }

    public SentryFileOutputStream(@Nullable File file, boolean z5, @NotNull IScopes iScopes) {
        this(init(file, z5, null, iScopes));
    }

    private SentryFileOutputStream(@NotNull FileOutputStreamInitData fileOutputStreamInitData, @NotNull FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.spanManager = new FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.options);
        this.delegate = fileOutputStreamInitData.delegate;
    }

    private SentryFileOutputStream(@NotNull FileOutputStreamInitData fileOutputStreamInitData) {
        super(getFileDescriptor(fileOutputStreamInitData.delegate));
        this.spanManager = new FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.options);
        this.delegate = fileOutputStreamInitData.delegate;
    }
}
