package fj;

import android.webkit.JsPromptResult;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s0 implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19419d;

    public /* synthetic */ s0(int i, Object obj, Object obj2) {
        this.f19417b = i;
        this.f19418c = obj;
        this.f19419d = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19417b) {
            case 0:
                u0 u0Var = (u0) this.f19418c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f19419d;
                m0 m0Var = (m0) obj;
                if (m0Var.f19378d) {
                    a1.m mVar = u0Var.f19427b.f19403a;
                    Throwable th2 = m0Var.f19377c;
                    Objects.requireNonNull(th2);
                    mVar.getClass();
                    a1.m.p(th2);
                    return null;
                }
                String str = (String) m0Var.f19376b;
                if (str != null) {
                    jsPromptResult.confirm(str);
                    return null;
                }
                jsPromptResult.cancel();
                return null;
            case 1:
                ik.d dVar = (ik.d) this.f19418c;
                dVar.f21366d.removeCallbacks((ed.c) this.f19419d);
                return Unit.f27471a;
            default:
                wd.i iVar = (wd.i) this.f19418c;
                String str2 = (String) this.f19419d;
                t2.b bVar = (t2.b) obj;
                iVar.getClass();
                bVar.e(wd.i.f35247d, str2);
                iVar.d(bVar, str2);
                return null;
        }
    }
}
