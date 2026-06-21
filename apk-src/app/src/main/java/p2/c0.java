package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.e0 f30934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f30935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f30936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f30937o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, oj.c cVar) {
        super(cVar);
        this.f30936n = e0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f30935m = obj;
        this.f30937o |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f30936n.j(null, false, this);
    }
}
