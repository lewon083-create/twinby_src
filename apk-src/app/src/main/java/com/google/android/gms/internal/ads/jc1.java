package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f6819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f6820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long[] f6821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hc1[][] f6822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hc1[] f6823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f6824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f6825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BigInteger f6826h;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(KotlinVersion.MAX_COMPONENT_VALUE).subtract(BigInteger.valueOf(19L));
        f6824f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f6825g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f6826h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        n90 n90Var = new n90(21);
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        n90Var.f8249d = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        n90Var.f8248c = bigIntegerModPow2;
        f6819a = rs.L(b(bigIntegerMod));
        f6820b = rs.L(b(bigIntegerMod2));
        f6821c = rs.L(b(bigIntegerModPow));
        f6822d = (hc1[][]) Array.newInstance((Class<?>) hc1.class, 32, 8);
        n90 n90VarA = n90Var;
        for (int i = 0; i < 32; i++) {
            n90 n90VarA2 = n90VarA;
            for (int i10 = 0; i10 < 8; i10++) {
                f6822d[i][i10] = c(n90VarA2);
                n90VarA2 = a(n90VarA2, n90VarA);
            }
            for (int i11 = 0; i11 < 8; i11++) {
                n90VarA = a(n90VarA, n90VarA);
            }
        }
        n90 n90VarA3 = a(n90Var, n90Var);
        f6823e = new hc1[8];
        for (int i12 = 0; i12 < 8; i12++) {
            f6823e[i12] = c(n90Var);
            n90Var = a(n90Var, n90VarA3);
        }
    }

    public static n90 a(n90 n90Var, n90 n90Var2) {
        n90 n90Var3 = new n90(21);
        BigInteger bigIntegerMultiply = f6825g.multiply(((BigInteger) n90Var.f8248c).multiply((BigInteger) n90Var2.f8248c).multiply((BigInteger) n90Var.f8249d).multiply((BigInteger) n90Var2.f8249d));
        BigInteger bigInteger = f6824f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) n90Var.f8248c).multiply((BigInteger) n90Var2.f8249d).add(((BigInteger) n90Var2.f8248c).multiply((BigInteger) n90Var.f8249d));
        BigInteger bigInteger2 = BigInteger.ONE;
        n90Var3.f8248c = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        n90Var3.f8249d = ((BigInteger) n90Var.f8249d).multiply((BigInteger) n90Var2.f8249d).add(((BigInteger) n90Var.f8248c).multiply((BigInteger) n90Var2.f8248c)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return n90Var3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            int i10 = 31 - i;
            bArr[i] = bArr[i10];
            bArr[i10] = b2;
        }
        return bArr;
    }

    public static hc1 c(n90 n90Var) {
        BigInteger bigIntegerAdd = ((BigInteger) n90Var.f8249d).add((BigInteger) n90Var.f8248c);
        BigInteger bigInteger = f6824f;
        return new hc1(rs.L(b(bigIntegerAdd.mod(bigInteger))), rs.L(b(((BigInteger) n90Var.f8249d).subtract((BigInteger) n90Var.f8248c).mod(bigInteger))), rs.L(b(f6826h.multiply((BigInteger) n90Var.f8248c).multiply((BigInteger) n90Var.f8249d).mod(bigInteger))));
    }
}
