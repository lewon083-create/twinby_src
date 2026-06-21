package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cb0 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public db0 f37327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wa0 f37328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f37329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db0 f37330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb0(db0 db0Var, mj.a aVar) {
        super(aVar);
        this.f37330e = db0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f37329d = obj;
        this.f37331f |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f37330e.a(null, null, this);
    }
}
