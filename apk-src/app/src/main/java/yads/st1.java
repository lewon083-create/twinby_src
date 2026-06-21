package yads;

import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class st1 extends ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em2 f43075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i82 f43076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a21 f43077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e21 f43078d;

    public st1(SSLSocketFactory sSLSocketFactory, em2 em2Var, i82 i82Var, a21 a21Var, f21 f21Var) {
        this.f43075a = em2Var;
        this.f43076b = i82Var;
        this.f43077c = a21Var;
        f21Var.getClass();
        this.f43078d = f21.a(sSLSocketFactory);
    }

    @Override // yads.ho
    public final z11 a(ro2 ro2Var, Map map) {
        boolean z5;
        synchronized (gu1.f38874a) {
            z5 = gu1.f38875b;
        }
        return z5 ? (z11) new rt1(this, map).invoke(ro2Var) : b(ro2Var, map);
    }

    public final z11 b(ro2 ro2Var, Map map) {
        h82 h82VarA = this.f43076b.a(ro2Var);
        if (h82VarA == null) {
            return this.f43078d.a(ro2Var, map);
        }
        this.f43075a.getClass();
        ArrayList arrayList = new ArrayList();
        Map map2 = h82VarA.f39071c;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(new r01((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return new z11(h82VarA.f39069a, arrayList, h82VarA.f39070b);
    }
}
