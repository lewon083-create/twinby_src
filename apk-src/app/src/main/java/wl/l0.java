package wl;

import com.google.android.gms.internal.ads.kv0;
import com.google.android.gms.internal.measurement.d4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l0 extends kv0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StringBuilder f35454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35455h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public vl.b f35458l;

    public l0() {
        super(4);
        this.f35454g = new StringBuilder();
        this.i = false;
        this.f35456j = false;
        this.f35457k = false;
    }

    public final void r(char c8) {
        String strValueOf = String.valueOf(c8);
        String str = this.f35453f;
        if (str != null) {
            strValueOf = str.concat(strValueOf);
        }
        this.f35453f = strValueOf;
    }

    public final void s(char c8) {
        this.f35456j = true;
        String str = this.f35455h;
        StringBuilder sb2 = this.f35454g;
        if (str != null) {
            sb2.append(str);
            this.f35455h = null;
        }
        sb2.append(c8);
    }

    public final void t(String str) {
        this.f35456j = true;
        String str2 = this.f35455h;
        StringBuilder sb2 = this.f35454g;
        if (str2 != null) {
            sb2.append(str2);
            this.f35455h = null;
        }
        if (sb2.length() == 0) {
            this.f35455h = str;
        } else {
            sb2.append(str);
        }
    }

    public final void u(int[] iArr) {
        this.f35456j = true;
        String str = this.f35455h;
        StringBuilder sb2 = this.f35454g;
        if (str != null) {
            sb2.append(str);
            this.f35455h = null;
        }
        for (int i : iArr) {
            sb2.appendCodePoint(i);
        }
    }

    public final void v(String str) {
        String str2 = this.f35451d;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f35451d = str;
        this.f35452e = d4.p(str);
    }

    public final String w() {
        String str = this.f35451d;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must be false");
        }
        return this.f35451d;
    }

    public final void x(String str) {
        this.f35451d = str;
        this.f35452e = d4.p(str);
    }

    public final void y() {
        if (this.f35458l == null) {
            this.f35458l = new vl.b();
        }
        String str = this.f35453f;
        StringBuilder sb2 = this.f35454g;
        if (str != null) {
            String strTrim = str.trim();
            this.f35453f = strTrim;
            if (strTrim.length() > 0) {
                this.f35458l.p(this.f35453f, this.f35456j ? sb2.length() > 0 ? sb2.toString() : this.f35455h : this.i ? "" : null);
            }
        }
        this.f35453f = null;
        this.i = false;
        this.f35456j = false;
        kv0.n(sb2);
        this.f35455h = null;
    }

    @Override // com.google.android.gms.internal.ads.kv0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public l0 m() {
        this.f35451d = null;
        this.f35452e = null;
        this.f35453f = null;
        kv0.n(this.f35454g);
        this.f35455h = null;
        this.i = false;
        this.f35456j = false;
        this.f35457k = false;
        this.f35458l = null;
        return this;
    }
}
