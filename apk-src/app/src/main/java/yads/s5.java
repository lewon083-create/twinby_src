package yads;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s5 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9 f42809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f42810b;

    public s5(z9 z9Var, WeakReference weakReference) {
        this.f42809a = z9Var;
        this.f42810b = weakReference;
        z9Var.a(this);
    }

    @Override // yads.f4
    public final void a(int i, Bundle bundle) {
        wz1 wz1Var = (wz1) this.f42810b.get();
        if (wz1Var != null) {
            if (i == 19) {
                wz1Var.f44534a.b();
                wz1Var.f44535b.f38319f.f37953b.b(h1.f38973e);
                return;
            }
            if (i == 20) {
                wz1Var.f44535b.f38319f.f37953b.a(h1.f38973e);
                return;
            }
            switch (i) {
                case 6:
                    wz1Var.f44534a.b();
                    wz1Var.f44535b.f38319f.f37953b.b(h1.f38972d);
                    break;
                case 7:
                    wz1Var.f44534a.b();
                    wz1Var.f44535b.f38319f.c();
                    break;
                case 8:
                    wz1Var.f44535b.f38319f.f37953b.a(h1.f38972d);
                    break;
                case 9:
                    wz1Var.f44535b.f38319f.a();
                    break;
            }
        }
    }

    public /* synthetic */ s5(wz1 wz1Var) {
        this(new z9(), new WeakReference(wz1Var));
    }
}
