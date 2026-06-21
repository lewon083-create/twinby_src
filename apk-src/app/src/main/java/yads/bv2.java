package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bv2 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cv2 f37155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w5 f37156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v5 f37157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f37158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cv2 f37159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37160g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv2(cv2 cv2Var, mj.a aVar) {
        super(aVar);
        this.f37159f = cv2Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f37158e = obj;
        this.f37160g |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f37159f.a(this);
    }
}
