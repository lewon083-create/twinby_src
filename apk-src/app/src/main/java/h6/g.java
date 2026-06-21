package h6;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h f20444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f20446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20447o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, mj.a aVar) {
        super(aVar);
        this.f20446n = hVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f20445m = obj;
        this.f20447o |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return h.d(this.f20446n, null, this);
    }
}
