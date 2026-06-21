package r2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f32174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f32175m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f32176n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32177o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, oj.c cVar2) {
        super(cVar2);
        this.f32176n = cVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f32175m = obj;
        this.f32177o |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f32176n.a(null, this);
    }
}
