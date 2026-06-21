package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ex0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f5129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5130m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f5131n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yf0 f5132o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5133p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex0(yf0 yf0Var, oj.c cVar) {
        super(cVar);
        this.f5132o = yf0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f5131n = obj;
        this.f5133p |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f5132o.q(this);
    }
}
