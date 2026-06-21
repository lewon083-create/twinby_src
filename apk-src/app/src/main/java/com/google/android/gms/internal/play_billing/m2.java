package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.om1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends g3 {
    private static final m2 zzb;
    private k3 zzd = d4.f14161f;

    static {
        m2 m2Var = new m2();
        zzb = m2Var;
        g3.k(m2.class, m2Var);
    }

    public static l2 n() {
        return (l2) zzb.f();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void o(m2 m2Var, Iterable iterable) {
        k3 k3Var = m2Var.zzd;
        if (!((r2) k3Var).f14295b) {
            int size = k3Var.size();
            m2Var.zzd = k3Var.d(size + size);
        }
        k3 k3Var2 = m2Var.zzd;
        Charset charset = l3.f14238a;
        iterable.getClass();
        if (iterable instanceof p3) {
            List listH = ((p3) iterable).h();
            if (k3Var2 != 0) {
                throw new ClassCastException();
            }
            k3Var2.size();
            Iterator it = listH.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof w2) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                w2.g(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof b4) {
            k3Var2.addAll((Collection<? extends E>) ((Collection) iterable));
            return;
        }
        if (iterable instanceof Collection) {
            int size2 = ((Collection) iterable).size();
            if (k3Var2 instanceof ArrayList) {
                ((ArrayList) k3Var2).ensureCapacity(k3Var2.size() + size2);
            }
            if (k3Var2 instanceof d4) {
                d4 d4Var = (d4) k3Var2;
                int i = d4Var.f14163d + size2;
                int length = d4Var.f14162c.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = om1.g(length, 3, 2, 1, 10);
                        }
                        d4Var.f14162c = Arrays.copyOf(d4Var.f14162c, length);
                    } else {
                        d4Var.f14162c = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size3 = k3Var2.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    f3.a(size3, k3Var2);
                    throw null;
                }
                k3Var2.add(obj);
            }
            return;
        }
        List list = (List) iterable;
        int size4 = list.size();
        for (int i10 = 0; i10 < size4; i10++) {
            Object obj2 = list.get(i10);
            if (obj2 == null) {
                f3.a(size3, k3Var2);
                throw null;
            }
            k3Var2.add(obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", k2.class});
        }
        if (i10 == 3) {
            return new m2();
        }
        if (i10 == 4) {
            return new l2(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
