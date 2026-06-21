package kk;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f27420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f27421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27422n;

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f27421m = obj;
        this.f27422n |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return u.a(null, null, null, this);
    }
}
