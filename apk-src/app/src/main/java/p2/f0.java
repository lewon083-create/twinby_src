package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f30965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public FileInputStream f30966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f30967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g0 f30968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f30969p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, oj.c cVar) {
        super(cVar);
        this.f30968o = g0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f30967n = obj;
        this.f30969p |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return g0.a(this.f30968o, this);
    }
}
