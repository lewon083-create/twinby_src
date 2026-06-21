package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e0 f31084l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f31086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e0 f31087o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31088p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e0 e0Var, oj.c cVar) {
        super(cVar);
        this.f31087o = e0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f31086n = obj;
        this.f31088p |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f31087o.h(this);
    }
}
