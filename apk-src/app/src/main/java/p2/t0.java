package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f31069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public pk.c f31070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f31071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v0 f31072o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31073p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(v0 v0Var, oj.c cVar) {
        super(cVar);
        this.f31072o = v0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f31071n = obj;
        this.f31073p |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f31072o.b(null, this);
    }
}
