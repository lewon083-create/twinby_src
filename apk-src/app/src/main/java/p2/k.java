package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f30996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f30997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f30998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f30999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e0 f31000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f31001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f31002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f31003s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, oj.c cVar) {
        super(cVar);
        this.f31002r = lVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f31001q = obj;
        this.f31003s |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f31002r.a(null, this);
    }
}
