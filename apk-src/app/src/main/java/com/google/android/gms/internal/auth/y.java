package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y f13308b = new y();

    public static boolean a(byte[] bArr, int i, int i10) {
        int iA;
        while (i < i10 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i10) {
            iA = 0;
        } else {
            while (i < i10) {
                int i11 = i + 1;
                iA = bArr[i];
                if (iA < 0) {
                    if (iA >= -32) {
                        if (iA >= -16) {
                            if (i11 < i10 - 2) {
                                int i12 = i + 2;
                                byte b2 = bArr[i11];
                                if (b2 <= -65) {
                                    if ((((b2 + 112) + (iA << 28)) >> 30) == 0) {
                                        int i13 = i + 3;
                                        if (bArr[i12] <= -65) {
                                            i += 4;
                                            if (bArr[i13] > -65) {
                                            }
                                        }
                                    }
                                }
                                iA = -1;
                                break;
                            }
                            iA = x1.a(bArr, i11, i10);
                            break;
                        }
                        if (i11 < i10 - 1) {
                            int i14 = i + 2;
                            byte b10 = bArr[i11];
                            if (b10 <= -65 && ((iA != -32 || b10 >= -96) && (iA != -19 || b10 < -96))) {
                                i += 3;
                                if (bArr[i14] > -65) {
                                }
                            }
                            iA = -1;
                            break;
                        }
                        iA = x1.a(bArr, i11, i10);
                        break;
                    }
                    if (i11 >= i10) {
                        break;
                    }
                    if (iA >= -62) {
                        i += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    iA = -1;
                    break;
                }
                i = i11;
            }
            iA = 0;
        }
        return iA == 0;
    }

    @Override // com.google.android.gms.internal.auth.w
    public Object h() {
        throw new IllegalStateException();
    }
}
