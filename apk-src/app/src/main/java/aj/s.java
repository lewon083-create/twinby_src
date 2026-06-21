package aj;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Set f1006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map f1007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Iterator f1008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t2.e f1009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e0 f1011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1012r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e0 e0Var, oj.c cVar) {
        super(cVar);
        this.f1011q = e0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f1010p = obj;
        this.f1012r |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return e0.f(this.f1011q, null, this);
    }
}
