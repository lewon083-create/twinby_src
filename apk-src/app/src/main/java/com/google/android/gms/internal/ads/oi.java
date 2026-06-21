package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oi extends PushbackInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oq0 f8694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(oq0 oq0Var, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.f8694b = oq0Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        ((com.google.android.gms.internal.measurement.i4) this.f8694b.f8764e).t();
        super.close();
    }
}
