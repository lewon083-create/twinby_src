package kk;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f27414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public jk.r f27415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public jk.b f27416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f27418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f27419q;

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f27418p = obj;
        this.f27419q |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return u.b(null, null, false, this);
    }
}
