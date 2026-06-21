package aj;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f1021n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, mj.a aVar) {
        super(aVar);
        this.f1021n = wVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f1019l = obj;
        this.f1020m |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f1021n.emit(null, this);
    }
}
