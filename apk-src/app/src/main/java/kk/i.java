package kk;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f27423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f27425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f27426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f27427p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, mj.a aVar) {
        super(aVar);
        this.f27425n = jVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f27423l = obj;
        this.f27424m |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f27425n.p(null, this);
    }
}
