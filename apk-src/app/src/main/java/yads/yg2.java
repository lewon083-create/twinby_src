package yads;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yg2 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ah2 f45048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ug2 f45049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uu f45050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f45051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ah2 f45052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45053g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg2(ah2 ah2Var, mj.a aVar) {
        super(aVar);
        this.f45052f = ah2Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f45051e = obj;
        this.f45053g |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f45052f.a((Context) null, (ug2) null, this);
    }
}
