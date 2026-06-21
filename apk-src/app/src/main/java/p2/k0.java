package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l0 f31004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f31005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f31006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n0 f31007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f31008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l0 f31009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f31010r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, oj.c cVar) {
        super(cVar);
        this.f31009q = l0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f31008p = obj;
        this.f31010r |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f31009q.b(null, this);
    }
}
