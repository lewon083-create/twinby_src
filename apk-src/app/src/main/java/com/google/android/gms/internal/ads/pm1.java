package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pm1 {
    protected transient int zzq;

    public static void e(Iterable iterable, List list) {
        Charset charset = ao1.f3341a;
        iterable.getClass();
        if (iterable instanceof fo1) {
            List listH = ((fo1) iterable).h();
            fo1 fo1Var = (fo1) list;
            int size = list.size();
            for (Object obj : listH) {
                if (obj == null) {
                    int size2 = fo1Var.size() - size;
                    String strL = l7.o.l(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                    int size3 = fo1Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(strL);
                        }
                        fo1Var.remove(size3);
                    }
                } else if (obj instanceof bn1) {
                    fo1Var.j();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    bn1.A(bArr, 0, bArr.length);
                    fo1Var.j();
                } else {
                    fo1Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof ro1) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof to1) {
                to1 to1Var = (to1) list;
                int i = to1Var.f10683d + size4;
                int length = to1Var.f10682c.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = om1.g(length, 3, 2, 1, 10);
                        }
                        to1Var.f10682c = Arrays.copyOf(to1Var.f10682c, length);
                    } else {
                        to1Var.f10682c = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    qn1.f(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj3 = list2.get(i10);
            if (obj3 == null) {
                qn1.f(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    public final zm1 a() {
        try {
            int iD = ((sn1) this).d(null);
            zm1 zm1Var = bn1.f3837c;
            byte[] bArr = new byte[iD];
            boolean z5 = hn1.f6201c;
            fn1 fn1Var = new fn1(iD, bArr);
            ((sn1) this).u(fn1Var);
            fn1Var.P();
            return new zm1(bArr);
        } catch (IOException e3) {
            throw new RuntimeException(f("ByteString"), e3);
        }
    }

    public final byte[] b() {
        try {
            int iD = ((sn1) this).d(null);
            byte[] bArr = new byte[iD];
            boolean z5 = hn1.f6201c;
            fn1 fn1Var = new fn1(iD, bArr);
            ((sn1) this).u(fn1Var);
            fn1Var.P();
            return bArr;
        } catch (IOException e3) {
            throw new RuntimeException(f("byte array"), e3);
        }
    }

    public final void c(OutputStream outputStream) {
        sn1 sn1Var = (sn1) this;
        int iD = sn1Var.d(null);
        boolean z5 = hn1.f6201c;
        if (iD > 4096) {
            iD = 4096;
        }
        gn1 gn1Var = new gn1(outputStream, iD);
        sn1Var.u(gn1Var);
        if (gn1Var.f5881f > 0) {
            gn1Var.l0();
        }
    }

    public abstract int d(yo1 yo1Var);

    public final String f(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 18 + str.length() + 44);
        l7.o.t(sb2, "Serializing ", name, " to a ", str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }
}
