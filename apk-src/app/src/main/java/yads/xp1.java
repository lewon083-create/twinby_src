package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xp1 extends oj.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f44783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f44784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp1(com.monetization.ads.mediation.base.initialize.a aVar, mj.a aVar2) {
        super(aVar2);
        this.f44784d = aVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f44783c = obj;
        this.f44785e |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f44784d.a(null, null, this);
    }
}
