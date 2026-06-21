package fd;

import hk.w0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import md.q;
import q9.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements md.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f16767c = new h(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f16768d = new h(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f16769e = new h(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f16770f = new h(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16771b;

    public /* synthetic */ h(int i) {
        this.f16771b = i;
    }

    @Override // md.e
    public final Object l(o oVar) {
        switch (this.f16771b) {
            case 0:
                Object objB = oVar.b(new q(ld.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objB, "get(...)");
                return new w0((Executor) objB);
            case 1:
                Object objB2 = oVar.b(new q(ld.c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objB2, "get(...)");
                return new w0((Executor) objB2);
            case 2:
                Object objB3 = oVar.b(new q(ld.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objB3, "get(...)");
                return new w0((Executor) objB3);
            default:
                Object objB4 = oVar.b(new q(ld.d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objB4, "get(...)");
                return new w0((Executor) objB4);
        }
    }
}
