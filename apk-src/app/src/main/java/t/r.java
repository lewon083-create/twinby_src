package t;

import g0.u2;
import g0.x2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f33244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f33245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f33246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f33247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f33248h;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f33242b = i;
        this.f33243c = obj;
        this.f33244d = obj2;
        this.f33245e = obj3;
        this.f33246f = obj4;
        this.f33247g = obj5;
        this.f33248h = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33242b) {
            case 0:
                c0 c0Var = (c0) this.f33243c;
                String str = (String) this.f33244d;
                g0.h2 h2Var = (g0.h2) this.f33245e;
                x2 x2Var = (x2) this.f33246f;
                g0.n nVar = (g0.n) this.f33247g;
                List list = (List) this.f33248h;
                c0Var.getClass();
                c0Var.v("Use case " + str + " UPDATED", null);
                c0Var.f32967b.V(str, h2Var, x2Var, nVar, list);
                c0Var.L();
                break;
            case 1:
                c0 c0Var2 = (c0) this.f33243c;
                String str2 = (String) this.f33244d;
                g0.h2 h2Var2 = (g0.h2) this.f33245e;
                x2 x2Var2 = (x2) this.f33246f;
                g0.n nVar2 = (g0.n) this.f33247g;
                List list2 = (List) this.f33248h;
                c0Var2.v("Use case " + str2 + " ACTIVE", null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0Var2.f32967b.f324d;
                u2 u2Var = (u2) linkedHashMap.get(str2);
                if (u2Var == null) {
                    u2Var = new u2(h2Var2, x2Var2, nVar2, list2);
                    linkedHashMap.put(str2, u2Var);
                }
                u2Var.f19782f = true;
                c0Var2.f32967b.V(str2, h2Var2, x2Var2, nVar2, list2);
                c0Var2.L();
                break;
            case 2:
                c0 c0Var3 = (c0) this.f33243c;
                String str3 = (String) this.f33244d;
                g0.h2 h2Var3 = (g0.h2) this.f33245e;
                x2 x2Var3 = (x2) this.f33246f;
                g0.n nVar3 = (g0.n) this.f33247g;
                List list3 = (List) this.f33248h;
                c0Var3.v("Use case " + str3 + " RESET", null);
                c0Var3.f32967b.V(str3, h2Var3, x2Var3, nVar3, list3);
                c0Var3.r();
                c0Var3.E();
                c0Var3.L();
                if (c0Var3.M == 10) {
                    c0Var3.D();
                }
                break;
            default:
                ((a1.m) this.f33243c).g((g0.f0) this.f33244d, (g0.f0) this.f33245e, (q0.m) this.f33246f, (q0.m) this.f33247g, (Map.Entry) this.f33248h);
                break;
        }
    }
}
