package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bx0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public pk.c f3955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yf0 f3958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f3960q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx0(yf0 yf0Var, oj.c cVar) {
        super(cVar);
        this.f3958o = yf0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f3957n = obj;
        this.f3959p |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f3958o.m(null, this);
    }
}
