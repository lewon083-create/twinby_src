package aj;

import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t2.e f979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f980o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(t2.e eVar, Object obj, mj.a aVar, int i) {
        super(2, aVar);
        this.f977l = i;
        this.f979n = eVar;
        this.f980o = obj;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f977l) {
            case 0:
                k kVar = new k(this.f979n, (String) this.f980o, aVar, 0);
                kVar.f978m = obj;
                return kVar;
            default:
                k kVar2 = new k(this.f979n, (Long) this.f980o, aVar, 1);
                kVar2.f978m = obj;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t2.b bVar = (t2.b) obj;
        mj.a aVar = (mj.a) obj2;
        switch (this.f977l) {
        }
        return ((k) create(bVar, aVar)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f977l;
        Object obj2 = this.f980o;
        t2.e eVar = this.f979n;
        switch (i) {
            case 0:
                nj.a aVar = nj.a.f29512b;
                h5.E(obj);
                ((t2.b) this.f978m).e(eVar, (String) obj2);
                break;
            default:
                nj.a aVar2 = nj.a.f29512b;
                h5.E(obj);
                ((t2.b) this.f978m).e(eVar, (Long) obj2);
                break;
        }
        return Unit.f27471a;
    }
}
