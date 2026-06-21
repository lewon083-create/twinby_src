package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w3 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x3 f44263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kf1 f44264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qa2 f44265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f44266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x3 f44267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44268g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(x3 x3Var, mj.a aVar) {
        super(aVar);
        this.f44267f = x3Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f44266e = obj;
        this.f44268g |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f44267f.a(null, null, null, null, this);
    }
}
