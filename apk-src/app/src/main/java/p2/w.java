package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e0 f31092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public w0 f31093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f31094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f31095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e0 f31096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f31097q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e0 e0Var, mj.a aVar) {
        super(aVar);
        this.f31096p = e0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f31095o = obj;
        this.f31097q |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return e0.e(this.f31096p, false, this);
    }
}
