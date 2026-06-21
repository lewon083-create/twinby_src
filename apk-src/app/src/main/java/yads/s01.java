package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s01 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f42774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t01 f42775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s01(t01 t01Var, mj.a aVar) {
        super(aVar);
        this.f42775c = t01Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f42774b = obj;
        this.f42776d |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f42775c.a(null, null, this);
    }
}
