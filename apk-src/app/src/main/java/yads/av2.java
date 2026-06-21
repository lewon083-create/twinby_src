package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class av2 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w5 f36864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v5 f36865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f36866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cv2 f36867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36868f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av2(cv2 cv2Var, mj.a aVar) {
        super(aVar);
        this.f36867e = cv2Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f36866d = obj;
        this.f36868f |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f36867e.b(null, this);
    }
}
