package oa;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.w f29822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sb.g f29823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final le.a f29824d;

    public b0(int i, com.google.android.gms.internal.play_billing.w wVar, sb.g gVar, le.a aVar) {
        super(i);
        this.f29823c = gVar;
        this.f29822b = wVar;
        this.f29824d = aVar;
        if (i == 2 && wVar.f14341a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // oa.c0
    public final void a(Status status) {
        this.f29824d.getClass();
        this.f29823c.c(pa.c0.n(status));
    }

    @Override // oa.c0
    public final void b(Exception exc) {
        this.f29823c.c(exc);
    }

    @Override // oa.c0
    public final void c(l6.i iVar, boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        Map map = (Map) iVar.f27979d;
        sb.g gVar = this.f29823c;
        map.put(gVar, boolValueOf);
        gVar.f32858a.addOnCompleteListener(new l6.i(iVar, gVar));
    }

    @Override // oa.c0
    public final void d(p pVar) throws DeadObjectException {
        sb.g gVar = this.f29823c;
        try {
            this.f29822b.b(pVar.f29871c, gVar);
        } catch (DeadObjectException e3) {
            throw e3;
        } catch (RemoteException e7) {
            a(c0.e(e7));
        } catch (RuntimeException e10) {
            gVar.c(e10);
        }
    }

    @Override // oa.t
    public final ma.d[] f(p pVar) {
        return (ma.d[]) this.f29822b.f14343c;
    }

    @Override // oa.t
    public final boolean g(p pVar) {
        return this.f29822b.f14341a;
    }
}
