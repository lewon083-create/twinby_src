package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dz0 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ez0 f37918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f37920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ez0 f37921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37922f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(ez0 ez0Var, mj.a aVar) {
        super(aVar);
        this.f37921e = ez0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f37920d = obj;
        this.f37922f |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f37921e.a(null, false, this);
    }
}
