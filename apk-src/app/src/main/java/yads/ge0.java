package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ge0 implements zm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe0 f38736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o30 f38737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ae0 f38738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f38740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f38741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f38742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f38743h;

    public ge0(o30 o30Var, od0 od0Var) {
        this.f38737b = o30Var;
        fe0 fe0Var = new fe0(od0Var);
        this.f38736a = fe0Var;
        fe0Var.b(o30Var);
        this.f38739d = -9223372036854775807L;
        this.f38740e = -9223372036854775807L;
        this.f38741f = -9223372036854775807L;
        this.f38742g = -3.4028235E38f;
        this.f38743h = -3.4028235E38f;
    }

    @Override // yads.zm1
    public final mo a(hm1 hm1Var) {
        Uri uri;
        String str;
        String str2;
        Object obj;
        List list;
        r51 r51Var;
        cm1 cm1Var;
        hm1 hm1Var2 = hm1Var;
        hm1Var2.f39245c.getClass();
        String scheme = hm1Var2.f39245c.f37092a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        cm1 cm1Var2 = hm1Var2.f39245c;
        int iA = lb3.a(cm1Var2.f37092a, cm1Var2.f37093b);
        fe0 fe0Var = this.f38736a;
        zm1 zm1Var = (zm1) fe0Var.f38432d.get(Integer.valueOf(iA));
        if (zm1Var == null) {
            b53 b53VarA = fe0Var.a(iA);
            if (b53VarA == null) {
                zm1Var = null;
            } else {
                zm1Var = (zm1) b53VarA.get();
                hd0 hd0Var = fe0Var.f38434f;
                if (hd0Var != null) {
                    zm1Var.a(hd0Var);
                }
                ae0 ae0Var = fe0Var.f38435g;
                if (ae0Var != null) {
                    zm1Var.a(ae0Var);
                }
                fe0Var.f38432d.put(Integer.valueOf(iA), zm1Var);
            }
        }
        ni.a(zm1Var, "No suitable media source factory found for content type: " + iA);
        am1 am1Var = hm1Var2.f39246d;
        am1Var.getClass();
        long j10 = am1Var.f36773b;
        long j11 = am1Var.f36774c;
        long j12 = am1Var.f36775d;
        float f10 = am1Var.f36776e;
        float f11 = am1Var.f36777f;
        am1 am1Var2 = hm1Var2.f39246d;
        if (am1Var2.f36773b == -9223372036854775807L) {
            j10 = this.f38739d;
        }
        long j13 = j10;
        if (am1Var2.f36776e == -3.4028235E38f) {
            f10 = this.f38742g;
        }
        float f12 = f10;
        if (am1Var2.f36777f == -3.4028235E38f) {
            f11 = this.f38743h;
        }
        float f13 = f11;
        if (am1Var2.f36774c == -9223372036854775807L) {
            j11 = this.f38740e;
        }
        long j14 = j11;
        if (am1Var2.f36775d == -9223372036854775807L) {
            j12 = this.f38741f;
        }
        am1 am1Var3 = new am1(j13, j14, j12, f12, f13);
        if (!am1Var3.equals(hm1Var2.f39246d)) {
            xl1 xl1Var = new xl1();
            List list2 = Collections.EMPTY_LIST;
            um2 um2VarG = r51.g();
            em1 em1Var = em1.f38181d;
            wl1 wl1Var = hm1Var2.f39248f;
            wl1Var.getClass();
            ul1 ul1Var = new ul1(wl1Var);
            String str3 = hm1Var2.f39244b;
            lm1 lm1Var = hm1Var2.f39247e;
            hm1Var2.f39246d.getClass();
            em1 em1Var2 = hm1Var2.f39249g;
            cm1 cm1Var3 = hm1Var2.f39245c;
            if (cm1Var3 != null) {
                String str4 = cm1Var3.f37096e;
                String str5 = cm1Var3.f37093b;
                Uri uri2 = cm1Var3.f37092a;
                List list3 = cm1Var3.f37095d;
                r51 r51Var2 = cm1Var3.f37097f;
                Object obj2 = cm1Var3.f37098g;
                yl1 yl1Var = cm1Var3.f37094c;
                if (yl1Var != null) {
                    str2 = str4;
                    list = list3;
                    r51Var = r51Var2;
                    obj = obj2;
                    xl1Var = new xl1(yl1Var);
                } else {
                    str2 = str4;
                    list = list3;
                    r51Var = r51Var2;
                    obj = obj2;
                    xl1Var = new xl1();
                }
                str = str5;
                uri = uri2;
            } else {
                uri = null;
                str = null;
                str2 = null;
                obj = null;
                list = list2;
                r51Var = um2VarG;
            }
            long j15 = am1Var3.f36773b;
            xl1 xl1Var2 = xl1Var;
            long j16 = am1Var3.f36774c;
            long j17 = am1Var3.f36775d;
            float f14 = am1Var3.f36776e;
            float f15 = am1Var3.f36777f;
            if (xl1Var2.f44754b != null && xl1Var2.f44753a == null) {
                throw new IllegalStateException();
            }
            if (uri != null) {
                cm1Var = new cm1(uri, str, xl1Var2.f44753a != null ? new yl1(xl1Var2) : null, list, str2, r51Var, obj);
            } else {
                cm1Var = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            String str6 = str3;
            wl1 wl1Var2 = new wl1(ul1Var);
            am1 am1Var4 = new am1(j15, j16, j17, f14, f15);
            if (lm1Var == null) {
                lm1Var = lm1.H;
            }
            hm1Var2 = new hm1(str6, wl1Var2, cm1Var, am1Var4, lm1Var, em1Var2);
        }
        mo moVarA = zm1Var.a(hm1Var2);
        r51 r51Var3 = hm1Var2.f39245c.f37097f;
        if (!r51Var3.isEmpty()) {
            mo[] moVarArr = new mo[r51Var3.size() + 1];
            moVarArr[0] = moVarA;
            int i = 0;
            while (i < r51Var3.size()) {
                o30 o30Var = this.f38737b;
                o30Var.getClass();
                ae0 ae0Var2 = new ae0(0);
                ae0 ae0Var3 = this.f38738c;
                if (ae0Var3 != null) {
                    ae0Var2 = ae0Var3;
                }
                int i10 = i + 1;
                if (r51Var3.get(i) != null) {
                    throw new ClassCastException();
                }
                moVarArr[i10] = new xz2(null, o30Var, ae0Var2, true);
                i = i10;
            }
            moVarA = new ss1(moVarArr, 0);
        }
        mo wvVar = moVarA;
        wl1 wl1Var3 = hm1Var2.f39248f;
        long j18 = wl1Var3.f44068b;
        if (j18 != 0 || wl1Var3.f44069c != Long.MIN_VALUE || wl1Var3.f44071e) {
            long jA = lb3.a(j18);
            long jA2 = lb3.a(hm1Var2.f39248f.f44069c);
            wl1 wl1Var4 = hm1Var2.f39248f;
            wvVar = new wv(wvVar, jA, jA2, !wl1Var4.f44072f, wl1Var4.f44070d, wl1Var4.f44071e);
        }
        hm1Var2.f39245c.getClass();
        hm1Var2.f39245c.getClass();
        return wvVar;
    }

    public static zm1 a(Class cls, o30 o30Var) {
        try {
            return (zm1) cls.getConstructor(o30.class).newInstance(o30Var);
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override // yads.zm1
    public final zm1 a(hd0 hd0Var) {
        fe0 fe0Var = this.f38736a;
        if (hd0Var != null) {
            fe0Var.f38434f = hd0Var;
            Iterator it = fe0Var.f38432d.values().iterator();
            while (it.hasNext()) {
                ((zm1) it.next()).a(hd0Var);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // yads.zm1
    public final zm1 a(ae0 ae0Var) {
        if (ae0Var != null) {
            this.f38738c = ae0Var;
            fe0 fe0Var = this.f38736a;
            fe0Var.f38435g = ae0Var;
            Iterator it = fe0Var.f38432d.values().iterator();
            while (it.hasNext()) {
                ((zm1) it.next()).a(ae0Var);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
