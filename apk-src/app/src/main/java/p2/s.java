package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e0 f31058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public pk.c f31059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f31060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e0 f31061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31062p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e0 e0Var, oj.c cVar) {
        super(cVar);
        this.f31061o = e0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f31060n = obj;
        this.f31062p |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return e0.b(this.f31061o, this);
    }
}
