package wl;

import com.google.android.gms.internal.ads.kv0;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final char[] f35459r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f35460s = {8364, VKApiCodes.CODE_INVALID_PHOTO_FORMAT, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f35461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f35462b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kv0 f35464d;
    public l0 i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35474o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c3 f35463c = c3.f35386b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35465e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35466f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StringBuilder f35467g = new StringBuilder(1024);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StringBuilder f35468h = new StringBuilder(1024);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k0 f35469j = new k0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j0 f35470k = new j0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f0 f35471l = new f0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h0 f35472m = new h0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g0 f35473n = new g0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f35475p = new int[1];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f35476q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f35459r = cArr;
        Arrays.sort(cArr);
    }

    public m0(a aVar, b0 b0Var) {
        this.f35461a = aVar;
        this.f35462b = b0Var;
    }

    public final void a(c3 c3Var) {
        this.f35461a.a();
        this.f35463c = c3Var;
    }

    public final void b(String str) {
        b0 b0Var = this.f35462b;
        if (b0Var.a()) {
            a aVar = this.f35461a;
            b0Var.add(new d8.i("Invalid character reference: %s", aVar.f35330f + aVar.f35329e, new Object[]{str}));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (java.util.Arrays.binarySearch(wl.m0.f35459r, r4[r1.f35329e]) >= 0) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] c(java.lang.Character r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.m0.c(java.lang.Character, boolean):int[]");
    }

    public final l0 d(boolean z5) {
        l0 l0Var;
        if (z5) {
            l0Var = this.f35469j;
            l0Var.m();
        } else {
            l0Var = this.f35470k;
            l0Var.m();
        }
        this.i = l0Var;
        return l0Var;
    }

    public final void e() {
        kv0.n(this.f35468h);
    }

    public final void f(char c8) {
        h(String.valueOf(c8));
    }

    public final void g(kv0 kv0Var) {
        if (this.f35465e) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.f35464d = kv0Var;
        this.f35465e = true;
        int i = kv0Var.f7316c;
        if (i == 2) {
            this.f35474o = ((k0) kv0Var).f35451d;
            return;
        }
        if (i != 3 || ((j0) kv0Var).f35458l == null) {
            return;
        }
        b0 b0Var = this.f35462b;
        if (b0Var.a()) {
            a aVar = this.f35461a;
            int i10 = aVar.f35330f + aVar.f35329e;
            d8.i iVar = new d8.i(2);
            iVar.f15634b = i10;
            iVar.f15635c = "Attributes incorrectly present on end tag";
            b0Var.add(iVar);
        }
    }

    public final void h(String str) {
        if (this.f35466f == null) {
            this.f35466f = str;
            return;
        }
        StringBuilder sb2 = this.f35467g;
        if (sb2.length() == 0) {
            sb2.append(this.f35466f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f35473n);
    }

    public final void j() {
        g(this.f35472m);
    }

    public final void k() {
        l0 l0Var = this.i;
        if (l0Var.f35453f != null) {
            l0Var.y();
        }
        g(this.i);
    }

    public final void l(c3 c3Var) {
        b0 b0Var = this.f35462b;
        if (b0Var.a()) {
            a aVar = this.f35461a;
            b0Var.add(new d8.i("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f35330f + aVar.f35329e, new Object[]{c3Var}));
        }
    }

    public final void m(c3 c3Var) {
        b0 b0Var = this.f35462b;
        if (b0Var.a()) {
            a aVar = this.f35461a;
            b0Var.add(new d8.i("Unexpected character '%s' in input state [%s]", aVar.f35330f + aVar.f35329e, new Object[]{Character.valueOf(aVar.i()), c3Var}));
        }
    }

    public final boolean n() {
        return this.f35474o != null && this.i.w().equalsIgnoreCase(this.f35474o);
    }
}
