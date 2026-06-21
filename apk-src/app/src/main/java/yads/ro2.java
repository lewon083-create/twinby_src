package yads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ro2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nm3 f42658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f42662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public vp2 f42663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f42664h;
    public ep2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f42669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public qe0 f42670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public lr f42671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f42672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public po2 f42673r;

    public ro2(int i, String str, vp2 vp2Var) {
        this.f42658b = nm3.f41295c ? new nm3() : null;
        this.f42662f = new Object();
        this.f42665j = true;
        this.f42666k = false;
        this.f42667l = false;
        this.f42668m = false;
        this.f42669n = false;
        this.f42671p = null;
        this.f42659c = i;
        this.f42660d = str;
        this.f42663g = vp2Var;
        a(new qe0());
        this.f42661e = b(str);
    }

    public lm3 a(lm3 lm3Var) {
        return lm3Var;
    }

    public abstract xp2 a(h82 h82Var);

    public abstract void a(Object obj);

    public byte[] b() {
        return null;
    }

    public final void c(String str) {
        ep2 ep2Var = this.i;
        if (ep2Var != null) {
            synchronized (ep2Var.f38225b) {
                ep2Var.f38225b.remove(this);
            }
            synchronized (ep2Var.f38232j) {
                Iterator it = ep2Var.f38232j.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            ep2Var.a(this, 5);
        }
        if (nm3.f41295c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new oo2(this, str, id2));
                return;
            }
            this.f42658b.a(str, id2);
            nm3 nm3Var = this.f42658b;
            toString();
            nm3Var.a();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ro2 ro2Var = (ro2) obj;
        int iF = f();
        int iF2 = ro2Var.f();
        return iF == iF2 ? this.f42664h.intValue() - ro2Var.f42664h.intValue() : hg0.a(iF2) - hg0.a(iF);
    }

    public Map d() {
        return Collections.EMPTY_MAP;
    }

    public final int e() {
        return this.f42659c;
    }

    public int f() {
        return 2;
    }

    public String g() {
        return this.f42660d;
    }

    public final boolean h() {
        boolean z5;
        synchronized (this.f42662f) {
            z5 = this.f42667l;
        }
        return z5;
    }

    public final boolean i() {
        boolean z5;
        synchronized (this.f42662f) {
            z5 = this.f42666k;
        }
        return z5;
    }

    public final void j() {
        po2 po2Var;
        synchronized (this.f42662f) {
            po2Var = this.f42673r;
        }
        if (po2Var != null) {
            ((hn3) po2Var).b(this);
        }
    }

    public final void k() {
        this.f42665j = false;
    }

    public final void l() {
        this.f42669n = true;
    }

    public final void m() {
        this.f42668m = true;
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.f42661e);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i() ? "[X] " : "[ ] ");
        sb2.append(g());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(qo2.a(f()));
        sb2.append(" ");
        sb2.append(this.f42664h);
        return sb2.toString();
    }

    public static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void a() {
        synchronized (this.f42662f) {
            this.f42666k = true;
            this.f42663g = null;
        }
    }

    public final void a(xp2 xp2Var) {
        po2 po2Var;
        synchronized (this.f42662f) {
            po2Var = this.f42673r;
        }
        if (po2Var != null) {
            ((hn3) po2Var).a(this, xp2Var);
        }
    }

    public final void a(int i) {
        ep2 ep2Var = this.i;
        if (ep2Var != null) {
            ep2Var.a(this, i);
        }
    }

    public final void a(po2 po2Var) {
        synchronized (this.f42662f) {
            this.f42673r = po2Var;
        }
    }

    public final void a(qe0 qe0Var) {
        this.f42670o = qe0Var;
    }

    public final void a(String str) {
        if (nm3.f41295c) {
            this.f42658b.a(str, Thread.currentThread().getId());
        }
    }

    public final String c() {
        String strG = g();
        int i = this.f42659c;
        if (i == 0 || i == -1) {
            return strG;
        }
        return Integer.toString(i) + '-' + strG;
    }
}
