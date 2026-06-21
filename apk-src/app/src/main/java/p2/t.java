package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f31063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e0 f31064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public hk.r f31065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f31066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e0 f31067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f31068q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(e0 e0Var, oj.c cVar) {
        super(cVar);
        this.f31067p = e0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f31066o = obj;
        this.f31068q |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return e0.c(this.f31067p, null, this);
    }
}
