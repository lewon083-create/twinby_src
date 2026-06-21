package aj;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f1015n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(m mVar, mj.a aVar) {
        super(aVar);
        this.f1015n = mVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f1013l = obj;
        this.f1014m |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f1015n.emit(null, this);
    }
}
