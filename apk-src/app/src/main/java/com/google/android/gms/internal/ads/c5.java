package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 implements o5, t81 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f4024e = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f4025f = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f4026g = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4029d;

    public c5(int i) {
        switch (i) {
            case 5:
                this.f4029d = new n90(23);
                this.f4027b = 8000;
                this.f4028c = 8000;
                break;
            default:
                this.f4029d = new byte[8];
                break;
        }
    }

    public static final void d(ByteBuffer byteBuffer, long j10, int i, int i10, boolean z5) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z5 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(fs1.a(i10));
    }

    public static long e(byte[] bArr, int i, boolean z5) {
        long j10 = ((long) bArr[0]) & 255;
        if (z5) {
            j10 &= ~f4024e[i - 1];
        }
        for (int i10 = 1; i10 < i; i10++) {
            j10 = (j10 << 8) | (((long) bArr[i10]) & 255);
        }
        return j10;
    }

    public String a(ArrayList arrayList, ArrayList arrayList2) {
        boolean z5;
        int i = this.f4027b;
        Collections.sort(arrayList2, new v(7));
        HashSet hashSet = new HashSet();
        loop0: for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((qh) arrayList2.get(i10)).f9500e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    String str = strArrSplit[i11];
                    if (str.contains("'")) {
                        StringBuilder sb2 = new StringBuilder(str);
                        int i12 = 1;
                        boolean z10 = false;
                        while (true) {
                            int i13 = i12 + 2;
                            if (i13 > sb2.length()) {
                                break;
                            }
                            if (sb2.charAt(i12) == '\'') {
                                char c8 = ' ';
                                if (sb2.charAt(i12 - 1) != ' ') {
                                    int i14 = i12 + 1;
                                    if (sb2.charAt(i14) == 's' || sb2.charAt(i14) == 'S') {
                                        if (i13 != sb2.length()) {
                                            c8 = ' ';
                                            if (sb2.charAt(i13) == ' ') {
                                            }
                                            z10 = true;
                                        } else {
                                            c8 = ' ';
                                        }
                                        sb2.insert(i12, c8);
                                        i12 = i13;
                                        z10 = true;
                                    } else {
                                        c8 = ' ';
                                    }
                                    sb2.setCharAt(i12, c8);
                                    z10 = true;
                                } else {
                                    sb2.setCharAt(i12, c8);
                                    z10 = true;
                                }
                            }
                            i12++;
                        }
                        z5 = true;
                        String string = z10 ? sb2.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    } else {
                        z5 = true;
                    }
                    String[] strArrL = nz.l(str, z5);
                    int length = strArrL.length;
                    int i15 = this.f4028c;
                    if (length >= i15) {
                        for (int i16 = 0; i16 < strArrL.length; i16++) {
                            String strConcat = "";
                            for (int i17 = 0; i17 < i15; i17++) {
                                int i18 = i16 + i17;
                                if (i18 >= strArrL.length) {
                                    break;
                                }
                                if (i17 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrL[i18]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= i) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= i) {
                            break loop0;
                        }
                    }
                }
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((th) this.f4029d).F1((String) it.next()));
            } catch (IOException e3) {
                u9.i.f("Error while writing hash to byteStream", e3);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e7) {
            u9.i.f("HashManager: Unable to convert to Base64.", e7);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e10) {
            u9.i.f("HashManager: Unable to convert to Base64.", e10);
            return "";
        }
    }

    public void b(zq1 zq1Var, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i;
        ByteBuffer byteBuffer2 = zq1Var.f13079f;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - zq1Var.f13079f.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f4027b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = zq1Var.f13079f;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f4027b;
        int i12 = (i10 + KotlinVersion.MAX_COMPONENT_VALUE) / KotlinVersion.MAX_COMPONENT_VALUE;
        int i13 = i12 + 27 + i10;
        if (i11 == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i13 += length + 44;
        } else {
            length = 0;
        }
        if (((ByteBuffer) this.f4029d).capacity() < i13) {
            this.f4029d = ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.f4029d).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.f4029d;
        if (this.f4027b == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i = 22;
                d(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(fs1.a(length2));
                byteBuffer.put(bArr);
                int i14 = length2 + 28;
                byteBuffer.putInt(22, cq0.f(byteBuffer.arrayOffset(), i14, 0, byteBuffer.array()));
                byteBuffer.position(i14);
            } else {
                byteBuffer = byteBuffer4;
                i = 22;
                byteBuffer.put(f4025f);
            }
            byteBuffer.put(f4026g);
        } else {
            byteBuffer = byteBuffer4;
            i = 22;
        }
        int iF = this.f4028c + ((int) ((pn1.F(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.f4028c = iF;
        int i15 = i;
        ByteBuffer byteBuffer5 = byteBuffer;
        d(byteBuffer5, iF, this.f4027b, i12, false);
        for (int i16 = 0; i16 < i12; i16++) {
            if (i10 >= 255) {
                byteBuffer5.put((byte) -1);
                i10 -= 255;
            } else {
                byteBuffer5.put((byte) i10);
                i10 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f4027b == 2) {
            byteBuffer5.putInt(length + 66, cq0.f(byteBuffer5.arrayOffset() + length + 44, byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        } else {
            byteBuffer5.putInt(i15, cq0.f(byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        }
        this.f4027b++;
        this.f4029d = byteBuffer5;
        zq1Var.r();
        zq1Var.s(((ByteBuffer) this.f4029d).remaining());
        zq1Var.f13079f.put((ByteBuffer) this.f4029d);
        zq1Var.u();
    }

    public long c(a2 a2Var, boolean z5, boolean z10, int i) {
        int i10;
        byte[] bArr = (byte[]) this.f4029d;
        if (this.f4027b == 0) {
            if (!a2Var.J(bArr, 0, 1, z5)) {
                return -1L;
            }
            int i11 = bArr[0] & 255;
            int i12 = 0;
            while (true) {
                if (i12 >= 8) {
                    i10 = -1;
                    break;
                }
                i10 = i12 + 1;
                if ((f4024e[i12] & ((long) i11)) != 0) {
                    break;
                }
                i12 = i10;
            }
            this.f4028c = i10;
            if (i10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f4027b = 1;
        }
        int i13 = this.f4028c;
        if (i13 > i) {
            this.f4027b = 0;
            return -2L;
        }
        if (i13 != 1) {
            a2Var.w(bArr, 1, i13 - 1);
        }
        this.f4027b = 0;
        return e(bArr, this.f4028c, z10);
    }

    @Override // com.google.android.gms.internal.ads.o5
    public int h() {
        return this.f4028c;
    }

    @Override // com.google.android.gms.internal.ads.o5
    public int j() {
        return this.f4027b;
    }

    @Override // com.google.android.gms.internal.ads.o5
    public int l() {
        int i = this.f4027b;
        return i == -1 ? ((tk0) this.f4029d).h() : i;
    }

    @Override // com.google.android.gms.internal.ads.t81
    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public g91 mo1h() {
        return new me1(null, this.f4027b, this.f4028c, false, (n90) this.f4029d);
    }
}
