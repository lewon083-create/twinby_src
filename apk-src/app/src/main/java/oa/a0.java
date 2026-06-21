package oa;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb.g f29819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f29821d;

    public a0(int i, sb.g gVar) {
        super(i);
        this.f29819b = gVar;
    }

    @Override // oa.c0
    public final void a(Status status) {
        this.f29819b.c(new na.d(status));
    }

    @Override // oa.c0
    public final void b(Exception exc) {
        this.f29819b.c(exc);
    }

    @Override // oa.c0
    public final /* bridge */ /* synthetic */ void c(l6.i iVar, boolean z5) {
        int i = this.f29820c;
    }

    @Override // oa.c0
    public final void d(p pVar) throws DeadObjectException {
        try {
            j(pVar);
        } catch (DeadObjectException e3) {
            a(c0.e(e3));
            throw e3;
        } catch (RemoteException e7) {
            a(c0.e(e7));
        } catch (RuntimeException e10) {
            this.f29819b.c(e10);
        }
    }

    @Override // oa.t
    public final ma.d[] f(p pVar) {
        switch (this.f29820c) {
            case 0:
                break;
            default:
                break;
        }
        return null;
    }

    @Override // oa.t
    public final boolean g(p pVar) {
        switch (this.f29820c) {
            case 0:
                return ((v) this.f29821d).f29892a.f13781b;
            default:
                v vVar = (v) pVar.f29875g.get((i) this.f29821d);
                return vVar != null && vVar.f29892a.f13781b;
        }
    }

    public final void j(p pVar) {
        switch (this.f29820c) {
            case 0:
                v vVar = (v) this.f29821d;
                i4 i4Var = vVar.f29892a;
                ((a1.e) ((la.m) i4Var.f13783d).f28099d).accept(pVar.f29871c, this.f29819b);
                i iVar = (i) ((k) i4Var.f13782c).f29860c;
                if (iVar != null) {
                    pVar.f29875g.put(iVar, vVar);
                }
                break;
            default:
                sb.g gVar = this.f29819b;
                v vVar2 = (v) pVar.f29875g.remove((i) this.f29821d);
                if (vVar2 == null) {
                    gVar.d(Boolean.FALSE);
                } else {
                    ((i4) ((la.m) vVar2.f29893b.f28696c).f28100e).accept(pVar.f29871c, gVar);
                    k kVar = (k) vVar2.f29892a.f13782c;
                    kVar.f29859b = null;
                    kVar.f29860c = null;
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(i iVar, sb.g gVar) {
        this(4, gVar);
        this.f29820c = 1;
        this.f29821d = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(v vVar, sb.g gVar) {
        this(3, gVar);
        this.f29820c = 0;
        this.f29821d = vVar;
    }

    private final /* bridge */ /* synthetic */ void h(l6.i iVar, boolean z5) {
    }

    private final /* bridge */ /* synthetic */ void i(l6.i iVar, boolean z5) {
    }
}
