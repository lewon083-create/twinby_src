package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hx0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f6286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f6288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yf0 f6289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6290p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx0(yf0 yf0Var, oj.c cVar) {
        super(cVar);
        this.f6289o = yf0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f6288n = obj;
        this.f6290p |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f6289o.r(this);
    }
}
