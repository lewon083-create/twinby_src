package io.flutter.embedding.engine.renderer;

import android.view.KeyEvent;
import java.util.Iterator;
import xh.f0;
import xh.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25567b;

    public /* synthetic */ a(int i, Object obj) {
        this.f25566a = i;
        this.f25567b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
        switch (this.f25566a) {
            case 0:
                ((j) this.f25567b).f25610d = false;
                break;
            case 1:
                xh.d dVar = (xh.d) this.f25567b;
                KeyEvent.Callback callbackJ = dVar.f36106a.j();
                if (callbackJ instanceof k) {
                    ((k) callbackJ).a();
                }
                dVar.f36113h = false;
                break;
            case 2:
                s sVar = (s) this.f25567b;
                sVar.f36175j = false;
                Iterator it = sVar.i.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).a();
                }
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        switch (this.f25566a) {
            case 0:
                ((j) this.f25567b).f25610d = true;
                break;
            case 1:
                xh.d dVar = (xh.d) this.f25567b;
                KeyEvent.Callback callbackJ = dVar.f36106a.j();
                if (callbackJ instanceof k) {
                    ((k) callbackJ).b();
                }
                dVar.f36113h = true;
                dVar.i = true;
                break;
            case 2:
                s sVar = (s) this.f25567b;
                sVar.f36175j = true;
                Iterator it = sVar.i.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).b();
                }
                break;
            default:
                f0 f0Var = (f0) this.f25567b;
                f0Var.f36119b.setAlpha(1.0f);
                j jVar = f0Var.f36120c;
                if (jVar != null) {
                    jVar.g(this);
                }
                break;
        }
    }

    private final void c() {
    }
}
