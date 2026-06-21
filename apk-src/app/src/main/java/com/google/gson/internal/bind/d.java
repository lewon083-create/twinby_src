package com.google.gson.internal.bind;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import me.r;
import me.s;
import me.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends re.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f14947u = new c();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f14948v = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object[] f14949q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14950r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String[] f14951s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f14952t;

    public final void N(int i) {
        if (s() == i) {
            return;
        }
        throw new IllegalStateException("Expected " + pe.a.w(i) + " but was " + pe.a.w(s()) + O());
    }

    public final String O() {
        return " at path " + h();
    }

    public final Object P() {
        return this.f14949q[this.f14950r - 1];
    }

    public final Object Q() {
        Object[] objArr = this.f14949q;
        int i = this.f14950r - 1;
        this.f14950r = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void R(Object obj) {
        int i = this.f14950r;
        Object[] objArr = this.f14949q;
        if (i == objArr.length) {
            int i10 = i * 2;
            this.f14949q = Arrays.copyOf(objArr, i10);
            this.f14952t = Arrays.copyOf(this.f14952t, i10);
            this.f14951s = (String[]) Arrays.copyOf(this.f14951s, i10);
        }
        Object[] objArr2 = this.f14949q;
        int i11 = this.f14950r;
        this.f14950r = i11 + 1;
        objArr2[i11] = obj;
    }

    @Override // re.b
    public final void beginArray() {
        N(1);
        R(((me.m) P()).f28893b.iterator());
        this.f14952t[this.f14950r - 1] = 0;
    }

    @Override // re.b
    public final void beginObject() {
        N(3);
        R(((oe.i) ((s) P()).f28895b.entrySet()).iterator());
    }

    @Override // re.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14949q = new Object[]{f14948v};
        this.f14950r = 1;
    }

    @Override // re.b
    public final void endArray() {
        N(2);
        Q();
        Q();
        int i = this.f14950r;
        if (i > 0) {
            int[] iArr = this.f14952t;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // re.b
    public final void endObject() {
        N(4);
        Q();
        Q();
        int i = this.f14950r;
        if (i > 0) {
            int[] iArr = this.f14952t;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // re.b
    public final String h() {
        StringBuilder sb2 = new StringBuilder("$");
        int i = 0;
        while (i < this.f14950r) {
            Object[] objArr = this.f14949q;
            Object obj = objArr[i];
            if (obj instanceof me.m) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb2.append('[');
                    sb2.append(this.f14952t[i]);
                    sb2.append(']');
                }
            } else if (obj instanceof s) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb2.append('.');
                    String str = this.f14951s[i];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            }
            i++;
        }
        return sb2.toString();
    }

    @Override // re.b
    public final boolean hasNext() {
        int iS = s();
        return (iS == 4 || iS == 2) ? false : true;
    }

    @Override // re.b
    public final boolean nextBoolean() {
        N(8);
        boolean zF = ((t) Q()).f();
        int i = this.f14950r;
        if (i > 0) {
            int[] iArr = this.f14952t;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return zF;
    }

    @Override // re.b
    public final double nextDouble() {
        int iS = s();
        if (iS != 7 && iS != 6) {
            throw new IllegalStateException("Expected " + pe.a.w(7) + " but was " + pe.a.w(iS) + O());
        }
        t tVar = (t) P();
        double dDoubleValue = tVar.f28896b instanceof Number ? tVar.g().doubleValue() : Double.parseDouble(tVar.e());
        if (!this.f32298c && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        Q();
        int i = this.f14950r;
        if (i > 0) {
            int[] iArr = this.f14952t;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return dDoubleValue;
    }

    @Override // re.b
    public final int nextInt() {
        int iS = s();
        if (iS != 7 && iS != 6) {
            throw new IllegalStateException("Expected " + pe.a.w(7) + " but was " + pe.a.w(iS) + O());
        }
        t tVar = (t) P();
        int iIntValue = tVar.f28896b instanceof Number ? tVar.g().intValue() : Integer.parseInt(tVar.e());
        Q();
        int i = this.f14950r;
        if (i > 0) {
            int[] iArr = this.f14952t;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return iIntValue;
    }

    @Override // re.b
    public final long nextLong() {
        int iS = s();
        if (iS != 7 && iS != 6) {
            throw new IllegalStateException("Expected " + pe.a.w(7) + " but was " + pe.a.w(iS) + O());
        }
        long jC = ((t) P()).c();
        Q();
        int i = this.f14950r;
        if (i > 0) {
            int[] iArr = this.f14952t;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return jC;
    }

    @Override // re.b
    public final String nextName() {
        N(5);
        Map.Entry entry = (Map.Entry) ((Iterator) P()).next();
        String str = (String) entry.getKey();
        this.f14951s[this.f14950r - 1] = str;
        R(entry.getValue());
        return str;
    }

    @Override // re.b
    public final void nextNull() {
        N(9);
        Q();
        int i = this.f14950r;
        if (i > 0) {
            int[] iArr = this.f14952t;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // re.b
    public final String nextString() {
        int iS = s();
        if (iS != 6 && iS != 7) {
            throw new IllegalStateException("Expected " + pe.a.w(6) + " but was " + pe.a.w(iS) + O());
        }
        String strE = ((t) Q()).e();
        int i = this.f14950r;
        if (i > 0) {
            int[] iArr = this.f14952t;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return strE;
    }

    @Override // re.b
    public final int s() {
        if (this.f14950r == 0) {
            return 10;
        }
        Object objP = P();
        if (objP instanceof Iterator) {
            boolean z5 = this.f14949q[this.f14950r - 2] instanceof s;
            Iterator it = (Iterator) objP;
            if (!it.hasNext()) {
                return z5 ? 4 : 2;
            }
            if (z5) {
                return 5;
            }
            R(it.next());
            return s();
        }
        if (objP instanceof s) {
            return 3;
        }
        if (objP instanceof me.m) {
            return 1;
        }
        if (!(objP instanceof t)) {
            if (objP instanceof r) {
                return 9;
            }
            if (objP == f14948v) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Serializable serializable = ((t) objP).f28896b;
        if (serializable instanceof String) {
            return 6;
        }
        if (serializable instanceof Boolean) {
            return 8;
        }
        if (serializable instanceof Number) {
            return 7;
        }
        throw new AssertionError();
    }

    @Override // re.b
    public final void skipValue() {
        if (s() == 5) {
            nextName();
            this.f14951s[this.f14950r - 2] = "null";
        } else {
            Q();
            int i = this.f14950r;
            if (i > 0) {
                this.f14951s[i - 1] = "null";
            }
        }
        int i10 = this.f14950r;
        if (i10 > 0) {
            int[] iArr = this.f14952t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // re.b
    public final String toString() {
        return d.class.getSimpleName();
    }
}
