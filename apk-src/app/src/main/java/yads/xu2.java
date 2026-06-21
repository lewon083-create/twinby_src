package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import hk.c1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xu2 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cv2 f44807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s61 f44808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w5 f44809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v5 f44810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c1 f44811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f44812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cv2 f44813h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu2(cv2 cv2Var, mj.a aVar) {
        super(aVar);
        this.f44813h = cv2Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f44812g = obj;
        this.i |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f44813h.a(null, this);
    }
}
