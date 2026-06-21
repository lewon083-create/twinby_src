package nc;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f29288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f29289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f29290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f29291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f29292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f29293f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f29294g = new ArrayList();

    public t() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f29291d;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f29289b;
        float f14 = this.f29290c;
        p pVar = new p(f13, f14, f13, f14);
        pVar.f29281f = this.f29291d;
        pVar.f29282g = f12;
        this.f29294g.add(new n(pVar));
        this.f29291d = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f29293f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((r) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        q qVar = new q();
        qVar.f29283b = f10;
        qVar.f29284c = f11;
        this.f29293f.add(qVar);
        o oVar = new o(qVar, this.f29289b, this.f29290c);
        float fB = oVar.b() + 270.0f;
        float fB2 = oVar.b() + 270.0f;
        a(fB);
        this.f29294g.add(oVar);
        this.f29291d = fB2;
        this.f29289b = f10;
        this.f29290c = f11;
    }

    public final void d(float f10, float f11, float f12) {
        this.f29288a = f10;
        this.f29289b = 0.0f;
        this.f29290c = f10;
        this.f29291d = f11;
        this.f29292e = (f11 + f12) % 360.0f;
        this.f29293f.clear();
        this.f29294g.clear();
    }
}
