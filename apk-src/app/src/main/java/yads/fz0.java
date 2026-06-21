package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fz0 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gz0 f38580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(gz0 gz0Var, mj.a aVar) {
        super(aVar);
        this.f38580c = gz0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f38579b = obj;
        this.f38581d |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f38580c.a(false, this);
    }
}
