package fj;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ni.l1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l0 implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f19373c;

    public /* synthetic */ l0(Function1 function1, int i) {
        this.f19372b = i;
        this.f19373c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ij.m mVar = (ij.m) obj;
        switch (this.f19372b) {
            case 0:
                this.f19373c.invoke(new m0(mVar.f21342b));
                break;
            default:
                this.f19373c.invoke(new l1(mVar.f21342b));
                break;
        }
        return Unit.f27471a;
    }
}
