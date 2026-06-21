package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d6 implements yc.g, yc.f, h7, h6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m4 f13358d = new m4(27);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13360c;

    public /* synthetic */ d6(int i, Object obj) {
        this.f13359b = i;
        this.f13360c = obj;
    }

    @Override // yc.f
    public void a(yc.e eVar) {
        ((vi.d) this.f13360c).a(eVar);
    }

    public void b(int i, Object obj, p6 p6Var) {
        l5 l5Var = (l5) this.f13360c;
        f5 f5Var = (f5) obj;
        l5Var.z(i, 2);
        l5Var.B(f5Var.b(p6Var));
        p6Var.d(f5Var, this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.h6
    public o6 c(Class cls) {
        for (int i = 0; i < 2; i++) {
            h6 h6Var = ((h6[]) this.f13360c)[i];
            if (h6Var.d(cls)) {
                return h6Var.c(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.consent_sdk.h6
    public boolean d(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((h6[]) this.f13360c)[i].d(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // yc.g
    public void f(k kVar) {
        ((AtomicReference) this.f13360c).set(kVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    public Object j() {
        switch (this.f13359b) {
            case 3:
                e0 e0Var = f0.f13386b;
                h0.c(e0Var);
                return new o((b) this.f13360c, e0Var);
            case 4:
                return new s((Application) ((i7) this.f13360c).j());
            case 5:
            case 6:
            default:
                return this.f13360c;
            case 7:
                g7 g7Var = (g7) this.f13360c;
                if (g7Var != null) {
                    return g7Var.j();
                }
                throw new IllegalStateException();
        }
    }

    public d6(int i) {
        this.f13359b = i;
        switch (i) {
            case 7:
                break;
            default:
                int i10 = h5.f13404a;
                d6 d6Var = new d6(6, new h6[]{m4.f13487w, f13358d});
                Charset charset = x5.f13606a;
                this.f13360c = d6Var;
                break;
        }
    }

    public d6(l5 l5Var) {
        this.f13359b = 5;
        Charset charset = x5.f13606a;
        this.f13360c = l5Var;
        l5Var.f13459b = this;
    }
}
