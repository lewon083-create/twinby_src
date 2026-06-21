package io.sentry.instrumentation.file;

import io.sentry.instrumentation.file.FileIOSpanManager;
import java.io.Closeable;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements FileIOSpanManager.FileIOCallable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Closeable f26038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f26039c;

    public /* synthetic */ c(Closeable closeable, Serializable serializable, int i) {
        this.f26037a = i;
        this.f26038b = closeable;
        this.f26039c = serializable;
    }

    @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
    public final Object call() {
        switch (this.f26037a) {
            case 0:
                return ((SentryFileInputStream) this.f26038b).lambda$read$1((byte[]) this.f26039c);
            case 1:
                return ((SentryFileInputStream) this.f26038b).lambda$read$0((AtomicInteger) this.f26039c);
            default:
                return ((SentryFileOutputStream) this.f26038b).lambda$write$1((byte[]) this.f26039c);
        }
    }
}
