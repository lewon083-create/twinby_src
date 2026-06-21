package kk;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public aj.q f27436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f27437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f27438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ aj.q f27439o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f27440p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(aj.q qVar, mj.a aVar) {
        super(aVar);
        this.f27439o = qVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f27438n = obj;
        this.f27440p |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f27439o.emit(null, this);
    }
}
