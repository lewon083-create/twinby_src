package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zi0 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w5 f45422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v5 f45423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f45424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dj0 f45425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45426f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(dj0 dj0Var, mj.a aVar) {
        super(aVar);
        this.f45425e = dj0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f45424d = obj;
        this.f45426f |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f45425e.a(this);
    }
}
