package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wh2 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f44404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zh2 f44405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44406d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh2(zh2 zh2Var, mj.a aVar) {
        super(aVar);
        this.f44405c = zh2Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f44404b = obj;
        this.f44406d |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return zh2.a(0L, null, null, null, this.f44405c, null, this);
    }
}
