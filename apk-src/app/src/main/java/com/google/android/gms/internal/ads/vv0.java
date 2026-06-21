package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg f11494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f11495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f11496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f11497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f11498e;

    public vv0(sg sgVar, File file, File file2, File file3) {
        this.f11494a = sgVar;
        this.f11495b = file;
        this.f11496c = file3;
        this.f11497d = file2;
    }

    public final byte[] a() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrD;
        ArrayList arrayList;
        int iMin;
        FileInputStream fileInputStream2 = null;
        if (this.f11498e == null) {
            try {
                fileInputStream = new FileInputStream(this.f11497d);
            } catch (IOException unused) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                zm1 zm1Var = bn1.f3837c;
                arrayList = new ArrayList();
                iMin = 256;
            } catch (IOException unused2) {
                ua.b.d(fileInputStream);
                bArrD = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                ua.b.d(fileInputStream2);
                throw th;
            }
            while (true) {
                byte[] bArr = new byte[iMin];
                int i = 0;
                while (i < iMin) {
                    int i10 = fileInputStream.read(bArr, i, iMin - i);
                    if (i10 == -1) {
                        break;
                    }
                    i += i10;
                }
                zm1 zm1VarA = i == 0 ? null : bn1.A(bArr, 0, i);
                if (zm1VarA == null) {
                    break;
                }
                arrayList.add(zm1VarA);
                iMin = Math.min(iMin + iMin, 8192);
                this.f11498e = bArrD;
            }
            bArrD = bn1.C(arrayList).D();
            ua.b.d(fileInputStream);
            this.f11498e = bArrD;
        }
        byte[] bArr2 = this.f11498e;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }
}
