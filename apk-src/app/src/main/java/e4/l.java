package e4;

import ad.g1;
import ad.m0;
import android.os.Handler;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable, Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f16143b = m3.z.o(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f16146e;

    public l(m mVar, long j10) {
        this.f16146e = mVar;
        this.f16144c = j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16145d = false;
        this.f16143b.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f16146e;
        m0 m0Var = mVar.f16153h;
        m0Var.q(m0Var.m(4, mVar.f16156l, g1.f796h, mVar.i));
        this.f16143b.postDelayed(this, this.f16144c);
    }
}
