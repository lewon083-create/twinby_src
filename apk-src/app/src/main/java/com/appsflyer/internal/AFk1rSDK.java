package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFk1rSDK extends FilterInputStream {
    private static final short getMonetizationNetwork = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private byte[] AFAdRevenueData;
    private int AFInAppEventType;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private final int equals;
    private int getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    private byte[] getRevenue;
    private int hashCode;
    private int toString;

    public AFk1rSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i10, int i11) {
        this(inputStream, iArr, i, bArr, i10, i11, (byte) 0);
    }

    private void AFAdRevenueData() {
        if (this.component1 == 3) {
            byte[] bArr = this.getMediationNetwork;
            System.arraycopy(bArr, 0, this.getRevenue, 0, bArr.length);
        }
        byte[] bArr2 = this.getMediationNetwork;
        boolean z5 = true;
        char c8 = 2;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i10 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i11 = 0;
        while (true) {
            int i12 = this.component2;
            if (i11 >= i12) {
                break;
            }
            short s10 = getMonetizationNetwork;
            i10 -= ((((i12 - i11) * s10) + i) ^ ((i << 4) + this.toString)) ^ ((i >>> 5) + this.hashCode);
            i -= (((i10 << 4) + this.areAllFieldsValid) ^ (((i12 - i11) * s10) + i10)) ^ ((i10 >>> 5) + this.copy);
            i11++;
            c8 = c8;
            z5 = z5;
        }
        byte[] bArr3 = this.getMediationNetwork;
        bArr3[0] = (byte) (i >> 24);
        bArr3[z5 ? 1 : 0] = (byte) (i >> 16);
        bArr3[c8] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i10 >> 24);
        bArr3[5] = (byte) (i10 >> 16);
        bArr3[6] = (byte) (i10 >> 8);
        bArr3[7] = (byte) i10;
        if (this.component1 == 3) {
            for (int i13 = 0; i13 < 8; i13++) {
                byte[] bArr4 = this.getMediationNetwork;
                bArr4[i13] = (byte) (bArr4[i13] ^ this.AFAdRevenueData[i13]);
            }
            byte[] bArr5 = this.getRevenue;
            System.arraycopy(bArr5, 0, this.AFAdRevenueData, 0, bArr5.length);
        }
    }

    private int getMonetizationNetwork() throws IOException {
        if (this.component3 == Integer.MAX_VALUE) {
            this.component3 = ((FilterInputStream) this).in.read();
        }
        if (this.getCurrencyIso4217Code == 8) {
            byte[] bArr = this.getMediationNetwork;
            int i = this.component3;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i10 = 1;
            do {
                int i11 = ((FilterInputStream) this).in.read(this.getMediationNetwork, i10, 8 - i10);
                if (i11 <= 0) {
                    break;
                }
                i10 += i11;
            } while (i10 < 8);
            if (i10 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = this.equals;
            if (i12 == this.copydefault) {
                AFAdRevenueData();
            } else {
                if (this.AFInAppEventType <= i12) {
                    AFAdRevenueData();
                }
                int i13 = this.AFInAppEventType;
                if (i13 < this.copydefault) {
                    this.AFInAppEventType = i13 + 1;
                } else {
                    this.AFInAppEventType = 1;
                }
            }
            int i14 = ((FilterInputStream) this).in.read();
            this.component3 = i14;
            this.getCurrencyIso4217Code = 0;
            this.component4 = i14 < 0 ? 8 - (this.getMediationNetwork[7] & 255) : 8;
        }
        return this.component4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getMonetizationNetwork();
        return this.component4 - this.getCurrencyIso4217Code;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMonetizationNetwork();
        int i = this.getCurrencyIso4217Code;
        if (i >= this.component4) {
            return -1;
        }
        byte[] bArr = this.getMediationNetwork;
        this.getCurrencyIso4217Code = i + 1;
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

    private AFk1rSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i10, int i11, byte b2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component3 = Integer.MAX_VALUE;
        this.AFInAppEventType = 1;
        this.getMediationNetwork = new byte[8];
        this.AFAdRevenueData = new byte[8];
        this.getRevenue = new byte[8];
        this.getCurrencyIso4217Code = 8;
        this.component4 = 8;
        this.component2 = Math.min(Math.max(i10, 5), 16);
        this.component1 = i11;
        if (i11 == 3) {
            System.arraycopy(bArr, 0, this.AFAdRevenueData, 0, 8);
        }
        long j10 = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i == 0) {
            this.areAllFieldsValid = (int) j10;
            long j11 = j10 >> 3;
            short s10 = getMonetizationNetwork;
            this.copy = (int) ((((long) s10) * j11) >> 32);
            this.toString = (int) (j10 >> 32);
            this.hashCode = (int) (j11 + ((long) s10));
        } else {
            int i12 = (int) j10;
            this.areAllFieldsValid = i12;
            this.copy = i12 * i;
            this.toString = i ^ i12;
            this.hashCode = (int) (j10 >> 32);
        }
        this.equals = 100;
        this.copydefault = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11 = i + i10;
        for (int i12 = i; i12 < i11; i12++) {
            getMonetizationNetwork();
            int i13 = this.getCurrencyIso4217Code;
            if (i13 >= this.component4) {
                if (i12 == i) {
                    return -1;
                }
                return i10 - (i11 - i12);
            }
            byte[] bArr2 = this.getMediationNetwork;
            this.getCurrencyIso4217Code = i13 + 1;
            bArr[i12] = bArr2[i13];
        }
        return i10;
    }
}
