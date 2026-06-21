package wk;

import com.vk.api.sdk.exceptions.VKApiCodes;
import d8.e0;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ij.b f35293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e0 f35294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinkedHashMap f35295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f35297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e0 f35298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35299r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e0 e0Var, oj.a aVar) {
        super(aVar);
        this.f35298q = e0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f35297p = obj;
        this.f35299r |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return e0.b(this.f35298q, null, this);
    }
}
