package fh;

import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nd implements g0.b1, sb.a, h9.a, i0.e, pa.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ nd f17945b = new nd();

    public static final String e(byte[] bArr, byte[][] bArr2, int i) {
        int i10;
        boolean z5;
        int i11;
        int i12;
        byte[] bArr3 = PublicSuffixDatabase.f30742e;
        int length = bArr.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = (i13 + length) / 2;
            while (i14 > -1 && bArr[i14] != 10) {
                i14--;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i10 = i15 + i16;
                if (bArr[i10] == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i10 - i15;
            int i18 = i;
            boolean z10 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z10) {
                    i11 = 46;
                    z5 = false;
                } else {
                    byte b2 = bArr2[i18][i19];
                    byte[] bArr4 = al.b.f1041a;
                    int i21 = b2 & 255;
                    z5 = z10;
                    i11 = i21;
                }
                byte b10 = bArr[i15 + i20];
                byte[] bArr5 = al.b.f1041a;
                i12 = i11 - (b10 & 255);
                if (i12 != 0) {
                    break;
                }
                i20++;
                i19++;
                if (i20 == i17) {
                    break;
                }
                if (bArr2[i18].length != i19) {
                    z10 = z5;
                } else {
                    if (i18 == bArr2.length - 1) {
                        break;
                    }
                    i18++;
                    i19 = -1;
                    z10 = true;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i22 = i17 - i20;
                    int length2 = bArr2[i18].length - i19;
                    int length3 = bArr2.length;
                    for (int i23 = i18 + 1; i23 < length3; i23++) {
                        length2 += bArr2[i23].length;
                    }
                    if (length2 >= i22) {
                        if (length2 <= i22) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                            return new String(bArr, i15, i17, UTF_8);
                        }
                    }
                }
                i13 = i10 + 1;
            }
            length = i14;
        }
        return null;
    }

    @Override // h9.a
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // pa.l
    public Object c(na.l lVar) {
        return ((ja.c) lVar).f26592c;
    }

    @Override // sb.a
    public /* synthetic */ Object g(Task task) {
        return null;
    }

    @Override // g0.b1
    public boolean k(int i) {
        return false;
    }

    @Override // g0.b1
    public g0.c1 u(int i) {
        return null;
    }

    @Override // i0.e
    public void a() {
    }

    @Override // i0.e
    public void close() {
    }

    @Override // i0.e
    public void d(String str) {
    }
}
