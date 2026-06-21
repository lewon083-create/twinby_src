package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bn2 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ en2 f37105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn2(en2 en2Var, mj.a aVar) {
        super(aVar);
        this.f37105c = en2Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f37104b = obj;
        this.f37106d |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        Object objA = this.f37105c.a(this);
        return objA == nj.a.f29512b ? objA : new ij.m(objA);
    }
}
