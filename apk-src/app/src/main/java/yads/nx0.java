package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nx0 implements xq {
    public static final nx0 H = new nx0(new mx0());
    public static final wq I = new zl.g0(9);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public int G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f41369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f41370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f41371h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f41372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final vs1 f41373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f41374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f41375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f41376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f41377o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lk0 f41378p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f41379q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f41380r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f41381s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f41382t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f41383u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f41384v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f41385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f41386x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mx f41387y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f41388z;

    public nx0(mx0 mx0Var) {
        this.f41365b = mx0Var.f41066a;
        this.f41366c = mx0Var.f41067b;
        this.f41367d = lb3.e(mx0Var.f41068c);
        this.f41368e = mx0Var.f41069d;
        this.f41369f = mx0Var.f41070e;
        int i = mx0Var.f41071f;
        this.f41370g = i;
        int i10 = mx0Var.f41072g;
        this.f41371h = i10;
        this.i = i10 != -1 ? i10 : i;
        this.f41372j = mx0Var.f41073h;
        this.f41373k = mx0Var.i;
        this.f41374l = mx0Var.f41074j;
        this.f41375m = mx0Var.f41075k;
        this.f41376n = mx0Var.f41076l;
        List list = mx0Var.f41077m;
        this.f41377o = list == null ? Collections.EMPTY_LIST : list;
        lk0 lk0Var = mx0Var.f41078n;
        this.f41378p = lk0Var;
        this.f41379q = mx0Var.f41079o;
        this.f41380r = mx0Var.f41080p;
        this.f41381s = mx0Var.f41081q;
        this.f41382t = mx0Var.f41082r;
        int i11 = mx0Var.f41083s;
        this.f41383u = i11 == -1 ? 0 : i11;
        float f10 = mx0Var.f41084t;
        this.f41384v = f10 == -1.0f ? 1.0f : f10;
        this.f41385w = mx0Var.f41085u;
        this.f41386x = mx0Var.f41086v;
        this.f41387y = mx0Var.f41087w;
        this.f41388z = mx0Var.f41088x;
        this.A = mx0Var.f41089y;
        this.B = mx0Var.f41090z;
        int i12 = mx0Var.A;
        this.C = i12 == -1 ? 0 : i12;
        int i13 = mx0Var.B;
        this.D = i13 != -1 ? i13 : 0;
        this.E = mx0Var.C;
        int i14 = mx0Var.D;
        if (i14 != 0 || lk0Var == null) {
            this.F = i14;
        } else {
            this.F = 1;
        }
    }

    public final int a() {
        int i;
        int i10 = this.f41380r;
        if (i10 == -1 || (i = this.f41381s) == -1) {
            return -1;
        }
        return i10 * i;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && nx0.class == obj.getClass()) {
            nx0 nx0Var = (nx0) obj;
            int i10 = this.G;
            if ((i10 == 0 || (i = nx0Var.G) == 0 || i10 == i) && this.f41368e == nx0Var.f41368e && this.f41369f == nx0Var.f41369f && this.f41370g == nx0Var.f41370g && this.f41371h == nx0Var.f41371h && this.f41376n == nx0Var.f41376n && this.f41379q == nx0Var.f41379q && this.f41380r == nx0Var.f41380r && this.f41381s == nx0Var.f41381s && this.f41383u == nx0Var.f41383u && this.f41386x == nx0Var.f41386x && this.f41388z == nx0Var.f41388z && this.A == nx0Var.A && this.B == nx0Var.B && this.C == nx0Var.C && this.D == nx0Var.D && this.E == nx0Var.E && this.F == nx0Var.F && Float.compare(this.f41382t, nx0Var.f41382t) == 0 && Float.compare(this.f41384v, nx0Var.f41384v) == 0 && lb3.a(this.f41365b, nx0Var.f41365b) && lb3.a(this.f41366c, nx0Var.f41366c) && lb3.a(this.f41372j, nx0Var.f41372j) && lb3.a(this.f41374l, nx0Var.f41374l) && lb3.a(this.f41375m, nx0Var.f41375m) && lb3.a(this.f41367d, nx0Var.f41367d) && Arrays.equals(this.f41385w, nx0Var.f41385w) && lb3.a(this.f41373k, nx0Var.f41373k) && lb3.a(this.f41387y, nx0Var.f41387y) && lb3.a(this.f41378p, nx0Var.f41378p) && a(nx0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.G == 0) {
            String str = this.f41365b;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f41366c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f41367d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f41368e) * 31) + this.f41369f) * 31) + this.f41370g) * 31) + this.f41371h) * 31;
            String str4 = this.f41372j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            vs1 vs1Var = this.f41373k;
            int iHashCode5 = (iHashCode4 + (vs1Var == null ? 0 : Arrays.hashCode(vs1Var.f44117b))) * 31;
            String str5 = this.f41374l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f41375m;
            this.G = ((((((((((((((((Float.floatToIntBits(this.f41384v) + ((((Float.floatToIntBits(this.f41382t) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f41376n) * 31) + ((int) this.f41379q)) * 31) + this.f41380r) * 31) + this.f41381s) * 31)) * 31) + this.f41383u) * 31)) * 31) + this.f41386x) * 31) + this.f41388z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f41365b);
        sb2.append(", ");
        sb2.append(this.f41366c);
        sb2.append(", ");
        sb2.append(this.f41374l);
        sb2.append(", ");
        sb2.append(this.f41375m);
        sb2.append(", ");
        sb2.append(this.f41372j);
        sb2.append(", ");
        sb2.append(this.i);
        sb2.append(", ");
        sb2.append(this.f41367d);
        sb2.append(", [");
        sb2.append(this.f41380r);
        sb2.append(", ");
        sb2.append(this.f41381s);
        sb2.append(", ");
        sb2.append(this.f41382t);
        sb2.append("], [");
        sb2.append(this.f41388z);
        sb2.append(", ");
        return t.z.d(this.A, "])", sb2);
    }

    public final boolean a(nx0 nx0Var) {
        if (this.f41377o.size() != nx0Var.f41377o.size()) {
            return false;
        }
        for (int i = 0; i < this.f41377o.size(); i++) {
            if (!Arrays.equals((byte[]) this.f41377o.get(i), (byte[]) nx0Var.f41377o.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static nx0 a(Bundle bundle) {
        mx0 mx0Var = new mx0();
        if (bundle != null) {
            ClassLoader classLoader = yq.class.getClassLoader();
            int i = lb3.f40466a;
            bundle.setClassLoader(classLoader);
        }
        int i10 = 0;
        String string = bundle.getString(Integer.toString(0, 36));
        nx0 nx0Var = H;
        String str = nx0Var.f41365b;
        if (string == null) {
            string = str;
        }
        mx0Var.f41066a = string;
        String string2 = bundle.getString(Integer.toString(1, 36));
        String str2 = nx0Var.f41366c;
        if (string2 == null) {
            string2 = str2;
        }
        mx0Var.f41067b = string2;
        String string3 = bundle.getString(Integer.toString(2, 36));
        String str3 = nx0Var.f41367d;
        if (string3 == null) {
            string3 = str3;
        }
        mx0Var.f41068c = string3;
        mx0Var.f41069d = bundle.getInt(Integer.toString(3, 36), nx0Var.f41368e);
        mx0Var.f41070e = bundle.getInt(Integer.toString(4, 36), nx0Var.f41369f);
        mx0Var.f41071f = bundle.getInt(Integer.toString(5, 36), nx0Var.f41370g);
        mx0Var.f41072g = bundle.getInt(Integer.toString(6, 36), nx0Var.f41371h);
        String string4 = bundle.getString(Integer.toString(7, 36));
        String str4 = nx0Var.f41372j;
        if (string4 == null) {
            string4 = str4;
        }
        mx0Var.f41073h = string4;
        vs1 vs1Var = (vs1) bundle.getParcelable(Integer.toString(8, 36));
        vs1 vs1Var2 = nx0Var.f41373k;
        if (vs1Var == null) {
            vs1Var = vs1Var2;
        }
        mx0Var.i = vs1Var;
        String string5 = bundle.getString(Integer.toString(9, 36));
        String str5 = nx0Var.f41374l;
        if (string5 == null) {
            string5 = str5;
        }
        mx0Var.f41074j = string5;
        String string6 = bundle.getString(Integer.toString(10, 36));
        String str6 = nx0Var.f41375m;
        if (string6 == null) {
            string6 = str6;
        }
        mx0Var.f41075k = string6;
        mx0Var.f41076l = bundle.getInt(Integer.toString(11, 36), nx0Var.f41376n);
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + "_" + Integer.toString(i10, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i10++;
        }
        mx0Var.f41077m = arrayList;
        mx0Var.f41078n = (lk0) bundle.getParcelable(Integer.toString(13, 36));
        String string7 = Integer.toString(14, 36);
        nx0 nx0Var2 = H;
        mx0Var.f41079o = bundle.getLong(string7, nx0Var2.f41379q);
        mx0Var.f41080p = bundle.getInt(Integer.toString(15, 36), nx0Var2.f41380r);
        mx0Var.f41081q = bundle.getInt(Integer.toString(16, 36), nx0Var2.f41381s);
        mx0Var.f41082r = bundle.getFloat(Integer.toString(17, 36), nx0Var2.f41382t);
        mx0Var.f41083s = bundle.getInt(Integer.toString(18, 36), nx0Var2.f41383u);
        mx0Var.f41084t = bundle.getFloat(Integer.toString(19, 36), nx0Var2.f41384v);
        mx0Var.f41085u = bundle.getByteArray(Integer.toString(20, 36));
        mx0Var.f41086v = bundle.getInt(Integer.toString(21, 36), nx0Var2.f41386x);
        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
        if (bundle2 != null) {
            mx0Var.f41087w = (mx) mx.f41060g.fromBundle(bundle2);
        }
        mx0Var.f41088x = bundle.getInt(Integer.toString(23, 36), nx0Var2.f41388z);
        mx0Var.f41089y = bundle.getInt(Integer.toString(24, 36), nx0Var2.A);
        mx0Var.f41090z = bundle.getInt(Integer.toString(25, 36), nx0Var2.B);
        mx0Var.A = bundle.getInt(Integer.toString(26, 36), nx0Var2.C);
        mx0Var.B = bundle.getInt(Integer.toString(27, 36), nx0Var2.D);
        mx0Var.C = bundle.getInt(Integer.toString(28, 36), nx0Var2.E);
        mx0Var.D = bundle.getInt(Integer.toString(29, 36), nx0Var2.F);
        return new nx0(mx0Var);
    }
}
