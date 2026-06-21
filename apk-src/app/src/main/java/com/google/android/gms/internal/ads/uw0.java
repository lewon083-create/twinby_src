package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uw0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f11116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public pk.c f11117m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f11118n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yf0 f11119o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11120p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw0(yf0 yf0Var, oj.c cVar) {
        super(cVar);
        this.f11119o = yf0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f11118n = obj;
        this.f11120p |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f11119o.t(null, this);
    }
}
