package kk;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f27430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h3.e f27432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h3.e f27433o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f27434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public lk.h f27435q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h3.e eVar, mj.a aVar) {
        super(aVar);
        this.f27432n = eVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f27430l = obj;
        this.f27431m |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f27432n.p(null, this);
    }
}
