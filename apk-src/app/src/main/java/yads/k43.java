package yads;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k43 extends ro2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f40074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public wp2 f40075t;

    public k43(String str, wp2 wp2Var, vp2 vp2Var) {
        super(0, str, vp2Var);
        this.f40074s = new Object();
        this.f40075t = wp2Var;
    }

    @Override // yads.ro2
    public final void a() {
        super.a();
        synchronized (this.f40074s) {
            this.f40075t = null;
        }
    }

    @Override // yads.ro2
    public final void a(Object obj) {
        wp2 wp2Var;
        String str = (String) obj;
        synchronized (this.f40074s) {
            wp2Var = this.f40075t;
        }
        if (wp2Var != null) {
            wp2Var.a(str);
        }
    }

    @Override // yads.ro2
    public final xp2 a(h82 h82Var) {
        String str;
        try {
            str = new String(h82Var.f39070b, w11.a(h82Var.f39071c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(h82Var.f39070b);
        }
        return new xp2(str, w11.a(h82Var));
    }
}
