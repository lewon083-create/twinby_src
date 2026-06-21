package yads;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f41 implements wp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m41 f38370b;

    public f41(m41 m41Var, String str) {
        this.f38370b = m41Var;
        this.f38369a = str;
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        m41 m41Var = this.f38370b;
        String str = this.f38369a;
        ((w82) m41Var.f40790b).a(str, bitmap);
        i41 i41Var = (i41) m41Var.f40791c.remove(str);
        if (i41Var != null) {
            i41Var.f39430b = bitmap;
            m41Var.f40792d.put(str, i41Var);
            if (m41Var.f40794f == null) {
                h41 h41Var = new h41(m41Var);
                m41Var.f40794f = h41Var;
                m41Var.f40793e.postDelayed(h41Var, 100);
            }
        }
    }
}
