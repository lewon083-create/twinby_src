package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x72 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a82 f44614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f44615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82 f44616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x72(a82 a82Var, mj.a aVar) {
        super(aVar);
        this.f44616d = a82Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f44615c = obj;
        this.f44617e |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return a82.a(this.f44616d, null, this);
    }
}
