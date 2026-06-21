package kk;

import com.vk.api.sdk.exceptions.VKApiCodes;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f0 f27450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d7.a f27451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f27452n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f27453o;

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f27452n = obj;
        this.f27453o |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return u.c(null, this);
    }
}
