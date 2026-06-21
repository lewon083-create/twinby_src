package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wy1 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oi f44516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f44517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az1 f44518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44519e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy1(az1 az1Var, mj.a aVar) {
        super(aVar);
        this.f44518d = az1Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f44517c = obj;
        this.f44519e |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return az1.a(this.f44518d, (oi) null, this);
    }
}
