package fl;

import com.google.android.gms.internal.ads.rq;
import dl.j;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import nl.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rq f19491f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rq rqVar, long j10) {
        super(rqVar);
        this.f19491f = rqVar;
        this.f19490e = j10;
        if (j10 == 0) {
            a();
        }
    }

    @Override // fl.a, nl.x
    public final long D(g sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f19481c) {
            throw new IllegalStateException("closed");
        }
        long j11 = this.f19490e;
        if (j11 == 0) {
            return -1L;
        }
        long jD = super.D(sink, Math.min(j11, 8192L));
        if (jD == -1) {
            ((j) this.f19491f.f10021c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j12 = this.f19490e - jD;
        this.f19490e = j12;
        if (j12 == 0) {
            a();
        }
        return jD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zS;
        if (this.f19481c) {
            return;
        }
        if (this.f19490e != 0) {
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
                ((j) this.f19491f.f10021c).k();
                a();
            }
        }
        this.f19481c = true;
    }
}
