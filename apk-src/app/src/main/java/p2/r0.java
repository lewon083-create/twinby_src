package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.google.firebase.messaging.y f31053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public pk.a f31054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f31055n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.y f31056o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31057p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.google.firebase.messaging.y yVar, oj.c cVar) {
        super(cVar);
        this.f31056o = yVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f31055n = obj;
        this.f31057p |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f31056o.w(this);
    }
}
