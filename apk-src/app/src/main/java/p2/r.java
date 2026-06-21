package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f31050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ aj.w f31052n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(aj.w wVar, mj.a aVar) {
        super(aVar);
        this.f31052n = wVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f31050l = obj;
        this.f31051m |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f31052n.emit(null, this);
    }
}
