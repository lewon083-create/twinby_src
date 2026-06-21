package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zf3 extends zj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg3 f45400a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf3(bg3 bg3Var) {
        super(null);
        this.f45400a = bg3Var;
    }

    @Override // zj.b
    public final void afterChange(dk.i property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f45400a.f37021f.f38129e = (dg3) obj2;
    }
}
