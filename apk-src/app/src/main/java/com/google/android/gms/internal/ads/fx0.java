package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fx0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public pk.a f5490l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5491m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yf0 f5492n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5493o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx0(yf0 yf0Var, oj.c cVar) {
        super(cVar);
        this.f5492n = yf0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f5491m = obj;
        this.f5493o |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f5492n.l(this);
    }
}
