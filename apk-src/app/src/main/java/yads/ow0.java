package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ow0 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sw0 f41749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fn2 f41750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f41751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sw0 f41752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(sw0 sw0Var, mj.a aVar) {
        super(aVar);
        this.f41752e = sw0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f41751d = obj;
        this.f41753f |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f41752e.a(null, this);
    }
}
