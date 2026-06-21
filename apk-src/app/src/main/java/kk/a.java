package kk;

import com.vk.api.sdk.exceptions.VKApiCodes;
import k6.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public lk.h f27403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f27404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t0 f27405n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f27406o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t0 t0Var, mj.a aVar) {
        super(aVar);
        this.f27405n = t0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f27404m = obj;
        this.f27406o |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f27405n.p(null, this);
    }
}
