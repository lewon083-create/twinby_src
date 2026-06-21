package dl;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends r implements Function0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zk.d f15851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f15852h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(zk.d dVar, Object obj, Object obj2, int i) {
        super(0);
        this.f15850f = i;
        this.f15851g = dVar;
        this.f15852h = obj;
        this.i = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listG;
        switch (this.f15850f) {
            case 0:
                wa.a aVar = this.f15851g.f46345b;
                Intrinsics.b(aVar);
                return aVar.g(((zk.a) this.i).f46315h.f46427d, ((zk.j) this.f15852h).a());
            default:
                List list = (List) this.f15852h;
                wa.a aVar2 = this.f15851g.f46345b;
                if (aVar2 != null && (listG = aVar2.g((String) this.i, list)) != null) {
                    list = listG;
                }
                List<Certificate> list2 = list;
                ArrayList arrayList = new ArrayList(t.j(list2, 10));
                for (Certificate certificate : list2) {
                    Intrinsics.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
        }
    }
}
