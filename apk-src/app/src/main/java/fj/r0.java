package fj;

import android.webkit.JsResult;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r0 implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f19413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JsResult f19414d;

    public /* synthetic */ r0(u0 u0Var, JsResult jsResult, int i) {
        this.f19412b = i;
        this.f19413c = u0Var;
        this.f19414d = jsResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m0 m0Var = (m0) obj;
        switch (this.f19412b) {
            case 0:
                if (!m0Var.f19378d) {
                    boolean zEquals = Boolean.TRUE.equals(m0Var.f19376b);
                    JsResult jsResult = this.f19414d;
                    if (!zEquals) {
                        jsResult.cancel();
                    } else {
                        jsResult.confirm();
                    }
                } else {
                    a1.m mVar = this.f19413c.f19427b.f19403a;
                    Throwable th2 = m0Var.f19377c;
                    Objects.requireNonNull(th2);
                    mVar.getClass();
                    a1.m.p(th2);
                }
                break;
            default:
                if (!m0Var.f19378d) {
                    this.f19414d.confirm();
                } else {
                    a1.m mVar2 = this.f19413c.f19427b.f19403a;
                    Throwable th3 = m0Var.f19377c;
                    Objects.requireNonNull(th3);
                    mVar2.getClass();
                    a1.m.p(th3);
                }
                break;
        }
        return null;
    }
}
