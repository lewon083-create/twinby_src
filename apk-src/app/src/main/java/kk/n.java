package kk;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public aj.m f27445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f27446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ aj.m f27448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f27449p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(aj.m mVar, mj.a aVar) {
        super(aVar);
        this.f27448o = mVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f27446m = obj;
        this.f27447n |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f27448o.emit(null, this);
    }
}
