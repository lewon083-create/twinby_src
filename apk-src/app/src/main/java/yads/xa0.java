package yads;

import android.view.View;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xa0 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f44627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ya0 f44628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(ya0 ya0Var, mj.a aVar) {
        super(aVar);
        this.f44628c = ya0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f44627b = obj;
        this.f44629d |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f44628c.a((View) null, (wa0) null, this);
    }
}
