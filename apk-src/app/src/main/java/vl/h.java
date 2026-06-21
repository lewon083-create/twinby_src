package vl;

import com.google.android.gms.internal.measurement.d4;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import wl.d0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f34919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34920k;

    public h() {
        HashMap map = d0.f35429j;
        d0 d0Var = (d0) map.get("#root");
        if (d0Var == null) {
            String strP = d4.p("#root");
            k3.f.t(strP);
            d0Var = (d0) map.get(strP);
            if (d0Var == null) {
                d0Var = new d0(strP);
                d0Var.f35437b = false;
            }
        }
        super(d0Var, "", null);
        g gVar = new g();
        gVar.f34912b = l.f34928g;
        gVar.f34914d = new ThreadLocal();
        gVar.f34916f = true;
        gVar.f34917g = 1;
        gVar.f34918h = 1;
        gVar.f34913c = Charset.forName("UTF8");
        this.f34919j = gVar;
        this.f34920k = 1;
    }

    @Override // vl.k, vl.p
    /* JADX INFO: renamed from: clone */
    public final Object g() {
        h hVar = (h) super.clone();
        hVar.f34919j = this.f34919j.clone();
        return hVar;
    }

    @Override // vl.k, vl.p
    public final p g() {
        h hVar = (h) super.clone();
        hVar.f34919j = this.f34919j.clone();
        return hVar;
    }

    @Override // vl.k, vl.p
    public final String o() {
        return "#document";
    }

    @Override // vl.p
    public final String p() {
        h hVar;
        StringBuilder sbG = tl.a.g();
        Iterator it = this.f34924f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p pVar = (p) it.next();
            pVar.getClass();
            p pVar2 = pVar;
            while (true) {
                p pVar3 = pVar2.f34939b;
                if (pVar3 == null) {
                    break;
                }
                pVar2 = pVar3;
            }
            hVar = pVar2 instanceof h ? (h) pVar2 : null;
            if (hVar == null) {
                hVar = new h();
            }
            g gVar = hVar.f34919j;
            r3.b bVar = new r3.b(25, false);
            bVar.f32188c = sbG;
            bVar.f32189d = gVar;
            gVar.b();
            rl.b.v(bVar, pVar);
        }
        p pVar4 = this;
        while (true) {
            p pVar5 = pVar4.f34939b;
            if (pVar5 == null) {
                break;
            }
            pVar4 = pVar5;
        }
        hVar = pVar4 instanceof h ? (h) pVar4 : null;
        boolean z5 = (hVar != null ? hVar.f34919j : new h().f34919j).f34916f;
        String string = sbG.toString();
        return z5 ? string.trim() : string;
    }

    @Override // vl.k
    /* JADX INFO: renamed from: w */
    public final k clone() {
        h hVar = (h) super.clone();
        hVar.f34919j = this.f34919j.clone();
        return hVar;
    }
}
