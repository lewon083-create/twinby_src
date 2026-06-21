package hk;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x1 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f20725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20727n;

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f20726m = obj;
        this.f20727n |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return c0.u(0L, null, this);
    }
}
