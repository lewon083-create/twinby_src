package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FileOutputStream f31030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public FileOutputStream f31031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f31032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0 f31033o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31034p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, oj.c cVar) {
        super(cVar);
        this.f31033o = n0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f31032n = obj;
        this.f31034p |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f31033o.b(null, this);
    }
}
