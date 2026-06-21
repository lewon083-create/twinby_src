package fl;

import com.google.android.gms.internal.ads.rq;
import kotlin.jvm.internal.Intrinsics;
import nl.g;
import nl.h;
import nl.l;
import nl.v;
import nl.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f19492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq f19494d;

    public e(rq rqVar) {
        this.f19494d = rqVar;
        this.f19492b = new l(((h) rqVar.f10023e).timeout());
    }

    @Override // nl.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f19493c) {
            return;
        }
        this.f19493c = true;
        l lVar = this.f19492b;
        rq rqVar = this.f19494d;
        rq.i(rqVar, lVar);
        rqVar.f10019a = 3;
    }

    @Override // nl.v, java.io.Flushable
    public final void flush() {
        if (this.f19493c) {
            return;
        }
        ((h) this.f19494d.f10023e).flush();
    }

    @Override // nl.v
    public final z timeout() {
        return this.f19492b;
    }

    @Override // nl.v
    public final void write(g source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f19493c) {
            throw new IllegalStateException("closed");
        }
        long j11 = source.f29540c;
        byte[] bArr = al.b.f1041a;
        if (j10 < 0 || 0 > j11 || j11 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((h) this.f19494d.f10023e).write(source, j10);
    }
}
