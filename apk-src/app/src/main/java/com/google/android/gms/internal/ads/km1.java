package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class km1 extends vv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final km1 f7264b = new km1();

    public static void N(nm1 nm1Var, wl1 wl1Var) throws IOException {
        jm1 jm1Var = nm1Var.f8373b;
        if (wl1Var == null || (wl1Var instanceof xl1)) {
            if (nm1Var.f8380j != null) {
                nm1Var.d();
            }
            nm1Var.j();
            jm1Var.write("null");
            return;
        }
        if (wl1Var instanceof am1) {
            am1 am1VarE = wl1Var.e();
            Serializable serializable = am1VarE.f3324b;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean zBooleanValue = ((Boolean) serializable).booleanValue();
                    nm1Var.d();
                    nm1Var.j();
                    jm1Var.write(true != zBooleanValue ? "false" : "true");
                    return;
                }
                String strA = am1VarE.a();
                if (strA != null) {
                    nm1Var.d();
                    nm1Var.j();
                    nm1Var.h(strA);
                    return;
                } else {
                    if (nm1Var.f8380j != null) {
                        nm1Var.d();
                    }
                    nm1Var.j();
                    jm1Var.write("null");
                    return;
                }
            }
            Number numberF = am1VarE.f();
            nm1Var.d();
            String string = numberF.toString();
            Class<?> cls = numberF.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    if (nm1Var.i != 1) {
                        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                    }
                } else if (cls != Float.class && cls != Double.class && !nm1.f8371k.matcher(string).matches()) {
                    String strValueOf = String.valueOf(cls);
                    throw new IllegalArgumentException(om1.n(new StringBuilder(strValueOf.length() + 47 + string.length()), "String created by ", strValueOf, " is not a valid JSON number: ", string));
                }
            }
            nm1Var.j();
            jm1Var.append((CharSequence) string);
            return;
        }
        boolean z5 = wl1Var instanceof vl1;
        if (z5) {
            nm1Var.d();
            nm1Var.j();
            int i = nm1Var.f8375d;
            int[] iArr = nm1Var.f8374c;
            if (i == iArr.length) {
                nm1Var.f8374c = Arrays.copyOf(iArr, i + i);
            }
            int[] iArr2 = nm1Var.f8374c;
            int i10 = nm1Var.f8375d;
            nm1Var.f8375d = i10 + 1;
            iArr2[i10] = 1;
            jm1Var.write(91);
            if (!z5) {
                throw new IllegalStateException("Not a JSON Array: ".concat(wl1Var.toString()));
            }
            Iterator it = ((vl1) wl1Var).f11418b.iterator();
            while (it.hasNext()) {
                N(nm1Var, (wl1) it.next());
            }
            nm1Var.a(1, 2, ']');
            return;
        }
        if (!(wl1Var instanceof yl1)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(wl1Var.getClass())));
        }
        nm1Var.d();
        nm1Var.j();
        int i11 = nm1Var.f8375d;
        int[] iArr3 = nm1Var.f8374c;
        if (i11 == iArr3.length) {
            nm1Var.f8374c = Arrays.copyOf(iArr3, i11 + i11);
        }
        int[] iArr4 = nm1Var.f8374c;
        int i12 = nm1Var.f8375d;
        nm1Var.f8375d = i12 + 1;
        iArr4[i12] = 3;
        jm1Var.write(123);
        Iterator it2 = ((dm1) wl1Var.c().f12663b.entrySet()).iterator();
        while (((fm1) it2).hasNext()) {
            gm1 gm1VarB = ((cm1) it2).b();
            String str = (String) gm1VarB.getKey();
            Objects.requireNonNull(str, "name == null");
            if (nm1Var.f8380j != null) {
                throw new IllegalStateException("Already wrote a name, expecting a value.");
            }
            int iB = nm1Var.b();
            if (iB != 3 && iB != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            nm1Var.f8380j = str;
            N(nm1Var, (wl1) gm1VarB.getValue());
        }
        nm1Var.a(3, 5, '}');
    }
}
