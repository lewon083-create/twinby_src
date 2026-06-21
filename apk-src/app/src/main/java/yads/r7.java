package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r7 extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f8 f42505b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(f8 f8Var) {
        super(1);
        this.f42505b = f8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vk.f fVar = (vk.f) obj;
        for (String str : this.f42505b.f38397g) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            uk.a0 a0Var = vk.m.f34887a;
            Object element = str == null ? vk.t.INSTANCE : new vk.q(str, true);
            fVar.getClass();
            Intrinsics.checkNotNullParameter(element, "element");
            fVar.f34879a.add(element);
        }
        return Unit.f27471a;
    }
}
