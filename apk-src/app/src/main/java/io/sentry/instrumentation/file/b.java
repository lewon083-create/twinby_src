package io.sentry.instrumentation.file;

import io.sentry.instrumentation.file.FileIOSpanManager;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements FileIOSpanManager.FileIOCallable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f26033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Closeable f26036e;

    public /* synthetic */ b(Closeable closeable, byte[] bArr, int i, int i10, int i11) {
        this.f26032a = i11;
        this.f26036e = closeable;
        this.f26033b = bArr;
        this.f26034c = i;
        this.f26035d = i10;
    }

    @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
    public final Object call() {
        switch (this.f26032a) {
            case 0:
                return ((SentryFileInputStream) this.f26036e).lambda$read$2(this.f26033b, this.f26034c, this.f26035d);
            default:
                return ((SentryFileOutputStream) this.f26036e).lambda$write$2(this.f26033b, this.f26034c, this.f26035d);
        }
    }
}
