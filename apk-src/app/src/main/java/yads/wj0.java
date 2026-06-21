package yads;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uj0 f44414a;

    public wj0() {
        int iMaxMemory = ((int) (Runtime.getRuntime().maxMemory() / ((long) 1024))) / 8;
        this.f44414a = new uj0(iMaxMemory > 10240 ? 10240 : iMaxMemory);
    }

    public final vj0 a(String str) {
        return (vj0) this.f44414a.get(str);
    }

    public final void a(String str, Drawable drawable, u41 u41Var) {
        this.f44414a.put(str, new vj0(drawable, u41Var));
    }
}
