package jk;

import com.vk.api.sdk.exceptions.VKApiCodes;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Function0 f26717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f26718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26719n;

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f26718m = obj;
        this.f26719n |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return j.b(null, null, this);
    }
}
