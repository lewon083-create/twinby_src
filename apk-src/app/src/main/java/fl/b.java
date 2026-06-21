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
public final class b implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f19483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq f19485d;

    public b(rq rqVar) {
        this.f19485d = rqVar;
        this.f19483b = new l(((h) rqVar.f10023e).timeout());
    }

    @Override // nl.v, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f19484c) {
            return;
        }
        this.f19484c = true;
        ((h) this.f19485d.f10023e).t("0\r\n\r\n");
        rq.i(this.f19485d, this.f19483b);
        this.f19485d.f10019a = 3;
    }

    @Override // nl.v, java.io.Flushable
    public final synchronized void flush() {
        if (this.f19484c) {
            return;
        }
        ((h) this.f19485d.f10023e).flush();
    }

    @Override // nl.v
    public final z timeout() {
        return this.f19483b;
    }

    @Override // nl.v
    public final void write(g source, long j10) {
        h hVar = (h) this.f19485d.f10023e;
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f19484c) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return;
        }
        hVar.w(j10);
        hVar.t("\r\n");
        hVar.write(source, j10);
        hVar.t("\r\n");
    }
}
