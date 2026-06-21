package gl;

import io.sentry.ProfilingTraceData;
import java.net.SocketTimeoutException;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends nl.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f20273m;

    public x(y yVar) {
        this.f20273m = yVar;
    }

    @Override // nl.e
    public final void j() {
        this.f20273m.e(b.CANCEL);
        q qVar = this.f20273m.f20275b;
        synchronized (qVar) {
            long j10 = qVar.f20233o;
            long j11 = qVar.f20232n;
            if (j10 < j11) {
                return;
            }
            qVar.f20232n = j11 + 1;
            qVar.f20234p = System.nanoTime() + ((long) 1000000000);
            Unit unit = Unit.f27471a;
            qVar.i.c(new cl.b(a0.u.o(new StringBuilder(), qVar.f20223d, " ping"), qVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        }
    }
}
