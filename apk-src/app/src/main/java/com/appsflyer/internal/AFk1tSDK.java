package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFk1tSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private byte[] areAllFieldsValid;
    private short component1;
    private int component2;
    private int component3;
    private long[] component4;
    private long[] getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private int getRevenue;
    private int toString;

    public AFk1tSDK(InputStream inputStream, int i, int i10, short s10, int i11, int i12) {
        this(inputStream, i, i10, s10, i11, i12, (byte) 0);
    }

    private int getCurrencyIso4217Code() throws IOException {
        int i;
        if (this.component3 == Integer.MAX_VALUE) {
            this.component3 = ((FilterInputStream) this).in.read();
        }
        if (this.component2 == this.getMonetizationNetwork) {
            byte[] bArr = this.areAllFieldsValid;
            int i10 = this.component3;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i11, this.getMonetizationNetwork - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < this.getMonetizationNetwork);
            if (i11 < this.getMonetizationNetwork) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.AFAdRevenueData;
            if (i13 == this.getMediationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getRevenue <= i13) {
                    getMonetizationNetwork();
                }
                int i14 = this.getRevenue;
                if (i14 < this.getMediationNetwork) {
                    this.getRevenue = i14 + 1;
                } else {
                    this.getRevenue = 1;
                }
            }
            int i15 = ((FilterInputStream) this).in.read();
            this.component3 = i15;
            this.component2 = 0;
            if (i15 < 0) {
                int i16 = this.getMonetizationNetwork;
                i = i16 - (this.areAllFieldsValid[i16 - 1] & 255);
            } else {
                i = this.getMonetizationNetwork;
            }
            this.toString = i;
        }
        return this.toString;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.getCurrencyIso4217Code;
        long[] jArr2 = this.component4;
        short s10 = this.component1;
        long j10 = jArr[s10 % 4] * 2147483085;
        long j11 = jArr2[(s10 + 2) % 4];
        int i = (s10 + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j11) / 2147483647L;
        jArr[i] = (j10 + j11) % 2147483647L;
        for (int i10 = 0; i10 < this.getMonetizationNetwork; i10++) {
            this.areAllFieldsValid[i10] = (byte) (((long) r1[i10]) ^ ((this.getCurrencyIso4217Code[this.component1] >> (i10 << 3)) & 255));
        }
        this.component1 = (short) ((this.component1 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getCurrencyIso4217Code();
        return this.toString - this.component2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getCurrencyIso4217Code();
        int i = this.component2;
        if (i >= this.toString) {
            return -1;
        }
        byte[] bArr = this.areAllFieldsValid;
        this.component2 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    private AFk1tSDK(InputStream inputStream, int i, int i10, short s10, int i11, int i12, byte b2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.getRevenue = 1;
        this.component3 = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s10, 4), 8);
        this.getMonetizationNetwork = iMin;
        this.areAllFieldsValid = new byte[iMin];
        this.getCurrencyIso4217Code = new long[4];
        this.component4 = new long[4];
        this.component2 = iMin;
        this.toString = iMin;
        this.getCurrencyIso4217Code = AFk1sSDK.getCurrencyIso4217Code(i ^ i12, iMin ^ i12);
        this.component4 = AFk1sSDK.getCurrencyIso4217Code(i10 ^ i12, i11 ^ i12);
        this.AFAdRevenueData = 100;
        this.getMediationNetwork = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11 = i + i10;
        for (int i12 = i; i12 < i11; i12++) {
            getCurrencyIso4217Code();
            int i13 = this.component2;
            if (i13 >= this.toString) {
                if (i12 == i) {
                    return -1;
                }
                return i10 - (i11 - i12);
            }
            byte[] bArr2 = this.areAllFieldsValid;
            this.component2 = i13 + 1;
            bArr[i12] = bArr2[i13];
        }
        return i10;
    }
}
