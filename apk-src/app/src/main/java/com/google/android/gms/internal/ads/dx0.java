package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dx0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public pk.c f4708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f4709n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yf0 f4710o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4711p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx0(yf0 yf0Var, oj.c cVar) {
        super(cVar);
        this.f4710o = yf0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f4709n = obj;
        this.f4711p |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f4710o.s(this);
    }
}
