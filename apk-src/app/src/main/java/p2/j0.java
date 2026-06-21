package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l0 f30990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g0 f30991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f30992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f30993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l0 f30994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f30995q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, oj.c cVar) {
        super(cVar);
        this.f30994p = l0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f30993o = obj;
        this.f30995q |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f30994p.a(null, this);
    }
}
