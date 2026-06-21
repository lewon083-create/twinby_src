package x0;

import g0.c1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f35642a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f35643b = new TreeMap(new i0.f(false));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0.a f35644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0.a f35645d;

    public l(x7.b bVar, int i) {
        g gVar = g.f35584e;
        Iterator it = new ArrayList(g.f35591m).iterator();
        while (true) {
            z0.a aVar = null;
            if (!it.hasNext()) {
                break;
            }
            g gVar2 = (g) it.next();
            f2.g.h("Currently only support ConstantQuality", gVar2 instanceof g);
            c1 c1VarC = bVar.c(gVar2.a(i));
            if (c1VarC != null) {
                com.google.android.gms.internal.auth.g.e("CapabilitiesByQuality", "profiles = " + c1VarC);
                if (!c1VarC.d().isEmpty()) {
                    int iA = c1VarC.a();
                    int iB = c1VarC.b();
                    List listC = c1VarC.c();
                    List listD = c1VarC.d();
                    f2.g.a("Should contain at least one VideoProfile.", !listD.isEmpty());
                    aVar = new z0.a(iA, iB, Collections.unmodifiableList(new ArrayList(listC)), Collections.unmodifiableList(new ArrayList(listD)), listC.isEmpty() ? null : (g0.h) listC.get(0), (g0.j) listD.get(0));
                }
                if (aVar == null) {
                    com.google.android.gms.internal.auth.g.O("CapabilitiesByQuality", "EncoderProfiles of quality " + gVar2 + " has no video validated profiles.");
                } else {
                    this.f35643b.put(aVar.f45781f.a(), gVar2);
                    this.f35642a.put(gVar2, aVar);
                }
            }
        }
        if (this.f35642a.isEmpty()) {
            com.google.android.gms.internal.auth.g.k("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f35645d = null;
            this.f35644c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f35642a.values());
            this.f35644c = (z0.a) arrayDeque.peekFirst();
            this.f35645d = (z0.a) arrayDeque.peekLast();
        }
    }

    public final z0.a a(g gVar) {
        f2.g.a("Unknown quality: " + gVar, g.f35590l.contains(gVar));
        return gVar == g.f35588j ? this.f35644c : gVar == g.i ? this.f35645d : (z0.a) this.f35642a.get(gVar);
    }
}
