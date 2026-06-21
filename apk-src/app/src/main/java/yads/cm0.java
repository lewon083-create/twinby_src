package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cm0 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dm0 f37437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm0 f37439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37440e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm0(dm0 dm0Var, mj.a aVar) {
        super(aVar);
        this.f37439d = dm0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f37438c = obj;
        this.f37440e |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f37439d.a(null, this);
    }
}
