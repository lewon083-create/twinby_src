package hk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements wj.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20681c;

    public /* synthetic */ k(int i, Object obj) {
        this.f20680b = i;
        this.f20681c = obj;
    }

    @Override // wj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f20680b) {
            case 0:
                ((Function1) this.f20681c).invoke((Throwable) obj);
                break;
            case 1:
                pk.c cVar = (pk.c) this.f20681c;
                pk.c.f31507g.set(cVar, null);
                cVar.e(null);
                break;
            default:
                ((pk.g) this.f20681c).b();
                break;
        }
        return Unit.f27471a;
    }

    public /* synthetic */ k(pk.c cVar, pk.b bVar) {
        this.f20680b = 1;
        this.f20681c = cVar;
    }
}
