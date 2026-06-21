package yads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ln f40610a = new ln();

    public static final byte[] a(String str) {
        Object objS;
        ByteArrayInputStream byteArrayInputStream;
        try {
            ij.k kVar = ij.m.f21341c;
            if (str == null) {
                str = "";
            }
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                objS = hl.d.w(gZIPInputStream);
                gZIPInputStream.close();
                byteArrayInputStream.close();
                if (ij.m.a(objS) != null) {
                    objS = new byte[0];
                }
                return (byte[]) objS;
            } finally {
            }
        } finally {
        }
    }

    public static final String b(String str) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            objS = new String(a(str), Charsets.UTF_8);
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (ij.m.a(objS) != null) {
            objS = "";
        }
        return (String) objS;
    }
}
