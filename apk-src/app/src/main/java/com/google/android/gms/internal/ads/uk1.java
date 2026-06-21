package com.google.android.gms.internal.ads;

import io.sentry.SentryOptions;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uk1 implements q91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10963a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f10964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f10965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10966d;

    public uk1(q91 q91Var, byte[] bArr, byte[] bArr2) {
        this.f10966d = q91Var;
        this.f10964b = bArr;
        this.f10965c = bArr2;
    }

    public static byte[] b(yd1 yd1Var) {
        ei1 ei1Var = (ei1) yd1Var.f12603f;
        Integer num = (Integer) yd1Var.f12604g;
        int iOrdinal = ei1Var.ordinal();
        if (iOrdinal == 1) {
            return kd1.b(num.intValue()).b();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return kd1.f7203a.b();
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return kd1.a(num.intValue()).b();
    }

    @Override // com.google.android.gms.internal.ads.q91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f10963a) {
            case 0:
                q91 q91Var = (q91) this.f10966d;
                byte[] bArr3 = this.f10964b;
                int length = bArr3.length;
                byte[] bArr4 = this.f10965c;
                if (length == 0 && bArr4.length == 0) {
                    q91Var.a(bArr, bArr2);
                    return;
                } else {
                    if (!ge1.c(bArr3, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr4.length != 0) {
                        bArr2 = ix.s(bArr2, bArr4);
                    }
                    q91Var.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
                    return;
                }
            default:
                byte[] bArr5 = this.f10964b;
                int length2 = bArr5.length;
                byte[] bArr6 = this.f10965c;
                if (length2 == 0 && bArr6.length == 0) {
                    c(bArr, bArr2);
                    return;
                } else {
                    if (!ge1.c(bArr5, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr6.length != 0) {
                        bArr2 = ix.s(bArr2, bArr6);
                    }
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                }
        }
    }

    public void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            throw new GeneralSecurityException("The length of the signature is not 64.");
        }
        byte[] bArrB = ((sl1) this.f10966d).b();
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i = 31;
            while (true) {
                if (i < 0) {
                    break;
                }
                int i10 = bArrCopyOfRange[i] & 255;
                int i11 = pn1.E[i] & 255;
                if (i10 == i11) {
                    i--;
                    bArr3 = bArr;
                } else if (i10 < i11) {
                    MessageDigest messageDigest = (MessageDigest) il1.f6537e.f6540a.b("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    messageDigest.update(bArrB);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jT = pn1.T(0, bArrDigest) & 2097151;
                    long jU = pn1.U(2, bArrDigest) >> 5;
                    long jT2 = pn1.T(5, bArrDigest) >> 2;
                    long jU2 = pn1.U(7, bArrDigest) >> 7;
                    long jU3 = pn1.U(10, bArrDigest) >> 4;
                    long jT3 = pn1.T(13, bArrDigest) >> 1;
                    long jU4 = pn1.U(15, bArrDigest) >> 6;
                    long jT4 = pn1.T(18, bArrDigest) >> 3;
                    long jT5 = pn1.T(21, bArrDigest) & 2097151;
                    long jU5 = pn1.U(23, bArrDigest) >> 5;
                    long jT6 = pn1.T(26, bArrDigest) >> 2;
                    long jU6 = pn1.U(28, bArrDigest) >> 7;
                    long jU7 = pn1.U(31, bArrDigest) >> 4;
                    long jT7 = pn1.T(34, bArrDigest) >> 1;
                    long jU8 = pn1.U(36, bArrDigest) >> 6;
                    long jT8 = pn1.T(39, bArrDigest) >> 3;
                    long jT9 = pn1.T(42, bArrDigest) & 2097151;
                    long jU9 = pn1.U(44, bArrDigest) >> 5;
                    long jT10 = (pn1.T(47, bArrDigest) >> 2) & 2097151;
                    long jU10 = (pn1.U(49, bArrDigest) >> 7) & 2097151;
                    long jU11 = (pn1.U(52, bArrDigest) >> 4) & 2097151;
                    long jT11 = (pn1.T(55, bArrDigest) >> 1) & 2097151;
                    long jU12 = (pn1.U(57, bArrDigest) >> 6) & 2097151;
                    long jU13 = pn1.U(60, bArrDigest) >> 3;
                    long j10 = (jU11 * 666643) + jT5;
                    long j11 = (jU10 * 666643) + jT4;
                    long j12 = (jT10 * 666643) + (jU4 & 2097151);
                    long j13 = (j12 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j14 = j13 << 21;
                    long j15 = (jT10 * 654183) + (jU10 * 470296) + j10;
                    long j16 = (j15 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j17 = j16 << 21;
                    long j18 = (jT10 * 136657) + (((jU11 * 654183) + ((jT11 * 470296) + ((jU12 * 666643) + (jT6 & 2097151)))) - (jU10 * 997805));
                    long j19 = (j18 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j20 = j19 << 21;
                    long j21 = ((jU11 * 136657) + (((jU12 * 654183) + ((jU13 * 470296) + (jU7 & 2097151))) - (jT11 * 997805))) - (jU10 * 683901);
                    long j22 = (j21 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j23 = ((jU12 * 136657) + ((jU8 & 2097151) - (jU13 * 997805))) - (jT11 * 683901);
                    long j24 = (j23 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j25 = j24 << 21;
                    long j26 = jT9 - (jU13 * 683901);
                    long j27 = (j26 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j28 = (jT10 * 470296) + j11 + j13;
                    long j29 = (j28 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j30 = j29 << 21;
                    long j31 = (((jU10 * 654183) + ((jU11 * 470296) + ((jT11 * 666643) + (jU5 & 2097151)))) - (jT10 * 997805)) + j16;
                    long j32 = (j31 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j33 = j32 << 21;
                    long j34 = (((jU10 * 136657) + (((jT11 * 654183) + ((jU12 * 470296) + ((jU13 * 666643) + (jU6 & 2097151)))) - (jU11 * 997805))) - (jT10 * 683901)) + j19;
                    long j35 = (j34 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j36 = j35 << 21;
                    long j37 = (((jT11 * 136657) + (((jU13 * 654183) + (jT7 & 2097151)) - (jU12 * 997805))) - (jU11 * 683901)) + j22;
                    long j38 = (j37 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j39 = (((jU13 * 136657) + jT8) - (jU12 * 683901)) + j24;
                    long j40 = (j39 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j41 = (j21 - (j22 << 21)) + j35;
                    long j42 = (j41 * 666643) + jT;
                    long j43 = (j42 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j44 = j43 << 21;
                    long j45 = (j23 - j25) + j38;
                    long j46 = j37 - (j38 << 21);
                    long j47 = (j41 * 654183) + (j46 * 470296) + (j45 * 666643) + (jT2 & 2097151);
                    long j48 = (j47 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j49 = j48 << 21;
                    long j50 = (j26 - (j27 << 21)) + j40;
                    long j51 = j39 - (j40 << 21);
                    long j52 = (j41 * 136657) + (((j45 * 654183) + ((j51 * 470296) + ((j50 * 666643) + (jU3 & 2097151)))) - (j46 * 997805));
                    long j53 = (j52 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j54 = j53 << 21;
                    long j55 = (jU9 & 2097151) + j27;
                    long j56 = ((j45 * 136657) + (((j50 * 654183) + ((j55 * 470296) + (j12 - j14))) - (j51 * 997805))) - (j46 * 683901);
                    long j57 = (j56 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j58 = j57 << 21;
                    long j59 = ((j50 * 136657) + (((j15 - j17) + j29) - (j55 * 997805))) - (j51 * 683901);
                    long j60 = (j59 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j61 = j60 << 21;
                    long j62 = ((j18 - j20) + j32) - (j55 * 683901);
                    long j63 = (j62 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j64 = j63 << 21;
                    long j65 = (j41 * 470296) + (j46 * 666643) + (jU & 2097151) + j43;
                    long j66 = (j65 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j67 = (((j46 * 654183) + ((j45 * 470296) + ((j51 * 666643) + (jU2 & 2097151)))) - (j41 * 997805)) + j48;
                    long j68 = (j67 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j69 = (((j46 * 136657) + (((j51 * 654183) + ((j50 * 470296) + ((j55 * 666643) + (jT3 & 2097151)))) - (j45 * 997805))) - (j41 * 683901)) + j53;
                    long j70 = (j69 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j71 = (((j51 * 136657) + (((j55 * 654183) + (j28 - j30)) - (j50 * 997805))) - (j45 * 683901)) + j57;
                    long j72 = (j71 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j73 = (((j55 * 136657) + (j31 - j33)) - (j50 * 683901)) + j60;
                    long j74 = (j73 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j75 = (j34 - j36) + j63;
                    long j76 = (j75 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
                    long j77 = j76 << 21;
                    long j78 = (j76 * 666643) + (j42 - j44);
                    long j79 = j78 >> 21;
                    long j80 = j79 << 21;
                    long j81 = (j76 * 470296) + (j65 - (j66 << 21)) + j79;
                    long j82 = j81 >> 21;
                    long j83 = j82 << 21;
                    long j84 = (j76 * 654183) + (j47 - j49) + j66 + j82;
                    long j85 = j84 >> 21;
                    long j86 = j85 << 21;
                    long j87 = ((j67 - (j68 << 21)) - (j76 * 997805)) + j85;
                    long j88 = j87 >> 21;
                    long j89 = j88 << 21;
                    long j90 = (j76 * 136657) + (j52 - j54) + j68 + j88;
                    long j91 = j90 >> 21;
                    long j92 = j91 << 21;
                    long j93 = ((j69 - (j70 << 21)) - (j76 * 683901)) + j91;
                    long j94 = j93 >> 21;
                    long j95 = j94 << 21;
                    long j96 = (j56 - j58) + j70 + j94;
                    long j97 = j96 >> 21;
                    long j98 = j97 << 21;
                    long j99 = (j71 - (j72 << 21)) + j97;
                    long j100 = j99 >> 21;
                    long j101 = j100 << 21;
                    long j102 = (j59 - j61) + j72 + j100;
                    long j103 = j102 >> 21;
                    long j104 = j103 << 21;
                    long j105 = (j73 - (j74 << 21)) + j103;
                    long j106 = j105 >> 21;
                    long j107 = j106 << 21;
                    long j108 = (j62 - j64) + j74 + j106;
                    long j109 = j108 >> 21;
                    long j110 = j109 << 21;
                    long j111 = (j75 - j77) + j109;
                    long j112 = j111 >> 21;
                    long j113 = j112 << 21;
                    long j114 = (666643 * j112) + (j78 - j80);
                    long j115 = j114 >> 21;
                    long j116 = j115 << 21;
                    long j117 = (470296 * j112) + (j81 - j83) + j115;
                    long j118 = j117 >> 21;
                    long j119 = j118 << 21;
                    long j120 = (654183 * j112) + (j84 - j86) + j118;
                    long j121 = j120 >> 21;
                    long j122 = j121 << 21;
                    long j123 = ((j87 - j89) - (997805 * j112)) + j121;
                    long j124 = j123 >> 21;
                    long j125 = j124 << 21;
                    long j126 = (136657 * j112) + (j90 - j92) + j124;
                    long j127 = j126 >> 21;
                    long j128 = j127 << 21;
                    long j129 = ((j93 - j95) - (j112 * 683901)) + j127;
                    long j130 = j129 >> 21;
                    long j131 = j130 << 21;
                    long j132 = (j96 - j98) + j130;
                    long j133 = j132 >> 21;
                    long j134 = j133 << 21;
                    long j135 = (j99 - j101) + j133;
                    long j136 = j135 >> 21;
                    long j137 = j136 << 21;
                    long j138 = (j102 - j104) + j136;
                    long j139 = j138 >> 21;
                    long j140 = j139 << 21;
                    long j141 = (j105 - j107) + j139;
                    long j142 = j141 >> 21;
                    long j143 = j142 << 21;
                    long j144 = (j108 - j110) + j142;
                    long j145 = j144 >> 21;
                    bArrDigest[0] = (byte) (j114 - j116);
                    long j146 = j135 - j137;
                    long j147 = j132 - j134;
                    long j148 = j129 - j131;
                    long j149 = j126 - j128;
                    long j150 = j123 - j125;
                    long j151 = j120 - j122;
                    long j152 = j117 - j119;
                    bArrDigest[1] = (byte) (r13 >> 8);
                    bArrDigest[2] = (byte) ((r13 >> 16) | (j152 << 5));
                    bArrDigest[3] = (byte) (j152 >> 3);
                    bArrDigest[4] = (byte) (j152 >> 11);
                    bArrDigest[5] = (byte) ((j152 >> 19) | (j151 << 2));
                    bArrDigest[6] = (byte) (j151 >> 6);
                    bArrDigest[7] = (byte) ((j151 >> 14) | (j150 << 7));
                    bArrDigest[8] = (byte) (j150 >> 1);
                    bArrDigest[9] = (byte) (j150 >> 9);
                    bArrDigest[10] = (byte) ((j150 >> 17) | (j149 << 4));
                    bArrDigest[11] = (byte) (j149 >> 4);
                    bArrDigest[12] = (byte) (j149 >> 12);
                    bArrDigest[13] = (byte) ((j149 >> 20) | (j148 + j148));
                    bArrDigest[14] = (byte) (j148 >> 7);
                    bArrDigest[15] = (byte) ((j148 >> 15) | (j147 << 6));
                    bArrDigest[16] = (byte) (j147 >> 2);
                    bArrDigest[17] = (byte) (j147 >> 10);
                    bArrDigest[18] = (byte) ((j147 >> 18) | (j146 << 3));
                    long j153 = j144 - (j145 << 21);
                    long j154 = (j111 - j113) + j145;
                    long j155 = j141 - j143;
                    bArrDigest[19] = (byte) (j146 >> 5);
                    bArrDigest[20] = (byte) (j146 >> 13);
                    bArrDigest[21] = (byte) (j138 - j140);
                    bArrDigest[22] = (byte) (r9 >> 8);
                    bArrDigest[23] = (byte) ((r9 >> 16) | (j155 << 5));
                    bArrDigest[24] = (byte) (j155 >> 3);
                    bArrDigest[25] = (byte) (j155 >> 11);
                    bArrDigest[26] = (byte) ((j155 >> 19) | (j153 << 2));
                    bArrDigest[27] = (byte) (j153 >> 6);
                    bArrDigest[28] = (byte) ((j153 >> 14) | (j154 << 7));
                    bArrDigest[29] = (byte) (j154 >> 1);
                    bArrDigest[30] = (byte) (j154 >> 9);
                    bArrDigest[31] = (byte) (j154 >> 17);
                    long[] jArr = new long[10];
                    long[] jArrL = rs.L(bArrB);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    rs.I(jArr4, jArrL);
                    rs.D(jArr5, jArr4, jc1.f6819a);
                    rs.o(jArr4, jArr4, jArr2);
                    rs.j(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    rs.I(jArr8, jArr5);
                    rs.D(jArr8, jArr8, jArr5);
                    rs.I(jArr, jArr8);
                    rs.D(jArr, jArr, jArr5);
                    rs.D(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    rs.I(jArr9, jArr);
                    rs.I(jArr10, jArr9);
                    rs.I(jArr10, jArr10);
                    rs.D(jArr10, jArr, jArr10);
                    rs.D(jArr9, jArr9, jArr10);
                    rs.I(jArr9, jArr9);
                    rs.D(jArr9, jArr10, jArr9);
                    rs.I(jArr10, jArr9);
                    for (int i12 = 1; i12 < 5; i12++) {
                        rs.I(jArr10, jArr10);
                    }
                    rs.D(jArr9, jArr10, jArr9);
                    rs.I(jArr10, jArr9);
                    for (int i13 = 1; i13 < 10; i13++) {
                        rs.I(jArr10, jArr10);
                    }
                    rs.D(jArr10, jArr10, jArr9);
                    rs.I(jArr11, jArr10);
                    for (int i14 = 1; i14 < 20; i14++) {
                        rs.I(jArr11, jArr11);
                    }
                    rs.D(jArr10, jArr11, jArr10);
                    rs.I(jArr10, jArr10);
                    for (int i15 = 1; i15 < 10; i15++) {
                        rs.I(jArr10, jArr10);
                    }
                    rs.D(jArr9, jArr10, jArr9);
                    rs.I(jArr10, jArr9);
                    for (int i16 = 1; i16 < 50; i16++) {
                        rs.I(jArr10, jArr10);
                    }
                    rs.D(jArr10, jArr10, jArr9);
                    rs.I(jArr11, jArr10);
                    for (int i17 = 1; i17 < 100; i17++) {
                        rs.I(jArr11, jArr11);
                    }
                    rs.D(jArr10, jArr11, jArr10);
                    rs.I(jArr10, jArr10);
                    for (int i18 = 1; i18 < 50; i18++) {
                        rs.I(jArr10, jArr10);
                    }
                    rs.D(jArr9, jArr10, jArr9);
                    rs.I(jArr9, jArr9);
                    rs.I(jArr9, jArr9);
                    rs.D(jArr, jArr9, jArr);
                    rs.D(jArr, jArr, jArr8);
                    rs.D(jArr, jArr, jArr4);
                    rs.I(jArr6, jArr);
                    rs.D(jArr6, jArr6, jArr5);
                    rs.o(jArr7, jArr6, jArr4);
                    if (pn1.B(jArr7)) {
                        rs.j(jArr7, jArr6, jArr4);
                        if (pn1.B(jArr7)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        rs.D(jArr, jArr, jc1.f6821c);
                    }
                    if (!pn1.B(jArr) && ((bArrB[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    if ((rs.M(jArr)[0] & 1) == ((bArrB[31] & 255) >> 7)) {
                        for (int i19 = 0; i19 < 10; i19++) {
                            jArr[i19] = -jArr[i19];
                        }
                    }
                    rs.D(jArr3, jArr, jArrL);
                    l91 l91Var = new l91(jArr, jArrL, jArr2, 4);
                    ic1[] ic1VarArr = new ic1[8];
                    ic1VarArr[0] = new ic1(new ut(23, l91Var, jArr3));
                    zd1 zd1Var = new zd1(24, (Object) new l91(4), (Object) new long[10], false);
                    pn1.N(l91Var, zd1Var);
                    ut utVar = new ut(zd1Var);
                    for (int i20 = 1; i20 < 8; i20++) {
                        pn1.H(zd1Var, utVar, ic1VarArr[i20 - 1]);
                        ic1VarArr[i20] = new ic1(new ut(zd1Var));
                    }
                    byte[] bArrS = pn1.S(bArrDigest);
                    byte[] bArrS2 = pn1.S(bArrCopyOfRange);
                    zd1 zd1Var2 = new zd1(24);
                    ut utVar2 = new ut(23);
                    int i21 = 255;
                    while (i21 >= 0 && bArrS[i21] == 0 && bArrS2[i21] == 0) {
                        i21--;
                    }
                    while (i21 >= 0) {
                        pn1.N(new l91(zd1Var2), zd1Var2);
                        byte b2 = bArrS[i21];
                        if (b2 > 0) {
                            ut.n(utVar2, zd1Var2);
                            pn1.H(zd1Var2, utVar2, ic1VarArr[bArrS[i21] / 2]);
                        } else if (b2 < 0) {
                            ut.n(utVar2, zd1Var2);
                            pn1.K(zd1Var2, utVar2, ic1VarArr[(-bArrS[i21]) / 2]);
                        }
                        byte b10 = bArrS2[i21];
                        if (b10 > 0) {
                            ut.n(utVar2, zd1Var2);
                            pn1.H(zd1Var2, utVar2, jc1.f6823e[bArrS2[i21] / 2]);
                        } else if (b10 < 0) {
                            ut.n(utVar2, zd1Var2);
                            pn1.K(zd1Var2, utVar2, jc1.f6823e[(-bArrS2[i21]) / 2]);
                        }
                        i21--;
                    }
                    byte[] bArrL = new l91(zd1Var2).l();
                    for (int i22 = 0; i22 < 32; i22++) {
                        if (bArrL[i22] == bArr[i22]) {
                        }
                    }
                    return;
                }
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }

    public uk1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!gr.x(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.f10966d = sl1.a(bArr);
        this.f10964b = bArr2;
        this.f10965c = bArr3;
        if (jc1.f6819a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }
}
