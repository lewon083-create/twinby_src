package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lg3 extends zj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mg3 f40551a;

    /* JADX WARN: Illegal instructions before constructor call */
    public lg3(mg3 mg3Var) {
        kg3 kg3Var = kg3.f40192b;
        this.f40551a = mg3Var;
        super(kg3Var);
    }

    @Override // zj.b
    public final void afterChange(dk.i property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f40551a.f40913a.add((kg3) obj2);
    }
}
