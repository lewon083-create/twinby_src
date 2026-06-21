package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f31111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f31112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Serializable f31113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f31114o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f31115p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f31116q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f31117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e0 f31118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f31119t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, oj.c cVar) {
        super(cVar);
        this.f31118s = e0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f31117r = obj;
        this.f31119t |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return e0.f(this.f31118s, false, this);
    }
}
