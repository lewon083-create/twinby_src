package yads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zf2 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f45396h;
    public final int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v63[] f45397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object[] f45398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f45399l;

    public zf2(List list, vy2 vy2Var) {
        super(vy2Var);
        int size = list.size();
        this.f45396h = new int[size];
        this.i = new int[size];
        this.f45397j = new v63[size];
        this.f45398k = new Object[size];
        this.f45399l = new HashMap();
        Iterator it = list.iterator();
        int iB = 0;
        int iA = 0;
        int i = 0;
        while (it.hasNext()) {
            fn1 fn1Var = (fn1) it.next();
            this.f45397j[i] = fn1Var.a();
            this.i[i] = iB;
            this.f45396h[i] = iA;
            iB += this.f45397j[i].b();
            iA += this.f45397j[i].a();
            this.f45398k[i] = fn1Var.getUid();
            this.f45399l.put(this.f45398k[i], Integer.valueOf(i));
            i++;
        }
        this.f45394f = iB;
        this.f45395g = iA;
    }

    @Override // yads.v63
    public final int a() {
        return this.f45395g;
    }

    @Override // yads.v63
    public final int b() {
        return this.f45394f;
    }
}
