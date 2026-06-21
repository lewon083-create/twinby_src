package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ui2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ij.g f43682a = ij.h.b(ti2.f43331b);

    public static Bitmap a(String str) {
        Object objS;
        byte[] bArrCopyOf;
        try {
            ij.k kVar = ij.m.f21341c;
            byte[] elements = Base64.decode(StringsKt.H(str, "data:image/png;base64,"), 0);
            if (!kotlin.text.a0.n(str, "data:image/png;base64,", false)) {
                if (elements.length == 0) {
                    bArrCopyOf = new byte[0];
                } else {
                    byte[] bArr = (byte[]) f43682a.getValue();
                    Intrinsics.checkNotNullParameter(bArr, "<this>");
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    int length = bArr.length;
                    int length2 = elements.length;
                    bArrCopyOf = Arrays.copyOf(bArr, length + length2);
                    System.arraycopy(elements, 0, bArrCopyOf, length, length2);
                    Intrinsics.b(bArrCopyOf);
                }
                elements = bArrCopyOf;
            }
            objS = elements.length == 0 ? null : BitmapFactory.decodeByteArray(elements, 0, elements.length);
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        return (Bitmap) (objS instanceof ij.l ? null : objS);
    }
}
