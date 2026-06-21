package vl;

import com.google.android.gms.internal.ads.gs1;
import com.google.android.gms.internal.ads.oc;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Iterable, Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f34908e = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34909b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f34910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f34911d;

    public b() {
        String[] strArr = f34908e;
        this.f34910c = strArr;
        this.f34911d = strArr;
    }

    public final void a(b bVar) {
        int i = bVar.f34909b;
        if (i == 0) {
            return;
        }
        c(this.f34909b + i);
        int i10 = 0;
        while (i10 < bVar.f34909b) {
            String str = bVar.f34910c[i10];
            String str2 = bVar.f34911d[i10];
            k3.f.v(str);
            String strTrim = str.trim();
            k3.f.t(str);
            i10++;
            p(strTrim, str2);
        }
    }

    public final void c(int i) {
        k3.f.r(i >= this.f34909b);
        String[] strArr = this.f34910c;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i10 = length >= 4 ? this.f34909b * 2 : 4;
        if (i <= i10) {
            i = i10;
        }
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
        this.f34910c = strArr2;
        String[] strArr3 = this.f34911d;
        String[] strArr4 = new String[i];
        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i));
        this.f34911d = strArr4;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f34909b = this.f34909b;
            String[] strArr = this.f34910c;
            int i = this.f34909b;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.f34910c = strArr2;
            String[] strArr3 = this.f34911d;
            int i10 = this.f34909b;
            String[] strArr4 = new String[i10];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
            this.f34911d = strArr4;
            return bVar;
        } catch (CloneNotSupportedException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f34909b == bVar.f34909b && Arrays.equals(this.f34910c, bVar.f34910c)) {
            return Arrays.equals(this.f34911d, bVar.f34911d);
        }
        return false;
    }

    public final String f(String str) {
        String str2;
        int iN = n(str);
        return (iN == -1 || (str2 = this.f34911d[iN]) == null) ? "" : str2;
    }

    public final void g(StringBuilder sb2, g gVar) {
        int i = this.f34909b;
        for (int i10 = 0; i10 < i; i10++) {
            String str = this.f34910c[i10];
            String str2 = this.f34911d[i10];
            sb2.append(' ').append(str);
            if (!a.a(str, str2, gVar)) {
                sb2.append("=\"");
                if (str2 == null) {
                    str2 = "";
                }
                m.b(sb2, str2, gVar, true, false);
                sb2.append('\"');
            }
        }
    }

    public final int hashCode() {
        return (((this.f34909b * 31) + Arrays.hashCode(this.f34910c)) * 31) + Arrays.hashCode(this.f34911d);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new gs1(this, 1);
    }

    public final int n(String str) {
        k3.f.v(str);
        for (int i = 0; i < this.f34909b; i++) {
            if (str.equals(this.f34910c[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int o(String str) {
        k3.f.v(str);
        for (int i = 0; i < this.f34909b; i++) {
            if (str.equalsIgnoreCase(this.f34910c[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void p(String str, String str2) {
        int iN = n(str);
        if (iN != -1) {
            this.f34911d[iN] = str2;
            return;
        }
        c(this.f34909b + 1);
        String[] strArr = this.f34910c;
        int i = this.f34909b;
        strArr[i] = str;
        this.f34911d[i] = str2;
        this.f34909b = i + 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            g(sb2, new h().f34919j);
            return sb2.toString();
        } catch (IOException e3) {
            throw new oc(e3);
        }
    }
}
