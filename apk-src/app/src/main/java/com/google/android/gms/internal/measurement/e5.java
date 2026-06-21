package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13715c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o6 f13716a = new o6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13717b;

    static {
        new e5(0);
    }

    public e5() {
    }

    public static void b(a5 a5Var, y6 y6Var, int i, Object obj) throws androidx.datastore.preferences.protobuf.m {
        if (y6Var == y6.f14101e) {
            Charset charset = r5.f13944a;
            a5Var.w(i, 3);
            ((k5) ((t4) obj)).d(a5Var);
            a5Var.w(i, 4);
            return;
        }
        a5Var.w(i, y6Var.f14104c);
        z6 z6Var = z6.f14119b;
        switch (y6Var.ordinal()) {
            case 0:
                a5Var.J(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                a5Var.H(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                a5Var.I(((Long) obj).longValue());
                break;
            case 3:
                a5Var.I(((Long) obj).longValue());
                break;
            case 4:
                a5Var.F(((Integer) obj).intValue());
                break;
            case 5:
                a5Var.J(((Long) obj).longValue());
                break;
            case 6:
                a5Var.H(((Integer) obj).intValue());
                break;
            case 7:
                a5Var.E(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof z4)) {
                    a5Var.L((String) obj);
                } else {
                    a5Var.D((z4) obj);
                }
                break;
            case 9:
                ((k5) ((t4) obj)).d(a5Var);
                break;
            case 10:
                a5Var.getClass();
                k5 k5Var = (k5) ((t4) obj);
                a5Var.G(k5Var.k());
                k5Var.d(a5Var);
                break;
            case 11:
                if (!(obj instanceof z4)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    a5Var.G(length);
                    a5Var.K(length, bArr);
                } else {
                    a5Var.D((z4) obj);
                }
                break;
            case 12:
                a5Var.G(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof m5)) {
                    a5Var.F(((Integer) obj).intValue());
                } else {
                    a5Var.F(((m5) obj).h());
                }
                break;
            case 14:
                a5Var.H(((Integer) obj).intValue());
                break;
            case 15:
                a5Var.J(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                a5Var.G((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                a5Var.I((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f13717b) {
            return;
        }
        o6 o6Var = this.f13716a;
        int i = o6Var.f13904c;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = o6Var.a(i10).f13919c;
            if (obj instanceof k5) {
                ((k5) obj).g();
            }
        }
        Iterator it = o6Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof k5) {
                ((k5) value).g();
            }
        }
        if (!o6Var.f13906e) {
            if (o6Var.f13904c > 0) {
                o6Var.a(0).f13918b.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = o6Var.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!o6Var.f13906e) {
            o6Var.f13905d = o6Var.f13905d.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(o6Var.f13905d);
            o6Var.f13908g = o6Var.f13908g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(o6Var.f13908g);
            o6Var.f13906e = true;
        }
        this.f13717b = true;
    }

    public final Object clone() {
        e5 e5Var = new e5();
        o6 o6Var = this.f13716a;
        if (o6Var.f13904c > 0) {
            o6Var.a(0).f13918b.getClass();
            throw new ClassCastException();
        }
        Iterator it = o6Var.b().iterator();
        if (!it.hasNext()) {
            return e5Var;
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
        if (obj instanceof e5) {
            return this.f13716a.equals(((e5) obj).f13716a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13716a.hashCode();
    }

    public e5(int i) {
        a();
        a();
    }
}
