package kk;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f27441l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27442m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h3.e f27443n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public aj.m f27444o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h3.e eVar, mj.a aVar) {
        super(aVar);
        this.f27443n = eVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f27441l = obj;
        this.f27442m |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f27443n.p(null, this);
    }
}
