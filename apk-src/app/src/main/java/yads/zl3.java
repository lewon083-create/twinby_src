package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final db2 f45458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bm3 f45459b;

    public zl3(db2 db2Var, bm3 bm3Var) {
        this.f45458a = db2Var;
        this.f45459b = bm3Var;
    }

    public static String b(View view) {
        int visibility = view.getVisibility();
        return "view is not shown: visibility=" + (visibility != 0 ? visibility != 4 ? visibility != 8 ? "UNKNOWN" : "GONE" : "INVISIBLE" : "VISIBLE") + ", attached=" + view.isAttachedToWindow();
    }

    public static String c(View view) {
        return "view rect is null: ".concat(!view.isAttachedToWindow() ? "not attached" : (view.getWidth() <= 0 || view.getHeight() <= 0) ? "zero size" : "scrolled off");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.am3 a(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zl3.a(android.view.View):yads.am3");
    }
}
