package yads;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mg3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f40912c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f40913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg3 f40914b;

    static {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u(mg3.class, "status", "getStatus()Lcom/monetization/ads/instream/status/VideoAdStatus;");
        kotlin.jvm.internal.g0.f27511a.getClass();
        f40912c = new dk.i[]{uVar};
    }

    public mg3() {
        kg3[] elements = {kg3.f40192b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(kotlin.collections.i0.b(1));
        kotlin.collections.p.t(elements, linkedHashSet);
        this.f40913a = linkedHashSet;
        this.f40914b = new lg3(this);
    }

    public final kg3 a() {
        return (kg3) this.f40914b.getValue(this, f40912c[0]);
    }

    public final void a(kg3 kg3Var) {
        this.f40914b.setValue(this, f40912c[0], kg3Var);
    }
}
