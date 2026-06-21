package yads;

import android.graphics.Bitmap;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f40062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l41 f40063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m41 f40065d;

    public k41(m41 m41Var, Bitmap bitmap, String str, l41 l41Var) {
        this.f40065d = m41Var;
        this.f40062a = bitmap;
        this.f40064c = str;
        this.f40063b = l41Var;
    }

    public final void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        if (this.f40063b == null) {
            return;
        }
        i41 i41Var = (i41) this.f40065d.f40791c.get(this.f40064c);
        if (i41Var != null) {
            i41Var.f39432d.remove(this);
            if (i41Var.f39432d.size() == 0) {
                i41Var.f39429a.a();
                this.f40065d.f40791c.remove(this.f40064c);
                return;
            }
            return;
        }
        i41 i41Var2 = (i41) this.f40065d.f40792d.get(this.f40064c);
        if (i41Var2 != null) {
            i41Var2.f39432d.remove(this);
            if (i41Var2.f39432d.size() == 0) {
                i41Var2.f39429a.a();
            }
            if (i41Var2.f39432d.size() == 0) {
                this.f40065d.f40792d.remove(this.f40064c);
            }
        }
    }
}
