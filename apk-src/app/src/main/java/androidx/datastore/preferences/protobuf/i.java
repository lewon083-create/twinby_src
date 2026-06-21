package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f1411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1416h;
    public int i = Integer.MAX_VALUE;

    public i(byte[] bArr, int i, int i10, boolean z5) {
        this.f1411c = bArr;
        this.f1412d = i10 + i;
        this.f1414f = i;
        this.f1415g = i;
    }

    public final int D() throws e0 {
        int i = this.f1414f;
        if (this.f1412d - i < 4) {
            throw e0.e();
        }
        this.f1414f = i + 4;
        byte[] bArr = this.f1411c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long E() throws e0 {
        int i = this.f1414f;
        if (this.f1412d - i < 8) {
            throw e0.e();
        }
        this.f1414f = i + 8;
        byte[] bArr = this.f1411c;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int F() {
        int i;
        int i10 = this.f1414f;
        int i11 = this.f1412d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f1411c;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.f1414f = i12;
                return b2;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b2;
                if (i14 < 0) {
                    i = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i19;
                            }
                            i = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f1414f = i13;
                return i;
            }
        }
        return (int) H();
    }

    public final long G() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i = this.f1414f;
        int i10 = this.f1412d;
        if (i10 != i) {
            int i11 = i + 1;
            byte[] bArr = this.f1411c;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f1414f = i11;
                return b2;
            }
            if (i10 - i11 >= 9) {
                int i12 = i + 2;
                int i13 = (bArr[i11] << 7) ^ b2;
                if (i13 < 0) {
                    j10 = i13 ^ (-128);
                } else {
                    int i14 = i + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j10 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j13 = (-2080896) ^ i17;
                        } else {
                            long j14 = i17;
                            i12 = i + 5;
                            long j15 = j14 ^ (((long) bArr[i16]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i16 = i + 6;
                                long j16 = j15 ^ (((long) bArr[i12]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i12 = i + 7;
                                    j15 = j16 ^ (((long) bArr[i16]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i16 = i + 8;
                                        j16 = j15 ^ (((long) bArr[i12]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i12 = i + 9;
                                            long j17 = (j16 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i18 = i + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j13 = j11 ^ j16;
                            }
                            j10 = j12 ^ j15;
                        }
                        i12 = i16;
                        j10 = j13;
                    }
                }
                this.f1414f = i12;
                return j10;
            }
        }
        return H();
    }

    public final long H() throws e0 {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i10 = this.f1414f;
            if (i10 == this.f1412d) {
                throw e0.e();
            }
            this.f1414f = i10 + 1;
            byte b2 = this.f1411c[i10];
            j10 |= ((long) (b2 & 127)) << i;
            if ((b2 & 128) == 0) {
                return j10;
            }
        }
        throw e0.c();
    }

    public final void I() {
        int i = this.f1412d + this.f1413e;
        this.f1412d = i;
        int i10 = i - this.f1415g;
        int i11 = this.i;
        if (i10 <= i11) {
            this.f1413e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f1413e = i12;
        this.f1412d = i - i12;
    }

    public final void J(int i) throws e0 {
        if (i >= 0) {
            int i10 = this.f1412d;
            int i11 = this.f1414f;
            if (i <= i10 - i11) {
                this.f1414f = i11 + i;
                return;
            }
        }
        if (i >= 0) {
            throw e0.e();
        }
        throw e0.d();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void a(int i) throws e0 {
        if (this.f1416h != i) {
            throw new e0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int b() {
        return this.f1414f - this.f1415g;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean c() {
        return this.f1414f == this.f1412d;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void d(int i) {
        this.i = i;
        I();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int e(int i) throws e0 {
        if (i < 0) {
            throw e0.d();
        }
        int iB = b() + i;
        if (iB < 0) {
            throw new e0("Failed to parse the message.");
        }
        int i10 = this.i;
        if (iB > i10) {
            throw e0.e();
        }
        this.i = iB;
        I();
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean f() {
        return G() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // androidx.datastore.preferences.protobuf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.datastore.preferences.protobuf.h g() throws androidx.datastore.preferences.protobuf.e0 {
        /*
            r4 = this;
            int r0 = r4.F()
            byte[] r1 = r4.f1411c
            if (r0 <= 0) goto L19
            int r2 = r4.f1412d
            int r3 = r4.f1414f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            androidx.datastore.preferences.protobuf.h r1 = androidx.datastore.preferences.protobuf.h.e(r1, r3, r0)
            int r2 = r4.f1414f
            int r2 = r2 + r0
            r4.f1414f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            androidx.datastore.preferences.protobuf.h r0 = androidx.datastore.preferences.protobuf.h.f1405d
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f1412d
            int r3 = r4.f1414f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f1414f = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = androidx.datastore.preferences.protobuf.c0.f1369b
        L35:
            androidx.datastore.preferences.protobuf.h r1 = androidx.datastore.preferences.protobuf.h.f1405d
            androidx.datastore.preferences.protobuf.h r1 = new androidx.datastore.preferences.protobuf.h
            r1.<init>(r0)
            return r1
        L3d:
            androidx.datastore.preferences.protobuf.e0 r0 = androidx.datastore.preferences.protobuf.e0.d()
            throw r0
        L42:
            androidx.datastore.preferences.protobuf.e0 r0 = androidx.datastore.preferences.protobuf.e0.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.g():androidx.datastore.preferences.protobuf.h");
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final double h() {
        return Double.longBitsToDouble(E());
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int i() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int j() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long k() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final float l() {
        return Float.intBitsToFloat(D());
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int m() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long n() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int o() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long p() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int q() {
        int iF = F();
        return (-(iF & 1)) ^ (iF >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long r() {
        long jG = G();
        return (-(jG & 1)) ^ (jG >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final String s() throws e0 {
        int iF = F();
        if (iF > 0) {
            int i = this.f1412d;
            int i10 = this.f1414f;
            if (iF <= i - i10) {
                String str = new String(this.f1411c, i10, iF, c0.f1368a);
                this.f1414f += iF;
                return str;
            }
        }
        if (iF == 0) {
            return "";
        }
        if (iF < 0) {
            throw e0.d();
        }
        throw e0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final String t() throws e0 {
        int iF = F();
        if (iF > 0) {
            int i = this.f1412d;
            int i10 = this.f1414f;
            if (iF <= i - i10) {
                String strD = s1.f1472a.d(this.f1411c, i10, iF);
                this.f1414f += iF;
                return strD;
            }
        }
        if (iF == 0) {
            return "";
        }
        if (iF <= 0) {
            throw e0.d();
        }
        throw e0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int u() throws e0 {
        if (c()) {
            this.f1416h = 0;
            return 0;
        }
        int iF = F();
        this.f1416h = iF;
        if ((iF >>> 3) != 0) {
            return iF;
        }
        throw new e0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int v() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long w() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean y(int i) throws e0 {
        int i10 = i & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                J(8);
                return true;
            }
            if (i10 == 2) {
                J(F());
                return true;
            }
            if (i10 == 3) {
                z();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw e0.b();
            }
            J(4);
            return true;
        }
        int i12 = this.f1412d - this.f1414f;
        byte[] bArr = this.f1411c;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f1414f;
                this.f1414f = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw e0.c();
        }
        while (i11 < 10) {
            int i14 = this.f1414f;
            if (i14 == this.f1412d) {
                throw e0.e();
            }
            this.f1414f = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw e0.c();
        return true;
    }
}
