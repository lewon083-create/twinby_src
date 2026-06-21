package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.protocol.Device;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cq2 f43108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9 f43109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy f43110c;

    public /* synthetic */ sx() {
        this(new cq2(), new n9(), new wy());
    }

    public final ho2 a(v9 v9Var, d4 d4Var) {
        ho2 ho2VarB = this.f43108a.b(v9Var, d4Var);
        ho2 ho2VarA = this.f43109b.a(d4Var.f37617e);
        wy wyVar = this.f43110c;
        wyVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!kotlin.jvm.internal.k0.d(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        za2 za2Var = wyVar.f44515a;
        int i = d4Var.f37625n;
        za2Var.getClass();
        linkedHashMap.put(Device.JsonKeys.ORIENTATION, i != 1 ? i != 2 ? StringUtils.UNDEFINED : "landscape" : "portrait");
        ho2 ho2VarA2 = io2.a(ho2VarB, ho2VarA);
        c cVar = ho2VarA2.f39287b;
        return new ho2(kotlin.collections.j0.i(ho2VarA2.f39286a, linkedHashMap), cVar != null ? cVar : null);
    }

    public sx(cq2 cq2Var, n9 n9Var, wy wyVar) {
        this.f43108a = cq2Var;
        this.f43109b = n9Var;
        this.f43110c = wyVar;
    }
}
