package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class em0 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fm0 f38177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm0 f38179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em0(fm0 fm0Var, mj.a aVar) {
        super(aVar);
        this.f38179d = fm0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f38178c = obj;
        this.f38180e |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f38179d.a(null, this);
    }
}
