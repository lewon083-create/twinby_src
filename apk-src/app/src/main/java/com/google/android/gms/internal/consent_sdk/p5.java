package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13516c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r6 f13517a = new r6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13518b;

    static {
        new p5(0);
    }

    public p5() {
    }

    public static void b(l5 l5Var, d7 d7Var, int i, Object obj) throws IOException {
        if (d7Var == d7.f13363f) {
            l5Var.z(i, 3);
            ((f5) obj).a(l5Var);
            l5Var.z(i, 4);
            return;
        }
        l5Var.z(i, d7Var.f13366c);
        e7 e7Var = e7.f13373b;
        switch (d7Var.ordinal()) {
            case 0:
                l5Var.v(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                l5Var.t(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                l5Var.D(((Long) obj).longValue());
                break;
            case 3:
                l5Var.D(((Long) obj).longValue());
                break;
            case 4:
                l5Var.x(((Integer) obj).intValue());
                break;
            case 5:
                l5Var.v(((Long) obj).longValue());
                break;
            case 6:
                l5Var.t(((Integer) obj).intValue());
                break;
            case 7:
                byte bBooleanValue = ((Boolean) obj).booleanValue();
                if (l5Var.f13462e == l5Var.f13461d) {
                    l5Var.k();
                }
                byte[] bArr = l5Var.f13460c;
                int i10 = l5Var.f13462e;
                bArr[i10] = bBooleanValue;
                l5Var.f13462e = i10 + 1;
                break;
            case 8:
                if (!(obj instanceof k5)) {
                    l5Var.y((String) obj);
                } else {
                    l5Var.r((k5) obj);
                }
                break;
            case 9:
                ((f5) obj).a(l5Var);
                break;
            case 10:
                f5 f5Var = (f5) obj;
                l5Var.B(f5Var.c());
                f5Var.a(l5Var);
                break;
            case 11:
                if (!(obj instanceof k5)) {
                    byte[] bArr2 = (byte[]) obj;
                    int length = bArr2.length;
                    l5Var.B(length);
                    l5Var.E(length, bArr2);
                } else {
                    l5Var.r((k5) obj);
                }
                break;
            case 12:
                l5Var.B(((Integer) obj).intValue());
                break;
            case 13:
                l5Var.x(((Integer) obj).intValue());
                break;
            case 14:
                l5Var.t(((Integer) obj).intValue());
                break;
            case 15:
                l5Var.v(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                l5Var.B((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                l5Var.D((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f13518b) {
            return;
        }
        r6 r6Var = this.f13517a;
        int i = r6Var.f13540c;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = r6Var.c(i10).f13550c;
            if (obj instanceof t5) {
                ((t5) obj).j();
            }
        }
        Iterator it = r6Var.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof t5) {
                ((t5) value).j();
            }
        }
        if (!r6Var.f13542e) {
            if (r6Var.f13540c > 0) {
                r6Var.c(0).f13549b.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = r6Var.a().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!r6Var.f13542e) {
            r6Var.f13541d = r6Var.f13541d.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(r6Var.f13541d);
            r6Var.f13544g = r6Var.f13544g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(r6Var.f13544g);
            r6Var.f13542e = true;
        }
        this.f13518b = true;
    }

    public final Object clone() {
        p5 p5Var = new p5();
        r6 r6Var = this.f13517a;
        if (r6Var.f13540c > 0) {
            r6Var.c(0).f13549b.getClass();
            throw new ClassCastException();
        }
        Iterator it = r6Var.a().iterator();
        if (!it.hasNext()) {
            return p5Var;
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
        if (obj instanceof p5) {
            return this.f13517a.equals(((p5) obj).f13517a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13517a.hashCode();
    }

    public p5(int i) {
        a();
        a();
    }
}
