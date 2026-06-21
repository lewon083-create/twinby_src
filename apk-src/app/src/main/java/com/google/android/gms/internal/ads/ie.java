package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ie implements PackageManager$OnChecksumsReadyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6473b;

    public /* synthetic */ ie(int i, Object obj) {
        this.f6472a = i;
        this.f6473b = obj;
    }

    public final void onChecksumsReady(List list) {
        int size;
        int size2;
        int i = this.f6472a;
        int i10 = 0;
        Object obj = this.f6473b;
        switch (i) {
            case 0:
                if (list == null) {
                    ((y81) obj).e("");
                } else {
                    try {
                        size = list.size();
                    } catch (Throwable unused) {
                    }
                    while (i10 < size) {
                        ApkChecksum apkChecksumE = a2.d.e(list.get(i10));
                        if (apkChecksumE.getType() == 8) {
                            i61 i61VarF = i61.f6401f.f();
                            byte[] value = apkChecksumE.getValue();
                            ((y81) obj).e(i61VarF.g(value.length, value));
                        } else {
                            i10++;
                        }
                        ((y81) obj).e("");
                        break;
                    }
                    ((y81) obj).e("");
                }
                break;
            case 1:
                y81 y81Var = (y81) obj;
                if (list == null) {
                    y81Var.e(null);
                } else {
                    try {
                        int size3 = list.size();
                        for (int i11 = 0; i11 < size3; i11++) {
                            ApkChecksum apkChecksumE2 = a2.d.e(list.get(i11));
                            if (apkChecksumE2.getType() == 8) {
                                byte[] value2 = apkChecksumE2.getValue();
                                char[] cArr = sf.f10283a;
                                int length = value2.length;
                                char[] cArr2 = new char[length + length];
                                while (i10 < value2.length) {
                                    byte b2 = value2[i10];
                                    char[] cArr3 = sf.f10283a;
                                    int i12 = i10 + i10;
                                    cArr2[i12] = cArr3[(b2 & 255) >>> 4];
                                    cArr2[i12 + 1] = cArr3[b2 & 15];
                                    i10++;
                                }
                                y81Var.e(new String(cArr2));
                            }
                            break;
                        }
                        y81Var.e(null);
                    } catch (Throwable unused2) {
                        y81Var.e(null);
                        return;
                    }
                }
                break;
            default:
                j1.h hVar = (j1.h) obj;
                if (list == null) {
                    hVar.b("");
                } else {
                    try {
                        size2 = list.size();
                    } catch (Throwable unused3) {
                    }
                    while (i10 < size2) {
                        ApkChecksum apkChecksumE3 = a2.d.e(list.get(i10));
                        if (apkChecksumE3.getType() == 8) {
                            i61 i61VarF2 = i61.f6401f.f();
                            byte[] value3 = apkChecksumE3.getValue();
                            hVar.b(i61VarF2.g(value3.length, value3));
                        } else {
                            i10++;
                        }
                        hVar.b("");
                        break;
                    }
                    hVar.b("");
                }
                break;
        }
    }

    public ie() {
        this.f6472a = 0;
        this.f6473b = new y81();
    }
}
