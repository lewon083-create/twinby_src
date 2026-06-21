package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y32 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b42 f44905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public oi2 f44906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ty1 f44907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w5 f44908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v5 f44909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f44910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b42 f44911h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y32(b42 b42Var, mj.a aVar) {
        super(aVar);
        this.f44911h = b42Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f44910g = obj;
        this.i |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f44911h.a(null, null, null, this);
    }
}
