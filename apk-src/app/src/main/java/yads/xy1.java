package yads;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xy1 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ty1 f44843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f44844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az1 f44845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44846e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy1(az1 az1Var, mj.a aVar) {
        super(aVar);
        this.f44845d = az1Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f44844c = obj;
        this.f44846e |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f44845d.a((Context) null, (ty1) null, this);
    }
}
