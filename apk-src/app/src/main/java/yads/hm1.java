package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hm1 implements xq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wq f39243h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cm1 f39245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final am1 f39246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm1 f39247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wl1 f39248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final em1 f39249g;

    static {
        r51.g();
        um2 um2Var = um2.f43723f;
        em1 em1Var = em1.f38181d;
        lm1 lm1Var = lm1.H;
        f39243h = new zf.a(25);
    }

    public hm1(String str, wl1 wl1Var, cm1 cm1Var, am1 am1Var, lm1 lm1Var, em1 em1Var) {
        this.f39244b = str;
        this.f39245c = cm1Var;
        this.f39246d = am1Var;
        this.f39247e = lm1Var;
        this.f39248f = wl1Var;
        this.f39249g = em1Var;
    }

    public static hm1 a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(0, 36), "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        am1 am1Var = bundle2 == null ? am1.f36771g : (am1) am1.f36772h.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        lm1 lm1Var = bundle3 == null ? lm1.H : (lm1) lm1.I.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        wl1 wl1Var = bundle4 == null ? wl1.f44422h : (wl1) vl1.f44067g.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        return new hm1(string, wl1Var, null, am1Var, lm1Var, bundle5 == null ? em1.f38181d : (em1) em1.f38182e.fromBundle(bundle5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm1)) {
            return false;
        }
        hm1 hm1Var = (hm1) obj;
        return lb3.a(this.f39244b, hm1Var.f39244b) && this.f39248f.equals(hm1Var.f39248f) && lb3.a(this.f39245c, hm1Var.f39245c) && lb3.a(this.f39246d, hm1Var.f39246d) && lb3.a(this.f39247e, hm1Var.f39247e) && lb3.a(this.f39249g, hm1Var.f39249g);
    }

    public final int hashCode() {
        int iHashCode = this.f39244b.hashCode() * 31;
        cm1 cm1Var = this.f39245c;
        return this.f39249g.hashCode() + ((this.f39247e.hashCode() + ((this.f39248f.hashCode() + ((this.f39246d.hashCode() + ((iHashCode + (cm1Var != null ? cm1Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public static hm1 a(String str) {
        cm1 cm1Var;
        ul1 ul1Var = new ul1();
        xl1 xl1Var = new xl1();
        List list = Collections.EMPTY_LIST;
        um2 um2Var = um2.f43723f;
        em1 em1Var = em1.f38181d;
        Uri uri = str == null ? null : Uri.parse(str);
        if (xl1Var.f44754b != null && xl1Var.f44753a == null) {
            throw new IllegalStateException();
        }
        yl1 yl1Var = null;
        if (uri != null) {
            if (xl1Var.f44753a != null) {
                yl1Var = new yl1(xl1Var);
            }
            cm1Var = new cm1(uri, null, yl1Var, list, null, um2Var, null);
        } else {
            cm1Var = null;
        }
        return new hm1("", new wl1(ul1Var), cm1Var, new am1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), lm1.H, em1Var);
    }
}
