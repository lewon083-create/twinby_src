package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gh2 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hh2 f38762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh2(hh2 hh2Var, mj.a aVar) {
        super(aVar);
        this.f38762c = hh2Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f38761b = obj;
        this.f38763d |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f38762c.a(null, null, this);
    }
}
