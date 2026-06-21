package g2;

import android.graphics.Rect;
import com.google.android.gms.internal.measurement.b4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f19869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x1.b[] f19870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect[][] f19871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect[][] f19872d;

    public j1() {
        this(new x1());
    }

    public final void a() {
        x1.b[] bVarArr = this.f19870b;
        if (bVarArr != null) {
            x1.b bVarH = bVarArr[0];
            x1.b bVarH2 = bVarArr[1];
            x1 x1Var = this.f19869a;
            if (bVarH2 == null) {
                bVarH2 = x1Var.f19943a.h(2);
            }
            if (bVarH == null) {
                bVarH = x1Var.f19943a.h(1);
            }
            h(x1.b.a(bVarH, bVarH2));
            x1.b bVar = this.f19870b[b4.C(16)];
            if (bVar != null) {
                g(bVar);
            }
            x1.b bVar2 = this.f19870b[b4.C(32)];
            if (bVar2 != null) {
                e(bVar2);
            }
            x1.b bVar3 = this.f19870b[b4.C(64)];
            if (bVar3 != null) {
                i(bVar3);
            }
        }
    }

    public abstract x1 b();

    public void c(x1 x1Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listE = x1Var.f19943a.e(i);
            int iC = b4.C(i);
            this.f19871c[iC] = (Rect[]) listE.toArray(new Rect[listE.size()]);
            if (i != 8) {
                List<Rect> listF = x1Var.f19943a.f(i);
                this.f19872d[iC] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            }
        }
    }

    public void d(int i, x1.b bVar) {
        if (this.f19870b == null) {
            this.f19870b = new x1.b[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i & i10) != 0) {
                this.f19870b[b4.C(i10)] = bVar;
            }
        }
    }

    public abstract void f(x1.b bVar);

    public abstract void h(x1.b bVar);

    public j1(x1 x1Var) {
        this.f19871c = new Rect[10][];
        this.f19872d = new Rect[10][];
        this.f19869a = x1Var;
        c(x1Var);
    }

    public void e(x1.b bVar) {
    }

    public void g(x1.b bVar) {
    }

    public void i(x1.b bVar) {
    }
}
