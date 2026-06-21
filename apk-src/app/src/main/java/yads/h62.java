package yads;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h62 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f39039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z30 f39040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f39042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k62 f39043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39044h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h62(k62 k62Var, mj.a aVar) {
        super(aVar);
        this.f39043g = k62Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f39042f = obj;
        this.f39044h |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f39043g.a(false, (Context) null, (ty1) null, (z30) null, (mj.a) this);
    }
}
