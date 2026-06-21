package fl;

import com.google.android.gms.internal.ads.rq;
import dl.j;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import zk.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f19486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f19487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rq f19489h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rq rqVar, m url) {
        super(rqVar);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f19489h = rqVar;
        this.f19486e = url;
        this.f19487f = -1L;
        this.f19488g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r9.f19488g == false) goto L28;
     */
    @Override // fl.a, nl.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long D(nl.g r10, long r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.c.D(nl.g, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zS;
        if (this.f19481c) {
            return;
        }
        if (this.f19488g) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = al.b.f1041a;
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            try {
                zS = al.b.s(this, 100);
            } catch (IOException unused) {
                zS = false;
            }
            if (!zS) {
                ((j) this.f19489h.f10021c).k();
                a();
            }
        }
        this.f19481c = true;
    }
}
