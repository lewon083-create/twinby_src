package gl;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends cl.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20200g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Object obj, Object obj2, String str) {
        super(str, true);
        this.f20198e = i;
        this.f20199f = obj;
        this.f20200g = obj2;
    }

    @Override // cl.a
    public final long a() {
        long jA;
        int i;
        y[] yVarArr;
        switch (this.f20198e) {
            case 0:
                q qVar = (q) this.f20199f;
                qVar.f20221b.a(qVar, (c0) ((f0) this.f20200g).f27510b);
                return -1L;
            case 1:
                try {
                    ((q) this.f20199f).f20221b.b((y) this.f20200g);
                    break;
                } catch (IOException e3) {
                    hl.n nVar = hl.n.f20755a;
                    hl.n nVar2 = hl.n.f20755a;
                    String str = "Http2Connection.Listener failure for " + ((q) this.f20199f).f20223d;
                    nVar2.getClass();
                    hl.n.i(str, e3, 4);
                    try {
                        ((y) this.f20200g).c(b.PROTOCOL_ERROR, e3);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                l lVar = (l) this.f20199f;
                c0 settings = (c0) this.f20200g;
                Intrinsics.checkNotNullParameter(settings, "settings");
                f0 f0Var = new f0();
                q qVar2 = lVar.f20205c;
                synchronized (qVar2.f20242x) {
                    synchronized (qVar2) {
                        try {
                            c0 c0Var = qVar2.f20236r;
                            c0 c0Var2 = new c0();
                            c0Var2.b(c0Var);
                            c0Var2.b(settings);
                            f0Var.f27510b = c0Var2;
                            jA = ((long) c0Var2.a()) - ((long) c0Var.a());
                            i = 0;
                            yVarArr = (jA == 0 || qVar2.f20222c.isEmpty()) ? null : (y[]) qVar2.f20222c.values().toArray(new y[0]);
                            c0 c0Var3 = (c0) f0Var.f27510b;
                            Intrinsics.checkNotNullParameter(c0Var3, "<set-?>");
                            qVar2.f20236r = c0Var3;
                            qVar2.f20229k.c(new j(i, qVar2, f0Var, qVar2.f20223d + " onSettings"), 0L);
                            Unit unit = Unit.f27471a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        qVar2.f20242x.a((c0) f0Var.f27510b);
                    } catch (IOException e7) {
                        qVar2.b(e7);
                    }
                    Unit unit2 = Unit.f27471a;
                    break;
                }
                if (yVarArr != null) {
                    int length = yVarArr.length;
                    while (i < length) {
                        y yVar = yVarArr[i];
                        synchronized (yVar) {
                            yVar.f20279f += jA;
                            if (jA > 0) {
                                yVar.notifyAll();
                            }
                            Unit unit3 = Unit.f27471a;
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
