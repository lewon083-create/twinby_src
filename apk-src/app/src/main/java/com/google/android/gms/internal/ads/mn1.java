package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mn1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f7953c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap1 f7954a = new ap1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7955b;

    static {
        new mn1(0);
    }

    public mn1() {
    }

    public static void b(hn1 hn1Var, mp1 mp1Var, int i, Object obj) {
        if (mp1Var == mp1.f7990e) {
            hn1Var.Q(i, 3);
            ((sn1) ((pm1) obj)).u(hn1Var);
            hn1Var.Q(i, 4);
            return;
        }
        hn1Var.Q(i, mp1Var.f7994c);
        np1 np1Var = np1.f8419b;
        switch (mp1Var.ordinal()) {
            case 0:
                hn1Var.i0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                hn1Var.g0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                hn1Var.h0(((Long) obj).longValue());
                break;
            case 3:
                hn1Var.h0(((Long) obj).longValue());
                break;
            case 4:
                hn1Var.e0(((Integer) obj).intValue());
                break;
            case 5:
                hn1Var.i0(((Long) obj).longValue());
                break;
            case 6:
                hn1Var.g0(((Integer) obj).intValue());
                break;
            case 7:
                hn1Var.d0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof bn1)) {
                    hn1Var.j0((String) obj);
                } else {
                    hn1Var.a0((bn1) obj);
                }
                break;
            case 9:
                ((sn1) ((pm1) obj)).u(hn1Var);
                break;
            case 10:
                hn1Var.c0((pm1) obj);
                break;
            case 11:
                if (!(obj instanceof bn1)) {
                    byte[] bArr = (byte[]) obj;
                    hn1Var.b0(bArr.length, bArr);
                } else {
                    hn1Var.a0((bn1) obj);
                }
                break;
            case 12:
                hn1Var.f0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof un1)) {
                    hn1Var.e0(((Integer) obj).intValue());
                } else {
                    hn1Var.e0(((un1) obj).h());
                }
                break;
            case 14:
                hn1Var.g0(((Integer) obj).intValue());
                break;
            case 15:
                hn1Var.i0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                hn1Var.f0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                hn1Var.h0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f7955b) {
            return;
        }
        ap1 ap1Var = this.f7954a;
        int i = ap1Var.f3352c;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = ap1Var.a(i10).f3849c;
            if (obj instanceof sn1) {
                sn1 sn1Var = (sn1) obj;
                so1.f10369c.a(sn1Var.getClass()).a(sn1Var);
                sn1Var.i();
            }
        }
        Iterator it = ap1Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof sn1) {
                sn1 sn1Var2 = (sn1) value;
                so1.f10369c.a(sn1Var2.getClass()).a(sn1Var2);
                sn1Var2.i();
            }
        }
        if (!ap1Var.f3354e) {
            if (ap1Var.f3352c > 0) {
                ap1Var.a(0).f3848b.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = ap1Var.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!ap1Var.f3354e) {
            ap1Var.f3353d = ap1Var.f3353d.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ap1Var.f3353d);
            ap1Var.f3356g = ap1Var.f3356g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ap1Var.f3356g);
            ap1Var.f3354e = true;
        }
        this.f7955b = true;
    }

    public final Object clone() {
        mn1 mn1Var = new mn1();
        ap1 ap1Var = this.f7954a;
        if (ap1Var.f3352c > 0) {
            ap1Var.a(0).f3848b.getClass();
            throw new ClassCastException();
        }
        Iterator it = ap1Var.b().iterator();
        if (!it.hasNext()) {
            return mn1Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mn1) {
            return this.f7954a.equals(((mn1) obj).f7954a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7954a.hashCode();
    }

    public mn1(int i) {
        a();
        a();
    }
}
