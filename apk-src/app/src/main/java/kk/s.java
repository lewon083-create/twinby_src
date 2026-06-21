package kk;

import com.vk.api.sdk.exceptions.VKApiCodes;
import hk.c1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t f27455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f27456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v f27457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c1 f27458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f27459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f27460q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f27461r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f27462s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, mj.a aVar) {
        super(aVar);
        this.f27461r = tVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f27460q = obj;
        this.f27462s |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        this.f27461r.p(null, this);
        return nj.a.f29512b;
    }
}
